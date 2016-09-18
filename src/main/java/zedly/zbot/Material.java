package zedly.zbot;

import java.util.HashMap;

public enum Material {
    
    AIR(0),
    STONE(1),
    GRASS(2),
    DIRT(3),
    COBBLESTONE(4),
    WOOD(5),
    SAPLING(6),
    BEDROCK(7),
    FLOWING_WATER(8),
    STILL_WATER(9),
    FLOWING_LAVA(10),
    STILL_LAVA(11),
    SAND(12),
    GRAVEL(13),
    GOLD_ORE(14),
    IRON_ORE(15),
    COAL_ORE(16),
    LOG(17),
    LEAVES(18),
    SPONGE(19),
    GLASS(20),
    LAPIS_LAZULI_ORE(21),
    LAPIS_LAZULI_BLOCK(22),
    DISPENSER(23),
    SANDSTONE(24),
    NOTE_BLOCK(25),
    BED_BLOCK(26),
    POWERED_RAIL(27),
    DETECTOR_RAIL(28),
    STICKY_PISTON(29),
    COBWEB(30),
    DEAD_SHRUB(31),
    DEAD_BUSH(32),
    PISTON(33),
    PISTON_HEAD(34),
    WOOL(35),
    DANDELION(26),
    POPPY(37),
    BROWN_MUSHROOM(38),
    RED_MUSHROOM(39),
    GOLD_BLOCK(40),
    IRON_BLOCK(41),
    DOUBLE_STONE_SLAB(42),
    STONE_SLAB(44),
    BRICKS(45),
    TNT(46),
    BOOKSHELF(47),
    MOSS_STONE(48),
    OBSIDIAN(49),
    TPRCH(50),
    FIRE(51),
    MONSTER_SPAWNER(52),
    OAK_WOOD_STAIRS(53),
    CHEST(54),
    REDSTONE_WIRE(55),
    DIAMOND_ORE(56),
    DIAMOND_BLOCK(57),
    CRAFTING_TABLE(58),
    WHEAT_CROPS(59),
    FARMLAND(60),
    FURNACE(61),
    BURNING_FURNACE(62),
    STANDING_SIGN(63),
    OAK_DOOR_BLOCK(64),
    LADDER(65),
    RAIL(66),
    COBBLESTONE_STAIRS(67),
    WALL_SIGN(68),
    LEVER(69),
    STONE_PRESSURE_PLATE(70),
    IRON_DOOR_BLOCK(71),
    WOOD_PRESSURE_PLATE(72),
    REDSTONE_ORE(73),
    GLOWING_REDSTONE_ORE(74),
    REDSTONE_TORCH_OFF(75),
    REDSTONE_TORCH_ON(76),
    STONE_BUTTON(77),
    SNOW(78),
    ICE(79),
    SNOW_BLOCK(80),
    CACTUS(81),
    CLAY_BLOCK(82),
    SUGAR_CANE(83),
    JUKEBOX(84),
    OAK_FENCE(85),
    PUMPKIN(86),
    NETHERRACK(87),
    SOUL_SAND(88),
    GLOWSTONE(89),
    NETHER_PORTAL(90),
    LIT_PUMPKIN(91),
    CAKE_BLOCK(92),
    REDSTONE_REPEATER_OFF(93),
    REDSTONE_REPEATER_ON(94),
    STAINED_GLASS(95),
    WOOD_TRAPDOOR(96),
    STONE_MONSTER_EGG(97),
    STONE_BRICK(98),
    BROWN_MUSHROOM_BLOCK(99),
    RED_MUSHROOM_BLOCK(100),
    IRON_BARS(101),
    GLASS_PANE(102),
    MELON_BLOCK(103),
    PUMPKIN_STEM(104),
    MELON_STEM(105),
    VINES(106),
    OAK_FENCE_GATE(107),
    BRICK_STAIRS(108),
    STONE_BRICK_STAIRS(109),
    MYCELIUM(110),
    LILY_PAD(111),
    NETHER_BRICK_BLOCK(112),
    NETHER_BRICK_FENCE(113),
    NETHER_BRICK_STAIRS(114),
    NETHER_WART_PLANT(115),
    ENCHANTMENT_TABLE(116),
    BREWING_STAND_BLOCK(117),
    CAULDRON_BLOCK(118),
    END_PORTAL(119),
    END_PORTAL_FRAME(120),
    END_STONE(121),
    DRAGON_EGG(122),
    REDSTONE_LAMP_OFF(123),
    REDSTONE_LAMP_ON(124),
    DOUBLE_WOOD_SLAB(125),
    WOOD_SLAB(126),
    COCOA(127),
    SANDSTONE_STAIRS(128),
    EMERALD_ORE(129),
    ENDER_CHEST(130),
    TRIPWIRE_HOOK(131),
    TRIPWIRE(132),
    EMERALD_BLOCK(133),
    SPRUCE_WOOD_STAIRS(134),
    BIRCH_WOOD_STAIRS(135),
    JUNGLE_WOOD_STAIRS(136),
    COMMAND_BLOCK(137),
    BEACON(138),
    COBBLESTONE_WALL(139),
    FLOWER_POT_BLOCK(140),
    CARROTS(141),
    POTATOES(142),
    WOOD_BUTTON(143),
    MOB_HEAD_BLOCK(144),
    ANVIl(145),
    TRAPPED_CHEST(146),
    LIGHT_WEIGHTED_PRESSURE_PLATE(147),
    HEAVY_WEIGHTED_PRESSURE_PLATE(148),
    REDSTONE_COMPARATOR_OFF(149),
    REDSTONE_COMPARATOR_ON(150),
    DAYLIGHT_SENSOR(151),
    REDSTONE_BLOCK(152),
    NETHER_QUARTZ_ORE(153),
    HOPPER(154),
    QUARTZ_BLOCK(155),
    QUARTZ_STAIRS(156),
    ACTIVATOR_RAIL(157),
    DROPPER(158),
    STAINED_CLAY(159),
    STAINED_GLASS_PANE(160),
    ACACIA_LEAVES(161),
    ACACIA_LOG(162),
    ACACIA_WOOD_STAIRS(163),
    DARK_OAK_WOOD_STAIRS(164),
    SLIME_BLOCK(165),
    BARRIER(166),
    IRON_TRAPDOOR(167),
    PRISMARINE(168),
    SEA_LANTERN(169),
    HAY_BALE(170),
    CARPET(171),
    HARDENED_CLAY(172),
    COAL_BLOCK(173),
    PACKED_ICE(174),
    SUNFLOWER(175),
    STANDING_BANNER(176),
    WALL_MOUNTED_BANNER(177),
    INVERTED_DAYLIGHT_SENSOR(178),
    RED_SANDSTONE(179),
    RED_SANDSTONE_STAIRS(180),
    DOUBLE_RED_SANDSTONE_SLAB(181),
    RED_SANDSTONE_SLAB(182),
    SPRUCE_FENCE_GATE(183),
    BIRCH_FENCE_GATE(184),
    JUNGLE_FENCE_GATE(185),
    DARK_OAK_FENCE_GATE(186),
    ACACIA_FENCE_GATE(187),
    SPRUCE_FENCE(188),
    BIRCH_FENCE(189),
    JUNGLE_FENCE(190),
    DARK_OAK_FENCE(191),
    ACACIA_FENCE(192),
    SPRUCE_DOOR_BLOCK(193),
    BIRCH_DOOR_BLOCK(194),
    JUNGLE_DOOR_BLOCK(195),
    ACACIA_DOOR_BLOCK(196),
    DARK_OAK_DOOR_BLOCK(197),
    END_ROD(198),
    CHORUS_PLANT(199),
    CHORUS_FLOWER(200),
    PURPUR_BLOCK(201),
    PURPUR_PILLAR(202),
    PURPUR_STAIRS(203),
    DOUBLE_PURPUR_SLAB(204),
    PURPUR_SLAB(205),
    END_STONE_BRICK(206),
    BEETROOT_BLOCK(207),
    GRASS_PATH(208),
    END_GATEWAY(209),
    REPEATING_COMMAND_BLOCK(210),
    CHAIN_COMMAND_BLOCK(211),
    FROSTED_ICE(212),
    STRUCTURE_BLOCK(255),
    IRON_SHOVEL(256),
    IRON_PICKAXE(257),
    IRON_AXE(258),
    FLINT_AND_STEEL(259),
    APPLE(260),
    BOW(261),
    ARROW(262),
    COAL(263),
    DIAMOND(264),
    IRON_INGOT(265),
    GOLD_INGOT(266),
    IRON_SWORD(267),
    WOODEN_SWORD(268),
    WOODEN_SHOVEL(269),
    WOODEN_PICKAXE(270),
    WOODEN_AXE(271),
    STONE_SWORD(272),
    STONE_SHOVEL(273),
    STONE_PICKAXE(274),
    STONE_AXE(275),
    DIAMOND_SWORD(276),
    DIAMOND_SHOVEL(277),
    DIAMOND_PICKAXE(278),
    DIAMOND_AXE(279),
    STICK(280),
    BOWL(281),
    MUSHROOM_STEW(282),
    GOLD_SWORD(283),
    GOLD_SHOVEL(284),
    GOLD_PICKAXE(285),
    GOLD_AXE(286),
    STRING(287),
    FEATHER(288),
    GUNPOWDER(289),
    WOODEN_HOE(290),
    STONE_HOE(291),
    IRON_HOE(292),
    DIAMOND_HOE(293),
    GOLD_HOE(294),
    WHEAT_SEEDS(295),
    WHEAT(296),
    BREAD(297),
    LEATHER_HELMET(298),
    LEATHER_TUNIC(299),
    LEATHER_PANTS(300),
    LEATHER_BOOTS(301),
    CHAINMAIl_HELMET(302),
    CHAINMAIL_CHESTPLATE(303),
    CHAINMAIL_LEGGINGS(304),
    CHAINMAIL_BOOTS(305),
    IRON_HELMET(306),
    IRON_CHESTPLATE(307),
    IRON_LEGGINGS(308),
    IRON_BOOTS(309),
    DIAMOND_HELMET(310),
    DIAMOND_CHESTPLATE(311),
    DIAMOND_LEGGINGS(312),
    DIAMOND_BOOTS(313),
    GOLD_HELMET(314),
    GOLD_CHESTPLATE(315),
    GOLD_LEGGINGS(316),
    GOLD_BOOTS(317),
    FLINT(318),
    RAW_PORKCHOP(319),
    COOKED_PORKCHOP(320),
    PAINTING(321),
    GOLDEN_APPLE(322),
    SIGN(323),
    OAK_DOOR(324),
    BUCKET(325),
    BUCKET_OF_WATER(326),
    BUCKET_OF_LAVA(327),
    MINECART(328),
    SADDLE(329),
    IRON_DOOR(330),
    REDSTONE(331),
    SNOWBALL(332),
    OAK_BOAT(333),
    LEATHER(334),
    MILK_BUCKET(335),
    BRICK(336),
    CLAY(337),
    SUGAR_CANES(338),
    PAPER(339),
    BOOK(340),
    SLIMEBALL(341),
    CHEST_MINECART(342),
    FURNACE_MINECART(343),
    EGG(344),
    COMPASS(345),
    FISHING_ROD(346),
    CLOCK(347),
    GLOWSTONE_DUST(348),
    RAW_FISH(349),
    COOKED_FISH(350),
    INK_SACK(351),
    BONE(352),
    SUGAR(353),
    CAKE(354),
    BED(355),
    REDSTONE_REPEATER(356),
    COOKIE(357),
    MAP(358),
    SHEARS(359),
    MELON(360),
    PUMPKIN_SEEDS(361),
    MELON_SEEDS(362),
    RAW_BEEF(363),
    STEAK(364),
    RAW_CHICKEN(365),
    COOKED_CHICKEN(366),
    ROTTEN_FLESH(367),
    ENDER_PEARL(368),
    BLAZE_ROD(369),
    GHAST_TEAR(370),
    GOLD_NUGGET(371),
    NETHER_WART(371),
    POTION(373),
    GLASS_BOTTLE(374),
    SPIDER_EYE(375),
    FERMENTED_SPIDER_EYE(376),
    BLAZE_POWDER(377),
    MAGMA_CREAM(378),
    BREWING_STAND(379),
    CAULDRON(380),
    ENDER_EYE(381),
    GLISTERING_MELON(382),
    SPAWN_EGG(383),
    EXPERIENCE_BOTTLE(384),
    FIRE_CHARGE(385),
    WRITABLE_BOOK(386),
    WRITTEN_BOOK(387),
    EMERALD(388),
    ITEM_FRAME(389),
    FLOWER_POT(390),
    CARROT(391),
    POTATO(392),
    BAKED_POTATO(393),
    POISONOUS_POTATO(394),
    EMPTY_MAP(395),
    GOLDEN_CARROT(396),
    MOB_HEAD(397),
    CARROT_ON_A_STICK(398),
    NETHER_STAR(399),
    PUMPKIN_PIE(400),
    FIREWORK_ROCKET(401),
    FIREWORK_STAR(402),
    ENCHANTED_BOOK(403),
    REDSTONE_COMPARATOR(404),
    NETHER_BRICK(405),
    NETHER_QUARTZ(406),
    TNT_MINECART(407),
    HOPPER_MINECART(408),
    PRISMARINE_SHARD(409),
    PRISMARINE_CRYSTALS(410),
    RAW_RABBIT(411),
    COOKED_RABBIT(412),
    RABBIT_STEW(413),
    RABBIT_FOOT(414),
    RABBIT_HIDE(415),
    ARMOR_STAND(416),
    IRON_HORSE_ARMOUR(417),
    GOLDEN_HORSE_ARMOUR(418),
    DIAMOND_HORSE_ARMOUR(419),
    LEAD(420),
    NAME_TAG(421),
    COMMAND_BLOCK_MINECART(422),
    RAW_MUTTON(423),
    COOKED_MUTTON(424),
    BANNER(425),
    SPRUCE_DOOR(427),
    BIRCH_DOOR(428),
    JUNGLE_DOOR(429),
    ACACIA_DOOR(430),
    DARK_OAK_DOOR(431),
    CHORUS_FRUIT(432),
    POPPED_CHORUS_FRUIT(433),
    BEETROOT(434),
    BEETROOT_SEEDS(435),
    BEETROOT_SOUP(436),
    DRAGON_BREATH(437),
    SPLASH_POTION(438),
    SPECTRAL_ARROW(439),
    TIPPED_ARROW(440),
    LINGERING_POTION(441),
    SHIELD(442),
    ELYTRA(443),
    SPRUCE_BOAT(444),
    BIRCH_BOAT(445),
    JUNGLE_BOAT(446),
    ACACIA_BOAT(447),
    DARK_OAK_BOAT(448),
    RECORD_13(2256),
    RECORD_CAT(2257),
    RECORD_BLOCKS(2258),
    RECORD_CHIRP(2259),
    RECORD_FAR(2260),
    RECORD_MALL(2261),
    RECORD_MELLOHI(2262),
    RECORD_STAL(2263),
    RECORD_STRAD(2264),
    RECORD_WARD(2265),
    RECORD_11(2266),
    RECORD_WAIT(2267);

    private int id;
    private static final HashMap<Integer, Material> materialIdMap = new HashMap<>();

    Material(int id) {
        this.id = id;
    }

    public int getTypeId() {
        return id;
    }
    
    public static Material fromTypeId(int typeId) {
        return materialIdMap.get(typeId);
    }
    
    static {
        for(Material m : values()) {
            materialIdMap.put(m.id, m);
        }
    }
}