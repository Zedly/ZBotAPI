package zedly.zbot.entity;

import zedly.zbot.DyeColor;

/**
 * Represents a wolf.
 */
public interface Wolf extends Tameable {

	/**
     * @return the last damage this wolf took.
     */
    float getDamageTaken();

	/**
     * @return whether this wolf is currently begging.
     */
    boolean isBegging();

	/**
     * @return the colour of this wolf's collar.
     */
    DyeColor getCollarColor();
}
