package net.sweenus.simplyswordsforge.item.custom;



import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.sweenus.simplyswordsforge.config.SimplySwordsConfig;

public class LevitationSwordItem extends SwordItem {
    public LevitationSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int lhitchance = SimplySwordsConfig.levitate_chance.get();
        int lduration = SimplySwordsConfig.levitate_duration.get();

        if (attacker.getRandom().nextInt(100) <= lhitchance) {
            target.addEffect(new MobEffectInstance(MobEffects.LEVITATION, lduration, 3), attacker);
        }

        return super.hurtEnemy(stack, target, attacker);
    }

}
