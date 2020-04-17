/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot;

import zedly.zbot.block.data.*;
import zedly.zbot.block.data.type.*;

/**
 *
 * @author Dennis
 */
public enum Material {

    ACACIA_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    ACACIA_BUTTON(Switch.class),
    /**
     * BlockData: {@link Door}
     */
    ACACIA_DOOR(Door.class),
    /**
     * BlockData: {@link Fence}
     */
    ACACIA_FENCE(Fence.class),
    /**
     * BlockData: {@link Gate}
     */
    ACACIA_FENCE_GATE(Gate.class),
    /**
     * BlockData: {@link Leaves}
     */
    ACACIA_LEAVES(Leaves.class),
    /**
     * BlockData: {@link Orientable}
     */
    ACACIA_LOG(Orientable.class),
    ACACIA_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    ACACIA_PRESSURE_PLATE(Powerable.class),
    /**
     * BlockData: {@link Sapling}
     */
    ACACIA_SAPLING(Sapling.class),
    /**
     * BlockData: {@link Sign}
     */
    ACACIA_SIGN(Sign.class),
    /**
     * BlockData: {@link Slab}
     */
    ACACIA_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    ACACIA_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Trapdoor}
     */
    ACACIA_TRAPDOOR(Trapdoor.class),
    /**
     * BlockData: {@link WallSign}
     */
    ACACIA_WALL_SIGN(WallSign.class),
    /**
     * BlockData: {@link Orientable}
     */
    ACACIA_WOOD(Orientable.class),
    /**
     * BlockData: {@link RedstoneRail}
     */
    ACTIVATOR_RAIL(RedstoneRail.class),
    AIR,
    ALLIUM,
    ANDESITE,
    /**
     * BlockData: {@link Slab}
     */
    ANDESITE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    ANDESITE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    ANDESITE_WALL(Fence.class),
    /**
     * BlockData: {@link Directional}
     */
    ANVIL(Directional.class),
    APPLE,
    ARMOR_STAND,
    ARROW,
    /**
     * BlockData: {@link Directional}
     */
    ATTACHED_MELON_STEM(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    ATTACHED_PUMPKIN_STEM(Directional.class),
    AZURE_BLUET,
    BAKED_POTATO,
    /**
     * BlockData: {@link Bamboo}
     */
    BAMBOO(Bamboo.class),
    BAMBOO_SAPLING,
    /**
     * BlockData: {@link Directional}
     */
    BARREL(Directional.class),
    BARRIER,
    BAT_SPAWN_EGG,
    BEACON,
    BEDROCK,
    BEEF,
    BEETROOT,
    /**
     * BlockData: {@link AgeableBlock}
     */
    BEETROOTS(AgeableBlock.class),
    BEETROOT_SEEDS,
    BEETROOT_SOUP,
    /**
     * BlockData: {@link Bell}
     */
    BELL(Bell.class),
    BIRCH_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    BIRCH_BUTTON(Switch.class),
    /**
     * BlockData: {@link Door}
     */
    BIRCH_DOOR(Door.class),
    /**
     * BlockData: {@link Fence}
     */
    BIRCH_FENCE(Fence.class),
    /**
     * BlockData: {@link Gate}
     */
    BIRCH_FENCE_GATE(Gate.class),
    /**
     * BlockData: {@link Leaves}
     */
    BIRCH_LEAVES(Leaves.class),
    /**
     * BlockData: {@link Orientable}
     */
    BIRCH_LOG(Orientable.class),
    BIRCH_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    BIRCH_PRESSURE_PLATE(Powerable.class),
    /**
     * BlockData: {@link Sapling}
     */
    BIRCH_SAPLING(Sapling.class),
    /**
     * BlockData: {@link Sign}
     */
    BIRCH_SIGN(Sign.class),
    /**
     * BlockData: {@link Slab}
     */
    BIRCH_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    BIRCH_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Trapdoor}
     */
    BIRCH_TRAPDOOR(Trapdoor.class),
    /**
     * BlockData: {@link WallSign}
     */
    BIRCH_WALL_SIGN(WallSign.class),
    /**
     * BlockData: {@link Orientable}
     */
    BIRCH_WOOD(Orientable.class),
    /**
     * BlockData: {@link Rotatable}
     */
    BLACK_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    BLACK_BED(Bed.class),
    BLACK_CARPET,
    BLACK_CONCRETE,
    BLACK_CONCRETE_POWDER,
    BLACK_DYE,
    /**
     * BlockData: {@link Directional}
     */
    BLACK_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    BLACK_SHULKER_BOX(Directional.class),
    BLACK_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    BLACK_STAINED_GLASS_PANE(GlassPane.class),
    BLACK_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    BLACK_WALL_BANNER(Directional.class),
    BLACK_WOOL,
    /**
     * BlockData: {@link Furnace}
     */
    BLAST_FURNACE(Furnace.class),
    BLAZE_POWDER,
    BLAZE_ROD,
    BLAZE_SPAWN_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    BLUE_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    BLUE_BED(Bed.class),
    BLUE_CARPET,
    BLUE_CONCRETE,
    BLUE_CONCRETE_POWDER,
    BLUE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    BLUE_GLAZED_TERRACOTTA(Directional.class),
    BLUE_ICE,
    BLUE_ORCHID,
    /**
     * BlockData: {@link Directional}
     */
    BLUE_SHULKER_BOX(Directional.class),
    BLUE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    BLUE_STAINED_GLASS_PANE(GlassPane.class),
    BLUE_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    BLUE_WALL_BANNER(Directional.class),
    BLUE_WOOL,
    BONE,
    /**
     * BlockData: {@link Orientable}
     */
    BONE_BLOCK(Orientable.class),
    BONE_MEAL,
    BOOK,
    BOOKSHELF,
    BOW,
    BOWL,
    /**
     * BlockData: {@link Waterlogged}
     */
    BRAIN_CORAL(Waterlogged.class),
    BRAIN_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    BRAIN_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    BRAIN_CORAL_WALL_FAN(CoralWallFan.class),
    BREAD,
    /**
     * BlockData: {@link BrewingStand}
     */
    BREWING_STAND(BrewingStand.class),
    BRICK,
    BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    BRICK_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    BRICK_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    BRICK_WALL(Fence.class),
    /**
     * BlockData: {@link Rotatable}
     */
    BROWN_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    BROWN_BED(Bed.class),
    BROWN_CARPET,
    BROWN_CONCRETE,
    BROWN_CONCRETE_POWDER,
    BROWN_DYE,
    /**
     * BlockData: {@link Directional}
     */
    BROWN_GLAZED_TERRACOTTA(Directional.class),
    BROWN_MUSHROOM,
    /**
     * BlockData: {@link MultipleFacing}
     */
    BROWN_MUSHROOM_BLOCK(MultipleFacing.class),
    /**
     * BlockData: {@link Directional}
     */
    BROWN_SHULKER_BOX(Directional.class),
    BROWN_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    BROWN_STAINED_GLASS_PANE(GlassPane.class),
    BROWN_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    BROWN_WALL_BANNER(Directional.class),
    BROWN_WOOL,
    /**
     * BlockData: {@link BubbleColumn}
     */
    BUBBLE_COLUMN(BubbleColumn.class),
    /**
     * BlockData: {@link Waterlogged}
     */
    BUBBLE_CORAL(Waterlogged.class),
    BUBBLE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    BUBBLE_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    BUBBLE_CORAL_WALL_FAN(CoralWallFan.class),
    BUCKET,
    /**
     * BlockData: {@link AgeableBlock}
     */
    CACTUS(AgeableBlock.class),
    /**
     * BlockData: {@link Cake}
     */
    CAKE(Cake.class),
    /**
     * BlockData: {@link Campfire}
     */
    CAMPFIRE(Campfire.class),
    CARROT,
    /**
     * BlockData: {@link AgeableBlock}
     */
    CARROTS(AgeableBlock.class),
    CARROT_ON_A_STICK,
    CARTOGRAPHY_TABLE,
    /**
     * BlockData: {@link Directional}
     */
    CARVED_PUMPKIN(Directional.class),
    CAT_SPAWN_EGG,
    /**
     * BlockData: {@link Levelled}
     */
    CAULDRON(Levelled.class),
    CAVE_AIR,
    CAVE_SPIDER_SPAWN_EGG,
    CHAINMAIL_BOOTS,
    CHAINMAIL_CHESTPLATE,
    CHAINMAIL_HELMET,
    CHAINMAIL_LEGGINGS,
    /**
     * BlockData: {@link CommandBlock}
     */
    CHAIN_COMMAND_BLOCK(CommandBlock.class),
    CHARCOAL,
    /**
     * BlockData: {@link Chest}
     */
    CHEST(Chest.class),
    CHEST_MINECART,
    CHICKEN,
    CHICKEN_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    CHIPPED_ANVIL(Directional.class),
    CHISELED_QUARTZ_BLOCK,
    CHISELED_RED_SANDSTONE,
    CHISELED_SANDSTONE,
    CHISELED_STONE_BRICKS,
    /**
     * BlockData: {@link AgeableBlock}
     */
    CHORUS_FLOWER(AgeableBlock.class),
    CHORUS_FRUIT,
    /**
     * BlockData: {@link MultipleFacing}
     */
    CHORUS_PLANT(MultipleFacing.class),
    CLAY,
    CLAY_BALL,
    CLOCK,
    COAL,
    COAL_BLOCK,
    COAL_ORE,
    COARSE_DIRT,
    COBBLESTONE,
    /**
     * BlockData: {@link Slab}
     */
    COBBLESTONE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    COBBLESTONE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    COBBLESTONE_WALL(Fence.class),
    COBWEB,
    /**
     * BlockData: {@link Cocoa}
     */
    COCOA(Cocoa.class),
    COCOA_BEANS,
    COD,
    COD_BUCKET,
    COD_SPAWN_EGG,
    /**
     * BlockData: {@link CommandBlock}
     */
    COMMAND_BLOCK(CommandBlock.class),
    COMMAND_BLOCK_MINECART,
    /**
     * BlockData: {@link Comparator}
     */
    COMPARATOR(Comparator.class),
    COMPASS,
    /**
     * BlockData: {@link Levelled}
     */
    COMPOSTER(Levelled.class),
    /**
     * BlockData: {@link Waterlogged}
     */
    CONDUIT(Waterlogged.class),
    COOKED_BEEF,
    COOKED_CHICKEN,
    COOKED_COD,
    COOKED_MUTTON,
    COOKED_PORKCHOP,
    COOKED_RABBIT,
    COOKED_SALMON,
    COOKIE,
    CORNFLOWER,
    COW_SPAWN_EGG,
    CRACKED_STONE_BRICKS,
    CRAFTING_TABLE,
    CREEPER_BANNER_PATTERN,
    /**
     * BlockData: {@link Rotatable}
     */
    CREEPER_HEAD(Rotatable.class),
    CREEPER_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    CREEPER_WALL_HEAD(Directional.class),
    CROSSBOW,
    CUT_RED_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    CUT_RED_SANDSTONE_SLAB(Slab.class),
    CUT_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    CUT_SANDSTONE_SLAB(Slab.class),
    /**
     * BlockData: {@link Rotatable}
     */
    CYAN_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    CYAN_BED(Bed.class),
    CYAN_CARPET,
    CYAN_CONCRETE,
    CYAN_CONCRETE_POWDER,
    CYAN_DYE,
    /**
     * BlockData: {@link Directional}
     */
    CYAN_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    CYAN_SHULKER_BOX(Directional.class),
    CYAN_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    CYAN_STAINED_GLASS_PANE(GlassPane.class),
    CYAN_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    CYAN_WALL_BANNER(Directional.class),
    CYAN_WOOL,
    /**
     * BlockData: {@link Directional}
     */
    DAMAGED_ANVIL(Directional.class),
    DANDELION,
    DARK_OAK_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    DARK_OAK_BUTTON(Switch.class),
    /**
     * BlockData: {@link Door}
     */
    DARK_OAK_DOOR(Door.class),
    /**
     * BlockData: {@link Fence}
     */
    DARK_OAK_FENCE(Fence.class),
    /**
     * BlockData: {@link Gate}
     */
    DARK_OAK_FENCE_GATE(Gate.class),
    /**
     * BlockData: {@link Leaves}
     */
    DARK_OAK_LEAVES(Leaves.class),
    /**
     * BlockData: {@link Orientable}
     */
    DARK_OAK_LOG(Orientable.class),
    DARK_OAK_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    DARK_OAK_PRESSURE_PLATE(Powerable.class),
    /**
     * BlockData: {@link Sapling}
     */
    DARK_OAK_SAPLING(Sapling.class),
    /**
     * BlockData: {@link Sign}
     */
    DARK_OAK_SIGN(Sign.class),
    /**
     * BlockData: {@link Slab}
     */
    DARK_OAK_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    DARK_OAK_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Trapdoor}
     */
    DARK_OAK_TRAPDOOR(Trapdoor.class),
    /**
     * BlockData: {@link WallSign}
     */
    DARK_OAK_WALL_SIGN(WallSign.class),
    /**
     * BlockData: {@link Orientable}
     */
    DARK_OAK_WOOD(Orientable.class),
    DARK_PRISMARINE,
    /**
     * BlockData: {@link Slab}
     */
    DARK_PRISMARINE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    DARK_PRISMARINE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link DaylightDetector}
     */
    DAYLIGHT_DETECTOR(DaylightDetector.class),
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BRAIN_CORAL(Waterlogged.class),
    DEAD_BRAIN_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BRAIN_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_BRAIN_CORAL_WALL_FAN(CoralWallFan.class),
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BUBBLE_CORAL(Waterlogged.class),
    DEAD_BUBBLE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_BUBBLE_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_BUBBLE_CORAL_WALL_FAN(CoralWallFan.class),
    DEAD_BUSH,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_FIRE_CORAL(Waterlogged.class),
    DEAD_FIRE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_FIRE_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_FIRE_CORAL_WALL_FAN(CoralWallFan.class),
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_HORN_CORAL(Waterlogged.class),
    DEAD_HORN_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_HORN_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_HORN_CORAL_WALL_FAN(CoralWallFan.class),
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_TUBE_CORAL(Waterlogged.class),
    DEAD_TUBE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    DEAD_TUBE_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    DEAD_TUBE_CORAL_WALL_FAN(CoralWallFan.class),
    DEBUG_STICK,
    /**
     * BlockData: {@link RedstoneRail}
     */
    DETECTOR_RAIL(RedstoneRail.class),
    DIAMOND,
    DIAMOND_AXE,
    DIAMOND_BLOCK,
    DIAMOND_BOOTS,
    DIAMOND_CHESTPLATE,
    DIAMOND_HELMET,
    DIAMOND_HOE,
    DIAMOND_HORSE_ARMOR,
    DIAMOND_LEGGINGS,
    DIAMOND_ORE,
    DIAMOND_PICKAXE,
    DIAMOND_SHOVEL,
    DIAMOND_SWORD,
    DIORITE,
    /**
     * BlockData: {@link Slab}
     */
    DIORITE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    DIORITE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    DIORITE_WALL(Fence.class),
    DIRT,
    /**
     * BlockData: {@link Dispenser}
     */
    DISPENSER(Dispenser.class),
    DOLPHIN_SPAWN_EGG,
    DONKEY_SPAWN_EGG,
    DRAGON_BREATH,
    DRAGON_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    DRAGON_HEAD(Rotatable.class),
    /**
     * BlockData: {@link Directional}
     */
    DRAGON_WALL_HEAD(Directional.class),
    DRIED_KELP,
    DRIED_KELP_BLOCK,
    /**
     * BlockData: {@link Dispenser}
     */
    DROPPER(Dispenser.class),
    DROWNED_SPAWN_EGG,
    EGG,
    ELDER_GUARDIAN_SPAWN_EGG,
    ELYTRA,
    EMERALD,
    EMERALD_BLOCK,
    EMERALD_ORE,
    ENCHANTED_BOOK,
    ENCHANTED_GOLDEN_APPLE,
    ENCHANTING_TABLE,
    ENDERMAN_SPAWN_EGG,
    ENDERMITE_SPAWN_EGG,
    /**
     * BlockData: {@link EnderChest}
     */
    ENDER_CHEST(EnderChest.class),
    ENDER_EYE,
    ENDER_PEARL,
    END_CRYSTAL,
    END_GATEWAY,
    END_PORTAL,
    /**
     * BlockData: {@link EndPortalFrame}
     */
    END_PORTAL_FRAME(EndPortalFrame.class),
    /**
     * BlockData: {@link Directional}
     */
    END_ROD(Directional.class),
    END_STONE,
    END_STONE_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    END_STONE_BRICK_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    END_STONE_BRICK_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    END_STONE_BRICK_WALL(Fence.class),
    EVOKER_SPAWN_EGG,
    EXPERIENCE_BOTTLE,
    /**
     * BlockData: {@link Farmland}
     */
    FARMLAND(Farmland.class),
    FEATHER,
    FERMENTED_SPIDER_EYE,
    FERN,
    FILLED_MAP,
    /**
     * BlockData: {@link Fire}
     */
    FIRE(Fire.class),
    FIREWORK_ROCKET,
    FIREWORK_STAR,
    FIRE_CHARGE,
    /**
     * BlockData: {@link Waterlogged}
     */
    FIRE_CORAL(Waterlogged.class),
    FIRE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    FIRE_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    FIRE_CORAL_WALL_FAN(CoralWallFan.class),
    FISHING_ROD,
    FLETCHING_TABLE,
    FLINT,
    FLINT_AND_STEEL,
    FLOWER_BANNER_PATTERN,
    FLOWER_POT,
    FOX_SPAWN_EGG,
    /**
     * BlockData: {@link AgeableBlock}
     */
    FROSTED_ICE(AgeableBlock.class),
    /**
     * BlockData: {@link Furnace}
     */
    FURNACE(Furnace.class),
    FURNACE_MINECART,
    GHAST_SPAWN_EGG,
    GHAST_TEAR,
    GLASS,
    GLASS_BOTTLE,
    /**
     * BlockData: {@link Fence}
     */
    GLASS_PANE(Fence.class),
    GLISTERING_MELON_SLICE,
    GLOBE_BANNER_PATTERN,
    GLOWSTONE,
    GLOWSTONE_DUST,
    GOLDEN_APPLE,
    GOLDEN_AXE,
    GOLDEN_BOOTS,
    GOLDEN_CARROT,
    GOLDEN_CHESTPLATE,
    GOLDEN_HELMET,
    GOLDEN_HOE,
    GOLDEN_HORSE_ARMOR,
    GOLDEN_LEGGINGS,
    GOLDEN_PICKAXE,
    GOLDEN_SHOVEL,
    GOLDEN_SWORD,
    GOLD_BLOCK,
    GOLD_INGOT,
    GOLD_NUGGET,
    GOLD_ORE,
    GRANITE,
    /**
     * BlockData: {@link Slab}
     */
    GRANITE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    GRANITE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    GRANITE_WALL(Fence.class),
    GRASS,
    /**
     * BlockData: {@link Snowable}
     */
    GRASS_BLOCK(Snowable.class),
    GRASS_PATH,
    GRAVEL,
    /**
     * BlockData: {@link Rotatable}
     */
    GRAY_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    GRAY_BED(Bed.class),
    GRAY_CARPET,
    GRAY_CONCRETE,
    GRAY_CONCRETE_POWDER,
    GRAY_DYE,
    /**
     * BlockData: {@link Directional}
     */
    GRAY_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    GRAY_SHULKER_BOX(Directional.class),
    GRAY_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    GRAY_STAINED_GLASS_PANE(GlassPane.class),
    GRAY_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    GRAY_WALL_BANNER(Directional.class),
    GRAY_WOOL,
    /**
     * BlockData: {@link Rotatable}
     */
    GREEN_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    GREEN_BED(Bed.class),
    GREEN_CARPET,
    GREEN_CONCRETE,
    GREEN_CONCRETE_POWDER,
    GREEN_DYE,
    /**
     * BlockData: {@link Directional}
     */
    GREEN_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    GREEN_SHULKER_BOX(Directional.class),
    GREEN_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    GREEN_STAINED_GLASS_PANE(GlassPane.class),
    GREEN_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    GREEN_WALL_BANNER(Directional.class),
    GREEN_WOOL,
    /**
     * BlockData: {@link Directional}
     */
    GRINDSTONE(Directional.class),
    GUARDIAN_SPAWN_EGG,
    GUNPOWDER,
    /**
     * BlockData: {@link Orientable}
     */
    HAY_BLOCK(Orientable.class),
    HEART_OF_THE_SEA,
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    HEAVY_WEIGHTED_PRESSURE_PLATE(AnaloguePowerable.class),
    /**
     * BlockData: {@link Hopper}
     */
    HOPPER(Hopper.class),
    HOPPER_MINECART,
    /**
     * BlockData: {@link Waterlogged}
     */
    HORN_CORAL(Waterlogged.class),
    HORN_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    HORN_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    HORN_CORAL_WALL_FAN(CoralWallFan.class),
    HORSE_SPAWN_EGG,
    HUSK_SPAWN_EGG,
    ICE,
    INFESTED_CHISELED_STONE_BRICKS,
    INFESTED_COBBLESTONE,
    INFESTED_CRACKED_STONE_BRICKS,
    INFESTED_MOSSY_STONE_BRICKS,
    INFESTED_STONE,
    INFESTED_STONE_BRICKS,
    INK_SAC,
    IRON_AXE,
    /**
     * BlockData: {@link Fence}
     */
    IRON_BARS(Fence.class),
    IRON_BLOCK,
    IRON_BOOTS,
    IRON_CHESTPLATE,
    /**
     * BlockData: {@link Door}
     */
    IRON_DOOR(Door.class),
    IRON_HELMET,
    IRON_HOE,
    IRON_HORSE_ARMOR,
    IRON_INGOT,
    IRON_LEGGINGS,
    IRON_NUGGET,
    IRON_ORE,
    IRON_PICKAXE,
    IRON_SHOVEL,
    IRON_SWORD,
    /**
     * BlockData: {@link Trapdoor}
     */
    IRON_TRAPDOOR(Trapdoor.class),
    ITEM_FRAME,
    /**
     * BlockData: {@link Directional}
     */
    JACK_O_LANTERN(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    JIGSAW(Directional.class),
    /**
     * BlockData: {@link Jukebox}
     */
    JUKEBOX(Jukebox.class),
    JUNGLE_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    JUNGLE_BUTTON(Switch.class),
    /**
     * BlockData: {@link Door}
     */
    JUNGLE_DOOR(Door.class),
    /**
     * BlockData: {@link Fence}
     */
    JUNGLE_FENCE(Fence.class),
    /**
     * BlockData: {@link Gate}
     */
    JUNGLE_FENCE_GATE(Gate.class),
    /**
     * BlockData: {@link Leaves}
     */
    JUNGLE_LEAVES(Leaves.class),
    /**
     * BlockData: {@link Orientable}
     */
    JUNGLE_LOG(Orientable.class),
    JUNGLE_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    JUNGLE_PRESSURE_PLATE(Powerable.class),
    /**
     * BlockData: {@link Sapling}
     */
    JUNGLE_SAPLING(Sapling.class),
    /**
     * BlockData: {@link Sign}
     */
    JUNGLE_SIGN(Sign.class),
    /**
     * BlockData: {@link Slab}
     */
    JUNGLE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    JUNGLE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Trapdoor}
     */
    JUNGLE_TRAPDOOR(Trapdoor.class),
    /**
     * BlockData: {@link WallSign}
     */
    JUNGLE_WALL_SIGN(WallSign.class),
    /**
     * BlockData: {@link Orientable}
     */
    JUNGLE_WOOD(Orientable.class),
    /**
     * BlockData: {@link AgeableBlock}
     */
    KELP(AgeableBlock.class),
    KELP_PLANT,
    KNOWLEDGE_BOOK,
    /**
     * BlockData: {@link Ladder}
     */
    LADDER(Ladder.class),
    /**
     * BlockData: {@link Lantern}
     */
    LANTERN(Lantern.class),
    LAPIS_BLOCK,
    LAPIS_LAZULI,
    LAPIS_ORE,
    /**
     * BlockData: {@link Bisected}
     */
    LARGE_FERN(Bisected.class),
    /**
     * BlockData: {@link Levelled}
     */
    LAVA(Levelled.class),
    LAVA_BUCKET,
    LEAD,
    LEATHER,
    LEATHER_BOOTS,
    LEATHER_CHESTPLATE,
    LEATHER_HELMET,
    LEATHER_HORSE_ARMOR,
    LEATHER_LEGGINGS,
    /**
     * BlockData: {@link Lectern}
     */
    LECTERN(Lectern.class),
    /**
     * BlockData: {@link Switch}
     */
    LEVER(Switch.class),
    /**
     * BlockData: {@link Rotatable}
     */
    LIGHT_BLUE_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    LIGHT_BLUE_BED(Bed.class),
    LIGHT_BLUE_CARPET,
    LIGHT_BLUE_CONCRETE,
    LIGHT_BLUE_CONCRETE_POWDER,
    LIGHT_BLUE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_BLUE_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_BLUE_SHULKER_BOX(Directional.class),
    LIGHT_BLUE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    LIGHT_BLUE_STAINED_GLASS_PANE(GlassPane.class),
    LIGHT_BLUE_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_BLUE_WALL_BANNER(Directional.class),
    LIGHT_BLUE_WOOL,
    /**
     * BlockData: {@link Rotatable}
     */
    LIGHT_GRAY_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    LIGHT_GRAY_BED(Bed.class),
    LIGHT_GRAY_CARPET,
    LIGHT_GRAY_CONCRETE,
    LIGHT_GRAY_CONCRETE_POWDER,
    LIGHT_GRAY_DYE,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_GRAY_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_GRAY_SHULKER_BOX(Directional.class),
    LIGHT_GRAY_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    LIGHT_GRAY_STAINED_GLASS_PANE(GlassPane.class),
    LIGHT_GRAY_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    LIGHT_GRAY_WALL_BANNER(Directional.class),
    LIGHT_GRAY_WOOL,
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    LIGHT_WEIGHTED_PRESSURE_PLATE(AnaloguePowerable.class),
    /**
     * BlockData: {@link Bisected}
     */
    LILAC(Bisected.class),
    LILY_OF_THE_VALLEY,
    LILY_PAD,
    /**
     * BlockData: {@link Rotatable}
     */
    LIME_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    LIME_BED(Bed.class),
    LIME_CARPET,
    LIME_CONCRETE,
    LIME_CONCRETE_POWDER,
    LIME_DYE,
    /**
     * BlockData: {@link Directional}
     */
    LIME_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    LIME_SHULKER_BOX(Directional.class),
    LIME_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    LIME_STAINED_GLASS_PANE(GlassPane.class),
    LIME_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    LIME_WALL_BANNER(Directional.class),
    LIME_WOOL,
    LINGERING_POTION,
    LLAMA_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    LOOM(Directional.class),
    /**
     * BlockData: {@link Rotatable}
     */
    MAGENTA_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    MAGENTA_BED(Bed.class),
    MAGENTA_CARPET,
    MAGENTA_CONCRETE,
    MAGENTA_CONCRETE_POWDER,
    MAGENTA_DYE,
    /**
     * BlockData: {@link Directional}
     */
    MAGENTA_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    MAGENTA_SHULKER_BOX(Directional.class),
    MAGENTA_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    MAGENTA_STAINED_GLASS_PANE(GlassPane.class),
    MAGENTA_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    MAGENTA_WALL_BANNER(Directional.class),
    MAGENTA_WOOL,
    MAGMA_BLOCK,
    MAGMA_CREAM,
    MAGMA_CUBE_SPAWN_EGG,
    MAP,
    MELON,
    MELON_SEEDS,
    MELON_SLICE,
    /**
     * BlockData: {@link AgeableBlock}
     */
    MELON_STEM(AgeableBlock.class),
    MILK_BUCKET,
    MINECART,
    MOJANG_BANNER_PATTERN,
    MOOSHROOM_SPAWN_EGG,
    /**
     * BlockData: {@link MultipleFacing}
     */
    MOSSY_COBBLESTONE(MultipleFacing.class),
    /**
     * BlockData: {@link Slab}
     */
    MOSSY_COBBLESTONE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    MOSSY_COBBLESTONE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    MOSSY_COBBLESTONE_WALL(Fence.class),
    MOSSY_STONE_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    MOSSY_STONE_BRICK_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    MOSSY_STONE_BRICK_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    MOSSY_STONE_BRICK_WALL(Fence.class),
    /**
     * BlockData: {@link TechnicalPiston}
     */
    MOVING_PISTON(TechnicalPiston.class),
    MULE_SPAWN_EGG,
    /**
     * BlockData: {@link MultipleFacing}
     */
    MUSHROOM_STEM(MultipleFacing.class),
    MUSHROOM_STEW,
    MUSIC_DISC_11,
    MUSIC_DISC_13,
    MUSIC_DISC_BLOCKS,
    MUSIC_DISC_CAT,
    MUSIC_DISC_CHIRP,
    MUSIC_DISC_FAR,
    MUSIC_DISC_MALL,
    MUSIC_DISC_MELLOHI,
    MUSIC_DISC_STAL,
    MUSIC_DISC_STRAD,
    MUSIC_DISC_WAIT,
    MUSIC_DISC_WARD,
    MUTTON,
    /**
     * BlockData: {@link Snowable}
     */
    MYCELIUM(Snowable.class),
    NAME_TAG,
    NAUTILUS_SHELL,
    NETHERRACK,
    NETHER_BRICK,
    NETHER_BRICKS,
    /**
     * BlockData: {@link Fence}
     */
    NETHER_BRICK_FENCE(Fence.class),
    /**
     * BlockData: {@link Slab}
     */
    NETHER_BRICK_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    NETHER_BRICK_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    NETHER_BRICK_WALL(Fence.class),
    /**
     * BlockData: {@link Orientable}
     */
    NETHER_PORTAL(Orientable.class),
    NETHER_QUARTZ_ORE,
    NETHER_STAR,
    /**
     * BlockData: {@link AgeableBlock}
     */
    NETHER_WART(AgeableBlock.class),
    NETHER_WART_BLOCK,
    /**
     * BlockData: {@link NoteBlock}
     */
    NOTE_BLOCK(NoteBlock.class),
    OAK_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    OAK_BUTTON(Switch.class),
    /**
     * BlockData: {@link Door}
     */
    OAK_DOOR(Door.class),
    /**
     * BlockData: {@link Fence}
     */
    OAK_FENCE(Fence.class),
    /**
     * BlockData: {@link Gate}
     */
    OAK_FENCE_GATE(Gate.class),
    /**
     * BlockData: {@link Leaves}
     */
    OAK_LEAVES(Leaves.class),
    /**
     * BlockData: {@link Orientable}
     */
    OAK_LOG(Orientable.class),
    OAK_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    OAK_PRESSURE_PLATE(Powerable.class),
    /**
     * BlockData: {@link Sapling}
     */
    OAK_SAPLING(Sapling.class),
    /**
     * BlockData: {@link Sign}
     */
    OAK_SIGN(Sign.class),
    /**
     * BlockData: {@link Slab}
     */
    OAK_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    OAK_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Trapdoor}
     */
    OAK_TRAPDOOR(Trapdoor.class),
    /**
     * BlockData: {@link WallSign}
     */
    OAK_WALL_SIGN(WallSign.class),
    /**
     * BlockData: {@link Orientable}
     */
    OAK_WOOD(Orientable.class),
    /**
     * BlockData: {@link Observer}
     */
    OBSERVER(Observer.class),
    OBSIDIAN,
    OCELOT_SPAWN_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    ORANGE_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    ORANGE_BED(Bed.class),
    ORANGE_CARPET,
    ORANGE_CONCRETE,
    ORANGE_CONCRETE_POWDER,
    ORANGE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    ORANGE_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    ORANGE_SHULKER_BOX(Directional.class),
    ORANGE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    ORANGE_STAINED_GLASS_PANE(GlassPane.class),
    ORANGE_TERRACOTTA,
    ORANGE_TULIP,
    /**
     * BlockData: {@link Directional}
     */
    ORANGE_WALL_BANNER(Directional.class),
    ORANGE_WOOL,
    OXEYE_DAISY,
    PACKED_ICE,
    PAINTING,
    PANDA_SPAWN_EGG,
    PAPER,
    PARROT_SPAWN_EGG,
    /**
     * BlockData: {@link Bisected}
     */
    PEONY(Bisected.class),
    /**
     * BlockData: {@link Slab}
     */
    PETRIFIED_OAK_SLAB(Slab.class),
    PHANTOM_MEMBRANE,
    PHANTOM_SPAWN_EGG,
    PIG_SPAWN_EGG,
    PILLAGER_SPAWN_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    PINK_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    PINK_BED(Bed.class),
    PINK_CARPET,
    PINK_CONCRETE,
    PINK_CONCRETE_POWDER,
    PINK_DYE,
    /**
     * BlockData: {@link Directional}
     */
    PINK_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    PINK_SHULKER_BOX(Directional.class),
    PINK_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    PINK_STAINED_GLASS_PANE(GlassPane.class),
    PINK_TERRACOTTA,
    PINK_TULIP,
    /**
     * BlockData: {@link Directional}
     */
    PINK_WALL_BANNER(Directional.class),
    PINK_WOOL,
    /**
     * BlockData: {@link Piston}
     */
    PISTON(Piston.class),
    /**
     * BlockData: {@link PistonHead}
     */
    PISTON_HEAD(PistonHead.class),
    /**
     * BlockData: {@link Rotatable}
     */
    PLAYER_HEAD(Rotatable.class),
    /**
     * BlockData: {@link Directional}
     */
    PLAYER_WALL_HEAD(Directional.class),
    /**
     * BlockData: {@link Snowable}
     */
    PODZOL(Snowable.class),
    POISONOUS_POTATO,
    POLAR_BEAR_SPAWN_EGG,
    POLISHED_ANDESITE,
    /**
     * BlockData: {@link Slab}
     */
    POLISHED_ANDESITE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_ANDESITE_STAIRS(Stairs.class),
    POLISHED_DIORITE,
    /**
     * BlockData: {@link Slab}
     */
    POLISHED_DIORITE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_DIORITE_STAIRS(Stairs.class),
    POLISHED_GRANITE,
    /**
     * BlockData: {@link Slab}
     */
    POLISHED_GRANITE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    POLISHED_GRANITE_STAIRS(Stairs.class),
    POPPED_CHORUS_FRUIT,
    POPPY,
    PORKCHOP,
    POTATO,
    /**
     * BlockData: {@link AgeableBlock}
     */
    POTATOES(AgeableBlock.class),
    POTION,
    POTTED_ACACIA_SAPLING,
    POTTED_ALLIUM,
    POTTED_AZURE_BLUET,
    POTTED_BAMBOO,
    POTTED_BIRCH_SAPLING,
    POTTED_BLUE_ORCHID,
    POTTED_BROWN_MUSHROOM,
    POTTED_CACTUS,
    POTTED_CORNFLOWER,
    POTTED_DANDELION,
    POTTED_DARK_OAK_SAPLING,
    POTTED_DEAD_BUSH,
    POTTED_FERN,
    POTTED_JUNGLE_SAPLING,
    POTTED_LILY_OF_THE_VALLEY,
    POTTED_OAK_SAPLING,
    POTTED_ORANGE_TULIP,
    POTTED_OXEYE_DAISY,
    POTTED_PINK_TULIP,
    POTTED_POPPY,
    POTTED_RED_MUSHROOM,
    POTTED_RED_TULIP,
    POTTED_SPRUCE_SAPLING,
    POTTED_WHITE_TULIP,
    POTTED_WITHER_ROSE,
    /**
     * BlockData: {@link RedstoneRail}
     */
    POWERED_RAIL(RedstoneRail.class),
    PRISMARINE,
    PRISMARINE_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    PRISMARINE_BRICK_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    PRISMARINE_BRICK_STAIRS(Stairs.class),
    PRISMARINE_CRYSTALS,
    PRISMARINE_SHARD,
    /**
     * BlockData: {@link Slab}
     */
    PRISMARINE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    PRISMARINE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    PRISMARINE_WALL(Fence.class),
    PUFFERFISH,
    PUFFERFISH_BUCKET,
    PUFFERFISH_SPAWN_EGG,
    PUMPKIN,
    PUMPKIN_PIE,
    PUMPKIN_SEEDS,
    /**
     * BlockData: {@link AgeableBlock}
     */
    PUMPKIN_STEM(AgeableBlock.class),
    /**
     * BlockData: {@link Rotatable}
     */
    PURPLE_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    PURPLE_BED(Bed.class),
    PURPLE_CARPET,
    PURPLE_CONCRETE,
    PURPLE_CONCRETE_POWDER,
    PURPLE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    PURPLE_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    PURPLE_SHULKER_BOX(Directional.class),
    PURPLE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    PURPLE_STAINED_GLASS_PANE(GlassPane.class),
    PURPLE_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    PURPLE_WALL_BANNER(Directional.class),
    PURPLE_WOOL,
    PURPUR_BLOCK,
    /**
     * BlockData: {@link Orientable}
     */
    PURPUR_PILLAR(Orientable.class),
    /**
     * BlockData: {@link Slab}
     */
    PURPUR_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    PURPUR_STAIRS(Stairs.class),
    QUARTZ,
    QUARTZ_BLOCK,
    /**
     * BlockData: {@link Orientable}
     */
    QUARTZ_PILLAR(Orientable.class),
    /**
     * BlockData: {@link Slab}
     */
    QUARTZ_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    QUARTZ_STAIRS(Stairs.class),
    RABBIT,
    RABBIT_FOOT,
    RABBIT_HIDE,
    RABBIT_SPAWN_EGG,
    RABBIT_STEW,
    /**
     * BlockData: {@link Rail}
     */
    RAIL(Rail.class),
    RAVAGER_SPAWN_EGG,
    REDSTONE,
    REDSTONE_BLOCK,
    /**
     * BlockData: {@link Lightable}
     */
    REDSTONE_LAMP(Lightable.class),
    /**
     * BlockData: {@link Lightable}
     */
    REDSTONE_ORE(Lightable.class),
    /**
     * BlockData: {@link Lightable}
     */
    REDSTONE_TORCH(Lightable.class),
    /**
     * BlockData: {@link RedstoneWallTorch}
     */
    REDSTONE_WALL_TORCH(RedstoneWallTorch.class),
    /**
     * BlockData: {@link RedstoneWire}
     */
    REDSTONE_WIRE(RedstoneWire.class),
    /**
     * BlockData: {@link Rotatable}
     */
    RED_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    RED_BED(Bed.class),
    RED_CARPET,
    RED_CONCRETE,
    RED_CONCRETE_POWDER,
    RED_DYE,
    /**
     * BlockData: {@link Directional}
     */
    RED_GLAZED_TERRACOTTA(Directional.class),
    RED_MUSHROOM,
    /**
     * BlockData: {@link MultipleFacing}
     */
    RED_MUSHROOM_BLOCK(MultipleFacing.class),
    RED_NETHER_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    RED_NETHER_BRICK_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    RED_NETHER_BRICK_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    RED_NETHER_BRICK_WALL(Fence.class),
    RED_SAND,
    RED_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    RED_SANDSTONE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    RED_SANDSTONE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    RED_SANDSTONE_WALL(Fence.class),
    /**
     * BlockData: {@link Directional}
     */
    RED_SHULKER_BOX(Directional.class),
    RED_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    RED_STAINED_GLASS_PANE(GlassPane.class),
    RED_TERRACOTTA,
    RED_TULIP,
    /**
     * BlockData: {@link Directional}
     */
    RED_WALL_BANNER(Directional.class),
    RED_WOOL,
    /**
     * BlockData: {@link Repeater}
     */
    REPEATER(Repeater.class),
    /**
     * BlockData: {@link CommandBlock}
     */
    REPEATING_COMMAND_BLOCK(CommandBlock.class),
    /**
     * BlockData: {@link Bisected}
     */
    ROSE_BUSH(Bisected.class),
    ROTTEN_FLESH,
    SADDLE,
    SALMON,
    SALMON_BUCKET,
    SALMON_SPAWN_EGG,
    SAND,
    SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    SANDSTONE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    SANDSTONE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    SANDSTONE_WALL(Fence.class),
    /**
     * BlockData: {@link Scaffolding}
     */
    SCAFFOLDING(Scaffolding.class),
    SCUTE,
    SEAGRASS,
    SEA_LANTERN,
    /**
     * BlockData: {@link SeaPickle}
     */
    SEA_PICKLE(SeaPickle.class),
    SHEARS,
    SHEEP_SPAWN_EGG,
    SHIELD,
    /**
     * BlockData: {@link Directional}
     */
    SHULKER_BOX(Directional.class),
    SHULKER_SHELL,
    SHULKER_SPAWN_EGG,
    SILVERFISH_SPAWN_EGG,
    SKELETON_HORSE_SPAWN_EGG,
    /**
     * BlockData: {@link Rotatable}
     */
    SKELETON_SKULL(Rotatable.class),
    SKELETON_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    SKELETON_WALL_SKULL(Directional.class),
    SKULL_BANNER_PATTERN,
    SLIME_BALL,
    SLIME_BLOCK,
    SLIME_SPAWN_EGG,
    SMITHING_TABLE,
    /**
     * BlockData: {@link Furnace}
     */
    SMOKER(Furnace.class),
    SMOOTH_QUARTZ,
    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_QUARTZ_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    SMOOTH_QUARTZ_STAIRS(Stairs.class),
    SMOOTH_RED_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_RED_SANDSTONE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    SMOOTH_RED_SANDSTONE_STAIRS(Stairs.class),
    SMOOTH_SANDSTONE,
    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_SANDSTONE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    SMOOTH_SANDSTONE_STAIRS(Stairs.class),
    SMOOTH_STONE,
    /**
     * BlockData: {@link Slab}
     */
    SMOOTH_STONE_SLAB(Slab.class),
    /**
     * BlockData: {@link Snow}
     */
    SNOW(Snow.class),
    SNOWBALL,
    SNOW_BLOCK,
    SOUL_SAND,
    SPAWNER,
    SPECTRAL_ARROW,
    SPIDER_EYE,
    SPIDER_SPAWN_EGG,
    SPLASH_POTION,
    SPONGE,
    SPRUCE_BOAT,
    /**
     * BlockData: {@link Switch}
     */
    SPRUCE_BUTTON(Switch.class),
    /**
     * BlockData: {@link Door}
     */
    SPRUCE_DOOR(Door.class),
    /**
     * BlockData: {@link Fence}
     */
    SPRUCE_FENCE(Fence.class),
    /**
     * BlockData: {@link Gate}
     */
    SPRUCE_FENCE_GATE(Gate.class),
    /**
     * BlockData: {@link Leaves}
     */
    SPRUCE_LEAVES(Leaves.class),
    /**
     * BlockData: {@link Orientable}
     */
    SPRUCE_LOG(Orientable.class),
    SPRUCE_PLANKS,
    /**
     * BlockData: {@link Powerable}
     */
    SPRUCE_PRESSURE_PLATE(Powerable.class),
    /**
     * BlockData: {@link Sapling}
     */
    SPRUCE_SAPLING(Sapling.class),
    /**
     * BlockData: {@link Sign}
     */
    SPRUCE_SIGN(Sign.class),
    /**
     * BlockData: {@link Slab}
     */
    SPRUCE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    SPRUCE_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Trapdoor}
     */
    SPRUCE_TRAPDOOR(Trapdoor.class),
    /**
     * BlockData: {@link WallSign}
     */
    SPRUCE_WALL_SIGN(WallSign.class),
    /**
     * BlockData: {@link Orientable}
     */
    SPRUCE_WOOD(Orientable.class),
    SQUID_SPAWN_EGG,
    STICK,
    /**
     * BlockData: {@link Piston}
     */
    STICKY_PISTON(Piston.class),
    STONE,
    /**
     * BlockData: {@link Directional}
     */
    STONECUTTER(Directional.class),
    STONE_AXE,
    STONE_BRICKS,
    /**
     * BlockData: {@link Slab}
     */
    STONE_BRICK_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    STONE_BRICK_STAIRS(Stairs.class),
    /**
     * BlockData: {@link Fence}
     */
    STONE_BRICK_WALL(Fence.class),
    /**
     * BlockData: {@link Switch}
     */
    STONE_BUTTON(Switch.class),
    STONE_HOE,
    STONE_PICKAXE,
    /**
     * BlockData: {@link Powerable}
     */
    STONE_PRESSURE_PLATE(Powerable.class),
    STONE_SHOVEL,
    /**
     * BlockData: {@link Slab}
     */
    STONE_SLAB(Slab.class),
    /**
     * BlockData: {@link Stairs}
     */
    STONE_STAIRS(Stairs.class),
    STONE_SWORD,
    STRAY_SPAWN_EGG,
    STRING,
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_ACACIA_LOG(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_ACACIA_WOOD(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_BIRCH_LOG(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_BIRCH_WOOD(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_DARK_OAK_LOG(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_DARK_OAK_WOOD(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_JUNGLE_LOG(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_JUNGLE_WOOD(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_OAK_LOG(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_OAK_WOOD(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_SPRUCE_LOG(Orientable.class),
    /**
     * BlockData: {@link Orientable}
     */
    STRIPPED_SPRUCE_WOOD(Orientable.class),
    /**
     * BlockData: {@link StructureBlock}
     */
    STRUCTURE_BLOCK(StructureBlock.class),
    STRUCTURE_VOID,
    SUGAR,
    /**
     * BlockData: {@link AgeableBlock}
     */
    SUGAR_CANE(AgeableBlock.class),
    /**
     * BlockData: {@link Bisected}
     */
    SUNFLOWER(Bisected.class),
    SUSPICIOUS_STEW,
    SWEET_BERRIES,
    /**
     * BlockData: {@link AgeableBlock}
     */
    SWEET_BERRY_BUSH(AgeableBlock.class),
    /**
     * BlockData: {@link Bisected}
     */
    TALL_GRASS(Bisected.class),
    /**
     * BlockData: {@link Bisected}
     */
    TALL_SEAGRASS(Bisected.class),
    TERRACOTTA,
    TIPPED_ARROW,
    /**
     * BlockData: {@link TNT}
     */
    TNT(TNT.class),
    TNT_MINECART,
    TORCH,
    TOTEM_OF_UNDYING,
    TRADER_LLAMA_SPAWN_EGG,
    /**
     * BlockData: {@link Chest}
     */
    TRAPPED_CHEST(Chest.class),
    TRIDENT,
    /**
     * BlockData: {@link Tripwire}
     */
    TRIPWIRE(Tripwire.class),
    /**
     * BlockData: {@link TripwireHook}
     */
    TRIPWIRE_HOOK(TripwireHook.class),
    TROPICAL_FISH,
    TROPICAL_FISH_BUCKET,
    TROPICAL_FISH_SPAWN_EGG,
    /**
     * BlockData: {@link Waterlogged}
     */
    TUBE_CORAL(Waterlogged.class),
    TUBE_CORAL_BLOCK,
    /**
     * BlockData: {@link Waterlogged}
     */
    TUBE_CORAL_FAN(Waterlogged.class),
    /**
     * BlockData: {@link CoralWallFan}
     */
    TUBE_CORAL_WALL_FAN(CoralWallFan.class),
    /**
     * BlockData: {@link TurtleEgg}
     */
    TURTLE_EGG(TurtleEgg.class),
    TURTLE_HELMET,
    TURTLE_SPAWN_EGG,
    VEX_SPAWN_EGG,
    VILLAGER_SPAWN_EGG,
    VINDICATOR_SPAWN_EGG,
    /**
     * BlockData: {@link MultipleFacing}
     */
    VINE(MultipleFacing.class),
    VOID_AIR,
    /**
     * BlockData: {@link Directional}
     */
    WALL_TORCH(Directional.class),
    WANDERING_TRADER_SPAWN_EGG,
    /**
     * BlockData: {@link Levelled}
     */
    WATER(Levelled.class),
    WATER_BUCKET,
    WET_SPONGE,
    /**
     * BlockData: {@link AgeableBlock}
     */
    WHEAT(AgeableBlock.class),
    WHEAT_SEEDS,
    /**
     * BlockData: {@link Rotatable}
     */
    WHITE_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    WHITE_BED(Bed.class),
    WHITE_CARPET,
    WHITE_CONCRETE,
    WHITE_CONCRETE_POWDER,
    WHITE_DYE,
    /**
     * BlockData: {@link Directional}
     */
    WHITE_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    WHITE_SHULKER_BOX(Directional.class),
    WHITE_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    WHITE_STAINED_GLASS_PANE(GlassPane.class),
    WHITE_TERRACOTTA,
    WHITE_TULIP,
    /**
     * BlockData: {@link Directional}
     */
    WHITE_WALL_BANNER(Directional.class),
    WHITE_WOOL,
    WITCH_SPAWN_EGG,
    WITHER_ROSE,
    /**
     * BlockData: {@link Rotatable}
     */
    WITHER_SKELETON_SKULL(Rotatable.class),
    WITHER_SKELETON_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    WITHER_SKELETON_WALL_SKULL(Directional.class),
    WOLF_SPAWN_EGG,
    WOODEN_AXE,
    WOODEN_HOE,
    WOODEN_PICKAXE,
    WOODEN_SHOVEL,
    WOODEN_SWORD,
    WRITABLE_BOOK,
    WRITTEN_BOOK,
    /**
     * BlockData: {@link Rotatable}
     */
    YELLOW_BANNER(Rotatable.class),
    /**
     * BlockData: {@link Bed}
     */
    YELLOW_BED(Bed.class),
    YELLOW_CARPET,
    YELLOW_CONCRETE,
    YELLOW_CONCRETE_POWDER,
    YELLOW_DYE,
    /**
     * BlockData: {@link Directional}
     */
    YELLOW_GLAZED_TERRACOTTA(Directional.class),
    /**
     * BlockData: {@link Directional}
     */
    YELLOW_SHULKER_BOX(Directional.class),
    YELLOW_STAINED_GLASS,
    /**
     * BlockData: {@link GlassPane}
     */
    YELLOW_STAINED_GLASS_PANE(GlassPane.class),
    YELLOW_TERRACOTTA,
    /**
     * BlockData: {@link Directional}
     */
    YELLOW_WALL_BANNER(Directional.class),
    YELLOW_WOOL,
    /**
     * BlockData: {@link Rotatable}
     */
    ZOMBIE_HEAD(Rotatable.class),
    ZOMBIE_HORSE_SPAWN_EGG,
    ZOMBIE_PIGMAN_SPAWN_EGG,
    ZOMBIE_SPAWN_EGG,
    ZOMBIE_VILLAGER_SPAWN_EGG,
    /**
     * BlockData: {@link Directional}
     */
    ZOMBIE_WALL_HEAD(Directional.class);

    
    private final Class<? extends BlockData> blockDataClass;
    
    private Material() {
        this.blockDataClass = null;
    }
    
    private Material(Class<? extends BlockData> clazz) {
        this.blockDataClass = clazz;
    }
    
    public Class<? extends BlockData> getBlockDataClass() {
        return blockDataClass;
    }
    
    /**
     * Checks if this Material is a placable block
     *
     * @return true if this material is a block
     */
    public boolean isBlock() {
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isBlock">
            case ACACIA_BUTTON:
            case ACACIA_DOOR:
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case ACACIA_LEAVES:
            case ACACIA_LOG:
            case ACACIA_PLANKS:
            case ACACIA_PRESSURE_PLATE:
            case ACACIA_SAPLING:
            case ACACIA_SIGN:
            case ACACIA_SLAB:
            case ACACIA_STAIRS:
            case ACACIA_TRAPDOOR:
            case ACACIA_WALL_SIGN:
            case ACACIA_WOOD:
            case ACTIVATOR_RAIL:
            case AIR:
            case ALLIUM:
            case ANDESITE:
            case ANDESITE_SLAB:
            case ANDESITE_STAIRS:
            case ANDESITE_WALL:
            case ANVIL:
            case ATTACHED_MELON_STEM:
            case ATTACHED_PUMPKIN_STEM:
            case AZURE_BLUET:
            case BAMBOO:
            case BAMBOO_SAPLING:
            case BARREL:
            case BARRIER:
            case BEACON:
            case BEDROCK:
            case BEETROOTS:
            case BELL:
            case BIRCH_BUTTON:
            case BIRCH_DOOR:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case BIRCH_LEAVES:
            case BIRCH_LOG:
            case BIRCH_PLANKS:
            case BIRCH_PRESSURE_PLATE:
            case BIRCH_SAPLING:
            case BIRCH_SIGN:
            case BIRCH_SLAB:
            case BIRCH_STAIRS:
            case BIRCH_TRAPDOOR:
            case BIRCH_WALL_SIGN:
            case BIRCH_WOOD:
            case BLACK_BANNER:
            case BLACK_BED:
            case BLACK_CARPET:
            case BLACK_CONCRETE:
            case BLACK_CONCRETE_POWDER:
            case BLACK_GLAZED_TERRACOTTA:
            case BLACK_SHULKER_BOX:
            case BLACK_STAINED_GLASS:
            case BLACK_STAINED_GLASS_PANE:
            case BLACK_TERRACOTTA:
            case BLACK_WALL_BANNER:
            case BLACK_WOOL:
            case BLAST_FURNACE:
            case BLUE_BANNER:
            case BLUE_BED:
            case BLUE_CARPET:
            case BLUE_CONCRETE:
            case BLUE_CONCRETE_POWDER:
            case BLUE_GLAZED_TERRACOTTA:
            case BLUE_ICE:
            case BLUE_ORCHID:
            case BLUE_SHULKER_BOX:
            case BLUE_STAINED_GLASS:
            case BLUE_STAINED_GLASS_PANE:
            case BLUE_TERRACOTTA:
            case BLUE_WALL_BANNER:
            case BLUE_WOOL:
            case BONE_BLOCK:
            case BOOKSHELF:
            case BRAIN_CORAL:
            case BRAIN_CORAL_BLOCK:
            case BRAIN_CORAL_FAN:
            case BRAIN_CORAL_WALL_FAN:
            case BREWING_STAND:
            case BRICKS:
            case BRICK_SLAB:
            case BRICK_STAIRS:
            case BRICK_WALL:
            case BROWN_BANNER:
            case BROWN_BED:
            case BROWN_CARPET:
            case BROWN_CONCRETE:
            case BROWN_CONCRETE_POWDER:
            case BROWN_GLAZED_TERRACOTTA:
            case BROWN_MUSHROOM:
            case BROWN_MUSHROOM_BLOCK:
            case BROWN_SHULKER_BOX:
            case BROWN_STAINED_GLASS:
            case BROWN_STAINED_GLASS_PANE:
            case BROWN_TERRACOTTA:
            case BROWN_WALL_BANNER:
            case BROWN_WOOL:
            case BUBBLE_COLUMN:
            case BUBBLE_CORAL:
            case BUBBLE_CORAL_BLOCK:
            case BUBBLE_CORAL_FAN:
            case BUBBLE_CORAL_WALL_FAN:
            case CACTUS:
            case CAKE:
            case CAMPFIRE:
            case CARROTS:
            case CARTOGRAPHY_TABLE:
            case CARVED_PUMPKIN:
            case CAULDRON:
            case CAVE_AIR:
            case CHAIN_COMMAND_BLOCK:
            case CHEST:
            case CHIPPED_ANVIL:
            case CHISELED_QUARTZ_BLOCK:
            case CHISELED_RED_SANDSTONE:
            case CHISELED_SANDSTONE:
            case CHISELED_STONE_BRICKS:
            case CHORUS_FLOWER:
            case CHORUS_PLANT:
            case CLAY:
            case COAL_BLOCK:
            case COAL_ORE:
            case COARSE_DIRT:
            case COBBLESTONE:
            case COBBLESTONE_SLAB:
            case COBBLESTONE_STAIRS:
            case COBBLESTONE_WALL:
            case COBWEB:
            case COCOA:
            case COMMAND_BLOCK:
            case COMPARATOR:
            case COMPOSTER:
            case CONDUIT:
            case CORNFLOWER:
            case CRACKED_STONE_BRICKS:
            case CRAFTING_TABLE:
            case CREEPER_HEAD:
            case CREEPER_WALL_HEAD:
            case CUT_RED_SANDSTONE:
            case CUT_RED_SANDSTONE_SLAB:
            case CUT_SANDSTONE:
            case CUT_SANDSTONE_SLAB:
            case CYAN_BANNER:
            case CYAN_BED:
            case CYAN_CARPET:
            case CYAN_CONCRETE:
            case CYAN_CONCRETE_POWDER:
            case CYAN_GLAZED_TERRACOTTA:
            case CYAN_SHULKER_BOX:
            case CYAN_STAINED_GLASS:
            case CYAN_STAINED_GLASS_PANE:
            case CYAN_TERRACOTTA:
            case CYAN_WALL_BANNER:
            case CYAN_WOOL:
            case DAMAGED_ANVIL:
            case DANDELION:
            case DARK_OAK_BUTTON:
            case DARK_OAK_DOOR:
            case DARK_OAK_FENCE:
            case DARK_OAK_FENCE_GATE:
            case DARK_OAK_LEAVES:
            case DARK_OAK_LOG:
            case DARK_OAK_PLANKS:
            case DARK_OAK_PRESSURE_PLATE:
            case DARK_OAK_SAPLING:
            case DARK_OAK_SIGN:
            case DARK_OAK_SLAB:
            case DARK_OAK_STAIRS:
            case DARK_OAK_TRAPDOOR:
            case DARK_OAK_WALL_SIGN:
            case DARK_OAK_WOOD:
            case DARK_PRISMARINE:
            case DARK_PRISMARINE_SLAB:
            case DARK_PRISMARINE_STAIRS:
            case DAYLIGHT_DETECTOR:
            case DEAD_BRAIN_CORAL:
            case DEAD_BRAIN_CORAL_BLOCK:
            case DEAD_BRAIN_CORAL_FAN:
            case DEAD_BRAIN_CORAL_WALL_FAN:
            case DEAD_BUBBLE_CORAL:
            case DEAD_BUBBLE_CORAL_BLOCK:
            case DEAD_BUBBLE_CORAL_FAN:
            case DEAD_BUBBLE_CORAL_WALL_FAN:
            case DEAD_BUSH:
            case DEAD_FIRE_CORAL:
            case DEAD_FIRE_CORAL_BLOCK:
            case DEAD_FIRE_CORAL_FAN:
            case DEAD_FIRE_CORAL_WALL_FAN:
            case DEAD_HORN_CORAL:
            case DEAD_HORN_CORAL_BLOCK:
            case DEAD_HORN_CORAL_FAN:
            case DEAD_HORN_CORAL_WALL_FAN:
            case DEAD_TUBE_CORAL:
            case DEAD_TUBE_CORAL_BLOCK:
            case DEAD_TUBE_CORAL_FAN:
            case DEAD_TUBE_CORAL_WALL_FAN:
            case DETECTOR_RAIL:
            case DIAMOND_BLOCK:
            case DIAMOND_ORE:
            case DIORITE:
            case DIORITE_SLAB:
            case DIORITE_STAIRS:
            case DIORITE_WALL:
            case DIRT:
            case DISPENSER:
            case DRAGON_EGG:
            case DRAGON_HEAD:
            case DRAGON_WALL_HEAD:
            case DRIED_KELP_BLOCK:
            case DROPPER:
            case EMERALD_BLOCK:
            case EMERALD_ORE:
            case ENCHANTING_TABLE:
            case ENDER_CHEST:
            case END_GATEWAY:
            case END_PORTAL:
            case END_PORTAL_FRAME:
            case END_ROD:
            case END_STONE:
            case END_STONE_BRICKS:
            case END_STONE_BRICK_SLAB:
            case END_STONE_BRICK_STAIRS:
            case END_STONE_BRICK_WALL:
            case FARMLAND:
            case FERN:
            case FIRE:
            case FIRE_CORAL:
            case FIRE_CORAL_BLOCK:
            case FIRE_CORAL_FAN:
            case FIRE_CORAL_WALL_FAN:
            case FLETCHING_TABLE:
            case FLOWER_POT:
            case FROSTED_ICE:
            case FURNACE:
            case GLASS:
            case GLASS_PANE:
            case GLOWSTONE:
            case GOLD_BLOCK:
            case GOLD_ORE:
            case GRANITE:
            case GRANITE_SLAB:
            case GRANITE_STAIRS:
            case GRANITE_WALL:
            case GRASS:
            case GRASS_BLOCK:
            case GRASS_PATH:
            case GRAVEL:
            case GRAY_BANNER:
            case GRAY_BED:
            case GRAY_CARPET:
            case GRAY_CONCRETE:
            case GRAY_CONCRETE_POWDER:
            case GRAY_GLAZED_TERRACOTTA:
            case GRAY_SHULKER_BOX:
            case GRAY_STAINED_GLASS:
            case GRAY_STAINED_GLASS_PANE:
            case GRAY_TERRACOTTA:
            case GRAY_WALL_BANNER:
            case GRAY_WOOL:
            case GREEN_BANNER:
            case GREEN_BED:
            case GREEN_CARPET:
            case GREEN_CONCRETE:
            case GREEN_CONCRETE_POWDER:
            case GREEN_GLAZED_TERRACOTTA:
            case GREEN_SHULKER_BOX:
            case GREEN_STAINED_GLASS:
            case GREEN_STAINED_GLASS_PANE:
            case GREEN_TERRACOTTA:
            case GREEN_WALL_BANNER:
            case GREEN_WOOL:
            case GRINDSTONE:
            case HAY_BLOCK:
            case HEAVY_WEIGHTED_PRESSURE_PLATE:
            case HOPPER:
            case HORN_CORAL:
            case HORN_CORAL_BLOCK:
            case HORN_CORAL_FAN:
            case HORN_CORAL_WALL_FAN:
            case ICE:
            case INFESTED_CHISELED_STONE_BRICKS:
            case INFESTED_COBBLESTONE:
            case INFESTED_CRACKED_STONE_BRICKS:
            case INFESTED_MOSSY_STONE_BRICKS:
            case INFESTED_STONE:
            case INFESTED_STONE_BRICKS:
            case IRON_BARS:
            case IRON_BLOCK:
            case IRON_DOOR:
            case IRON_ORE:
            case IRON_TRAPDOOR:
            case JACK_O_LANTERN:
            case JIGSAW:
            case JUKEBOX:
            case JUNGLE_BUTTON:
            case JUNGLE_DOOR:
            case JUNGLE_FENCE:
            case JUNGLE_FENCE_GATE:
            case JUNGLE_LEAVES:
            case JUNGLE_LOG:
            case JUNGLE_PLANKS:
            case JUNGLE_PRESSURE_PLATE:
            case JUNGLE_SAPLING:
            case JUNGLE_SIGN:
            case JUNGLE_SLAB:
            case JUNGLE_STAIRS:
            case JUNGLE_TRAPDOOR:
            case JUNGLE_WALL_SIGN:
            case JUNGLE_WOOD:
            case KELP:
            case KELP_PLANT:
            case LADDER:
            case LANTERN:
            case LAPIS_BLOCK:
            case LAPIS_ORE:
            case LARGE_FERN:
            case LAVA:
            case LECTERN:
            case LEVER:
            case LIGHT_BLUE_BANNER:
            case LIGHT_BLUE_BED:
            case LIGHT_BLUE_CARPET:
            case LIGHT_BLUE_CONCRETE:
            case LIGHT_BLUE_CONCRETE_POWDER:
            case LIGHT_BLUE_GLAZED_TERRACOTTA:
            case LIGHT_BLUE_SHULKER_BOX:
            case LIGHT_BLUE_STAINED_GLASS:
            case LIGHT_BLUE_STAINED_GLASS_PANE:
            case LIGHT_BLUE_TERRACOTTA:
            case LIGHT_BLUE_WALL_BANNER:
            case LIGHT_BLUE_WOOL:
            case LIGHT_GRAY_BANNER:
            case LIGHT_GRAY_BED:
            case LIGHT_GRAY_CARPET:
            case LIGHT_GRAY_CONCRETE:
            case LIGHT_GRAY_CONCRETE_POWDER:
            case LIGHT_GRAY_GLAZED_TERRACOTTA:
            case LIGHT_GRAY_SHULKER_BOX:
            case LIGHT_GRAY_STAINED_GLASS:
            case LIGHT_GRAY_STAINED_GLASS_PANE:
            case LIGHT_GRAY_TERRACOTTA:
            case LIGHT_GRAY_WALL_BANNER:
            case LIGHT_GRAY_WOOL:
            case LIGHT_WEIGHTED_PRESSURE_PLATE:
            case LILAC:
            case LILY_OF_THE_VALLEY:
            case LILY_PAD:
            case LIME_BANNER:
            case LIME_BED:
            case LIME_CARPET:
            case LIME_CONCRETE:
            case LIME_CONCRETE_POWDER:
            case LIME_GLAZED_TERRACOTTA:
            case LIME_SHULKER_BOX:
            case LIME_STAINED_GLASS:
            case LIME_STAINED_GLASS_PANE:
            case LIME_TERRACOTTA:
            case LIME_WALL_BANNER:
            case LIME_WOOL:
            case LOOM:
            case MAGENTA_BANNER:
            case MAGENTA_BED:
            case MAGENTA_CARPET:
            case MAGENTA_CONCRETE:
            case MAGENTA_CONCRETE_POWDER:
            case MAGENTA_GLAZED_TERRACOTTA:
            case MAGENTA_SHULKER_BOX:
            case MAGENTA_STAINED_GLASS:
            case MAGENTA_STAINED_GLASS_PANE:
            case MAGENTA_TERRACOTTA:
            case MAGENTA_WALL_BANNER:
            case MAGENTA_WOOL:
            case MAGMA_BLOCK:
            case MELON:
            case MELON_STEM:
            case MOSSY_COBBLESTONE:
            case MOSSY_COBBLESTONE_SLAB:
            case MOSSY_COBBLESTONE_STAIRS:
            case MOSSY_COBBLESTONE_WALL:
            case MOSSY_STONE_BRICKS:
            case MOSSY_STONE_BRICK_SLAB:
            case MOSSY_STONE_BRICK_STAIRS:
            case MOSSY_STONE_BRICK_WALL:
            case MOVING_PISTON:
            case MUSHROOM_STEM:
            case MYCELIUM:
            case NETHERRACK:
            case NETHER_BRICKS:
            case NETHER_BRICK_FENCE:
            case NETHER_BRICK_SLAB:
            case NETHER_BRICK_STAIRS:
            case NETHER_BRICK_WALL:
            case NETHER_PORTAL:
            case NETHER_QUARTZ_ORE:
            case NETHER_WART:
            case NETHER_WART_BLOCK:
            case NOTE_BLOCK:
            case OAK_BUTTON:
            case OAK_DOOR:
            case OAK_FENCE:
            case OAK_FENCE_GATE:
            case OAK_LEAVES:
            case OAK_LOG:
            case OAK_PLANKS:
            case OAK_PRESSURE_PLATE:
            case OAK_SAPLING:
            case OAK_SIGN:
            case OAK_SLAB:
            case OAK_STAIRS:
            case OAK_TRAPDOOR:
            case OAK_WALL_SIGN:
            case OAK_WOOD:
            case OBSERVER:
            case OBSIDIAN:
            case ORANGE_BANNER:
            case ORANGE_BED:
            case ORANGE_CARPET:
            case ORANGE_CONCRETE:
            case ORANGE_CONCRETE_POWDER:
            case ORANGE_GLAZED_TERRACOTTA:
            case ORANGE_SHULKER_BOX:
            case ORANGE_STAINED_GLASS:
            case ORANGE_STAINED_GLASS_PANE:
            case ORANGE_TERRACOTTA:
            case ORANGE_TULIP:
            case ORANGE_WALL_BANNER:
            case ORANGE_WOOL:
            case OXEYE_DAISY:
            case PACKED_ICE:
            case PEONY:
            case PETRIFIED_OAK_SLAB:
            case PINK_BANNER:
            case PINK_BED:
            case PINK_CARPET:
            case PINK_CONCRETE:
            case PINK_CONCRETE_POWDER:
            case PINK_GLAZED_TERRACOTTA:
            case PINK_SHULKER_BOX:
            case PINK_STAINED_GLASS:
            case PINK_STAINED_GLASS_PANE:
            case PINK_TERRACOTTA:
            case PINK_TULIP:
            case PINK_WALL_BANNER:
            case PINK_WOOL:
            case PISTON:
            case PISTON_HEAD:
            case PLAYER_HEAD:
            case PLAYER_WALL_HEAD:
            case PODZOL:
            case POLISHED_ANDESITE:
            case POLISHED_ANDESITE_SLAB:
            case POLISHED_ANDESITE_STAIRS:
            case POLISHED_DIORITE:
            case POLISHED_DIORITE_SLAB:
            case POLISHED_DIORITE_STAIRS:
            case POLISHED_GRANITE:
            case POLISHED_GRANITE_SLAB:
            case POLISHED_GRANITE_STAIRS:
            case POPPY:
            case POTATOES:
            case POTTED_ACACIA_SAPLING:
            case POTTED_ALLIUM:
            case POTTED_AZURE_BLUET:
            case POTTED_BAMBOO:
            case POTTED_BIRCH_SAPLING:
            case POTTED_BLUE_ORCHID:
            case POTTED_BROWN_MUSHROOM:
            case POTTED_CACTUS:
            case POTTED_CORNFLOWER:
            case POTTED_DANDELION:
            case POTTED_DARK_OAK_SAPLING:
            case POTTED_DEAD_BUSH:
            case POTTED_FERN:
            case POTTED_JUNGLE_SAPLING:
            case POTTED_LILY_OF_THE_VALLEY:
            case POTTED_OAK_SAPLING:
            case POTTED_ORANGE_TULIP:
            case POTTED_OXEYE_DAISY:
            case POTTED_PINK_TULIP:
            case POTTED_POPPY:
            case POTTED_RED_MUSHROOM:
            case POTTED_RED_TULIP:
            case POTTED_SPRUCE_SAPLING:
            case POTTED_WHITE_TULIP:
            case POTTED_WITHER_ROSE:
            case POWERED_RAIL:
            case PRISMARINE:
            case PRISMARINE_BRICKS:
            case PRISMARINE_BRICK_SLAB:
            case PRISMARINE_BRICK_STAIRS:
            case PRISMARINE_SLAB:
            case PRISMARINE_STAIRS:
            case PRISMARINE_WALL:
            case PUMPKIN:
            case PUMPKIN_STEM:
            case PURPLE_BANNER:
            case PURPLE_BED:
            case PURPLE_CARPET:
            case PURPLE_CONCRETE:
            case PURPLE_CONCRETE_POWDER:
            case PURPLE_GLAZED_TERRACOTTA:
            case PURPLE_SHULKER_BOX:
            case PURPLE_STAINED_GLASS:
            case PURPLE_STAINED_GLASS_PANE:
            case PURPLE_TERRACOTTA:
            case PURPLE_WALL_BANNER:
            case PURPLE_WOOL:
            case PURPUR_BLOCK:
            case PURPUR_PILLAR:
            case PURPUR_SLAB:
            case PURPUR_STAIRS:
            case QUARTZ_BLOCK:
            case QUARTZ_PILLAR:
            case QUARTZ_SLAB:
            case QUARTZ_STAIRS:
            case RAIL:
            case REDSTONE_BLOCK:
            case REDSTONE_LAMP:
            case REDSTONE_ORE:
            case REDSTONE_TORCH:
            case REDSTONE_WALL_TORCH:
            case REDSTONE_WIRE:
            case RED_BANNER:
            case RED_BED:
            case RED_CARPET:
            case RED_CONCRETE:
            case RED_CONCRETE_POWDER:
            case RED_GLAZED_TERRACOTTA:
            case RED_MUSHROOM:
            case RED_MUSHROOM_BLOCK:
            case RED_NETHER_BRICKS:
            case RED_NETHER_BRICK_SLAB:
            case RED_NETHER_BRICK_STAIRS:
            case RED_NETHER_BRICK_WALL:
            case RED_SAND:
            case RED_SANDSTONE:
            case RED_SANDSTONE_SLAB:
            case RED_SANDSTONE_STAIRS:
            case RED_SANDSTONE_WALL:
            case RED_SHULKER_BOX:
            case RED_STAINED_GLASS:
            case RED_STAINED_GLASS_PANE:
            case RED_TERRACOTTA:
            case RED_TULIP:
            case RED_WALL_BANNER:
            case RED_WOOL:
            case REPEATER:
            case REPEATING_COMMAND_BLOCK:
            case ROSE_BUSH:
            case SAND:
            case SANDSTONE:
            case SANDSTONE_SLAB:
            case SANDSTONE_STAIRS:
            case SANDSTONE_WALL:
            case SCAFFOLDING:
            case SEAGRASS:
            case SEA_LANTERN:
            case SEA_PICKLE:
            case SHULKER_BOX:
            case SKELETON_SKULL:
            case SKELETON_WALL_SKULL:
            case SLIME_BLOCK:
            case SMITHING_TABLE:
            case SMOKER:
            case SMOOTH_QUARTZ:
            case SMOOTH_QUARTZ_SLAB:
            case SMOOTH_QUARTZ_STAIRS:
            case SMOOTH_RED_SANDSTONE:
            case SMOOTH_RED_SANDSTONE_SLAB:
            case SMOOTH_RED_SANDSTONE_STAIRS:
            case SMOOTH_SANDSTONE:
            case SMOOTH_SANDSTONE_SLAB:
            case SMOOTH_SANDSTONE_STAIRS:
            case SMOOTH_STONE:
            case SMOOTH_STONE_SLAB:
            case SNOW:
            case SNOW_BLOCK:
            case SOUL_SAND:
            case SPAWNER:
            case SPONGE:
            case SPRUCE_BUTTON:
            case SPRUCE_DOOR:
            case SPRUCE_FENCE:
            case SPRUCE_FENCE_GATE:
            case SPRUCE_LEAVES:
            case SPRUCE_LOG:
            case SPRUCE_PLANKS:
            case SPRUCE_PRESSURE_PLATE:
            case SPRUCE_SAPLING:
            case SPRUCE_SIGN:
            case SPRUCE_SLAB:
            case SPRUCE_STAIRS:
            case SPRUCE_TRAPDOOR:
            case SPRUCE_WALL_SIGN:
            case SPRUCE_WOOD:
            case STICKY_PISTON:
            case STONE:
            case STONECUTTER:
            case STONE_BRICKS:
            case STONE_BRICK_SLAB:
            case STONE_BRICK_STAIRS:
            case STONE_BRICK_WALL:
            case STONE_BUTTON:
            case STONE_PRESSURE_PLATE:
            case STONE_SLAB:
            case STONE_STAIRS:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_LOG:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_LOG:
            case STRIPPED_SPRUCE_WOOD:
            case STRUCTURE_BLOCK:
            case STRUCTURE_VOID:
            case SUGAR_CANE:
            case SUNFLOWER:
            case SWEET_BERRY_BUSH:
            case TALL_GRASS:
            case TALL_SEAGRASS:
            case TERRACOTTA:
            case TNT:
            case TORCH:
            case TRAPPED_CHEST:
            case TRIPWIRE:
            case TRIPWIRE_HOOK:
            case TUBE_CORAL:
            case TUBE_CORAL_BLOCK:
            case TUBE_CORAL_FAN:
            case TUBE_CORAL_WALL_FAN:
            case TURTLE_EGG:
            case VINE:
            case VOID_AIR:
            case WALL_TORCH:
            case WATER:
            case WET_SPONGE:
            case WHEAT:
            case WHITE_BANNER:
            case WHITE_BED:
            case WHITE_CARPET:
            case WHITE_CONCRETE:
            case WHITE_CONCRETE_POWDER:
            case WHITE_GLAZED_TERRACOTTA:
            case WHITE_SHULKER_BOX:
            case WHITE_STAINED_GLASS:
            case WHITE_STAINED_GLASS_PANE:
            case WHITE_TERRACOTTA:
            case WHITE_TULIP:
            case WHITE_WALL_BANNER:
            case WHITE_WOOL:
            case WITHER_ROSE:
            case WITHER_SKELETON_SKULL:
            case WITHER_SKELETON_WALL_SKULL:
            case YELLOW_BANNER:
            case YELLOW_BED:
            case YELLOW_CARPET:
            case YELLOW_CONCRETE:
            case YELLOW_CONCRETE_POWDER:
            case YELLOW_GLAZED_TERRACOTTA:
            case YELLOW_SHULKER_BOX:
            case YELLOW_STAINED_GLASS:
            case YELLOW_STAINED_GLASS_PANE:
            case YELLOW_TERRACOTTA:
            case YELLOW_WALL_BANNER:
            case YELLOW_WOOL:
            case ZOMBIE_HEAD:
            case ZOMBIE_WALL_HEAD:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Checks if this Material is edible.
     *
     * @return true if this Material is edible.
     */
    public boolean isEdible() {
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isEdible">
            case APPLE:
            case BAKED_POTATO:
            case BEEF:
            case BEETROOT:
            case BEETROOT_SOUP:
            case BREAD:
            case CARROT:
            case CHICKEN:
            case CHORUS_FRUIT:
            case COD:
            case COOKED_BEEF:
            case COOKED_CHICKEN:
            case COOKED_COD:
            case COOKED_MUTTON:
            case COOKED_PORKCHOP:
            case COOKED_RABBIT:
            case COOKED_SALMON:
            case COOKIE:
            case DRIED_KELP:
            case ENCHANTED_GOLDEN_APPLE:
            case GOLDEN_APPLE:
            case GOLDEN_CARROT:
            case MELON_SLICE:
            case MUSHROOM_STEW:
            case MUTTON:
            case POISONOUS_POTATO:
            case PORKCHOP:
            case POTATO:
            case PUFFERFISH:
            case PUMPKIN_PIE:
            case RABBIT:
            case RABBIT_STEW:
            case ROTTEN_FLESH:
            case SALMON:
            case SPIDER_EYE:
            case SUSPICIOUS_STEW:
            case SWEET_BERRIES:
            case TROPICAL_FISH:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * @return True if this material represents a playable music disk.
     */
    public boolean isRecord() {
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isRecord">
            case MUSIC_DISC_11:
            case MUSIC_DISC_13:
            case MUSIC_DISC_BLOCKS:
            case MUSIC_DISC_CAT:
            case MUSIC_DISC_CHIRP:
            case MUSIC_DISC_FAR:
            case MUSIC_DISC_MALL:
            case MUSIC_DISC_MELLOHI:
            case MUSIC_DISC_STAL:
            case MUSIC_DISC_STRAD:
            case MUSIC_DISC_WAIT:
            case MUSIC_DISC_WARD:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and solid (can be built upon)
     *
     * @return True if this material is a block and solid
     */
    public boolean isSolid() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isSolid">
            case ACACIA_DOOR:
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case ACACIA_LEAVES:
            case ACACIA_LOG:
            case ACACIA_PLANKS:
            case ACACIA_PRESSURE_PLATE:
            case ACACIA_SIGN:
            case ACACIA_SLAB:
            case ACACIA_STAIRS:
            case ACACIA_TRAPDOOR:
            case ACACIA_WALL_SIGN:
            case ACACIA_WOOD:
            case ANDESITE:
            case ANDESITE_SLAB:
            case ANDESITE_STAIRS:
            case ANDESITE_WALL:
            case ANVIL:
            case BAMBOO:
            case BARREL:
            case BARRIER:
            case BEACON:
            case BEDROCK:
            case BELL:
            case BIRCH_DOOR:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case BIRCH_LEAVES:
            case BIRCH_LOG:
            case BIRCH_PLANKS:
            case BIRCH_PRESSURE_PLATE:
            case BIRCH_SIGN:
            case BIRCH_SLAB:
            case BIRCH_STAIRS:
            case BIRCH_TRAPDOOR:
            case BIRCH_WALL_SIGN:
            case BIRCH_WOOD:
            case BLACK_BANNER:
            case BLACK_BED:
            case BLACK_CONCRETE:
            case BLACK_CONCRETE_POWDER:
            case BLACK_GLAZED_TERRACOTTA:
            case BLACK_SHULKER_BOX:
            case BLACK_STAINED_GLASS:
            case BLACK_STAINED_GLASS_PANE:
            case BLACK_TERRACOTTA:
            case BLACK_WALL_BANNER:
            case BLACK_WOOL:
            case BLAST_FURNACE:
            case BLUE_BANNER:
            case BLUE_BED:
            case BLUE_CONCRETE:
            case BLUE_CONCRETE_POWDER:
            case BLUE_GLAZED_TERRACOTTA:
            case BLUE_ICE:
            case BLUE_SHULKER_BOX:
            case BLUE_STAINED_GLASS:
            case BLUE_STAINED_GLASS_PANE:
            case BLUE_TERRACOTTA:
            case BLUE_WALL_BANNER:
            case BLUE_WOOL:
            case BONE_BLOCK:
            case BOOKSHELF:
            case BRAIN_CORAL_BLOCK:
            case BREWING_STAND:
            case BRICKS:
            case BRICK_SLAB:
            case BRICK_STAIRS:
            case BRICK_WALL:
            case BROWN_BANNER:
            case BROWN_BED:
            case BROWN_CONCRETE:
            case BROWN_CONCRETE_POWDER:
            case BROWN_GLAZED_TERRACOTTA:
            case BROWN_MUSHROOM_BLOCK:
            case BROWN_SHULKER_BOX:
            case BROWN_STAINED_GLASS:
            case BROWN_STAINED_GLASS_PANE:
            case BROWN_TERRACOTTA:
            case BROWN_WALL_BANNER:
            case BROWN_WOOL:
            case BUBBLE_CORAL_BLOCK:
            case CACTUS:
            case CAKE:
            case CAMPFIRE:
            case CARTOGRAPHY_TABLE:
            case CARVED_PUMPKIN:
            case CAULDRON:
            case CHAIN_COMMAND_BLOCK:
            case CHEST:
            case CHIPPED_ANVIL:
            case CHISELED_QUARTZ_BLOCK:
            case CHISELED_RED_SANDSTONE:
            case CHISELED_SANDSTONE:
            case CHISELED_STONE_BRICKS:
            case CLAY:
            case COAL_BLOCK:
            case COAL_ORE:
            case COARSE_DIRT:
            case COBBLESTONE:
            case COBBLESTONE_SLAB:
            case COBBLESTONE_STAIRS:
            case COBBLESTONE_WALL:
            case COMMAND_BLOCK:
            case COMPOSTER:
            case CONDUIT:
            case CRACKED_STONE_BRICKS:
            case CRAFTING_TABLE:
            case CUT_RED_SANDSTONE:
            case CUT_RED_SANDSTONE_SLAB:
            case CUT_SANDSTONE:
            case CUT_SANDSTONE_SLAB:
            case CYAN_BANNER:
            case CYAN_BED:
            case CYAN_CONCRETE:
            case CYAN_CONCRETE_POWDER:
            case CYAN_GLAZED_TERRACOTTA:
            case CYAN_SHULKER_BOX:
            case CYAN_STAINED_GLASS:
            case CYAN_STAINED_GLASS_PANE:
            case CYAN_TERRACOTTA:
            case CYAN_WALL_BANNER:
            case CYAN_WOOL:
            case DAMAGED_ANVIL:
            case DARK_OAK_DOOR:
            case DARK_OAK_FENCE:
            case DARK_OAK_FENCE_GATE:
            case DARK_OAK_LEAVES:
            case DARK_OAK_LOG:
            case DARK_OAK_PLANKS:
            case DARK_OAK_PRESSURE_PLATE:
            case DARK_OAK_SIGN:
            case DARK_OAK_SLAB:
            case DARK_OAK_STAIRS:
            case DARK_OAK_TRAPDOOR:
            case DARK_OAK_WALL_SIGN:
            case DARK_OAK_WOOD:
            case DARK_PRISMARINE:
            case DARK_PRISMARINE_SLAB:
            case DARK_PRISMARINE_STAIRS:
            case DAYLIGHT_DETECTOR:
            case DEAD_BRAIN_CORAL:
            case DEAD_BRAIN_CORAL_BLOCK:
            case DEAD_BRAIN_CORAL_FAN:
            case DEAD_BRAIN_CORAL_WALL_FAN:
            case DEAD_BUBBLE_CORAL:
            case DEAD_BUBBLE_CORAL_BLOCK:
            case DEAD_BUBBLE_CORAL_FAN:
            case DEAD_BUBBLE_CORAL_WALL_FAN:
            case DEAD_FIRE_CORAL:
            case DEAD_FIRE_CORAL_BLOCK:
            case DEAD_FIRE_CORAL_FAN:
            case DEAD_FIRE_CORAL_WALL_FAN:
            case DEAD_HORN_CORAL:
            case DEAD_HORN_CORAL_BLOCK:
            case DEAD_HORN_CORAL_FAN:
            case DEAD_HORN_CORAL_WALL_FAN:
            case DEAD_TUBE_CORAL:
            case DEAD_TUBE_CORAL_BLOCK:
            case DEAD_TUBE_CORAL_FAN:
            case DEAD_TUBE_CORAL_WALL_FAN:
            case DIAMOND_BLOCK:
            case DIAMOND_ORE:
            case DIORITE:
            case DIORITE_SLAB:
            case DIORITE_STAIRS:
            case DIORITE_WALL:
            case DIRT:
            case DISPENSER:
            case DRAGON_EGG:
            case DRIED_KELP_BLOCK:
            case DROPPER:
            case EMERALD_BLOCK:
            case EMERALD_ORE:
            case ENCHANTING_TABLE:
            case ENDER_CHEST:
            case END_PORTAL_FRAME:
            case END_STONE:
            case END_STONE_BRICKS:
            case END_STONE_BRICK_SLAB:
            case END_STONE_BRICK_STAIRS:
            case END_STONE_BRICK_WALL:
            case FARMLAND:
            case FIRE_CORAL_BLOCK:
            case FLETCHING_TABLE:
            case FROSTED_ICE:
            case FURNACE:
            case GLASS:
            case GLASS_PANE:
            case GLOWSTONE:
            case GOLD_BLOCK:
            case GOLD_ORE:
            case GRANITE:
            case GRANITE_SLAB:
            case GRANITE_STAIRS:
            case GRANITE_WALL:
            case GRASS_BLOCK:
            case GRASS_PATH:
            case GRAVEL:
            case GRAY_BANNER:
            case GRAY_BED:
            case GRAY_CONCRETE:
            case GRAY_CONCRETE_POWDER:
            case GRAY_GLAZED_TERRACOTTA:
            case GRAY_SHULKER_BOX:
            case GRAY_STAINED_GLASS:
            case GRAY_STAINED_GLASS_PANE:
            case GRAY_TERRACOTTA:
            case GRAY_WALL_BANNER:
            case GRAY_WOOL:
            case GREEN_BANNER:
            case GREEN_BED:
            case GREEN_CONCRETE:
            case GREEN_CONCRETE_POWDER:
            case GREEN_GLAZED_TERRACOTTA:
            case GREEN_SHULKER_BOX:
            case GREEN_STAINED_GLASS:
            case GREEN_STAINED_GLASS_PANE:
            case GREEN_TERRACOTTA:
            case GREEN_WALL_BANNER:
            case GREEN_WOOL:
            case GRINDSTONE:
            case HAY_BLOCK:
            case HEAVY_WEIGHTED_PRESSURE_PLATE:
            case HOPPER:
            case HORN_CORAL_BLOCK:
            case ICE:
            case INFESTED_CHISELED_STONE_BRICKS:
            case INFESTED_COBBLESTONE:
            case INFESTED_CRACKED_STONE_BRICKS:
            case INFESTED_MOSSY_STONE_BRICKS:
            case INFESTED_STONE:
            case INFESTED_STONE_BRICKS:
            case IRON_BARS:
            case IRON_BLOCK:
            case IRON_DOOR:
            case IRON_ORE:
            case IRON_TRAPDOOR:
            case JACK_O_LANTERN:
            case JIGSAW:
            case JUKEBOX:
            case JUNGLE_DOOR:
            case JUNGLE_FENCE:
            case JUNGLE_FENCE_GATE:
            case JUNGLE_LEAVES:
            case JUNGLE_LOG:
            case JUNGLE_PLANKS:
            case JUNGLE_PRESSURE_PLATE:
            case JUNGLE_SIGN:
            case JUNGLE_SLAB:
            case JUNGLE_STAIRS:
            case JUNGLE_TRAPDOOR:
            case JUNGLE_WALL_SIGN:
            case JUNGLE_WOOD:
            case LANTERN:
            case LAPIS_BLOCK:
            case LAPIS_ORE:
            case LECTERN:
            case LIGHT_BLUE_BANNER:
            case LIGHT_BLUE_BED:
            case LIGHT_BLUE_CONCRETE:
            case LIGHT_BLUE_CONCRETE_POWDER:
            case LIGHT_BLUE_GLAZED_TERRACOTTA:
            case LIGHT_BLUE_SHULKER_BOX:
            case LIGHT_BLUE_STAINED_GLASS:
            case LIGHT_BLUE_STAINED_GLASS_PANE:
            case LIGHT_BLUE_TERRACOTTA:
            case LIGHT_BLUE_WALL_BANNER:
            case LIGHT_BLUE_WOOL:
            case LIGHT_GRAY_BANNER:
            case LIGHT_GRAY_BED:
            case LIGHT_GRAY_CONCRETE:
            case LIGHT_GRAY_CONCRETE_POWDER:
            case LIGHT_GRAY_GLAZED_TERRACOTTA:
            case LIGHT_GRAY_SHULKER_BOX:
            case LIGHT_GRAY_STAINED_GLASS:
            case LIGHT_GRAY_STAINED_GLASS_PANE:
            case LIGHT_GRAY_TERRACOTTA:
            case LIGHT_GRAY_WALL_BANNER:
            case LIGHT_GRAY_WOOL:
            case LIGHT_WEIGHTED_PRESSURE_PLATE:
            case LIME_BANNER:
            case LIME_BED:
            case LIME_CONCRETE:
            case LIME_CONCRETE_POWDER:
            case LIME_GLAZED_TERRACOTTA:
            case LIME_SHULKER_BOX:
            case LIME_STAINED_GLASS:
            case LIME_STAINED_GLASS_PANE:
            case LIME_TERRACOTTA:
            case LIME_WALL_BANNER:
            case LIME_WOOL:
            case LOOM:
            case MAGENTA_BANNER:
            case MAGENTA_BED:
            case MAGENTA_CONCRETE:
            case MAGENTA_CONCRETE_POWDER:
            case MAGENTA_GLAZED_TERRACOTTA:
            case MAGENTA_SHULKER_BOX:
            case MAGENTA_STAINED_GLASS:
            case MAGENTA_STAINED_GLASS_PANE:
            case MAGENTA_TERRACOTTA:
            case MAGENTA_WALL_BANNER:
            case MAGENTA_WOOL:
            case MAGMA_BLOCK:
            case MELON:
            case MOSSY_COBBLESTONE:
            case MOSSY_COBBLESTONE_SLAB:
            case MOSSY_COBBLESTONE_STAIRS:
            case MOSSY_COBBLESTONE_WALL:
            case MOSSY_STONE_BRICKS:
            case MOSSY_STONE_BRICK_SLAB:
            case MOSSY_STONE_BRICK_STAIRS:
            case MOSSY_STONE_BRICK_WALL:
            case MOVING_PISTON:
            case MUSHROOM_STEM:
            case MYCELIUM:
            case NETHERRACK:
            case NETHER_BRICKS:
            case NETHER_BRICK_FENCE:
            case NETHER_BRICK_SLAB:
            case NETHER_BRICK_STAIRS:
            case NETHER_BRICK_WALL:
            case NETHER_QUARTZ_ORE:
            case NETHER_WART_BLOCK:
            case NOTE_BLOCK:
            case OAK_DOOR:
            case OAK_FENCE:
            case OAK_FENCE_GATE:
            case OAK_LEAVES:
            case OAK_LOG:
            case OAK_PLANKS:
            case OAK_PRESSURE_PLATE:
            case OAK_SIGN:
            case OAK_SLAB:
            case OAK_STAIRS:
            case OAK_TRAPDOOR:
            case OAK_WALL_SIGN:
            case OAK_WOOD:
            case OBSERVER:
            case OBSIDIAN:
            case ORANGE_BANNER:
            case ORANGE_BED:
            case ORANGE_CONCRETE:
            case ORANGE_CONCRETE_POWDER:
            case ORANGE_GLAZED_TERRACOTTA:
            case ORANGE_SHULKER_BOX:
            case ORANGE_STAINED_GLASS:
            case ORANGE_STAINED_GLASS_PANE:
            case ORANGE_TERRACOTTA:
            case ORANGE_WALL_BANNER:
            case ORANGE_WOOL:
            case PACKED_ICE:
            case PETRIFIED_OAK_SLAB:
            case PINK_BANNER:
            case PINK_BED:
            case PINK_CONCRETE:
            case PINK_CONCRETE_POWDER:
            case PINK_GLAZED_TERRACOTTA:
            case PINK_SHULKER_BOX:
            case PINK_STAINED_GLASS:
            case PINK_STAINED_GLASS_PANE:
            case PINK_TERRACOTTA:
            case PINK_WALL_BANNER:
            case PINK_WOOL:
            case PISTON:
            case PISTON_HEAD:
            case PODZOL:
            case POLISHED_ANDESITE:
            case POLISHED_ANDESITE_SLAB:
            case POLISHED_ANDESITE_STAIRS:
            case POLISHED_DIORITE:
            case POLISHED_DIORITE_SLAB:
            case POLISHED_DIORITE_STAIRS:
            case POLISHED_GRANITE:
            case POLISHED_GRANITE_SLAB:
            case POLISHED_GRANITE_STAIRS:
            case PRISMARINE:
            case PRISMARINE_BRICKS:
            case PRISMARINE_BRICK_SLAB:
            case PRISMARINE_BRICK_STAIRS:
            case PRISMARINE_SLAB:
            case PRISMARINE_STAIRS:
            case PRISMARINE_WALL:
            case PUMPKIN:
            case PURPLE_BANNER:
            case PURPLE_BED:
            case PURPLE_CONCRETE:
            case PURPLE_CONCRETE_POWDER:
            case PURPLE_GLAZED_TERRACOTTA:
            case PURPLE_SHULKER_BOX:
            case PURPLE_STAINED_GLASS:
            case PURPLE_STAINED_GLASS_PANE:
            case PURPLE_TERRACOTTA:
            case PURPLE_WALL_BANNER:
            case PURPLE_WOOL:
            case PURPUR_BLOCK:
            case PURPUR_PILLAR:
            case PURPUR_SLAB:
            case PURPUR_STAIRS:
            case QUARTZ_BLOCK:
            case QUARTZ_PILLAR:
            case QUARTZ_SLAB:
            case QUARTZ_STAIRS:
            case REDSTONE_BLOCK:
            case REDSTONE_LAMP:
            case REDSTONE_ORE:
            case RED_BANNER:
            case RED_BED:
            case RED_CONCRETE:
            case RED_CONCRETE_POWDER:
            case RED_GLAZED_TERRACOTTA:
            case RED_MUSHROOM_BLOCK:
            case RED_NETHER_BRICKS:
            case RED_NETHER_BRICK_SLAB:
            case RED_NETHER_BRICK_STAIRS:
            case RED_NETHER_BRICK_WALL:
            case RED_SAND:
            case RED_SANDSTONE:
            case RED_SANDSTONE_SLAB:
            case RED_SANDSTONE_STAIRS:
            case RED_SANDSTONE_WALL:
            case RED_SHULKER_BOX:
            case RED_STAINED_GLASS:
            case RED_STAINED_GLASS_PANE:
            case RED_TERRACOTTA:
            case RED_WALL_BANNER:
            case RED_WOOL:
            case REPEATING_COMMAND_BLOCK:
            case SAND:
            case SANDSTONE:
            case SANDSTONE_SLAB:
            case SANDSTONE_STAIRS:
            case SANDSTONE_WALL:
            case SEA_LANTERN:
            case SHULKER_BOX:
            case SLIME_BLOCK:
            case SMITHING_TABLE:
            case SMOKER:
            case SMOOTH_QUARTZ:
            case SMOOTH_QUARTZ_SLAB:
            case SMOOTH_QUARTZ_STAIRS:
            case SMOOTH_RED_SANDSTONE:
            case SMOOTH_RED_SANDSTONE_SLAB:
            case SMOOTH_RED_SANDSTONE_STAIRS:
            case SMOOTH_SANDSTONE:
            case SMOOTH_SANDSTONE_SLAB:
            case SMOOTH_SANDSTONE_STAIRS:
            case SMOOTH_STONE:
            case SMOOTH_STONE_SLAB:
            case SNOW_BLOCK:
            case SOUL_SAND:
            case SPAWNER:
            case SPONGE:
            case SPRUCE_DOOR:
            case SPRUCE_FENCE:
            case SPRUCE_FENCE_GATE:
            case SPRUCE_LEAVES:
            case SPRUCE_LOG:
            case SPRUCE_PLANKS:
            case SPRUCE_PRESSURE_PLATE:
            case SPRUCE_SIGN:
            case SPRUCE_SLAB:
            case SPRUCE_STAIRS:
            case SPRUCE_TRAPDOOR:
            case SPRUCE_WALL_SIGN:
            case SPRUCE_WOOD:
            case STICKY_PISTON:
            case STONE:
            case STONECUTTER:
            case STONE_BRICKS:
            case STONE_BRICK_SLAB:
            case STONE_BRICK_STAIRS:
            case STONE_BRICK_WALL:
            case STONE_PRESSURE_PLATE:
            case STONE_SLAB:
            case STONE_STAIRS:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_LOG:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_LOG:
            case STRIPPED_SPRUCE_WOOD:
            case STRUCTURE_BLOCK:
            case TERRACOTTA:
            case TNT:
            case TRAPPED_CHEST:
            case TUBE_CORAL_BLOCK:
            case TURTLE_EGG:
            case WET_SPONGE:
            case WHITE_BANNER:
            case WHITE_BED:
            case WHITE_CONCRETE:
            case WHITE_CONCRETE_POWDER:
            case WHITE_GLAZED_TERRACOTTA:
            case WHITE_SHULKER_BOX:
            case WHITE_STAINED_GLASS:
            case WHITE_STAINED_GLASS_PANE:
            case WHITE_TERRACOTTA:
            case WHITE_WALL_BANNER:
            case WHITE_WOOL:
            case YELLOW_BANNER:
            case YELLOW_BED:
            case YELLOW_CONCRETE:
            case YELLOW_CONCRETE_POWDER:
            case YELLOW_GLAZED_TERRACOTTA:
            case YELLOW_SHULKER_BOX:
            case YELLOW_STAINED_GLASS:
            case YELLOW_STAINED_GLASS_PANE:
            case YELLOW_TERRACOTTA:
            case YELLOW_WALL_BANNER:
            case YELLOW_WOOL:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is an air block.
     *
     * @return True if this material is an air block.
     */
    public boolean isAir() {
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isAir">
            case AIR:
            case CAVE_AIR:
            case VOID_AIR:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and does not block any light
     *
     * @return True if this material is a block and does not block any light
     * @deprecated currently does not have an implementation which is well
     * linked to the underlying server. Contributions welcome.
     */
    @Deprecated
    public boolean isTransparent() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isTransparent">
            case ACACIA_BUTTON:
            case ACACIA_SAPLING:
            case ACTIVATOR_RAIL:
            case AIR:
            case ALLIUM:
            case ATTACHED_MELON_STEM:
            case ATTACHED_PUMPKIN_STEM:
            case AZURE_BLUET:
            case BARRIER:
            case BEETROOTS:
            case BIRCH_BUTTON:
            case BIRCH_SAPLING:
            case BLACK_CARPET:
            case BLUE_CARPET:
            case BLUE_ORCHID:
            case BROWN_CARPET:
            case BROWN_MUSHROOM:
            case CARROTS:
            case CAVE_AIR:
            case CHORUS_FLOWER:
            case CHORUS_PLANT:
            case COCOA:
            case COMPARATOR:
            case CREEPER_HEAD:
            case CREEPER_WALL_HEAD:
            case CYAN_CARPET:
            case DANDELION:
            case DARK_OAK_BUTTON:
            case DARK_OAK_SAPLING:
            case DEAD_BUSH:
            case DETECTOR_RAIL:
            case DRAGON_HEAD:
            case DRAGON_WALL_HEAD:
            case END_GATEWAY:
            case END_PORTAL:
            case END_ROD:
            case FERN:
            case FIRE:
            case FLOWER_POT:
            case GRASS:
            case GRAY_CARPET:
            case GREEN_CARPET:
            case JUNGLE_BUTTON:
            case JUNGLE_SAPLING:
            case LADDER:
            case LARGE_FERN:
            case LEVER:
            case LIGHT_BLUE_CARPET:
            case LIGHT_GRAY_CARPET:
            case LILAC:
            case LILY_PAD:
            case LIME_CARPET:
            case MAGENTA_CARPET:
            case MELON_STEM:
            case NETHER_PORTAL:
            case NETHER_WART:
            case OAK_BUTTON:
            case OAK_SAPLING:
            case ORANGE_CARPET:
            case ORANGE_TULIP:
            case OXEYE_DAISY:
            case PEONY:
            case PINK_CARPET:
            case PINK_TULIP:
            case PLAYER_HEAD:
            case PLAYER_WALL_HEAD:
            case POPPY:
            case POTATOES:
            case POTTED_ACACIA_SAPLING:
            case POTTED_ALLIUM:
            case POTTED_AZURE_BLUET:
            case POTTED_BIRCH_SAPLING:
            case POTTED_BLUE_ORCHID:
            case POTTED_BROWN_MUSHROOM:
            case POTTED_CACTUS:
            case POTTED_DANDELION:
            case POTTED_DARK_OAK_SAPLING:
            case POTTED_DEAD_BUSH:
            case POTTED_FERN:
            case POTTED_JUNGLE_SAPLING:
            case POTTED_OAK_SAPLING:
            case POTTED_ORANGE_TULIP:
            case POTTED_OXEYE_DAISY:
            case POTTED_PINK_TULIP:
            case POTTED_POPPY:
            case POTTED_RED_MUSHROOM:
            case POTTED_RED_TULIP:
            case POTTED_SPRUCE_SAPLING:
            case POTTED_WHITE_TULIP:
            case POWERED_RAIL:
            case PUMPKIN_STEM:
            case PURPLE_CARPET:
            case RAIL:
            case REDSTONE_TORCH:
            case REDSTONE_WALL_TORCH:
            case REDSTONE_WIRE:
            case RED_CARPET:
            case RED_MUSHROOM:
            case RED_TULIP:
            case REPEATER:
            case ROSE_BUSH:
            case SKELETON_SKULL:
            case SKELETON_WALL_SKULL:
            case SNOW:
            case SPRUCE_BUTTON:
            case SPRUCE_SAPLING:
            case STONE_BUTTON:
            case STRUCTURE_VOID:
            case SUGAR_CANE:
            case SUNFLOWER:
            case TALL_GRASS:
            case TORCH:
            case TRIPWIRE:
            case TRIPWIRE_HOOK:
            case VINE:
            case VOID_AIR:
            case WALL_TORCH:
            case WHEAT:
            case WHITE_CARPET:
            case WHITE_TULIP:
            case WITHER_SKELETON_SKULL:
            case WITHER_SKELETON_WALL_SKULL:
            case YELLOW_CARPET:
            case ZOMBIE_HEAD:
            case ZOMBIE_WALL_HEAD:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and can catch fire
     *
     * @return True if this material is a block and can catch fire
     */
    public boolean isFlammable() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isFlammable">
            case ACACIA_DOOR:
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case ACACIA_LEAVES:
            case ACACIA_LOG:
            case ACACIA_PLANKS:
            case ACACIA_PRESSURE_PLATE:
            case ACACIA_SIGN:
            case ACACIA_SLAB:
            case ACACIA_STAIRS:
            case ACACIA_TRAPDOOR:
            case ACACIA_WALL_SIGN:
            case ACACIA_WOOD:
            case BAMBOO:
            case BAMBOO_SAPLING:
            case BARREL:
            case BIRCH_DOOR:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case BIRCH_LEAVES:
            case BIRCH_LOG:
            case BIRCH_PLANKS:
            case BIRCH_PRESSURE_PLATE:
            case BIRCH_SIGN:
            case BIRCH_SLAB:
            case BIRCH_STAIRS:
            case BIRCH_TRAPDOOR:
            case BIRCH_WALL_SIGN:
            case BIRCH_WOOD:
            case BLACK_BANNER:
            case BLACK_BED:
            case BLACK_CARPET:
            case BLACK_WALL_BANNER:
            case BLACK_WOOL:
            case BLUE_BANNER:
            case BLUE_BED:
            case BLUE_CARPET:
            case BLUE_WALL_BANNER:
            case BLUE_WOOL:
            case BOOKSHELF:
            case BROWN_BANNER:
            case BROWN_BED:
            case BROWN_CARPET:
            case BROWN_MUSHROOM_BLOCK:
            case BROWN_WALL_BANNER:
            case BROWN_WOOL:
            case CAMPFIRE:
            case CARTOGRAPHY_TABLE:
            case CHEST:
            case COMPOSTER:
            case CRAFTING_TABLE:
            case CYAN_BANNER:
            case CYAN_BED:
            case CYAN_CARPET:
            case CYAN_WALL_BANNER:
            case CYAN_WOOL:
            case DARK_OAK_DOOR:
            case DARK_OAK_FENCE:
            case DARK_OAK_FENCE_GATE:
            case DARK_OAK_LEAVES:
            case DARK_OAK_LOG:
            case DARK_OAK_PLANKS:
            case DARK_OAK_PRESSURE_PLATE:
            case DARK_OAK_SIGN:
            case DARK_OAK_SLAB:
            case DARK_OAK_STAIRS:
            case DARK_OAK_TRAPDOOR:
            case DARK_OAK_WALL_SIGN:
            case DARK_OAK_WOOD:
            case DAYLIGHT_DETECTOR:
            case DEAD_BUSH:
            case FERN:
            case FLETCHING_TABLE:
            case GRASS:
            case GRAY_BANNER:
            case GRAY_BED:
            case GRAY_CARPET:
            case GRAY_WALL_BANNER:
            case GRAY_WOOL:
            case GREEN_BANNER:
            case GREEN_BED:
            case GREEN_CARPET:
            case GREEN_WALL_BANNER:
            case GREEN_WOOL:
            case JUKEBOX:
            case JUNGLE_DOOR:
            case JUNGLE_FENCE:
            case JUNGLE_FENCE_GATE:
            case JUNGLE_LEAVES:
            case JUNGLE_LOG:
            case JUNGLE_PLANKS:
            case JUNGLE_PRESSURE_PLATE:
            case JUNGLE_SIGN:
            case JUNGLE_SLAB:
            case JUNGLE_STAIRS:
            case JUNGLE_TRAPDOOR:
            case JUNGLE_WALL_SIGN:
            case JUNGLE_WOOD:
            case LARGE_FERN:
            case LECTERN:
            case LIGHT_BLUE_BANNER:
            case LIGHT_BLUE_BED:
            case LIGHT_BLUE_CARPET:
            case LIGHT_BLUE_WALL_BANNER:
            case LIGHT_BLUE_WOOL:
            case LIGHT_GRAY_BANNER:
            case LIGHT_GRAY_BED:
            case LIGHT_GRAY_CARPET:
            case LIGHT_GRAY_WALL_BANNER:
            case LIGHT_GRAY_WOOL:
            case LILAC:
            case LIME_BANNER:
            case LIME_BED:
            case LIME_CARPET:
            case LIME_WALL_BANNER:
            case LIME_WOOL:
            case LOOM:
            case MAGENTA_BANNER:
            case MAGENTA_BED:
            case MAGENTA_CARPET:
            case MAGENTA_WALL_BANNER:
            case MAGENTA_WOOL:
            case MUSHROOM_STEM:
            case NOTE_BLOCK:
            case OAK_DOOR:
            case OAK_FENCE:
            case OAK_FENCE_GATE:
            case OAK_LEAVES:
            case OAK_LOG:
            case OAK_PLANKS:
            case OAK_PRESSURE_PLATE:
            case OAK_SIGN:
            case OAK_SLAB:
            case OAK_STAIRS:
            case OAK_TRAPDOOR:
            case OAK_WALL_SIGN:
            case OAK_WOOD:
            case ORANGE_BANNER:
            case ORANGE_BED:
            case ORANGE_CARPET:
            case ORANGE_WALL_BANNER:
            case ORANGE_WOOL:
            case PEONY:
            case PINK_BANNER:
            case PINK_BED:
            case PINK_CARPET:
            case PINK_WALL_BANNER:
            case PINK_WOOL:
            case PURPLE_BANNER:
            case PURPLE_BED:
            case PURPLE_CARPET:
            case PURPLE_WALL_BANNER:
            case PURPLE_WOOL:
            case RED_BANNER:
            case RED_BED:
            case RED_CARPET:
            case RED_MUSHROOM_BLOCK:
            case RED_WALL_BANNER:
            case RED_WOOL:
            case ROSE_BUSH:
            case SMITHING_TABLE:
            case SPRUCE_DOOR:
            case SPRUCE_FENCE:
            case SPRUCE_FENCE_GATE:
            case SPRUCE_LEAVES:
            case SPRUCE_LOG:
            case SPRUCE_PLANKS:
            case SPRUCE_PRESSURE_PLATE:
            case SPRUCE_SIGN:
            case SPRUCE_SLAB:
            case SPRUCE_STAIRS:
            case SPRUCE_TRAPDOOR:
            case SPRUCE_WALL_SIGN:
            case SPRUCE_WOOD:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_LOG:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_LOG:
            case STRIPPED_SPRUCE_WOOD:
            case SUNFLOWER:
            case TALL_GRASS:
            case TNT:
            case TRAPPED_CHEST:
            case VINE:
            case WHITE_BANNER:
            case WHITE_BED:
            case WHITE_CARPET:
            case WHITE_WALL_BANNER:
            case WHITE_WOOL:
            case YELLOW_BANNER:
            case YELLOW_BED:
            case YELLOW_CARPET:
            case YELLOW_WALL_BANNER:
            case YELLOW_WOOL:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and can burn away
     *
     * @return True if this material is a block and can burn away
     */
    public boolean isBurnable() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isBurnable">
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case ACACIA_LEAVES:
            case ACACIA_LOG:
            case ACACIA_PLANKS:
            case ACACIA_SLAB:
            case ACACIA_STAIRS:
            case ACACIA_WOOD:
            case ALLIUM:
            case AZURE_BLUET:
            case BAMBOO:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case BIRCH_LEAVES:
            case BIRCH_LOG:
            case BIRCH_PLANKS:
            case BIRCH_SLAB:
            case BIRCH_STAIRS:
            case BIRCH_WOOD:
            case BLACK_CARPET:
            case BLACK_WOOL:
            case BLUE_CARPET:
            case BLUE_ORCHID:
            case BLUE_WOOL:
            case BOOKSHELF:
            case BROWN_CARPET:
            case BROWN_WOOL:
            case COAL_BLOCK:
            case COMPOSTER:
            case CORNFLOWER:
            case CYAN_CARPET:
            case CYAN_WOOL:
            case DANDELION:
            case DARK_OAK_FENCE:
            case DARK_OAK_FENCE_GATE:
            case DARK_OAK_LEAVES:
            case DARK_OAK_LOG:
            case DARK_OAK_PLANKS:
            case DARK_OAK_SLAB:
            case DARK_OAK_STAIRS:
            case DARK_OAK_WOOD:
            case DEAD_BUSH:
            case DRIED_KELP_BLOCK:
            case FERN:
            case GRASS:
            case GRAY_CARPET:
            case GRAY_WOOL:
            case GREEN_CARPET:
            case GREEN_WOOL:
            case HAY_BLOCK:
            case JUNGLE_FENCE:
            case JUNGLE_FENCE_GATE:
            case JUNGLE_LEAVES:
            case JUNGLE_LOG:
            case JUNGLE_PLANKS:
            case JUNGLE_SLAB:
            case JUNGLE_STAIRS:
            case JUNGLE_WOOD:
            case LARGE_FERN:
            case LECTERN:
            case LIGHT_BLUE_CARPET:
            case LIGHT_BLUE_WOOL:
            case LIGHT_GRAY_CARPET:
            case LIGHT_GRAY_WOOL:
            case LILAC:
            case LILY_OF_THE_VALLEY:
            case LIME_CARPET:
            case LIME_WOOL:
            case MAGENTA_CARPET:
            case MAGENTA_WOOL:
            case OAK_FENCE:
            case OAK_FENCE_GATE:
            case OAK_LEAVES:
            case OAK_LOG:
            case OAK_PLANKS:
            case OAK_SLAB:
            case OAK_STAIRS:
            case OAK_WOOD:
            case ORANGE_CARPET:
            case ORANGE_TULIP:
            case ORANGE_WOOL:
            case OXEYE_DAISY:
            case PEONY:
            case PINK_CARPET:
            case PINK_TULIP:
            case PINK_WOOL:
            case POPPY:
            case PURPLE_CARPET:
            case PURPLE_WOOL:
            case RED_CARPET:
            case RED_TULIP:
            case RED_WOOL:
            case ROSE_BUSH:
            case SCAFFOLDING:
            case SPRUCE_FENCE:
            case SPRUCE_FENCE_GATE:
            case SPRUCE_LEAVES:
            case SPRUCE_LOG:
            case SPRUCE_PLANKS:
            case SPRUCE_SLAB:
            case SPRUCE_STAIRS:
            case SPRUCE_WOOD:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_LOG:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_LOG:
            case STRIPPED_SPRUCE_WOOD:
            case SUNFLOWER:
            case SWEET_BERRY_BUSH:
            case TALL_GRASS:
            case TNT:
            case VINE:
            case WHITE_CARPET:
            case WHITE_TULIP:
            case WHITE_WOOL:
            case WITHER_ROSE:
            case YELLOW_CARPET:
            case YELLOW_WOOL:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Checks if this Material can be used as fuel in a Furnace
     *
     * @return true if this Material can be used as fuel.
     */
    public boolean isFuel() {
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isFuel">
            case ACACIA_BOAT:
            case ACACIA_BUTTON:
            case ACACIA_DOOR:
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case ACACIA_LOG:
            case ACACIA_PLANKS:
            case ACACIA_PRESSURE_PLATE:
            case ACACIA_SAPLING:
            case ACACIA_SIGN:
            case ACACIA_SLAB:
            case ACACIA_STAIRS:
            case ACACIA_TRAPDOOR:
            case ACACIA_WOOD:
            case BAMBOO:
            case BARREL:
            case BIRCH_BOAT:
            case BIRCH_BUTTON:
            case BIRCH_DOOR:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case BIRCH_LOG:
            case BIRCH_PLANKS:
            case BIRCH_PRESSURE_PLATE:
            case BIRCH_SAPLING:
            case BIRCH_SIGN:
            case BIRCH_SLAB:
            case BIRCH_STAIRS:
            case BIRCH_TRAPDOOR:
            case BIRCH_WOOD:
            case BLACK_BANNER:
            case BLACK_CARPET:
            case BLACK_WOOL:
            case BLAZE_ROD:
            case BLUE_BANNER:
            case BLUE_CARPET:
            case BLUE_WOOL:
            case BOOKSHELF:
            case BOW:
            case BOWL:
            case BROWN_BANNER:
            case BROWN_CARPET:
            case BROWN_WOOL:
            case CARTOGRAPHY_TABLE:
            case CHARCOAL:
            case CHEST:
            case COAL:
            case COAL_BLOCK:
            case COMPOSTER:
            case CRAFTING_TABLE:
            case CROSSBOW:
            case CYAN_BANNER:
            case CYAN_CARPET:
            case CYAN_WOOL:
            case DARK_OAK_BOAT:
            case DARK_OAK_BUTTON:
            case DARK_OAK_DOOR:
            case DARK_OAK_FENCE:
            case DARK_OAK_FENCE_GATE:
            case DARK_OAK_LOG:
            case DARK_OAK_PLANKS:
            case DARK_OAK_PRESSURE_PLATE:
            case DARK_OAK_SAPLING:
            case DARK_OAK_SIGN:
            case DARK_OAK_SLAB:
            case DARK_OAK_STAIRS:
            case DARK_OAK_TRAPDOOR:
            case DARK_OAK_WOOD:
            case DAYLIGHT_DETECTOR:
            case DEAD_BUSH:
            case DRIED_KELP_BLOCK:
            case FISHING_ROD:
            case FLETCHING_TABLE:
            case GRAY_BANNER:
            case GRAY_CARPET:
            case GRAY_WOOL:
            case GREEN_BANNER:
            case GREEN_CARPET:
            case GREEN_WOOL:
            case JUKEBOX:
            case JUNGLE_BOAT:
            case JUNGLE_BUTTON:
            case JUNGLE_DOOR:
            case JUNGLE_FENCE:
            case JUNGLE_FENCE_GATE:
            case JUNGLE_LOG:
            case JUNGLE_PLANKS:
            case JUNGLE_PRESSURE_PLATE:
            case JUNGLE_SAPLING:
            case JUNGLE_SIGN:
            case JUNGLE_SLAB:
            case JUNGLE_STAIRS:
            case JUNGLE_TRAPDOOR:
            case JUNGLE_WOOD:
            case LADDER:
            case LAVA_BUCKET:
            case LECTERN:
            case LIGHT_BLUE_BANNER:
            case LIGHT_BLUE_CARPET:
            case LIGHT_BLUE_WOOL:
            case LIGHT_GRAY_BANNER:
            case LIGHT_GRAY_CARPET:
            case LIGHT_GRAY_WOOL:
            case LIME_BANNER:
            case LIME_CARPET:
            case LIME_WOOL:
            case LOOM:
            case MAGENTA_BANNER:
            case MAGENTA_CARPET:
            case MAGENTA_WOOL:
            case NOTE_BLOCK:
            case OAK_BOAT:
            case OAK_BUTTON:
            case OAK_DOOR:
            case OAK_FENCE:
            case OAK_FENCE_GATE:
            case OAK_LOG:
            case OAK_PLANKS:
            case OAK_PRESSURE_PLATE:
            case OAK_SAPLING:
            case OAK_SIGN:
            case OAK_SLAB:
            case OAK_STAIRS:
            case OAK_TRAPDOOR:
            case OAK_WOOD:
            case ORANGE_BANNER:
            case ORANGE_CARPET:
            case ORANGE_WOOL:
            case PINK_BANNER:
            case PINK_CARPET:
            case PINK_WOOL:
            case PURPLE_BANNER:
            case PURPLE_CARPET:
            case PURPLE_WOOL:
            case RED_BANNER:
            case RED_CARPET:
            case RED_WOOL:
            case SCAFFOLDING:
            case SMITHING_TABLE:
            case SPRUCE_BOAT:
            case SPRUCE_BUTTON:
            case SPRUCE_DOOR:
            case SPRUCE_FENCE:
            case SPRUCE_FENCE_GATE:
            case SPRUCE_LOG:
            case SPRUCE_PLANKS:
            case SPRUCE_PRESSURE_PLATE:
            case SPRUCE_SAPLING:
            case SPRUCE_SIGN:
            case SPRUCE_SLAB:
            case SPRUCE_STAIRS:
            case SPRUCE_TRAPDOOR:
            case SPRUCE_WOOD:
            case STICK:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_LOG:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_LOG:
            case STRIPPED_SPRUCE_WOOD:
            case TRAPPED_CHEST:
            case WHITE_BANNER:
            case WHITE_CARPET:
            case WHITE_WOOL:
            case WOODEN_AXE:
            case WOODEN_HOE:
            case WOODEN_PICKAXE:
            case WOODEN_SHOVEL:
            case WOODEN_SWORD:
            case YELLOW_BANNER:
            case YELLOW_CARPET:
            case YELLOW_WOOL:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Check if the material is a block and completely blocks vision
     *
     * @return True if this material is a block and completely blocks vision
     */
    public boolean isOccluding() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isOccluding">
            case ACACIA_LOG:
            case ACACIA_PLANKS:
            case ACACIA_WOOD:
            case ANDESITE:
            case BARREL:
            case BARRIER:
            case BEDROCK:
            case BIRCH_LOG:
            case BIRCH_PLANKS:
            case BIRCH_WOOD:
            case BLACK_CONCRETE:
            case BLACK_CONCRETE_POWDER:
            case BLACK_GLAZED_TERRACOTTA:
            case BLACK_SHULKER_BOX:
            case BLACK_TERRACOTTA:
            case BLACK_WOOL:
            case BLAST_FURNACE:
            case BLUE_CONCRETE:
            case BLUE_CONCRETE_POWDER:
            case BLUE_GLAZED_TERRACOTTA:
            case BLUE_ICE:
            case BLUE_SHULKER_BOX:
            case BLUE_TERRACOTTA:
            case BLUE_WOOL:
            case BONE_BLOCK:
            case BOOKSHELF:
            case BRAIN_CORAL_BLOCK:
            case BRICKS:
            case BROWN_CONCRETE:
            case BROWN_CONCRETE_POWDER:
            case BROWN_GLAZED_TERRACOTTA:
            case BROWN_MUSHROOM_BLOCK:
            case BROWN_SHULKER_BOX:
            case BROWN_TERRACOTTA:
            case BROWN_WOOL:
            case BUBBLE_CORAL_BLOCK:
            case CARTOGRAPHY_TABLE:
            case CARVED_PUMPKIN:
            case CHAIN_COMMAND_BLOCK:
            case CHISELED_QUARTZ_BLOCK:
            case CHISELED_RED_SANDSTONE:
            case CHISELED_SANDSTONE:
            case CHISELED_STONE_BRICKS:
            case CLAY:
            case COAL_BLOCK:
            case COAL_ORE:
            case COARSE_DIRT:
            case COBBLESTONE:
            case COMMAND_BLOCK:
            case CRACKED_STONE_BRICKS:
            case CRAFTING_TABLE:
            case CUT_RED_SANDSTONE:
            case CUT_SANDSTONE:
            case CYAN_CONCRETE:
            case CYAN_CONCRETE_POWDER:
            case CYAN_GLAZED_TERRACOTTA:
            case CYAN_SHULKER_BOX:
            case CYAN_TERRACOTTA:
            case CYAN_WOOL:
            case DARK_OAK_LOG:
            case DARK_OAK_PLANKS:
            case DARK_OAK_WOOD:
            case DARK_PRISMARINE:
            case DEAD_BRAIN_CORAL_BLOCK:
            case DEAD_BUBBLE_CORAL_BLOCK:
            case DEAD_FIRE_CORAL_BLOCK:
            case DEAD_HORN_CORAL_BLOCK:
            case DEAD_TUBE_CORAL_BLOCK:
            case DIAMOND_BLOCK:
            case DIAMOND_ORE:
            case DIORITE:
            case DIRT:
            case DISPENSER:
            case DRIED_KELP_BLOCK:
            case DROPPER:
            case EMERALD_BLOCK:
            case EMERALD_ORE:
            case END_STONE:
            case END_STONE_BRICKS:
            case FIRE_CORAL_BLOCK:
            case FLETCHING_TABLE:
            case FURNACE:
            case GOLD_BLOCK:
            case GOLD_ORE:
            case GRANITE:
            case GRASS_BLOCK:
            case GRAVEL:
            case GRAY_CONCRETE:
            case GRAY_CONCRETE_POWDER:
            case GRAY_GLAZED_TERRACOTTA:
            case GRAY_SHULKER_BOX:
            case GRAY_TERRACOTTA:
            case GRAY_WOOL:
            case GREEN_CONCRETE:
            case GREEN_CONCRETE_POWDER:
            case GREEN_GLAZED_TERRACOTTA:
            case GREEN_SHULKER_BOX:
            case GREEN_TERRACOTTA:
            case GREEN_WOOL:
            case HAY_BLOCK:
            case HORN_CORAL_BLOCK:
            case INFESTED_CHISELED_STONE_BRICKS:
            case INFESTED_COBBLESTONE:
            case INFESTED_CRACKED_STONE_BRICKS:
            case INFESTED_MOSSY_STONE_BRICKS:
            case INFESTED_STONE:
            case INFESTED_STONE_BRICKS:
            case IRON_BLOCK:
            case IRON_ORE:
            case JACK_O_LANTERN:
            case JIGSAW:
            case JUKEBOX:
            case JUNGLE_LOG:
            case JUNGLE_PLANKS:
            case JUNGLE_WOOD:
            case LAPIS_BLOCK:
            case LAPIS_ORE:
            case LIGHT_BLUE_CONCRETE:
            case LIGHT_BLUE_CONCRETE_POWDER:
            case LIGHT_BLUE_GLAZED_TERRACOTTA:
            case LIGHT_BLUE_SHULKER_BOX:
            case LIGHT_BLUE_TERRACOTTA:
            case LIGHT_BLUE_WOOL:
            case LIGHT_GRAY_CONCRETE:
            case LIGHT_GRAY_CONCRETE_POWDER:
            case LIGHT_GRAY_GLAZED_TERRACOTTA:
            case LIGHT_GRAY_SHULKER_BOX:
            case LIGHT_GRAY_TERRACOTTA:
            case LIGHT_GRAY_WOOL:
            case LIME_CONCRETE:
            case LIME_CONCRETE_POWDER:
            case LIME_GLAZED_TERRACOTTA:
            case LIME_SHULKER_BOX:
            case LIME_TERRACOTTA:
            case LIME_WOOL:
            case LOOM:
            case MAGENTA_CONCRETE:
            case MAGENTA_CONCRETE_POWDER:
            case MAGENTA_GLAZED_TERRACOTTA:
            case MAGENTA_SHULKER_BOX:
            case MAGENTA_TERRACOTTA:
            case MAGENTA_WOOL:
            case MAGMA_BLOCK:
            case MELON:
            case MOSSY_COBBLESTONE:
            case MOSSY_STONE_BRICKS:
            case MUSHROOM_STEM:
            case MYCELIUM:
            case NETHERRACK:
            case NETHER_BRICKS:
            case NETHER_QUARTZ_ORE:
            case NETHER_WART_BLOCK:
            case NOTE_BLOCK:
            case OAK_LOG:
            case OAK_PLANKS:
            case OAK_WOOD:
            case OBSIDIAN:
            case ORANGE_CONCRETE:
            case ORANGE_CONCRETE_POWDER:
            case ORANGE_GLAZED_TERRACOTTA:
            case ORANGE_SHULKER_BOX:
            case ORANGE_TERRACOTTA:
            case ORANGE_WOOL:
            case PACKED_ICE:
            case PINK_CONCRETE:
            case PINK_CONCRETE_POWDER:
            case PINK_GLAZED_TERRACOTTA:
            case PINK_SHULKER_BOX:
            case PINK_TERRACOTTA:
            case PINK_WOOL:
            case PODZOL:
            case POLISHED_ANDESITE:
            case POLISHED_DIORITE:
            case POLISHED_GRANITE:
            case PRISMARINE:
            case PRISMARINE_BRICKS:
            case PUMPKIN:
            case PURPLE_CONCRETE:
            case PURPLE_CONCRETE_POWDER:
            case PURPLE_GLAZED_TERRACOTTA:
            case PURPLE_SHULKER_BOX:
            case PURPLE_TERRACOTTA:
            case PURPLE_WOOL:
            case PURPUR_BLOCK:
            case PURPUR_PILLAR:
            case QUARTZ_BLOCK:
            case QUARTZ_PILLAR:
            case REDSTONE_LAMP:
            case REDSTONE_ORE:
            case RED_CONCRETE:
            case RED_CONCRETE_POWDER:
            case RED_GLAZED_TERRACOTTA:
            case RED_MUSHROOM_BLOCK:
            case RED_NETHER_BRICKS:
            case RED_SAND:
            case RED_SANDSTONE:
            case RED_SHULKER_BOX:
            case RED_TERRACOTTA:
            case RED_WOOL:
            case REPEATING_COMMAND_BLOCK:
            case SAND:
            case SANDSTONE:
            case SHULKER_BOX:
            case SLIME_BLOCK:
            case SMITHING_TABLE:
            case SMOKER:
            case SMOOTH_QUARTZ:
            case SMOOTH_RED_SANDSTONE:
            case SMOOTH_SANDSTONE:
            case SMOOTH_STONE:
            case SNOW_BLOCK:
            case SOUL_SAND:
            case SPAWNER:
            case SPONGE:
            case SPRUCE_LOG:
            case SPRUCE_PLANKS:
            case SPRUCE_WOOD:
            case STONE:
            case STONE_BRICKS:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_LOG:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_LOG:
            case STRIPPED_SPRUCE_WOOD:
            case STRUCTURE_BLOCK:
            case TERRACOTTA:
            case TUBE_CORAL_BLOCK:
            case WET_SPONGE:
            case WHITE_CONCRETE:
            case WHITE_CONCRETE_POWDER:
            case WHITE_GLAZED_TERRACOTTA:
            case WHITE_SHULKER_BOX:
            case WHITE_TERRACOTTA:
            case WHITE_WOOL:
            case YELLOW_CONCRETE:
            case YELLOW_CONCRETE_POWDER:
            case YELLOW_GLAZED_TERRACOTTA:
            case YELLOW_SHULKER_BOX:
            case YELLOW_TERRACOTTA:
            case YELLOW_WOOL:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * @return True if this material is affected by gravity.
     */
    public boolean hasGravity() {
        if (!isBlock()) {
            return false;
        }
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="hasGravity">
            case ANVIL:
            case BLACK_CONCRETE_POWDER:
            case BLUE_CONCRETE_POWDER:
            case BROWN_CONCRETE_POWDER:
            case CHIPPED_ANVIL:
            case CYAN_CONCRETE_POWDER:
            case DAMAGED_ANVIL:
            case DRAGON_EGG:
            case GRAVEL:
            case GRAY_CONCRETE_POWDER:
            case GREEN_CONCRETE_POWDER:
            case LIGHT_BLUE_CONCRETE_POWDER:
            case LIGHT_GRAY_CONCRETE_POWDER:
            case LIME_CONCRETE_POWDER:
            case MAGENTA_CONCRETE_POWDER:
            case ORANGE_CONCRETE_POWDER:
            case PINK_CONCRETE_POWDER:
            case PURPLE_CONCRETE_POWDER:
            case RED_CONCRETE_POWDER:
            case RED_SAND:
            case SAND:
            case WHITE_CONCRETE_POWDER:
            case YELLOW_CONCRETE_POWDER:
                //</editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Checks if this Material is an obtainable item.
     *
     * @return true if this material is an item
     */
    public boolean isItem() {
        switch (this) {
            //<editor-fold defaultstate="collapsed" desc="isItem">
            case ACACIA_WALL_SIGN:
            case ATTACHED_MELON_STEM:
            case ATTACHED_PUMPKIN_STEM:
            case BAMBOO_SAPLING:
            case BEETROOTS:
            case BIRCH_WALL_SIGN:
            case BLACK_WALL_BANNER:
            case BLUE_WALL_BANNER:
            case BRAIN_CORAL_WALL_FAN:
            case BROWN_WALL_BANNER:
            case BUBBLE_COLUMN:
            case BUBBLE_CORAL_WALL_FAN:
            case CARROTS:
            case CAVE_AIR:
            case COCOA:
            case CREEPER_WALL_HEAD:
            case CYAN_WALL_BANNER:
            case DARK_OAK_WALL_SIGN:
            case DEAD_BRAIN_CORAL_WALL_FAN:
            case DEAD_BUBBLE_CORAL_WALL_FAN:
            case DEAD_FIRE_CORAL_WALL_FAN:
            case DEAD_HORN_CORAL_WALL_FAN:
            case DEAD_TUBE_CORAL_WALL_FAN:
            case DRAGON_WALL_HEAD:
            case END_GATEWAY:
            case END_PORTAL:
            case FIRE:
            case FIRE_CORAL_WALL_FAN:
            case FROSTED_ICE:
            case GRAY_WALL_BANNER:
            case GREEN_WALL_BANNER:
            case HORN_CORAL_WALL_FAN:
            case JUNGLE_WALL_SIGN:
            case KELP_PLANT:
            case LAVA:
            case LIGHT_BLUE_WALL_BANNER:
            case LIGHT_GRAY_WALL_BANNER:
            case LIME_WALL_BANNER:
            case MAGENTA_WALL_BANNER:
            case MELON_STEM:
            case MOVING_PISTON:
            case NETHER_PORTAL:
            case OAK_WALL_SIGN:
            case ORANGE_WALL_BANNER:
            case PINK_WALL_BANNER:
            case PISTON_HEAD:
            case PLAYER_WALL_HEAD:
            case POTATOES:
            case POTTED_ACACIA_SAPLING:
            case POTTED_ALLIUM:
            case POTTED_AZURE_BLUET:
            case POTTED_BAMBOO:
            case POTTED_BIRCH_SAPLING:
            case POTTED_BLUE_ORCHID:
            case POTTED_BROWN_MUSHROOM:
            case POTTED_CACTUS:
            case POTTED_CORNFLOWER:
            case POTTED_DANDELION:
            case POTTED_DARK_OAK_SAPLING:
            case POTTED_DEAD_BUSH:
            case POTTED_FERN:
            case POTTED_JUNGLE_SAPLING:
            case POTTED_LILY_OF_THE_VALLEY:
            case POTTED_OAK_SAPLING:
            case POTTED_ORANGE_TULIP:
            case POTTED_OXEYE_DAISY:
            case POTTED_PINK_TULIP:
            case POTTED_POPPY:
            case POTTED_RED_MUSHROOM:
            case POTTED_RED_TULIP:
            case POTTED_SPRUCE_SAPLING:
            case POTTED_WHITE_TULIP:
            case POTTED_WITHER_ROSE:
            case PUMPKIN_STEM:
            case PURPLE_WALL_BANNER:
            case REDSTONE_WALL_TORCH:
            case REDSTONE_WIRE:
            case RED_WALL_BANNER:
            case SKELETON_WALL_SKULL:
            case SPRUCE_WALL_SIGN:
            case SWEET_BERRY_BUSH:
            case TALL_SEAGRASS:
            case TRIPWIRE:
            case TUBE_CORAL_WALL_FAN:
            case VOID_AIR:
            case WALL_TORCH:
            case WATER:
            case WHITE_WALL_BANNER:
            case WITHER_SKELETON_WALL_SKULL:
            case YELLOW_WALL_BANNER:
            case ZOMBIE_WALL_HEAD:
                //</editor-fold>
                return false;
            default:
                return true;
        }
    }

    /**
     * Checks if this Material can be interacted with.
     *
     * Interactable materials include those with functionality when they are
     * interacted with by a player such as chests, furnaces, etc.
     *
     * Some blocks such as piston heads and stairs are considered interactable
     * though may not perform any additional functionality.
     *
     * Note that the interactability of some materials may be dependant on their
     * state as well. This method will return true if there is at least one
     * state in which additional interact handling is performed for the
     * material.
     *
     * @return true if this material can be interacted with.
     */
    public boolean isInteractable() {
        switch (this) {
            // <editor-fold defaultstate="collapsed" desc="isInteractable">
            case ACACIA_BUTTON:
            case ACACIA_DOOR:
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case ACACIA_SIGN:
            case ACACIA_STAIRS:
            case ACACIA_TRAPDOOR:
            case ACACIA_WALL_SIGN:
            case ANDESITE_STAIRS:
            case ANVIL:
            case BARREL:
            case BEACON:
            case BELL:
            case BIRCH_BUTTON:
            case BIRCH_DOOR:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case BIRCH_SIGN:
            case BIRCH_STAIRS:
            case BIRCH_TRAPDOOR:
            case BIRCH_WALL_SIGN:
            case BLACK_BED:
            case BLACK_SHULKER_BOX:
            case BLAST_FURNACE:
            case BLUE_BED:
            case BLUE_SHULKER_BOX:
            case BREWING_STAND:
            case BRICK_STAIRS:
            case BROWN_BED:
            case BROWN_SHULKER_BOX:
            case CAKE:
            case CAMPFIRE:
            case CARTOGRAPHY_TABLE:
            case CAULDRON:
            case CHAIN_COMMAND_BLOCK:
            case CHEST:
            case CHIPPED_ANVIL:
            case COBBLESTONE_STAIRS:
            case COMMAND_BLOCK:
            case COMPARATOR:
            case COMPOSTER:
            case CRAFTING_TABLE:
            case CYAN_BED:
            case CYAN_SHULKER_BOX:
            case DAMAGED_ANVIL:
            case DARK_OAK_BUTTON:
            case DARK_OAK_DOOR:
            case DARK_OAK_FENCE:
            case DARK_OAK_FENCE_GATE:
            case DARK_OAK_SIGN:
            case DARK_OAK_STAIRS:
            case DARK_OAK_TRAPDOOR:
            case DARK_OAK_WALL_SIGN:
            case DARK_PRISMARINE_STAIRS:
            case DAYLIGHT_DETECTOR:
            case DIORITE_STAIRS:
            case DISPENSER:
            case DRAGON_EGG:
            case DROPPER:
            case ENCHANTING_TABLE:
            case ENDER_CHEST:
            case END_STONE_BRICK_STAIRS:
            case FLETCHING_TABLE:
            case FLOWER_POT:
            case FURNACE:
            case GRANITE_STAIRS:
            case GRAY_BED:
            case GRAY_SHULKER_BOX:
            case GREEN_BED:
            case GREEN_SHULKER_BOX:
            case GRINDSTONE:
            case HOPPER:
            case IRON_DOOR:
            case IRON_TRAPDOOR:
            case JIGSAW:
            case JUKEBOX:
            case JUNGLE_BUTTON:
            case JUNGLE_DOOR:
            case JUNGLE_FENCE:
            case JUNGLE_FENCE_GATE:
            case JUNGLE_SIGN:
            case JUNGLE_STAIRS:
            case JUNGLE_TRAPDOOR:
            case JUNGLE_WALL_SIGN:
            case LECTERN:
            case LEVER:
            case LIGHT_BLUE_BED:
            case LIGHT_BLUE_SHULKER_BOX:
            case LIGHT_GRAY_BED:
            case LIGHT_GRAY_SHULKER_BOX:
            case LIME_BED:
            case LIME_SHULKER_BOX:
            case LOOM:
            case MAGENTA_BED:
            case MAGENTA_SHULKER_BOX:
            case MOSSY_COBBLESTONE_STAIRS:
            case MOSSY_STONE_BRICK_STAIRS:
            case MOVING_PISTON:
            case NETHER_BRICK_FENCE:
            case NETHER_BRICK_STAIRS:
            case NOTE_BLOCK:
            case OAK_BUTTON:
            case OAK_DOOR:
            case OAK_FENCE:
            case OAK_FENCE_GATE:
            case OAK_SIGN:
            case OAK_STAIRS:
            case OAK_TRAPDOOR:
            case OAK_WALL_SIGN:
            case ORANGE_BED:
            case ORANGE_SHULKER_BOX:
            case PINK_BED:
            case PINK_SHULKER_BOX:
            case POLISHED_ANDESITE_STAIRS:
            case POLISHED_DIORITE_STAIRS:
            case POLISHED_GRANITE_STAIRS:
            case POTTED_ACACIA_SAPLING:
            case POTTED_ALLIUM:
            case POTTED_AZURE_BLUET:
            case POTTED_BAMBOO:
            case POTTED_BIRCH_SAPLING:
            case POTTED_BLUE_ORCHID:
            case POTTED_BROWN_MUSHROOM:
            case POTTED_CACTUS:
            case POTTED_CORNFLOWER:
            case POTTED_DANDELION:
            case POTTED_DARK_OAK_SAPLING:
            case POTTED_DEAD_BUSH:
            case POTTED_FERN:
            case POTTED_JUNGLE_SAPLING:
            case POTTED_LILY_OF_THE_VALLEY:
            case POTTED_OAK_SAPLING:
            case POTTED_ORANGE_TULIP:
            case POTTED_OXEYE_DAISY:
            case POTTED_PINK_TULIP:
            case POTTED_POPPY:
            case POTTED_RED_MUSHROOM:
            case POTTED_RED_TULIP:
            case POTTED_SPRUCE_SAPLING:
            case POTTED_WHITE_TULIP:
            case POTTED_WITHER_ROSE:
            case PRISMARINE_BRICK_STAIRS:
            case PRISMARINE_STAIRS:
            case PUMPKIN:
            case PURPLE_BED:
            case PURPLE_SHULKER_BOX:
            case PURPUR_STAIRS:
            case QUARTZ_STAIRS:
            case REDSTONE_ORE:
            case RED_BED:
            case RED_NETHER_BRICK_STAIRS:
            case RED_SANDSTONE_STAIRS:
            case RED_SHULKER_BOX:
            case REPEATER:
            case REPEATING_COMMAND_BLOCK:
            case SANDSTONE_STAIRS:
            case SHULKER_BOX:
            case SMITHING_TABLE:
            case SMOKER:
            case SMOOTH_QUARTZ_STAIRS:
            case SMOOTH_RED_SANDSTONE_STAIRS:
            case SMOOTH_SANDSTONE_STAIRS:
            case SPRUCE_BUTTON:
            case SPRUCE_DOOR:
            case SPRUCE_FENCE:
            case SPRUCE_FENCE_GATE:
            case SPRUCE_SIGN:
            case SPRUCE_STAIRS:
            case SPRUCE_TRAPDOOR:
            case SPRUCE_WALL_SIGN:
            case STONECUTTER:
            case STONE_BRICK_STAIRS:
            case STONE_BUTTON:
            case STONE_STAIRS:
            case STRUCTURE_BLOCK:
            case SWEET_BERRY_BUSH:
            case TNT:
            case TRAPPED_CHEST:
            case WHITE_BED:
            case WHITE_SHULKER_BOX:
            case YELLOW_BED:
            case YELLOW_SHULKER_BOX:
                // </editor-fold>
                return true;
            default:
                return false;
        }
    }

    /**
     * Obtains the block's hardness level (also known as "strength").
     * <br>
     * This number is used to calculate the time required to break each block.
     * <br>
     * Only available when {@link #isBlock()} is true.
     *
     * @return the hardness of that material.
     */
    public float getHardness() {
        switch (this) {
            // <editor-fold defaultstate="collapsed" desc="getBlockHardness">
            case BARRIER:
            case BEDROCK:
            case CHAIN_COMMAND_BLOCK:
            case COMMAND_BLOCK:
            case END_GATEWAY:
            case END_PORTAL:
            case END_PORTAL_FRAME:
            case JIGSAW:
            case MOVING_PISTON:
            case NETHER_PORTAL:
            case REPEATING_COMMAND_BLOCK:
            case STRUCTURE_BLOCK:
                return -1.0F;
            case BLACK_CARPET:
            case BLUE_CARPET:
            case BROWN_CARPET:
            case CYAN_CARPET:
            case GRAY_CARPET:
            case GREEN_CARPET:
            case LIGHT_BLUE_CARPET:
            case LIGHT_GRAY_CARPET:
            case LIME_CARPET:
            case MAGENTA_CARPET:
            case ORANGE_CARPET:
            case PINK_CARPET:
            case PURPLE_CARPET:
            case RED_CARPET:
            case SNOW:
            case WHITE_CARPET:
            case YELLOW_CARPET:
                return 0.1F;
            case ACACIA_LEAVES:
            case BIRCH_LEAVES:
            case BLACK_BED:
            case BLUE_BED:
            case BROWN_BED:
            case BROWN_MUSHROOM_BLOCK:
            case COCOA:
            case CYAN_BED:
            case DARK_OAK_LEAVES:
            case DAYLIGHT_DETECTOR:
            case GRAY_BED:
            case GREEN_BED:
            case JUNGLE_LEAVES:
            case LIGHT_BLUE_BED:
            case LIGHT_GRAY_BED:
            case LIME_BED:
            case MAGENTA_BED:
            case MUSHROOM_STEM:
            case OAK_LEAVES:
            case ORANGE_BED:
            case PINK_BED:
            case PURPLE_BED:
            case RED_BED:
            case RED_MUSHROOM_BLOCK:
            case SNOW_BLOCK:
            case SPRUCE_LEAVES:
            case VINE:
            case WHITE_BED:
            case YELLOW_BED:
                return 0.2F;
            case BLACK_STAINED_GLASS:
            case BLACK_STAINED_GLASS_PANE:
            case BLUE_STAINED_GLASS:
            case BLUE_STAINED_GLASS_PANE:
            case BROWN_STAINED_GLASS:
            case BROWN_STAINED_GLASS_PANE:
            case CYAN_STAINED_GLASS:
            case CYAN_STAINED_GLASS_PANE:
            case GLASS:
            case GLASS_PANE:
            case GLOWSTONE:
            case GRAY_STAINED_GLASS:
            case GRAY_STAINED_GLASS_PANE:
            case GREEN_STAINED_GLASS:
            case GREEN_STAINED_GLASS_PANE:
            case LIGHT_BLUE_STAINED_GLASS:
            case LIGHT_BLUE_STAINED_GLASS_PANE:
            case LIGHT_GRAY_STAINED_GLASS:
            case LIGHT_GRAY_STAINED_GLASS_PANE:
            case LIME_STAINED_GLASS:
            case LIME_STAINED_GLASS_PANE:
            case MAGENTA_STAINED_GLASS:
            case MAGENTA_STAINED_GLASS_PANE:
            case ORANGE_STAINED_GLASS:
            case ORANGE_STAINED_GLASS_PANE:
            case PINK_STAINED_GLASS:
            case PINK_STAINED_GLASS_PANE:
            case PURPLE_STAINED_GLASS:
            case PURPLE_STAINED_GLASS_PANE:
            case REDSTONE_LAMP:
            case RED_STAINED_GLASS:
            case RED_STAINED_GLASS_PANE:
            case SEA_LANTERN:
            case WHITE_STAINED_GLASS:
            case WHITE_STAINED_GLASS_PANE:
            case YELLOW_STAINED_GLASS:
            case YELLOW_STAINED_GLASS_PANE:
                return 0.3F;
            case CACTUS:
            case CHORUS_FLOWER:
            case CHORUS_PLANT:
            case LADDER:
            case NETHERRACK:
                return 0.4F;
            case ACACIA_BUTTON:
            case ACACIA_PRESSURE_PLATE:
            case BIRCH_BUTTON:
            case BIRCH_PRESSURE_PLATE:
            case BLACK_CONCRETE_POWDER:
            case BLUE_CONCRETE_POWDER:
            case BREWING_STAND:
            case BROWN_CONCRETE_POWDER:
            case CAKE:
            case COARSE_DIRT:
            case CYAN_CONCRETE_POWDER:
            case DARK_OAK_BUTTON:
            case DARK_OAK_PRESSURE_PLATE:
            case DIRT:
            case DRIED_KELP_BLOCK:
            case FROSTED_ICE:
            case GRAY_CONCRETE_POWDER:
            case GREEN_CONCRETE_POWDER:
            case HAY_BLOCK:
            case HEAVY_WEIGHTED_PRESSURE_PLATE:
            case ICE:
            case JUNGLE_BUTTON:
            case JUNGLE_PRESSURE_PLATE:
            case LEVER:
            case LIGHT_BLUE_CONCRETE_POWDER:
            case LIGHT_GRAY_CONCRETE_POWDER:
            case LIGHT_WEIGHTED_PRESSURE_PLATE:
            case LIME_CONCRETE_POWDER:
            case MAGENTA_CONCRETE_POWDER:
            case MAGMA_BLOCK:
            case OAK_BUTTON:
            case OAK_PRESSURE_PLATE:
            case ORANGE_CONCRETE_POWDER:
            case PACKED_ICE:
            case PINK_CONCRETE_POWDER:
            case PISTON:
            case PISTON_HEAD:
            case PODZOL:
            case PURPLE_CONCRETE_POWDER:
            case RED_CONCRETE_POWDER:
            case RED_SAND:
            case SAND:
            case SOUL_SAND:
            case SPRUCE_BUTTON:
            case SPRUCE_PRESSURE_PLATE:
            case STICKY_PISTON:
            case STONE_BUTTON:
            case STONE_PRESSURE_PLATE:
            case TURTLE_EGG:
            case WHITE_CONCRETE_POWDER:
            case YELLOW_CONCRETE_POWDER:
                return 0.5F;
            case CLAY:
            case COMPOSTER:
            case FARMLAND:
            case GRASS_BLOCK:
            case GRAVEL:
            case MYCELIUM:
            case SPONGE:
            case WET_SPONGE:
                return 0.6F;
            case GRASS_PATH:
                return 0.65F;
            case ACTIVATOR_RAIL:
            case DETECTOR_RAIL:
            case POWERED_RAIL:
            case RAIL:
                return 0.7F;
            case BLACK_WOOL:
            case BLUE_WOOL:
            case BROWN_WOOL:
            case CHISELED_QUARTZ_BLOCK:
            case CHISELED_RED_SANDSTONE:
            case CHISELED_SANDSTONE:
            case CUT_RED_SANDSTONE:
            case CUT_SANDSTONE:
            case CYAN_WOOL:
            case END_STONE_BRICKS:
            case END_STONE_BRICK_SLAB:
            case END_STONE_BRICK_STAIRS:
            case END_STONE_BRICK_WALL:
            case GRAY_WOOL:
            case GREEN_WOOL:
            case LIGHT_BLUE_WOOL:
            case LIGHT_GRAY_WOOL:
            case LIME_WOOL:
            case MAGENTA_WOOL:
            case NOTE_BLOCK:
            case ORANGE_WOOL:
            case PINK_WOOL:
            case PURPLE_WOOL:
            case QUARTZ_BLOCK:
            case QUARTZ_PILLAR:
            case QUARTZ_STAIRS:
            case RED_SANDSTONE:
            case RED_SANDSTONE_STAIRS:
            case RED_SANDSTONE_WALL:
            case RED_WOOL:
            case SANDSTONE:
            case SANDSTONE_STAIRS:
            case SANDSTONE_WALL:
            case WHITE_WOOL:
            case YELLOW_WOOL:
                return 0.8F;
            case ACACIA_SIGN:
            case ACACIA_WALL_SIGN:
            case BAMBOO:
            case BAMBOO_SAPLING:
            case BIRCH_SIGN:
            case BIRCH_WALL_SIGN:
            case BLACK_BANNER:
            case BLACK_WALL_BANNER:
            case BLUE_BANNER:
            case BLUE_WALL_BANNER:
            case BROWN_BANNER:
            case BROWN_WALL_BANNER:
            case CARVED_PUMPKIN:
            case CREEPER_HEAD:
            case CREEPER_WALL_HEAD:
            case CYAN_BANNER:
            case CYAN_WALL_BANNER:
            case DARK_OAK_SIGN:
            case DARK_OAK_WALL_SIGN:
            case DRAGON_HEAD:
            case DRAGON_WALL_HEAD:
            case GRAY_BANNER:
            case GRAY_WALL_BANNER:
            case GREEN_BANNER:
            case GREEN_WALL_BANNER:
            case JACK_O_LANTERN:
            case JUNGLE_SIGN:
            case JUNGLE_WALL_SIGN:
            case LIGHT_BLUE_BANNER:
            case LIGHT_BLUE_WALL_BANNER:
            case LIGHT_GRAY_BANNER:
            case LIGHT_GRAY_WALL_BANNER:
            case LIME_BANNER:
            case LIME_WALL_BANNER:
            case MAGENTA_BANNER:
            case MAGENTA_WALL_BANNER:
            case MELON:
            case NETHER_WART_BLOCK:
            case OAK_SIGN:
            case OAK_WALL_SIGN:
            case ORANGE_BANNER:
            case ORANGE_WALL_BANNER:
            case PINK_BANNER:
            case PINK_WALL_BANNER:
            case PLAYER_HEAD:
            case PLAYER_WALL_HEAD:
            case PUMPKIN:
            case PURPLE_BANNER:
            case PURPLE_WALL_BANNER:
            case RED_BANNER:
            case RED_WALL_BANNER:
            case SKELETON_SKULL:
            case SKELETON_WALL_SKULL:
            case SPRUCE_SIGN:
            case SPRUCE_WALL_SIGN:
            case WHITE_BANNER:
            case WHITE_WALL_BANNER:
            case WITHER_SKELETON_SKULL:
            case WITHER_SKELETON_WALL_SKULL:
            case YELLOW_BANNER:
            case YELLOW_WALL_BANNER:
            case ZOMBIE_HEAD:
            case ZOMBIE_WALL_HEAD:
                return 1.0F;
            case BLACK_TERRACOTTA:
            case BLUE_TERRACOTTA:
            case BROWN_TERRACOTTA:
            case CYAN_TERRACOTTA:
            case GRAY_TERRACOTTA:
            case GREEN_TERRACOTTA:
            case LIGHT_BLUE_TERRACOTTA:
            case LIGHT_GRAY_TERRACOTTA:
            case LIME_TERRACOTTA:
            case MAGENTA_TERRACOTTA:
            case ORANGE_TERRACOTTA:
            case PINK_TERRACOTTA:
            case PURPLE_TERRACOTTA:
            case RED_TERRACOTTA:
            case TERRACOTTA:
            case WHITE_TERRACOTTA:
            case YELLOW_TERRACOTTA:
                return 1.25F;
            case BLACK_GLAZED_TERRACOTTA:
            case BLUE_GLAZED_TERRACOTTA:
            case BROWN_GLAZED_TERRACOTTA:
            case CYAN_GLAZED_TERRACOTTA:
            case GRAY_GLAZED_TERRACOTTA:
            case GREEN_GLAZED_TERRACOTTA:
            case LIGHT_BLUE_GLAZED_TERRACOTTA:
            case LIGHT_GRAY_GLAZED_TERRACOTTA:
            case LIME_GLAZED_TERRACOTTA:
            case MAGENTA_GLAZED_TERRACOTTA:
            case ORANGE_GLAZED_TERRACOTTA:
            case PINK_GLAZED_TERRACOTTA:
            case PURPLE_GLAZED_TERRACOTTA:
            case RED_GLAZED_TERRACOTTA:
            case WHITE_GLAZED_TERRACOTTA:
            case YELLOW_GLAZED_TERRACOTTA:
                return 1.4F;
            case ANDESITE:
            case ANDESITE_SLAB:
            case ANDESITE_STAIRS:
            case ANDESITE_WALL:
            case BOOKSHELF:
            case BRAIN_CORAL_BLOCK:
            case BUBBLE_CORAL_BLOCK:
            case CHISELED_STONE_BRICKS:
            case CRACKED_STONE_BRICKS:
            case DARK_PRISMARINE:
            case DARK_PRISMARINE_SLAB:
            case DARK_PRISMARINE_STAIRS:
            case DEAD_BRAIN_CORAL_BLOCK:
            case DEAD_BUBBLE_CORAL_BLOCK:
            case DEAD_FIRE_CORAL_BLOCK:
            case DEAD_HORN_CORAL_BLOCK:
            case DEAD_TUBE_CORAL_BLOCK:
            case DIORITE:
            case DIORITE_SLAB:
            case DIORITE_STAIRS:
            case DIORITE_WALL:
            case FIRE_CORAL_BLOCK:
            case GRANITE:
            case GRANITE_SLAB:
            case GRANITE_STAIRS:
            case GRANITE_WALL:
            case HORN_CORAL_BLOCK:
            case MOSSY_STONE_BRICKS:
            case MOSSY_STONE_BRICK_SLAB:
            case MOSSY_STONE_BRICK_STAIRS:
            case MOSSY_STONE_BRICK_WALL:
            case POLISHED_ANDESITE:
            case POLISHED_ANDESITE_SLAB:
            case POLISHED_ANDESITE_STAIRS:
            case POLISHED_DIORITE:
            case POLISHED_DIORITE_SLAB:
            case POLISHED_DIORITE_STAIRS:
            case POLISHED_GRANITE:
            case POLISHED_GRANITE_SLAB:
            case POLISHED_GRANITE_STAIRS:
            case PRISMARINE:
            case PRISMARINE_BRICKS:
            case PRISMARINE_BRICK_SLAB:
            case PRISMARINE_BRICK_STAIRS:
            case PRISMARINE_SLAB:
            case PRISMARINE_STAIRS:
            case PRISMARINE_WALL:
            case PURPUR_BLOCK:
            case PURPUR_PILLAR:
            case PURPUR_STAIRS:
            case STONE:
            case STONE_BRICKS:
            case STONE_BRICK_STAIRS:
            case STONE_BRICK_WALL:
            case STONE_STAIRS:
            case TUBE_CORAL_BLOCK:
                return 1.5F;
            case BLACK_CONCRETE:
            case BLUE_CONCRETE:
            case BROWN_CONCRETE:
            case CYAN_CONCRETE:
            case GRAY_CONCRETE:
            case GREEN_CONCRETE:
            case LIGHT_BLUE_CONCRETE:
            case LIGHT_GRAY_CONCRETE:
            case LIME_CONCRETE:
            case MAGENTA_CONCRETE:
            case ORANGE_CONCRETE:
            case PINK_CONCRETE:
            case PURPLE_CONCRETE:
            case RED_CONCRETE:
            case WHITE_CONCRETE:
            case YELLOW_CONCRETE:
                return 1.8F;
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case ACACIA_LOG:
            case ACACIA_PLANKS:
            case ACACIA_SLAB:
            case ACACIA_STAIRS:
            case ACACIA_WOOD:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case BIRCH_LOG:
            case BIRCH_PLANKS:
            case BIRCH_SLAB:
            case BIRCH_STAIRS:
            case BIRCH_WOOD:
            case BLACK_SHULKER_BOX:
            case BLUE_SHULKER_BOX:
            case BONE_BLOCK:
            case BRICKS:
            case BRICK_SLAB:
            case BRICK_STAIRS:
            case BRICK_WALL:
            case BROWN_SHULKER_BOX:
            case CAMPFIRE:
            case CAULDRON:
            case COBBLESTONE:
            case COBBLESTONE_SLAB:
            case COBBLESTONE_STAIRS:
            case COBBLESTONE_WALL:
            case CUT_RED_SANDSTONE_SLAB:
            case CUT_SANDSTONE_SLAB:
            case CYAN_SHULKER_BOX:
            case DARK_OAK_FENCE:
            case DARK_OAK_FENCE_GATE:
            case DARK_OAK_LOG:
            case DARK_OAK_PLANKS:
            case DARK_OAK_SLAB:
            case DARK_OAK_STAIRS:
            case DARK_OAK_WOOD:
            case GRAY_SHULKER_BOX:
            case GREEN_SHULKER_BOX:
            case GRINDSTONE:
            case JUKEBOX:
            case JUNGLE_FENCE:
            case JUNGLE_FENCE_GATE:
            case JUNGLE_LOG:
            case JUNGLE_PLANKS:
            case JUNGLE_SLAB:
            case JUNGLE_STAIRS:
            case JUNGLE_WOOD:
            case LIGHT_BLUE_SHULKER_BOX:
            case LIGHT_GRAY_SHULKER_BOX:
            case LIME_SHULKER_BOX:
            case MAGENTA_SHULKER_BOX:
            case MOSSY_COBBLESTONE:
            case MOSSY_COBBLESTONE_SLAB:
            case MOSSY_COBBLESTONE_STAIRS:
            case MOSSY_COBBLESTONE_WALL:
            case NETHER_BRICKS:
            case NETHER_BRICK_FENCE:
            case NETHER_BRICK_SLAB:
            case NETHER_BRICK_STAIRS:
            case NETHER_BRICK_WALL:
            case OAK_FENCE:
            case OAK_FENCE_GATE:
            case OAK_LOG:
            case OAK_PLANKS:
            case OAK_SLAB:
            case OAK_STAIRS:
            case OAK_WOOD:
            case ORANGE_SHULKER_BOX:
            case PETRIFIED_OAK_SLAB:
            case PINK_SHULKER_BOX:
            case PURPLE_SHULKER_BOX:
            case PURPUR_SLAB:
            case QUARTZ_SLAB:
            case RED_NETHER_BRICKS:
            case RED_NETHER_BRICK_SLAB:
            case RED_NETHER_BRICK_STAIRS:
            case RED_NETHER_BRICK_WALL:
            case RED_SANDSTONE_SLAB:
            case RED_SHULKER_BOX:
            case SANDSTONE_SLAB:
            case SHULKER_BOX:
            case SMOOTH_QUARTZ:
            case SMOOTH_QUARTZ_SLAB:
            case SMOOTH_QUARTZ_STAIRS:
            case SMOOTH_RED_SANDSTONE:
            case SMOOTH_RED_SANDSTONE_SLAB:
            case SMOOTH_RED_SANDSTONE_STAIRS:
            case SMOOTH_SANDSTONE:
            case SMOOTH_SANDSTONE_SLAB:
            case SMOOTH_SANDSTONE_STAIRS:
            case SMOOTH_STONE:
            case SMOOTH_STONE_SLAB:
            case SPRUCE_FENCE:
            case SPRUCE_FENCE_GATE:
            case SPRUCE_LOG:
            case SPRUCE_PLANKS:
            case SPRUCE_SLAB:
            case SPRUCE_STAIRS:
            case SPRUCE_WOOD:
            case STONE_BRICK_SLAB:
            case STONE_SLAB:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_LOG:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_LOG:
            case STRIPPED_SPRUCE_WOOD:
            case WHITE_SHULKER_BOX:
            case YELLOW_SHULKER_BOX:
                return 2.0F;
            case BARREL:
            case CARTOGRAPHY_TABLE:
            case CHEST:
            case CRAFTING_TABLE:
            case FLETCHING_TABLE:
            case LECTERN:
            case LOOM:
            case SMITHING_TABLE:
            case TRAPPED_CHEST:
                return 2.5F;
            case BLUE_ICE:
                return 2.8F;
            case ACACIA_DOOR:
            case ACACIA_TRAPDOOR:
            case BEACON:
            case BIRCH_DOOR:
            case BIRCH_TRAPDOOR:
            case COAL_ORE:
            case CONDUIT:
            case DARK_OAK_DOOR:
            case DARK_OAK_TRAPDOOR:
            case DIAMOND_ORE:
            case DRAGON_EGG:
            case EMERALD_ORE:
            case END_STONE:
            case GOLD_BLOCK:
            case GOLD_ORE:
            case HOPPER:
            case IRON_ORE:
            case JUNGLE_DOOR:
            case JUNGLE_TRAPDOOR:
            case LAPIS_BLOCK:
            case LAPIS_ORE:
            case NETHER_QUARTZ_ORE:
            case OAK_DOOR:
            case OAK_TRAPDOOR:
            case OBSERVER:
            case REDSTONE_ORE:
            case SPRUCE_DOOR:
            case SPRUCE_TRAPDOOR:
                return 3.0F;
            case BLAST_FURNACE:
            case DISPENSER:
            case DROPPER:
            case FURNACE:
            case LANTERN:
            case SMOKER:
            case STONECUTTER:
                return 3.5F;
            case COBWEB:
                return 4.0F;
            case ANVIL:
            case BELL:
            case CHIPPED_ANVIL:
            case COAL_BLOCK:
            case DAMAGED_ANVIL:
            case DIAMOND_BLOCK:
            case EMERALD_BLOCK:
            case ENCHANTING_TABLE:
            case IRON_BARS:
            case IRON_BLOCK:
            case IRON_DOOR:
            case IRON_TRAPDOOR:
            case REDSTONE_BLOCK:
            case SPAWNER:
                return 5.0F;
            case ENDER_CHEST:
                return 22.5F;
            case OBSIDIAN:
                return 50.0F;
            case LAVA:
            case WATER:
                return 100.0F;
            default:
                return 0F;
            // </editor-fold>
        }
    }

    /**
     * Obtains the blast resistance value (also known as block "durability").
     * <br>
     * This value is used in explosions to calculate whether a block should be
     * broken or not.
     * <br>
     * Only available when {@link #isBlock()} is true.
     *
     * @return the blast resistance of that material.
     */
    public float getBlastResistance() {
        switch (this) {
            // <editor-fold defaultstate="collapsed" desc="getBlastResistance">
            case BLACK_CARPET:
            case BLUE_CARPET:
            case BROWN_CARPET:
            case CYAN_CARPET:
            case GRAY_CARPET:
            case GREEN_CARPET:
            case LIGHT_BLUE_CARPET:
            case LIGHT_GRAY_CARPET:
            case LIME_CARPET:
            case MAGENTA_CARPET:
            case ORANGE_CARPET:
            case PINK_CARPET:
            case PURPLE_CARPET:
            case RED_CARPET:
            case SNOW:
            case WHITE_CARPET:
            case YELLOW_CARPET:
                return 0.1F;
            case ACACIA_LEAVES:
            case BIRCH_LEAVES:
            case BLACK_BED:
            case BLUE_BED:
            case BROWN_BED:
            case BROWN_MUSHROOM_BLOCK:
            case CYAN_BED:
            case DARK_OAK_LEAVES:
            case DAYLIGHT_DETECTOR:
            case GRAY_BED:
            case GREEN_BED:
            case JUNGLE_LEAVES:
            case LIGHT_BLUE_BED:
            case LIGHT_GRAY_BED:
            case LIME_BED:
            case MAGENTA_BED:
            case MUSHROOM_STEM:
            case OAK_LEAVES:
            case ORANGE_BED:
            case PINK_BED:
            case PURPLE_BED:
            case RED_BED:
            case RED_MUSHROOM_BLOCK:
            case SNOW_BLOCK:
            case SPRUCE_LEAVES:
            case VINE:
            case WHITE_BED:
            case YELLOW_BED:
                return 0.2F;
            case BLACK_STAINED_GLASS:
            case BLACK_STAINED_GLASS_PANE:
            case BLUE_STAINED_GLASS:
            case BLUE_STAINED_GLASS_PANE:
            case BROWN_STAINED_GLASS:
            case BROWN_STAINED_GLASS_PANE:
            case CYAN_STAINED_GLASS:
            case CYAN_STAINED_GLASS_PANE:
            case GLASS:
            case GLASS_PANE:
            case GLOWSTONE:
            case GRAY_STAINED_GLASS:
            case GRAY_STAINED_GLASS_PANE:
            case GREEN_STAINED_GLASS:
            case GREEN_STAINED_GLASS_PANE:
            case LIGHT_BLUE_STAINED_GLASS:
            case LIGHT_BLUE_STAINED_GLASS_PANE:
            case LIGHT_GRAY_STAINED_GLASS:
            case LIGHT_GRAY_STAINED_GLASS_PANE:
            case LIME_STAINED_GLASS:
            case LIME_STAINED_GLASS_PANE:
            case MAGENTA_STAINED_GLASS:
            case MAGENTA_STAINED_GLASS_PANE:
            case ORANGE_STAINED_GLASS:
            case ORANGE_STAINED_GLASS_PANE:
            case PINK_STAINED_GLASS:
            case PINK_STAINED_GLASS_PANE:
            case PURPLE_STAINED_GLASS:
            case PURPLE_STAINED_GLASS_PANE:
            case REDSTONE_LAMP:
            case RED_STAINED_GLASS:
            case RED_STAINED_GLASS_PANE:
            case SEA_LANTERN:
            case WHITE_STAINED_GLASS:
            case WHITE_STAINED_GLASS_PANE:
            case YELLOW_STAINED_GLASS:
            case YELLOW_STAINED_GLASS_PANE:
                return 0.3F;
            case CACTUS:
            case CHORUS_FLOWER:
            case CHORUS_PLANT:
            case LADDER:
            case NETHERRACK:
                return 0.4F;
            case ACACIA_BUTTON:
            case ACACIA_PRESSURE_PLATE:
            case BIRCH_BUTTON:
            case BIRCH_PRESSURE_PLATE:
            case BLACK_CONCRETE_POWDER:
            case BLUE_CONCRETE_POWDER:
            case BREWING_STAND:
            case BROWN_CONCRETE_POWDER:
            case CAKE:
            case COARSE_DIRT:
            case CYAN_CONCRETE_POWDER:
            case DARK_OAK_BUTTON:
            case DARK_OAK_PRESSURE_PLATE:
            case DIRT:
            case FROSTED_ICE:
            case GRAY_CONCRETE_POWDER:
            case GREEN_CONCRETE_POWDER:
            case HAY_BLOCK:
            case HEAVY_WEIGHTED_PRESSURE_PLATE:
            case ICE:
            case JUNGLE_BUTTON:
            case JUNGLE_PRESSURE_PLATE:
            case LEVER:
            case LIGHT_BLUE_CONCRETE_POWDER:
            case LIGHT_GRAY_CONCRETE_POWDER:
            case LIGHT_WEIGHTED_PRESSURE_PLATE:
            case LIME_CONCRETE_POWDER:
            case MAGENTA_CONCRETE_POWDER:
            case MAGMA_BLOCK:
            case OAK_BUTTON:
            case OAK_PRESSURE_PLATE:
            case ORANGE_CONCRETE_POWDER:
            case PACKED_ICE:
            case PINK_CONCRETE_POWDER:
            case PISTON:
            case PISTON_HEAD:
            case PODZOL:
            case PURPLE_CONCRETE_POWDER:
            case RED_CONCRETE_POWDER:
            case RED_SAND:
            case SAND:
            case SOUL_SAND:
            case SPRUCE_BUTTON:
            case SPRUCE_PRESSURE_PLATE:
            case STICKY_PISTON:
            case STONE_BUTTON:
            case STONE_PRESSURE_PLATE:
            case TURTLE_EGG:
            case WHITE_CONCRETE_POWDER:
            case YELLOW_CONCRETE_POWDER:
                return 0.5F;
            case CLAY:
            case COMPOSTER:
            case FARMLAND:
            case GRASS_BLOCK:
            case GRAVEL:
            case MYCELIUM:
            case SPONGE:
            case WET_SPONGE:
                return 0.6F;
            case GRASS_PATH:
                return 0.65F;
            case ACTIVATOR_RAIL:
            case DETECTOR_RAIL:
            case POWERED_RAIL:
            case RAIL:
                return 0.7F;
            case INFESTED_CHISELED_STONE_BRICKS:
            case INFESTED_COBBLESTONE:
            case INFESTED_CRACKED_STONE_BRICKS:
            case INFESTED_MOSSY_STONE_BRICKS:
            case INFESTED_STONE:
            case INFESTED_STONE_BRICKS:
                return 0.75F;
            case BLACK_WOOL:
            case BLUE_WOOL:
            case BROWN_WOOL:
            case CHISELED_QUARTZ_BLOCK:
            case CHISELED_RED_SANDSTONE:
            case CHISELED_SANDSTONE:
            case CUT_RED_SANDSTONE:
            case CUT_SANDSTONE:
            case CYAN_WOOL:
            case END_STONE_BRICKS:
            case END_STONE_BRICK_SLAB:
            case END_STONE_BRICK_STAIRS:
            case END_STONE_BRICK_WALL:
            case GRAY_WOOL:
            case GREEN_WOOL:
            case LIGHT_BLUE_WOOL:
            case LIGHT_GRAY_WOOL:
            case LIME_WOOL:
            case MAGENTA_WOOL:
            case NOTE_BLOCK:
            case ORANGE_WOOL:
            case PINK_WOOL:
            case PURPLE_WOOL:
            case QUARTZ_BLOCK:
            case QUARTZ_PILLAR:
            case QUARTZ_STAIRS:
            case RED_SANDSTONE:
            case RED_SANDSTONE_STAIRS:
            case RED_SANDSTONE_WALL:
            case RED_WOOL:
            case SANDSTONE:
            case SANDSTONE_STAIRS:
            case SANDSTONE_WALL:
            case WHITE_WOOL:
            case YELLOW_WOOL:
                return 0.8F;
            case ACACIA_SIGN:
            case ACACIA_WALL_SIGN:
            case BAMBOO:
            case BAMBOO_SAPLING:
            case BIRCH_SIGN:
            case BIRCH_WALL_SIGN:
            case BLACK_BANNER:
            case BLACK_WALL_BANNER:
            case BLUE_BANNER:
            case BLUE_WALL_BANNER:
            case BROWN_BANNER:
            case BROWN_WALL_BANNER:
            case CARVED_PUMPKIN:
            case CREEPER_HEAD:
            case CREEPER_WALL_HEAD:
            case CYAN_BANNER:
            case CYAN_WALL_BANNER:
            case DARK_OAK_SIGN:
            case DARK_OAK_WALL_SIGN:
            case DRAGON_HEAD:
            case DRAGON_WALL_HEAD:
            case GRAY_BANNER:
            case GRAY_WALL_BANNER:
            case GREEN_BANNER:
            case GREEN_WALL_BANNER:
            case JACK_O_LANTERN:
            case JUNGLE_SIGN:
            case JUNGLE_WALL_SIGN:
            case LIGHT_BLUE_BANNER:
            case LIGHT_BLUE_WALL_BANNER:
            case LIGHT_GRAY_BANNER:
            case LIGHT_GRAY_WALL_BANNER:
            case LIME_BANNER:
            case LIME_WALL_BANNER:
            case MAGENTA_BANNER:
            case MAGENTA_WALL_BANNER:
            case MELON:
            case NETHER_WART_BLOCK:
            case OAK_SIGN:
            case OAK_WALL_SIGN:
            case ORANGE_BANNER:
            case ORANGE_WALL_BANNER:
            case PINK_BANNER:
            case PINK_WALL_BANNER:
            case PLAYER_HEAD:
            case PLAYER_WALL_HEAD:
            case PUMPKIN:
            case PURPLE_BANNER:
            case PURPLE_WALL_BANNER:
            case RED_BANNER:
            case RED_WALL_BANNER:
            case SKELETON_SKULL:
            case SKELETON_WALL_SKULL:
            case SPRUCE_SIGN:
            case SPRUCE_WALL_SIGN:
            case WHITE_BANNER:
            case WHITE_WALL_BANNER:
            case WITHER_SKELETON_SKULL:
            case WITHER_SKELETON_WALL_SKULL:
            case YELLOW_BANNER:
            case YELLOW_WALL_BANNER:
            case ZOMBIE_HEAD:
            case ZOMBIE_WALL_HEAD:
                return 1.0F;
            case BLACK_GLAZED_TERRACOTTA:
            case BLUE_GLAZED_TERRACOTTA:
            case BROWN_GLAZED_TERRACOTTA:
            case CYAN_GLAZED_TERRACOTTA:
            case GRAY_GLAZED_TERRACOTTA:
            case GREEN_GLAZED_TERRACOTTA:
            case LIGHT_BLUE_GLAZED_TERRACOTTA:
            case LIGHT_GRAY_GLAZED_TERRACOTTA:
            case LIME_GLAZED_TERRACOTTA:
            case MAGENTA_GLAZED_TERRACOTTA:
            case ORANGE_GLAZED_TERRACOTTA:
            case PINK_GLAZED_TERRACOTTA:
            case PURPLE_GLAZED_TERRACOTTA:
            case RED_GLAZED_TERRACOTTA:
            case WHITE_GLAZED_TERRACOTTA:
            case YELLOW_GLAZED_TERRACOTTA:
                return 1.4F;
            case BOOKSHELF:
                return 1.5F;
            case BLACK_CONCRETE:
            case BLUE_CONCRETE:
            case BROWN_CONCRETE:
            case CYAN_CONCRETE:
            case GRAY_CONCRETE:
            case GREEN_CONCRETE:
            case LIGHT_BLUE_CONCRETE:
            case LIGHT_GRAY_CONCRETE:
            case LIME_CONCRETE:
            case MAGENTA_CONCRETE:
            case ORANGE_CONCRETE:
            case PINK_CONCRETE:
            case PURPLE_CONCRETE:
            case RED_CONCRETE:
            case WHITE_CONCRETE:
            case YELLOW_CONCRETE:
                return 1.8F;
            case ACACIA_LOG:
            case ACACIA_WOOD:
            case BIRCH_LOG:
            case BIRCH_WOOD:
            case BLACK_SHULKER_BOX:
            case BLUE_SHULKER_BOX:
            case BONE_BLOCK:
            case BROWN_SHULKER_BOX:
            case CAMPFIRE:
            case CAULDRON:
            case CYAN_SHULKER_BOX:
            case DARK_OAK_LOG:
            case DARK_OAK_WOOD:
            case GRAY_SHULKER_BOX:
            case GREEN_SHULKER_BOX:
            case JUNGLE_LOG:
            case JUNGLE_WOOD:
            case LIGHT_BLUE_SHULKER_BOX:
            case LIGHT_GRAY_SHULKER_BOX:
            case LIME_SHULKER_BOX:
            case MAGENTA_SHULKER_BOX:
            case OAK_LOG:
            case OAK_WOOD:
            case ORANGE_SHULKER_BOX:
            case PINK_SHULKER_BOX:
            case PURPLE_SHULKER_BOX:
            case RED_SHULKER_BOX:
            case SHULKER_BOX:
            case SPRUCE_LOG:
            case SPRUCE_WOOD:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_OAK_LOG:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_SPRUCE_LOG:
            case STRIPPED_SPRUCE_WOOD:
            case WHITE_SHULKER_BOX:
            case YELLOW_SHULKER_BOX:
                return 2.0F;
            case BARREL:
            case CARTOGRAPHY_TABLE:
            case CHEST:
            case CRAFTING_TABLE:
            case DRIED_KELP_BLOCK:
            case FLETCHING_TABLE:
            case LECTERN:
            case LOOM:
            case SMITHING_TABLE:
            case TRAPPED_CHEST:
                return 2.5F;
            case BLUE_ICE:
                return 2.8F;
            case ACACIA_DOOR:
            case ACACIA_FENCE:
            case ACACIA_FENCE_GATE:
            case ACACIA_PLANKS:
            case ACACIA_SLAB:
            case ACACIA_STAIRS:
            case ACACIA_TRAPDOOR:
            case BEACON:
            case BIRCH_DOOR:
            case BIRCH_FENCE:
            case BIRCH_FENCE_GATE:
            case BIRCH_PLANKS:
            case BIRCH_SLAB:
            case BIRCH_STAIRS:
            case BIRCH_TRAPDOOR:
            case COAL_ORE:
            case COCOA:
            case CONDUIT:
            case DARK_OAK_DOOR:
            case DARK_OAK_FENCE:
            case DARK_OAK_FENCE_GATE:
            case DARK_OAK_PLANKS:
            case DARK_OAK_SLAB:
            case DARK_OAK_STAIRS:
            case DARK_OAK_TRAPDOOR:
            case DIAMOND_ORE:
            case EMERALD_ORE:
            case GOLD_ORE:
            case IRON_ORE:
            case JUNGLE_DOOR:
            case JUNGLE_FENCE:
            case JUNGLE_FENCE_GATE:
            case JUNGLE_PLANKS:
            case JUNGLE_SLAB:
            case JUNGLE_STAIRS:
            case JUNGLE_TRAPDOOR:
            case LAPIS_BLOCK:
            case LAPIS_ORE:
            case NETHER_QUARTZ_ORE:
            case OAK_DOOR:
            case OAK_FENCE:
            case OAK_FENCE_GATE:
            case OAK_PLANKS:
            case OAK_SLAB:
            case OAK_STAIRS:
            case OAK_TRAPDOOR:
            case OBSERVER:
            case REDSTONE_ORE:
            case SPRUCE_DOOR:
            case SPRUCE_FENCE:
            case SPRUCE_FENCE_GATE:
            case SPRUCE_PLANKS:
            case SPRUCE_SLAB:
            case SPRUCE_STAIRS:
            case SPRUCE_TRAPDOOR:
                return 3.0F;
            case BLAST_FURNACE:
            case DISPENSER:
            case DROPPER:
            case FURNACE:
            case LANTERN:
            case SMOKER:
            case STONECUTTER:
                return 3.5F;
            case COBWEB:
                return 4.0F;
            case BLACK_TERRACOTTA:
            case BLUE_TERRACOTTA:
            case BROWN_TERRACOTTA:
            case CYAN_TERRACOTTA:
            case GRAY_TERRACOTTA:
            case GREEN_TERRACOTTA:
            case LIGHT_BLUE_TERRACOTTA:
            case LIGHT_GRAY_TERRACOTTA:
            case LIME_TERRACOTTA:
            case MAGENTA_TERRACOTTA:
            case ORANGE_TERRACOTTA:
            case PINK_TERRACOTTA:
            case PURPLE_TERRACOTTA:
            case RED_TERRACOTTA:
            case TERRACOTTA:
            case WHITE_TERRACOTTA:
            case YELLOW_TERRACOTTA:
                return 4.2F;
            case HOPPER:
                return 4.8F;
            case BELL:
            case IRON_DOOR:
            case IRON_TRAPDOOR:
            case SPAWNER:
                return 5.0F;
            case ANDESITE:
            case ANDESITE_SLAB:
            case ANDESITE_STAIRS:
            case ANDESITE_WALL:
            case BRAIN_CORAL_BLOCK:
            case BRICKS:
            case BRICK_SLAB:
            case BRICK_STAIRS:
            case BRICK_WALL:
            case BUBBLE_CORAL_BLOCK:
            case CHISELED_STONE_BRICKS:
            case COAL_BLOCK:
            case COBBLESTONE:
            case COBBLESTONE_SLAB:
            case COBBLESTONE_STAIRS:
            case COBBLESTONE_WALL:
            case CRACKED_STONE_BRICKS:
            case CUT_RED_SANDSTONE_SLAB:
            case CUT_SANDSTONE_SLAB:
            case DARK_PRISMARINE:
            case DARK_PRISMARINE_SLAB:
            case DARK_PRISMARINE_STAIRS:
            case DEAD_BRAIN_CORAL_BLOCK:
            case DEAD_BUBBLE_CORAL_BLOCK:
            case DEAD_FIRE_CORAL_BLOCK:
            case DEAD_HORN_CORAL_BLOCK:
            case DEAD_TUBE_CORAL_BLOCK:
            case DIAMOND_BLOCK:
            case DIORITE:
            case DIORITE_SLAB:
            case DIORITE_STAIRS:
            case DIORITE_WALL:
            case EMERALD_BLOCK:
            case FIRE_CORAL_BLOCK:
            case GOLD_BLOCK:
            case GRANITE:
            case GRANITE_SLAB:
            case GRANITE_STAIRS:
            case GRANITE_WALL:
            case GRINDSTONE:
            case HORN_CORAL_BLOCK:
            case IRON_BARS:
            case IRON_BLOCK:
            case JUKEBOX:
            case MOSSY_COBBLESTONE:
            case MOSSY_COBBLESTONE_SLAB:
            case MOSSY_COBBLESTONE_STAIRS:
            case MOSSY_COBBLESTONE_WALL:
            case MOSSY_STONE_BRICKS:
            case MOSSY_STONE_BRICK_SLAB:
            case MOSSY_STONE_BRICK_STAIRS:
            case MOSSY_STONE_BRICK_WALL:
            case NETHER_BRICKS:
            case NETHER_BRICK_FENCE:
            case NETHER_BRICK_SLAB:
            case NETHER_BRICK_STAIRS:
            case NETHER_BRICK_WALL:
            case PETRIFIED_OAK_SLAB:
            case POLISHED_ANDESITE:
            case POLISHED_ANDESITE_SLAB:
            case POLISHED_ANDESITE_STAIRS:
            case POLISHED_DIORITE:
            case POLISHED_DIORITE_SLAB:
            case POLISHED_DIORITE_STAIRS:
            case POLISHED_GRANITE:
            case POLISHED_GRANITE_SLAB:
            case POLISHED_GRANITE_STAIRS:
            case PRISMARINE:
            case PRISMARINE_BRICKS:
            case PRISMARINE_BRICK_SLAB:
            case PRISMARINE_BRICK_STAIRS:
            case PRISMARINE_SLAB:
            case PRISMARINE_STAIRS:
            case PRISMARINE_WALL:
            case PURPUR_BLOCK:
            case PURPUR_PILLAR:
            case PURPUR_SLAB:
            case PURPUR_STAIRS:
            case QUARTZ_SLAB:
            case REDSTONE_BLOCK:
            case RED_NETHER_BRICKS:
            case RED_NETHER_BRICK_SLAB:
            case RED_NETHER_BRICK_STAIRS:
            case RED_NETHER_BRICK_WALL:
            case RED_SANDSTONE_SLAB:
            case SANDSTONE_SLAB:
            case SMOOTH_QUARTZ:
            case SMOOTH_QUARTZ_SLAB:
            case SMOOTH_QUARTZ_STAIRS:
            case SMOOTH_RED_SANDSTONE:
            case SMOOTH_RED_SANDSTONE_SLAB:
            case SMOOTH_RED_SANDSTONE_STAIRS:
            case SMOOTH_SANDSTONE:
            case SMOOTH_SANDSTONE_SLAB:
            case SMOOTH_SANDSTONE_STAIRS:
            case SMOOTH_STONE:
            case SMOOTH_STONE_SLAB:
            case STONE:
            case STONE_BRICKS:
            case STONE_BRICK_SLAB:
            case STONE_BRICK_STAIRS:
            case STONE_BRICK_WALL:
            case STONE_SLAB:
            case STONE_STAIRS:
            case TUBE_CORAL_BLOCK:
                return 6.0F;
            case DRAGON_EGG:
            case END_STONE:
                return 9.0F;
            case LAVA:
            case WATER:
                return 100.0F;
            case ENDER_CHEST:
                return 600.0F;
            case ANVIL:
            case CHIPPED_ANVIL:
            case DAMAGED_ANVIL:
            case ENCHANTING_TABLE:
            case OBSIDIAN:
                return 1200.0F;
            case BEDROCK:
            case CHAIN_COMMAND_BLOCK:
            case COMMAND_BLOCK:
            case END_GATEWAY:
            case END_PORTAL:
            case END_PORTAL_FRAME:
            case JIGSAW:
            case REPEATING_COMMAND_BLOCK:
            case STRUCTURE_BLOCK:
                return 3600000.0F;
            case BARRIER:
                return 3600000.8F;
            default:
                return 0;
            // </editor-fold>
        }
    }

}
