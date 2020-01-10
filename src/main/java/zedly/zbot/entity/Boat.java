package zedly.zbot.entity;

/**
 * Represents a boat.
 */
public interface Boat extends Object {

    /**
     * @return the time since this boat was last hit by an object.
     */
    int getTimeSinceLastHit();

    /**
     * @return the direction this boat is facing.
     */
    int getForwardDirection();

    /**
     * @return the damage taken the last time this boat was hit by an object.
     */
    float getDamageTaken();

    /**
     * @return the wood type ID of this boat.
     */
    int getTypeId();

    boolean isLeftPaddleTurning();

    boolean isRightPaddleTurning();

    int getSplashTimer();
}
