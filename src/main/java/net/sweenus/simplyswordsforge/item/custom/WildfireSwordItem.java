package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswordsforge.effect.ModEffects;

public class WildfireSwordItem extends SwordItem {
    public WildfireSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int phitchance = 15; //SimplySwordsConfig.getIntValue("wildfire_chance");
        int pduration = 30;//SimplySwordsConfig.getIntValue("wildfire_duration");

        if (attacker.getRandom().nextInt(100) <= phitchance) {
            target.addEffect(new MobEffectInstance(ModEffects.WILDFIRE.get(), pduration, 3), attacker);
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
