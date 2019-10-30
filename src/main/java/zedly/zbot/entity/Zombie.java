package zedly.zbot.entity;

import zedly.zbot.VillagerProfession;

/**
 * Represents a zombie.
 */
public interface Zombie extends Monster {

    /**
     * @return whether this zombie is a baby zombie.
     */
    boolean isBaby();

    boolean isDrowning();
}
