package net.sweenus.simplyswordsforge.effect;

import net.minecraft.client.Minecraft;
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
            var pPlayer = Minecraft.getInstance().player;

            if (pLivingEntity.getRandom().nextInt(100) <= 1) {
                AABB aabb = new AABB(x, y, z, (x + 1), (y + 1), (z + 1)).inflate(5).expandTowards(0.0D, pLivingEntity.level.getMaxBuildHeight(), 0.0D);
                List<LivingEntity> list = pLivingEntity.level.getEntitiesOfClass(LivingEntity.class, aabb);

                for (LivingEntity livingEntity : list) {
                    if (livingEntity.getClass() != ServerPlayer.class && livingEntity.distanceTo(pPlayer) >= 5) {
                        livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 100, 1));

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
