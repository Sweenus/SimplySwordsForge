package net.sweenus.simplyswordsforge.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.AABB;

public class PlagueEffect extends MobEffect {
    public PlagueEffect(MobEffectCategory mobEffectCategory, int color) {super (mobEffectCategory, color); }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {
            ServerLevel level = (ServerLevel)pLivingEntity.level;
            BlockPos position = pLivingEntity.getOnPos();
            int x = (int) pLivingEntity.getX();
            int y = (int) pLivingEntity.getY();
            int z = (int) pLivingEntity.getZ();
            var attacker = pLivingEntity.getLastHurtByMob();
            //int spreadchance = SimplySwordsConfig.getIntValue("plague_spread_chance");

            if (pLivingEntity.getRandom().nextInt(100) <= 90) {
                AABB boundingBox = pLivingEntity.getBoundingBox().inflate(15);
                    BoundingBox box = new BoundingBox(x + 10, y + 5, z + 10, x - 10, y - 5, z - 10);

                for (LivingEntity tlivingentity : attacker.level.getNearbyEntities(Zombie.class, null, attacker,boundingBox)) {
                    tlivingentity.addEffect(new MobEffectInstance(MobEffects.WITHER, 5, 1), attacker);
                }

                    //for(Entity e: level.getNearbyEntities(null, EntityPredicate.ANY , attacker,  box )) {
                    //    if (e != null) {
                    //        //end me
                    //    }
                //}
            }

        }

        super.applyEffectTick(pLivingEntity, pAmplifier);

    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
