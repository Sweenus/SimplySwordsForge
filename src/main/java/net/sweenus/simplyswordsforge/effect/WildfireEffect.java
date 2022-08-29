package net.sweenus.simplyswordsforge.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class WildfireEffect extends MobEffect {
    public WildfireEffect(MobEffectCategory mobEffectCategory, int color) {super (mobEffectCategory, color); }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {
            ServerLevel level = (ServerLevel)pLivingEntity.level;
            BlockPos position = pLivingEntity.getOnPos();
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();
            int pduration = 30; //SimplySwordsConfig.getIntValue("wildfire_duration");
            /*Box box = new Box(x + 10, y +5, z + 10, x - 10, y - 5, z - 10);

            for(Entity e: level.getEntitiesByType(pLivingEntity.getType(), box, EntityPredicates.VALID_ENTITY))
            {
                if (e != null) {
                    e.setOnFireFor(pduration);
                }
            }*/

        }

        super.applyEffectTick(pLivingEntity, pAmplifier);

    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
