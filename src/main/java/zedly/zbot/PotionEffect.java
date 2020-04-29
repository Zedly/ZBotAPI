/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot;

import java.util.HashMap;

/**
 *
 * @author Dennis
 */
public enum PotionEffect {

    SPEED("speed", 1),
    SLOWNESS("slowness", 2),
    HASTE("haste", 3),
    MINING_FATIGUE("mining_fatigue", 4),
    STRENGTH("strength", 5),
    INSTANT_HEALTH("instant_health", 6),
    INSTANT_DAMAGE("instant_damage", 7),
    JUMP_BOOST("jump_boost", 8),
    NAUSEA("nausea", 9),
    REGENERATION("regeneration", 10),
    RESISTANCE("resistance", 11),
    FIRE_RESISTANCE("fire_resistance", 12),
    WATER_BREATHING("water_breathing", 13),
    INVISIBILITY("invisibility", 14),
    BLINDNESS("blindness", 15),
    NIGHT_VISION("night_vision", 16),
    HUNGER("hunger", 17),
    WEAKNESS("weakness", 18),
    POISON("poison", 19),
    WITHER("wither", 20),
    HEALTH_BOOST("health_boost", 21),
    ABSORBTION("absorption", 22),
    SATURATION("saturation", 23),
    GLOWING("glowing", 24),
    LEVITATION("levitation", 25),
    LUCK("luck", 26),
    BAD_LUCK("unluck", 27),
    SLOW_FALLING("slow_falling", 28),
    CONDUIT_POWER("conduit_power", 29),
    DOLPHINS_GRACE("dolphins_grace", 30),
    BAD_OMEN("bad_omen", 31),
    HERO_OF_THE_VILLAGE("hero_of_the_village", 32);

    private static final HashMap<String, PotionEffect> BY_NAMESPACED_ID = new HashMap<>();
    private static final HashMap<Integer, PotionEffect> BY_EFFECT_ID = new HashMap<>();
    private final String namespacedId;
    private final int effectId;

    private PotionEffect(String namespacedId, int effectId) {
        this.namespacedId = namespacedId;
        this.effectId = effectId;
    }

    public static PotionEffect byNamespacedId(String namespacedId) {
        return BY_NAMESPACED_ID.get(namespacedId);
    }

    public static PotionEffect byEffectId(int effectId) {
        return BY_EFFECT_ID.get(effectId);
    }

    static {
        for (PotionEffect effect : values()) {
            BY_NAMESPACED_ID.put(effect.namespacedId, effect);
            BY_EFFECT_ID.put(effect.effectId, effect);
        }
    }
}
