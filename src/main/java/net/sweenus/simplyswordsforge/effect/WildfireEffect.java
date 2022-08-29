package net.sweenus.simplyswordsforge.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.MobEffect;
import net.minecraft.entity.effect.MobEffectCategory;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.sweenus.simplyswords.config.SimplySwordsConfig;

public class WildfireEffect extends MobEffect {
    public WildfireEffect(MobEffectCategory mobEffectCategory, int color) {super (mobEffectCategory, color); }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClient()) {
            Serverlevel level = (Serverlevel)pLivingEntity.level;
            BlockPos position = pLivingEntity.getBlockPos();
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();
            int pduration = SimplySwordsConfig.getIntValue("wildfire_duration");
            Box box = new Box(x + 10, y +5, z + 10, x - 10, y - 5, z - 10);

            for(Entity e: level.getEntitiesByType(pLivingEntity.getType(), box, EntityPredicates.VALID_ENTITY))
            {
                if (e != null) {
                    e.setOnFireFor(pduration);
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
