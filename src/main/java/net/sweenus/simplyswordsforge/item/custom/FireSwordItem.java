package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswordsforge.config.SimplySwordsConfig;
import net.sweenus.simplyswordsforge.effect.ModEffects;

public class FireSwordItem extends SwordItem {
    public FireSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int fhitchance = SimplySwordsConfig.brimstone_chance.get();


        if (attacker.getRandom().nextInt(100) <= fhitchance) {
            target.addEffect(new MobEffectInstance(ModEffects.BURN.get(), 5, 1), attacker);
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
