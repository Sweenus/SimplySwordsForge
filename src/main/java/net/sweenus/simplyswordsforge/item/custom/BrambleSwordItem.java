package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class BrambleSwordItem extends SwordItem {
    public BrambleSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int fhitchance = 50; //SimplySwordsConfig.getIntValue("brimstone_chance");


        if (attacker.getRandom().nextInt(100) <= fhitchance) {
            if (!target.level.isClientSide()) {
                int x = (int) target.getX();
                int y = (int) target.getY();
                int z = (int) target.getZ();
                ServerLevel world = (ServerLevel) target.level;
                AABB aabb = new AABB(x, y, z, (x + 1), (y + 1), (z + 1)).inflate(20).expandTowards(0.0D, target.level.getMaxBuildHeight(), 0.0D);
                List<LivingEntity> list = target.level.getEntitiesOfClass(LivingEntity.class, aabb);

                for (LivingEntity livingEntity : list) {
                    if (livingEntity != attacker) {
                        target.addEffect(new MobEffectInstance(MobEffects.POISON, 300, 1), attacker);
                        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 3), attacker);
                    }
                }
            }
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
