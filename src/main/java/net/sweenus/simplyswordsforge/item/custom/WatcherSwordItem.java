package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswordsforge.effect.ModEffects;

public class WatcherSwordItem extends SwordItem {
    public WatcherSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int phitchance = 15;//SimplySwordsConfig.getIntValue("watcher_chance");
        int thitchance = 15;//SimplySwordsConfig.getIntValue("omen_chance");

        if (attacker.getRandom().nextInt(100) <= thitchance) {
            target.addEffect(new MobEffectInstance(ModEffects.WATCHER.get(), 1, 1), attacker);
        }

        if (attacker.getRandom().nextInt(100) <= phitchance) {
            target.addEffect(new MobEffectInstance(ModEffects.OMEN.get(), 1, 1), attacker);
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
