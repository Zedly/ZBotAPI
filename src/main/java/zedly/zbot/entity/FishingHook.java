package zedly.zbot.entity;

/**
 * Represents a fishing hook from a fishing rod.
 */
public interface FishingHook extends Object {

	/**
     * @return whether this fishing hook is hooked to an entity.
     */
    boolean hasHookedEntity();

	/**
     * @return the entity ID of the entity this fishing hook is hooked to.
     */
    int getHookedEntityId();
}
