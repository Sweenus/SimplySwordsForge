package net.sweenus.simplyswordsforge.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class OmenEffect extends MobEffect {
    public OmenEffect(MobEffectCategory MobEffectCategory, int color) {super (MobEffectCategory, color); }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {
            ServerLevel level = (ServerLevel)pLivingEntity.level;
            BlockPos position = pLivingEntity.getOnPos();
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();
            var pPlayer = pLivingEntity.getLastHurtMob();
            float absAmount = .5f; //SimplySwordsConfig.getFloatValue("omen_absorption_amount");
            int pduration = 5;
            int pthreshold = 60; //SimplySwordsConfig.getIntValue("omen_instantkill_threshold");
            if (pLivingEntity.getHealth() <= pthreshold && pPlayer != null) {
                pLivingEntity.kill();
                if (pPlayer.getAbsorptionAmount() < 6f) {
                    pPlayer.setAbsorptionAmount(pPlayer.getAbsorptionAmount() + absAmount);
                    level.playSound(null, position, SoundEvents.ANVIL_LAND, SoundSource.BLOCKS, 0.6f, 1f);
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
