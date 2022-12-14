package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.AABB;
import net.sweenus.simplyswordsforge.config.SimplySwordsConfig;
import net.sweenus.simplyswordsforge.effect.ModEffects;

import java.util.List;

public class WatcherSwordItem extends SwordItem {
    public WatcherSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int phitchance = SimplySwordsConfig.watcher_chance.get();
        int thitchance = SimplySwordsConfig.omen_chance.get();
        float watcherheal = SimplySwordsConfig.watcher_heal.get();
        ServerLevel level = (ServerLevel) attacker.level;
        BlockPos position = attacker.getOnPos();

        if (attacker.getRandom().nextInt(100) <= thitchance) {
            //target.addEffect(new MobEffectInstance(ModEffects.WATCHER.get(), 1, 1), attacker);

            double x = attacker.getX();
            double y = attacker.getY();
            double z = attacker.getZ();

            AABB aabb = new AABB(x, y, z, (x + 1), (y + 1), (z + 1)).inflate(20).expandTowards(0.0D, target.level.getMaxBuildHeight(), 0.0D);
            List<LivingEntity> list = target.level.getEntitiesOfClass(LivingEntity.class, aabb);

            for (LivingEntity livingEntity : list) {
                if (livingEntity != attacker) {
                    livingEntity.hurt(DamageSource.FREEZE, .5f);
                    attacker.heal(watcherheal);
                    level.playSound(null, position, SoundEvents.ENDER_CHEST_OPEN, SoundSource.BLOCKS, 0.3f, 1f);
                }
            }
        }

        if (attacker.getRandom().nextInt(100) <= phitchance) {
            float absAmount = SimplySwordsConfig.omen_absorption.get();
            float pthreshold = SimplySwordsConfig.omen_threshold.get();
            if (target.getHealth() <= pthreshold && attacker != null) {
                target.kill();
                if (attacker.getAbsorptionAmount() < 6f) {
                    attacker.setAbsorptionAmount(attacker.getAbsorptionAmount() + absAmount);
                    level.playSound(null, position, SoundEvents.ANVIL_LAND, SoundSource.BLOCKS, 0.6f, 1f);
                }
            }
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
