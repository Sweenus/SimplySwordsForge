package net.sweenus.simplyswordsforge.item.custom;



import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswordsforge.effect.ModEffects;

public class FreezeSwordItem extends SwordItem {
    public FreezeSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int fhitchance = 15; //SimplySwordsConfig.getIntValue("freeze_chance");
        int fduration = 50; //SimplySwordsConfig.getIntValue("freeze_duration");
        int sduration = 50; //SimplySwordsConfig.getIntValue("slowness_duration");

        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, sduration, 1), attacker);

        if (attacker.getRandom().nextInt(100) <= fhitchance) {
            target.addEffect(new MobEffectInstance(ModEffects.FREEZE.get(), fduration, 1), attacker);
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
