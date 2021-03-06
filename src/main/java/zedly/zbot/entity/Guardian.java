package zedly.zbot.entity;

/**
 * Represents a guardian.
 */
public interface Guardian extends Monster
{
	/**
	 * @return whether this guardian is retracting its spikes.
	 */
	boolean isRetractingSpikes();

	/**
	 * @return whether this guardian is targeting an entity.
	 */
	boolean isTargeting();

	/**
	 * @return the entity ID of this guardian's target.
	 */
	int getTargetedEntityId();
}
