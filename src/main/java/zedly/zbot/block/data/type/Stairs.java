package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Bisected;
import zedly.zbot.block.data.Directional;
import zedly.zbot.block.data.Waterlogged;

/**
 * 'shape' represents the texture and bounding box shape of these stairs.
 */
public interface Stairs extends Bisected, Directional, Waterlogged {

    /**
     * Gets the value of the 'shape' property.
     *
     * @return the 'shape' value
     */
    Shape getShape();

    /**
     * The shape of a stair block - used for constructing corners.
     */
    public enum Shape {
        /**
         * Regular stair block.
         */
        STRAIGHT,
        /**
         * Inner corner stair block with higher left side.
         */
        INNER_LEFT,
        /**
         * Inner corner stair block with higher right side.
         */
        INNER_RIGHT,
        /**
         * Outer corner stair block with higher left side.
         */
        OUTER_LEFT,
        /**
         * Outer corner stair block with higher right side.
         */
        OUTER_RIGHT;
    }
}
