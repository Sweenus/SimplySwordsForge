package net.sweenus.simplyswordsforge.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class SimplySwordsConfig {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Chances
    public static final ForgeConfigSpec.ConfigValue<Integer> storm_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> wildfire_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> omen_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> watcher_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> speed_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> levitate_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> plague_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> plague_spread_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> bramble_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> brimstone_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> slowness_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> freeze_chance;
    public static final ForgeConfigSpec.ConfigValue<Integer> poison_chance;
    //Durations
    public static final ForgeConfigSpec.ConfigValue<Integer> wildfire_duration;
    public static final ForgeConfigSpec.ConfigValue<Integer> speed_duration;
    public static final ForgeConfigSpec.ConfigValue<Integer> levitate_duration;
    public static final ForgeConfigSpec.ConfigValue<Integer> plague_duration;
    public static final ForgeConfigSpec.ConfigValue<Integer> bramble_duration;
    public static final ForgeConfigSpec.ConfigValue<Integer> slowness_duration;
    public static final ForgeConfigSpec.ConfigValue<Integer> freeze_duration;
    public static final ForgeConfigSpec.ConfigValue<Integer> poison_duration;
    //Misc
    public static final ForgeConfigSpec.ConfigValue<Float> omen_threshold;
    public static final ForgeConfigSpec.ConfigValue<Float> omen_absorption;
    public static final ForgeConfigSpec.ConfigValue<Float> watcher_heal;
    public static final ForgeConfigSpec.ConfigValue<Float> loot_weight;

    static {
        //Chances
        BUILDER.push("EFFECT CHANCE");
        storm_chance = BUILDER.comment("Chance to proc Storm on hit").define("Storm Chance", 15);
        wildfire_chance = BUILDER.comment("Chance to proc Wildfire on hit").define("Wildfire Chance", 10);
        omen_chance = BUILDER.comment("Chance to proc Omen (Instant-kill) on hit").define("Omen Chance", 10);
        watcher_chance = BUILDER.comment("Chance to proc Watcher (lifesteal) on hit").define("Watcher Chance", 15);
        speed_chance = BUILDER.comment("Chance to proc Speed on hit").define("Speed Chance", 15);
        levitate_chance = BUILDER.comment("Chance to proc Levitate on hit").define("Levitate Chance", 15);
        plague_chance = BUILDER.comment("Chance to proc Plague on hit").define("Plague Chance", 15);
        plague_spread_chance = BUILDER.comment("Chance to spread Plague").define("Plague Spread Chance", 15);
        bramble_chance = BUILDER.comment("Chance to proc Bramble on hit").define("Bramble Chance", 15);
        brimstone_chance = BUILDER.comment("Chance to proc Brimstone on hit").define("Brimstone Chance", 15);
        slowness_chance = BUILDER.comment("Chance to proc Slowness on hit").define("Slowness Chance", 50);
        freeze_chance = BUILDER.comment("Chance to proc Freeze on hit").define("Freeze Chance", 15);
        poison_chance = BUILDER.comment("Chance to proc Poison on hit").define("Poison Chance", 15);
        BUILDER.pop();
        //Durations
        BUILDER.push("EFFECT DURATION");
        wildfire_duration = BUILDER.comment("Duration of Wildfire").define("Wildfire Duration", 8);
        speed_duration = BUILDER.comment("Duration of Speed").define("Speed Duration", 300);
        levitate_duration = BUILDER.comment("Duration of Levitate").define("Levitate Duration", 50);
        plague_duration = BUILDER.comment("Duration of Plague").define("Plague Duration", 180);
        bramble_duration = BUILDER.comment("Duration of Bramble").define("Bramble Duration", 180);
        slowness_duration = BUILDER.comment("Duration of Slowness").define("Slowness Duration", 50);
        freeze_duration = BUILDER.comment("Duration of Freeze").define("Freeze Duration", 120);
        poison_duration = BUILDER.comment("Duration of Poison").define("Poison Duration", 180);
        BUILDER.pop();

        //Misc
        BUILDER.push("MISC");
        omen_threshold = BUILDER.comment("When target HP is below this flat value Omen can proc").define("Omen Threshold", 60f);
        omen_absorption = BUILDER.comment("Absorption granted on Omen proc").define("Omen Absorption", 0.5f);
        watcher_heal = BUILDER.comment("Health gained per target effected by Watcher proc").define("Watcher Heal", 0.5f);
        loot_weight = BUILDER.comment("The chance of SimplySwords loot spawning in chests (1 = 100%)").define("Loot Weight", 0.1f);
        BUILDER.pop();

        SPEC = BUILDER.build();

    }

}
