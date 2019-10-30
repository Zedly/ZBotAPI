package zedly.zbot.entity;

import java.util.UUID;

/**
 * Represents a horse.
 */
public interface AbstractHorse extends Animal
{
	/**
	 * @return whether this horse is tamed.
	 */
	boolean isTame();

	/**
	 * @return whether this horse has a saddle.
	 */
	boolean isSaddled();

	/**
	 * @return whether this horse has a chest (donkeys only).
	 */
	boolean isEating();

	/**
	 * @return whether this horse has been bred.
	 */
	boolean hasBred();
	
	/**
	 * @return whether this horse is rearing (on its hind legs; doing a wheelie).
	 */
	boolean isRearing();

	/**
	 * @return whether this horse's mouth is open.
	 */
	boolean isMouthOpen();

        
	boolean hasOwner();

	/**
	 * @return the UUID of this horse's owner - not name, as if
	 * they change their name this horse will no longer belong
	 * to them.
	 */
	UUID getOwner();

}
