package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Bisected;
import zedly.zbot.block.data.Directional;
import zedly.zbot.block.data.Openable;
import zedly.zbot.block.data.Powerable;

/**
 * 'hinge' indicates which hinge this door is attached to and will rotate around
 * when opened.
 */
public interface Door extends Bisected, Directional, Openable, Powerable {

    /**
     * Gets the value of the 'hinge' property.
     *
     * @return the 'hinge' value
     */
    Hinge getHinge();

    /**
     * The hinge of a door.
     */
    public enum Hinge {
        /**
         * Door is attached to the left side.
         */
        LEFT,
        /**
         * Door is attached to the right side.
         */
        RIGHT;
    }
}
