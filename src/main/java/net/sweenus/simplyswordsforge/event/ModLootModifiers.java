package net.sweenus.simplyswordsforge.event;

import net.sweenus.simplyswordsforge.SimplySwords;
import net.sweenus.simplyswordsforge.event.loot.RollLootTableLootModifier;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {

    public static final DeferredRegister<GlobalLootModifierSerializer<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, SimplySwords.MOD_ID);

    public static final RegistryObject<GlobalLootModifierSerializer<RollLootTableLootModifier>> ROLL_LOOT_TABLE = REGISTRY.register("roll_loot_table", RollLootTableLootModifier.Serializer::new);
}