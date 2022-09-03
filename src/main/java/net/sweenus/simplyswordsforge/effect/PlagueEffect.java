package net.sweenus.simplyswordsforge.effect;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.sweenus.simplyswordsforge.config.SimplySwordsConfig;

import java.util.List;

public class PlagueEffect extends MobEffect {
    public PlagueEffect(MobEffectCategory mobEffectCategory, int color) {super (mobEffectCategory, color); }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {
            ServerLevel llevel = (ServerLevel)pLivingEntity.level;
            BlockPos position = pLivingEntity.getOnPos();
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();
            //LocalPlayer player = Minecraft.getInstance().player;
            //Entity playerEntity = (Entity) player;
            int spreadchance = SimplySwordsConfig.plague_spread_chance.get();
            int pduration = SimplySwordsConfig.plague_duration.get();

            if (pLivingEntity.getRandom().nextInt(100) <= 1) {
                AABB aabb = new AABB(x, y, z, (x + 1), (y + 1), (z + 1)).inflate(5).expandTowards(0.0D, pLivingEntity.level.getMaxBuildHeight(), 0.0D);
                List<LivingEntity> list = pLivingEntity.level.getEntitiesOfClass(LivingEntity.class, aabb);

                for (LivingEntity livingEntity : list) {
                    if (livingEntity.getRandom().nextInt(100) <= spreadchance) {
                            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, pduration, 1));
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
