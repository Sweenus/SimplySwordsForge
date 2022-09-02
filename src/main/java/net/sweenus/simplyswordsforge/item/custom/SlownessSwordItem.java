package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswordsforge.config.SimplySwordsConfig;

public class SlownessSwordItem extends SwordItem {
    public SlownessSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int shitchance = SimplySwordsConfig.slowness_chance.get();
        int sduration = SimplySwordsConfig.slowness_duration.get();

        if (attacker.getRandom().nextInt(100) <= shitchance) {
            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, sduration, 3), attacker);
        }
        return super.hurtEnemy(stack, target, attacker);
    }

}
