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
    SHARPNESS(16, "Sharpness", 5),
    SMITE(17, "Smite", 5),
    BANE_OF_ARTHROPODS(18, "Bane of Arthropods", 5),
    KNOCKBACK(19, "Knockback", 2),
    FIRE_ASPECT(20, "Fire Aspect", 2),
    LOOTING(21, "Looting", 3),
    SWEEPING_EDGE(22, "Sweeping Edge", 3),
    EFFICIENCY(32, "Efficiency", 5),
    SILK_TOUCH(33, "Silk Touch", 1),
    UNBREAKING(34, "Unbreaking", 3),
    FORTUNE(35, "Fortune", 3),
    POWER(48, "Power", 5),
    PUNCH(49, "Punch", 2),
    FLAME(50, "Flame", 1),
    INFINITY(51, "Infinity", 1),
    LUCK_OF_THE_SEA(61, "Luck of the Sea", 3),
    LURE(62, "Lure", 3),
    LOYALTY(65, "Loyalty", 3),
    IMPALING(66, "Impaling", 5),
    RIPTIDE(67, "Riptide", 3),
    CHANNELING(68, "Channeling", 1),
    MENDING(70, "Mending", 1),
    CURSE_OF_VANISHING(71, "Curse of Vanishing", 1);

    private static final HashMap<Integer, Enchantment> BY_ID = new HashMap<>();
    
    private final int id;
    private final String name;
    private final int maxLevel;
    
    public static Enchantment byId(int id) {
        return BY_ID.get(id);
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
        for(Enchantment ench : Enchantment.values()) {
            BY_ID.put(ench.getId(), ench);
        }
    }
    
}
