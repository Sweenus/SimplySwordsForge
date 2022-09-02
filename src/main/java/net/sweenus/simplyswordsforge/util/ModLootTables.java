package net.sweenus.simplyswordsforge.util;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.sweenus.simplyswordsforge.SimplySwords;

import java.util.Arrays;
import java.util.List;

public class ModLootTables {

    public static final List<ResourceLocation> INJECT_TABLE_IDS = Arrays.asList(
            new ResourceLocation("chests/village/village_armorer"),
            new ResourceLocation("chests/village/village_butcher"),
            new ResourceLocation("chests/village/village_tannery"),
            new ResourceLocation("chests/village/village_temple"),
            new ResourceLocation("chests/village/village_toolsmith"),
            new ResourceLocation("chests/village/village_weaponsmith"),
            new ResourceLocation("chests/village/village_desert_house"),
            new ResourceLocation("chests/village/village_plains_house"),
            new ResourceLocation("chests/village/village_savanna_house"),
            new ResourceLocation("chests/village/village_snowy_house"),
            new ResourceLocation("chests/village/village_taiga_house"),
            new ResourceLocation("chests/abandoned_mineshaft"),
            new ResourceLocation("chests/bastion_hoglin_stable"),
            new ResourceLocation("chests/bastion_treasure"),
            new ResourceLocation("chests/buried_treasure"),
            new ResourceLocation("chests/desert_pyramid"),
            new ResourceLocation("chests/end_city_treasure"),
            new ResourceLocation("chests/jungle_temple"),
            new ResourceLocation("chests/nether_bridge"),
            new ResourceLocation("chests/pillager_outpost"),
            new ResourceLocation("chests/ruined_portal"),
            new ResourceLocation("chests/shipwreck_treasure"),
            new ResourceLocation("chests/spawn_bonus_chest"),
            new ResourceLocation("chests/stronghold_corridor"),
            new ResourceLocation("chests/underwater_ruin_big"),
            new ResourceLocation("chests/woodland_mansion"),
            new ResourceLocation("entities/cow")
    );

    public static void onLootTableLoad(ResourceLocation id, LootTable.Builder supplier) {
        if (INJECT_TABLE_IDS.contains(id)) {
            supplier.withPool(LootPool.lootPool().add(getInjectEntry(id.getPath())));
        }
    }

    private static LootPoolEntryContainer.Builder<?> getInjectEntry(String name) {
        ResourceLocation table = SimplySwords.id("inject/" + name);
        return LootTableReference.lootTableReference(table).setWeight(1);
    }

    private ModLootTables() {
    }
}