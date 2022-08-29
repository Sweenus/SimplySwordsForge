package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class PoisonSwordItem extends SwordItem {
    public PoisonSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int phitchance = 15; //SimplySwordsConfig.getIntValue("toxin_chance");
        int pduration = 50; //SimplySwordsConfig.getIntValue("toxin_duration");

        if (attacker.getRandom().nextInt(100) <= phitchance) {
            target.addEffect(new MobEffectInstance(MobEffects.WITHER, pduration, 3), attacker);
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
