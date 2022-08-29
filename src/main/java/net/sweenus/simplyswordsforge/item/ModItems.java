package net.sweenus.simplyswordsforge.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sweenus.simplyswordsforge.SimplySwords;
import net.sweenus.simplyswordsforge.item.custom.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimplySwords.MOD_ID);


    public static final RegistryObject<Item> IRON_LONGSWORD = ITEMS.register( "iron_longsword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> IRON_TWINBLADE = ITEMS.register( "iron_twinblade",
            () -> new SwordItem(Tiers.IRON, 3, -1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> IRON_RAPIER = ITEMS.register( "iron_rapier",
            () -> new SwordItem(Tiers.IRON, 2, -1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> IRON_KATANA = ITEMS.register( "iron_katana",
            () -> new SwordItem(Tiers.IRON, 3, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> IRON_SAI = ITEMS.register("iron_sai",
            () -> new SwordItem(Tiers.IRON, 0, -1.1f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register( "iron_spear",
            () -> new SwordItem(Tiers.IRON, 3, -2.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> IRON_GLAIVE = ITEMS.register( "iron_glaive",
            () -> new SwordItem(Tiers.IRON, 3, -2.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> IRON_WARGLAIVE = ITEMS.register( "iron_warglaive",
            () -> new SwordItem(Tiers.IRON, 3, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> IRON_CUTLASS = ITEMS.register( "iron_cutlass",
            () -> new SwordItem(Tiers.IRON, 3, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> IRON_CLAYMORE = ITEMS.register( "iron_claymore",
            () -> new SwordItem(Tiers.IRON, 5, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    //GOLD
    public static final RegistryObject<Item> GOLD_LONGSWORD = ITEMS.register( "gold_longsword",
            () -> new SwordItem(Tiers.GOLD, 2, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GOLD_TWINBLADE = ITEMS.register( "gold_twinblade",
            () -> new SwordItem(Tiers.GOLD, 2, -1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_RAPIER = ITEMS.register( "gold_rapier",
            () -> new SwordItem(Tiers.GOLD, 1, -1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_KATANA = ITEMS.register( "gold_katana",
            () -> new SwordItem(Tiers.GOLD, 2, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_SAI = ITEMS.register( "gold_sai",
            () -> new SwordItem(Tiers.GOLD, 0, -1.1f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GOLD_SPEAR = ITEMS.register( "gold_spear",
            () -> new SwordItem(Tiers.GOLD, 2, -2.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GOLD_GLAIVE = ITEMS.register( "gold_glaive",
            () -> new SwordItem(Tiers.GOLD, 2, -2.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> GOLD_WARGLAIVE = ITEMS.register( "gold_warglaive",
            () -> new SwordItem(Tiers.GOLD, 2, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_CUTLASS = ITEMS.register( "gold_cutlass",
            () -> new SwordItem(Tiers.GOLD, 2, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_CLAYMORE = ITEMS.register( "gold_claymore",
            () -> new SwordItem(Tiers.GOLD, 4, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    //DIAMOND
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = ITEMS.register( "diamond_longsword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DIAMOND_TWINBLADE = ITEMS.register( "diamond_twinblade",
            () -> new SwordItem(Tiers.DIAMOND, 3, -1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_RAPIER = ITEMS.register( "diamond_rapier",
            () -> new SwordItem(Tiers.DIAMOND, 2, -1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_KATANA = ITEMS.register( "diamond_katana",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_SAI = ITEMS.register( "diamond_sai",
            () -> new SwordItem(Tiers.DIAMOND, 0, -1.1f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register( "diamond_spear",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DIAMOND_GLAIVE = ITEMS.register( "diamond_glaive",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> DIAMOND_WARGLAIVE = ITEMS.register( "diamond_warglaive",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_CUTLASS = ITEMS.register( "diamond_cutlass",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_CLAYMORE = ITEMS.register( "diamond_claymore",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    //NETHERITE

    public static final RegistryObject<Item> NETHERITE_LONGSWORD = ITEMS.register( "netherite_longsword",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NETHERITE_TWINBLADE = ITEMS.register( "netherite_twinblade",
            () -> new SwordItem(Tiers.NETHERITE, 3, -1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NETHERITE_RAPIER = ITEMS.register( "netherite_rapier",
            () -> new SwordItem(Tiers.NETHERITE, 2, -1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_KATANA = ITEMS.register( "netherite_katana",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_SAI = ITEMS.register( "netherite_sai",
            () -> new SwordItem(Tiers.NETHERITE, 0, -1.1f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register( "netherite_spear",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NETHERITE_GLAIVE = ITEMS.register( "netherite_glaive",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NETHERITE_WARGLAIVE = ITEMS.register( "netherite_warglaive",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NETHERITE_CUTLASS = ITEMS.register( "netherite_cutlass",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));


    public static final RegistryObject<Item> NETHERITE_CLAYMORE = ITEMS.register( "netherite_claymore",
            () -> new SwordItem(Tiers.NETHERITE, 6, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    //RUNIC
    public static final RegistryObject<Item> RUNIC_LONGSWORD = ITEMS.register( "runic_longsword",
            () -> new PoisonSwordItem(Tiers.NETHERITE, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> RUNIC_TWINBLADE = ITEMS.register( "runic_twinblade",
            () -> new WildfireSwordItem(Tiers.NETHERITE, 3, -1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> RUNIC_RAPIER = ITEMS.register( "runic_rapier",
            () -> new SpeedSwordItem(Tiers.NETHERITE, 2, -1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> RUNIC_KATANA = ITEMS.register( "runic_katana",
            () -> new WildfireSwordItem(Tiers.NETHERITE, 3, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> RUNIC_SAI = ITEMS.register( "runic_sai",
            () -> new SlownessSwordItem(Tiers.NETHERITE, 0, -1.1f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    public static final RegistryObject<Item> RUNIC_SPEAR = ITEMS.register( "runic_spear",
            () -> new FreezeSwordItem(Tiers.NETHERITE, 3, -2.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> RUNIC_GLAIVE = ITEMS.register( "runic_glaive",
            () -> new WildfireSwordItem(Tiers.NETHERITE, 3, -2.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> RUNIC_CUTLASS = ITEMS.register( "runic_cutlass",
            () -> new LevitationSwordItem(Tiers.NETHERITE, 3, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RUNIC_CLAYMORE = ITEMS.register( "runic_claymore",
            () -> new FreezeSwordItem(Tiers.NETHERITE, 6, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1)));

    //SPECIAL
    public static final RegistryObject<Item> BRIMSTONE_CLAYMORE = ITEMS.register( "brimstone_claymore",
            () -> new FireSwordItem(Tiers.NETHERITE, 6, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> WATCHER_CLAYMORE = ITEMS.register( "watcher_claymore",
            () -> new WatcherSwordItem(Tiers.NETHERITE, 6, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> STORMS_EDGE = ITEMS.register( "storms_edge",
            () -> new StormSwordItem(Tiers.NETHERITE, 3, -1.7f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> STORMBRINGER = ITEMS.register( "stormbringer",
            () -> new StormSwordItem(Tiers.NETHERITE, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> SWORD_ON_A_STICK = ITEMS.register( "sword_on_a_stick",
            () -> new SwordItem(Tiers.WOOD, 5, -2.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> BRAMBLETHORN = ITEMS.register( "bramblethorn",
            () -> new BrambleSwordItem(Tiers.WOOD, 6, -1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> WATCHING_WARGLAIVE = ITEMS.register( "watching_warglaive",
            () -> new WatcherSwordItem(Tiers.NETHERITE, 3, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> TOXIC_LONGSWORD = ITEMS.register( "toxic_longsword",
            () -> new PlagueSwordItem(Tiers.NETHERITE, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.SIMPLYSWORDS_TAB).stacksTo(1).rarity(Rarity.EPIC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}