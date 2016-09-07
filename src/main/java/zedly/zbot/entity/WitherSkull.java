package zedly.zbot.entity;

/**
 * Represents a wither skull.
 */
public interface WitherSkull extends Fireball
{

	/**
	 * @return whether this wither skull can currently be
	 * killed.
	 */
	boolean isInvulnerable();
}
