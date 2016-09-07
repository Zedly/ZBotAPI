package zedly.zbot.entity;

/**
 * Represents a witch.
 */
public interface Witch extends Monster
{

	/**
	 * @return whether this witch is currently aggressive
	 * (looking to attack a mob).
	 */
	boolean isAggressive();
}
