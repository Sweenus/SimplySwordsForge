package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class PlagueSwordItem extends SwordItem {
    public PlagueSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int phitchance = 15; //SimplySwordsConfig.getIntValue("plague_chance");
        int pduration = 50; //SimplySwordsConfig.getIntValue("plague_duration");

        if (attacker.getRandom().nextInt(100) <= phitchance) {
            target.addEffect(new MobEffectInstance(MobEffects.WITHER, pduration, 1), attacker);
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
