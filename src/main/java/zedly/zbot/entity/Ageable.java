package zedly.zbot.entity;

/**
 * Represents an ageable entity (one which can grow).
 */
public interface Ageable extends Creature
{
	/**
	 * @return if this ageable entity is a baby.
	 */
	boolean isBaby();
}
