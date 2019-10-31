package zedly.zbot.entity;

/**
 * Represents a projectile, for example a snowball or arrow.
 */
public interface Projectile extends Object {

    /**
     * @return the ID of the entity that fired this projectile
     */
    int getFiringEntityId();
    
}
