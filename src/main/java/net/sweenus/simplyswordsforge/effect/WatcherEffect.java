package net.sweenus.simplyswordsforge.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class WatcherEffect extends MobEffect {
    public WatcherEffect(MobEffectCategory mobEffectCategory, int color) {super (mobEffectCategory, color); }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {
            ServerLevel level = (ServerLevel)pLivingEntity.level;
            BlockPos position = pLivingEntity.getOnPos();
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();
            int pduration = 1;
            float rAmount = SimplySwordsConfig.getFloatValue("watcher_restore_amount");
            Box box = new Box(x + 10, y +10, z + 10, x - 10, y - 10, z - 10);
            var pPlayer = pLivingEntity.getLastHurtByMob();

            //for(Entity e: level.getEntitiesByType(pLivingEntity.getType(), box, EntityPredicates.VALID_ENTITY))
            for(Entity e: level.getOtherEntities(pPlayer, box, EntityPredicates.VALID_ENTITY))
            {
                if (e != null && pPlayer != null){
                    e.hurt(DamageSource.FREEZE, rAmount);
                    pPlayer.setHealth(pPlayer.getHealth() + rAmount);
                    level.playSound(null, position, SoundEvents.ENDER_CHEST_OPEN, SoundSource.BLOCKS, 0.2f, 1f);
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
