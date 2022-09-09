package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.AABB;
import net.sweenus.simplyswordsforge.config.SimplySwordsConfig;
import net.sweenus.simplyswordsforge.effect.ModEffects;

import javax.annotation.Nonnull;
import java.util.List;

public class WildfireSwordItem extends SwordItem {
    public WildfireSwordItem(Tier pTier, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(pTier, (int) attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean hurtEnemy(@Nonnull ItemStack stack, @Nonnull LivingEntity target, @Nonnull LivingEntity attacker) {

        int phitchance = SimplySwordsConfig.wildfire_chance.get();
        int pduration = SimplySwordsConfig.wildfire_duration.get();
        int x = (int) target.getX();
        int y = (int) target.getY();
        int z = (int) target.getZ();
        ServerLevel world = (ServerLevel) target.level;
        AABB aabb = new AABB(x, y, z, (x + 1), (y + 1), (z + 1)).inflate(10).expandTowards(0.0D, target.level.getMaxBuildHeight(), 0.0D);
        List<LivingEntity> list = target.level.getEntitiesOfClass(LivingEntity.class, aabb);

        if (attacker.getRandom().nextInt(100) <= phitchance) {
            for (LivingEntity livingEntity : list) {
                if (livingEntity != attacker) {
                    livingEntity.setSecondsOnFire(pduration);
                }
            }
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
