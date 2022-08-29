package net.sweenus.simplyswordsforge.item.custom;


import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.levelgen.structure.BoundingBox;

public class BrambleSwordItem extends SwordItem {
    public BrambleSwordItem(Tier pTier, int attackDamage, float attackSpeed, Properties settings) {
        super(pTier, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int fhitchance = 50; //SimplySwordsConfig.getIntValue("brimstone_chance");


        if (attacker.getRandom().nextInt(100) <= fhitchance) {
            if (!target.level.isClientSide()) {
                int x = (int) target.getX();
                int y = (int) target.getY();
                int z = (int) target.getZ();
                ServerLevel world = (ServerLevel) target.level;
                BoundingBox box = new BoundingBox(x + 10, y + 5, z + 10, x - 10, y - 5, z - 10);

                /*for(Entity e: world.getOtherEntities(attacker, box, EntityPredicates.VALID_LIVING_ENTITY)) {
                    if (e != null) {
                        target = (LivingEntity) e;
                        target.addEffect(new MobEffectInstance(StatusEffects.POISON, 300, 1), attacker);
                        target.addEffect(new MobEffectInstance(StatusEffects.SLOWNESS, 150, 1), attacker);
                    }
                }*/
            }
        }

        return super.hurtEnemy(stack, target, attacker);

    }

}
