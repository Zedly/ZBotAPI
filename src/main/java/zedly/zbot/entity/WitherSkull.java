package zedly.zbot.entity;

/**
 * Represents a wither skull.
 */
public interface WitherSkull extends AbstractFireball, Object {

    /**
     * @return whether this wither skull can currently be killed.
     */
    boolean isInvulnerable();
}
