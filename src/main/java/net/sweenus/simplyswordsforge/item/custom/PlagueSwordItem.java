package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswordsforge.effect.ModEffects;

import javax.annotation.Nonnull;

public class PlagueSwordItem extends SwordItem {
    public PlagueSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {

        int phitchance = 55; //SimplySwordsConfig.getIntValue("plague_chance");
        int pduration = 500; //SimplySwordsConfig.getIntValue("plague_duration");

        if (attacker.getRandom().nextInt(100) <= phitchance) {
            target.addEffect(new MobEffectInstance(MobEffects.WITHER, pduration, 1), attacker);
            target.addEffect(new MobEffectInstance(ModEffects.PLAGUE.get(), pduration, 1), attacker);
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
