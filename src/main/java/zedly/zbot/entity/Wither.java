package zedly.zbot.entity;

/**
 * Represents a wither.
 */
public interface Wither
{
	/**
	 * @return if the main head of this wither is targeting
	 * anything.
	 */
	boolean isCenterHeadTargeting();

	/**
	 * @return the entity ID of the entity this wither's main
	 * head is targeting.
	 */
	int getCenterHeadTargetId();

	/**
	 * @return if the second head of this wither is targeting
	 * anything.
	 */
	boolean isLeftHeadTargeting();

	/**
	 * @return the entity ID of the entity this wither's second
	 * head is targeting.
	 */
	int getLeftHeadTargetId();

	/**
	 * @return the entity ID of the entity this wither's third
	 * head is targeting.
	 */
	boolean isRightHeadTargeting();

	/**
	 * @return the entity ID of the entity this wither's third
	 * head is targeting.
	 */
	int getRightHeadTargetId();

	/**
	 * @return all of the entity IDs of the targets of this
	 * wither.
	 */
	int[] getTargetIds();

	/**
	 * @return how long this wither is invulnerable for.
	 */
	int getInvulnerableTime();

}
