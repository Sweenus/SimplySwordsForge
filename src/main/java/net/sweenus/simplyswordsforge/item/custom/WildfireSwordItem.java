package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswordsforge.effect.ModEffects;

import javax.annotation.Nonnull;

public class WildfireSwordItem extends SwordItem {
    public WildfireSwordItem(Tier pTier, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(pTier, (int) attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {

        int phitchance = 15; //SimplySwordsConfig.getIntValue("wildfire_chance");
        int pduration = 300;//SimplySwordsConfig.getIntValue("wildfire_duration");

        if (attacker.getRandom().nextInt(100) <= phitchance) {
            target.addEffect(new MobEffectInstance(ModEffects.WILDFIRE.get(), pduration, 3));
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
