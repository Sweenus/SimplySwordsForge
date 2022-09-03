package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.AABB;
import net.sweenus.simplyswordsforge.config.SimplySwordsConfig;
import net.sweenus.simplyswordsforge.effect.ModEffects;

import java.util.List;

public class StormSwordItem extends SwordItem {
    public StormSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int phitchance = SimplySwordsConfig.storm_chance.get();
        int x = (int) target.getX();
        int y = (int) target.getY();
        int z = (int) target.getZ();
        ServerLevel world = (ServerLevel) target.level;
        AABB aabb = new AABB(x, y, z, (x + 1), (y + 1), (z + 1)).inflate(10).expandTowards(0.0D, target.level.getMaxBuildHeight(), 0.0D);
        List<LivingEntity> list = target.level.getEntitiesOfClass(LivingEntity.class, aabb);

        if (attacker.getRandom().nextInt(100) <= phitchance) {
            for (LivingEntity livingEntity : list) {
                BlockPos pposition = livingEntity.getOnPos();
                if (livingEntity != attacker && livingEntity.distanceTo(attacker) >= 10 && livingEntity.isInWaterOrRain()){
                    Entity lightning = EntityType.LIGHTNING_BOLT.spawn(world, null, null, null, pposition, MobSpawnType.TRIGGERED, true, true);
                }
            }
        }


        return super.hurtEnemy(stack, target, attacker);

    }

}
