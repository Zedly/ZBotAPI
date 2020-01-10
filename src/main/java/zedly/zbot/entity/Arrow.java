package zedly.zbot.entity;

import java.util.UUID;

/**
 * Represents an arrow shot by an object.
 */
public interface Arrow extends Object {

    /**
     * @return if the damage done by this arrow is critical.
     */
    boolean isCritical();
    
    boolean isNoClip();
    
    int getShooter();
    
    int getPiercingLevel();
}
