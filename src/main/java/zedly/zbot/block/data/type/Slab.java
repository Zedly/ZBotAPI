package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Waterlogged;

/**
 * 'type' represents what state the slab is in - either top, bottom, or a double
 * slab occupying the full block.
 */
public interface Slab extends Waterlogged {

    /**
     * Gets the value of the 'type' property.
     *
     * @return the 'type' value
     */
    Type getType();

    /**
     * The type of the slab.
     */
    public enum Type {
        /**
         * The slab occupies the upper y half of the block.
         */
        TOP,
        /**
         * The slab occupies the lower y half of the block.
         */
        BOTTOM,
        /**
         * The slab occupies the entire block.
         */
        DOUBLE;
    }
}
