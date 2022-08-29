package net.sweenus.simplyswordsforge.effect;

import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.EntityTypePredicate;
import net.minecraft.core.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.MobEffect;
import net.minecraft.entity.effect.MobEffectCategory;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.levelgen.structure.BoundingBox;

public class PlagueEffect extends MobEffect {
    public PlagueEffect(MobEffectCategory mobEffectCategory, int color) {super (mobEffectCategory, color); }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {
            ServerLevel level = (ServerLevel)pLivingEntity.level;
            BlockPos position = pLivingEntity.getOnPos();
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();
            var attacker = pLivingEntity.getLastHurtByMob();
            //int spreadchance = SimplySwordsConfig.getIntValue("plague_spread_chance");

            if (pLivingEntity.getRandom().nextInt(100) <= 10) {
                    BoundingBox box = new BoundingBox(x + 10, y + 5, z + 10, x - 10, y - 5, z - 10);

                    for(Entity e: level.getNearbyEntities(attacker, box, EntityTypePredicate.)) {
                        if (e != null) {
                            //end me
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
