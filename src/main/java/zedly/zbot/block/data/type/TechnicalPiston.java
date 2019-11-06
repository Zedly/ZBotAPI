package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Directional;

/**
 * 'type' represents the type of piston which this (technical) block corresponds
 * to.
 */
public interface TechnicalPiston extends Directional {

    /**
     * Gets the value of the 'type' property.
     *
     * @return the 'type' value
     */
    Type getType();

    /**
     * Different piston variants.
     */
    public enum Type {
        /**
         * A normal piston which does not pull connected blocks backwards on
         * retraction.
         */
        NORMAL,
        /**
         * A sticky piston which will also retract connected blocks.
         */
        STICKY;
    }
}
