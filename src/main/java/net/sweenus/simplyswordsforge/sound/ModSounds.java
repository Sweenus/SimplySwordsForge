package net.sweenus.simplyswordsforge.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sweenus.simplyswordsforge.SimplySwords;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SimplySwords.MOD_ID);

    public static final RegistryObject<SoundEvent> THROW_MJOLNIR_SHORT =
            registerSoundEvent("throw_mjolnir_short");
    public static final RegistryObject<SoundEvent> THROW_MJOLNIR_LONG =
            registerSoundEvent("throw_mjolnir_long");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(SimplySwords.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}