package net.sweenus.simplyswordsforge.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sweenus.simplyswordsforge.SimplySwords;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SimplySwords.MOD_ID);

    public static final RegistryObject<MobEffect> FREEZE = MOB_EFFECTS.register("freeze",
            () -> new FreezeEffect(MobEffectCategory.HARMFUL, 3124687));

    public static final RegistryObject<MobEffect> BURN = MOB_EFFECTS.register( "burn",
            () -> new BurnEffect(MobEffectCategory.HARMFUL, 2124687));

    public static final RegistryObject<MobEffect> ELECTRIC = MOB_EFFECTS.register( "electric",
            () -> new ElectricEffect(MobEffectCategory.HARMFUL, 2124687));

    public static final RegistryObject<MobEffect> PLAGUE = MOB_EFFECTS.register( "plague",
            () -> new PlagueEffect(MobEffectCategory.HARMFUL, 2124687));

    public static final RegistryObject<MobEffect> WILDFIRE = MOB_EFFECTS.register( "wildfire",
            () -> new WildfireEffect(MobEffectCategory.HARMFUL, 2124687));

    public static final RegistryObject<MobEffect> STORM = MOB_EFFECTS.register( "storm",
            () -> new StormEffect(MobEffectCategory.HARMFUL, 2124687));


    public static final RegistryObject<MobEffect> OMEN = MOB_EFFECTS.register( "omen",
            () -> new OmenEffect(MobEffectCategory.HARMFUL, 2124687));


    public static final RegistryObject<MobEffect> WATCHER = MOB_EFFECTS.register( "watcher",
            () -> new WatcherEffect(MobEffectCategory.HARMFUL, 2124687));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
