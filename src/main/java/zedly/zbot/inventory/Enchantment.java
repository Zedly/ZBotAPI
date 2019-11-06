/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.inventory;

import java.util.HashMap;

/**
 *
 * @author Dennis
 */
public enum Enchantment {

    PROTECTION(0, "Protection", 4),
    FIRE_PROTECTION(1, "Fire Protection", 4),
    FEATHER_FALLING(2, "Feather Falling", 4),
    BLAST_PROTECTION(3, "Blast Protection", 4),
    PROJECTILE_PROTECTION(4, "Projectile Protection", 4),
    RESPIRATION(5, "Respiration", 3),
    AQUA_AFFINITY(6, "Aqua Affinity", 1),
    THORNS(7, "Thorns", 3),
    DEPTH_STRIDER(8, "Depth Strider", 3),
    FROST_WALKER(9, "Frost Walker", 2),
    CURSE_OF_BINDING(10, "Curse of Binding", 1),
    SHARPNESS(11, "Sharpness", 5),
    SMITE(12, "Smite", 5),
    BANE_OF_ARTHROPODS(13, "Bane of Arthropods", 5),
    KNOCKBACK(14, "Knockback", 2),
    FIRE_ASPECT(15, "Fire Aspect", 2),
    LOOTING(16, "Looting", 3),
    SWEEPING(17, "Sweeping Edge", 3),
    EFFICIENCY(18, "Efficiency", 5),
    SILK_TOUCH(19, "Silk Touch", 1),
    UNBREAKING(20, "Unbreaking", 3),
    FORTUNE(21, "Fortune", 3),
    POWER(22, "Power", 5),
    PUNCH(23, "Punch", 2),
    FLAME(24, "Flame", 1),
    INFINITY(25, "Infinity", 1),
    LUCK_OF_THE_SEA(26, "Luck of the Sea", 3),
    LURE(27, "Lure", 3),
    LOYALTY(28, "Loyalty", 3),
    IMPALING(29, "Impaling", 5),
    RIPTIDE(30, "Riptide", 3),
    CHANNELING(31, "Channeling", 3),
    MULTISHOT(32, "Multishot", 4),
    QUICK_CHARGE(33, "Quick Charge", 4),
    PIERCING(34, "Piercing", 4),
    MENDING(35, "Mending", 1),
    CURSE_OF_VANISHING(35, "Curse of Vanishing", 1);

    private static final HashMap<Integer, Enchantment> BY_ID = new HashMap<>();

    private final int id;
    private final String name;
    private final int maxLevel;

    public static Enchantment byId(int id) {
        return BY_ID.get(id);
    }

    public static Enchantment byCanonicalId(String canId) {
        try {
            return valueOf(canId.substring(canId.indexOf(":") + 1).toUpperCase());
        } catch (IllegalArgumentException ex) {
            return null;
        }
    }

    private Enchantment(int id, String name, int maxLevel) {
        this.id = id;
        this.name = name;
        this.maxLevel = maxLevel;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    static {
        for (Enchantment ench : Enchantment.values()) {
            BY_ID.put(ench.getId(), ench);
        }
    }

}
