package net.sweenus.simplyswordsforge.effect;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.network.PlayMessages;

import java.util.List;

public class StormEffect extends MobEffect {
    public StormEffect(MobEffectCategory mobEffectCategory, int color) {super (mobEffectCategory, color); }
    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {
            ServerLevel level = (ServerLevel)pLivingEntity.level;
            BlockPos position = pLivingEntity.getOnPos();
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();
            LocalPlayer player = Minecraft.getInstance().player;
            Entity playerEntity = (Entity) player;

            if (pLivingEntity.getRandom().nextInt(100) <= 15) {
                AABB aabb = new AABB(x, y, z, (x + 1), (y + 1), (z + 1)).inflate(25).expandTowards(0.0D, pLivingEntity.level.getMaxBuildHeight(), 0.0D);
                List<LivingEntity> list = pLivingEntity.level.getEntitiesOfClass(LivingEntity.class, aabb);

                for (LivingEntity livingEntity : list) {
                    BlockPos pposition = livingEntity.getOnPos();

                    if (livingEntity != playerEntity && livingEntity.distanceTo(playerEntity) >= 10 && livingEntity.isInWaterOrRain()){
                        Entity lightning = EntityType.LIGHTNING_BOLT.spawn(level, null, null, null, pposition, MobSpawnType.TRIGGERED, true, true);

                    }
                }
            }

        }

        super.applyEffectTick(pLivingEntity, pAmplifier);

    }



    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
