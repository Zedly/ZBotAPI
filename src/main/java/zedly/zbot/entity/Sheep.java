package zedly.zbot.entity;

import zedly.zbot.DyeColor;

/**
 * Represents a sheep.
 */
public interface Sheep extends Animal
{
	/**
	 * @return the colour of this sheep.
	 */
	DyeColor getColor();

	/**
	 * @return if this sheep is sheared at the current time (if
	 * it has wool or not).
	 */
	boolean isSheared();
}
