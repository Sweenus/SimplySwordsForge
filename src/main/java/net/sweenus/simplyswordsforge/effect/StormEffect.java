package net.sweenus.simplyswordsforge.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;

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
            var pPlayer = pLivingEntity.getLastHurtByMob();
     /*       Box box = new Box(x + 15, y +5, z + 15, x - 15, y - 5, z - 15);

            //for(Entity e: level.getEntitiesByType(pLivingEntity.getType(), box, EntityPredicates.VALID_ENTITY))
            for(Entity e: level.getOtherEntities(pPlayer, box, EntityPredicates.VALID_LIVING_ENTITY))
            {
                if (e != null) {
                    if (e.isInWaterOrRain()) {
                        var stormtarget = e.getOnPos();
                        if (e.distanceTo(pPlayer) >= 5 ){
                            Entity storm = EntityType.LIGHTNING_BOLT.spawn(level, null, null, null, stormtarget, MobSpawnType.TRIGGERED, true, true);
                        }
                        //e.damage(DamageSource.LIGHTNING_BOLT, 5f);


                    }
                }
            }

       */ }

        super.applyEffectTick(pLivingEntity, pAmplifier);

    }



    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
