package net.sweenus.simplyswordsforge.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sweenus.simplyswords.SimplySwords;

public class ModEffects {
    public static StatusEffect FREEZE;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(SimplySwords.MOD_ID, name),
                new FreezeEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    public static void registerEffects() {
        FREEZE = registerStatusEffect("freeze");
    }

    public static final StatusEffect BURN = new BurnEffect(StatusEffectCategory.HARMFUL, 2124687);
    public static final StatusEffect ELECTRIC = new ElectricEffect(StatusEffectCategory.HARMFUL, 2184187);
    public static final StatusEffect PLAGUE = new PlagueEffect(StatusEffectCategory.HARMFUL, 2184187);
    public static final StatusEffect WILDFIRE = new WildfireEffect(StatusEffectCategory.HARMFUL, 1124687);
    public static final StatusEffect STORM = new StormEffect(StatusEffectCategory.HARMFUL, 1124687);
    public static final StatusEffect OMEN = new OmenEffect(StatusEffectCategory.HARMFUL, 1124687);
    public static final StatusEffect WATCHER = new WatcherEffect(StatusEffectCategory.HARMFUL, 1124687);

}
