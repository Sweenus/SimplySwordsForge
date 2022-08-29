package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswordsforge.effect.ModEffects;

public class ElectricSwordItem extends SwordItem {
    public ElectricSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int fhitchance = 15; //SimplySwordsConfig.getIntValue("lightning_chance");


        if (attacker.getRandom().nextInt(100) <= fhitchance) {
            target.addEffect(new MobEffectInstance(ModEffects.ELECTRIC.get(), 5, 1), attacker);
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
