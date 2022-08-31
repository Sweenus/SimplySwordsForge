package net.sweenus.simplyswordsforge.effect;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class PlagueEffect extends MobEffect {
    public PlagueEffect(MobEffectCategory mobEffectCategory, int color) {super (mobEffectCategory, color); }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()) {
            ServerLevel llevel = (ServerLevel)pLivingEntity.level;
            BlockPos position = pLivingEntity.getOnPos();
            double x = pLivingEntity.getX();
            double y = pLivingEntity.getY();
            double z = pLivingEntity.getZ();
            Player player = Minecraft.getInstance().player;
            var attacker = Minecraft.getInstance().player;
            //int spreadchance = SimplySwordsConfig.getIntValue("plague_spread_chance");

            if (pLivingEntity.getRandom().nextInt(100) <= 1) {
                AABB aabb = new AABB(x, y, z, (x + 1), (y + 1), (z + 1)).inflate(5).expandTowards(0.0D, pLivingEntity.level.getMaxBuildHeight(), 0.0D);
                List<LivingEntity> list = pLivingEntity.level.getEntitiesOfClass(LivingEntity.class, aabb);

                for (LivingEntity livingEntity : list) {
                    if (livingEntity.getClass() != ServerPlayer.class && livingEntity.getRandom().nextInt(100) <= 15) {
                            livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 300, 1));
                    }
                }
            }

        }

        super.applyEffectTick(pLivingEntity, pAmplifier);

    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

}
