package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Directional;
import zedly.zbot.block.data.Powerable;

/**
 * 'face' represents the face to which a lever or button is stuck.
 * <br>
 * This is used in conjunction with {@link Directional} to compute the
 * orientation of these blocks.
 */
public interface Switch extends Directional, Powerable {

    /**
     * Gets the value of the 'face' property.
     *
     * @return the 'face' value
     */
    Face getFace();

    /**
     * The face to which a switch type block is stuck.
     */
    public enum Face {
        /**
         * The switch is mounted to the floor and pointing upwards.
         */
        FLOOR,
        /**
         * The switch is mounted to the wall.
         */
        WALL,
        /**
         * The switch is mounted to the ceiling and pointing dowanrds.
         */
        CEILING;
    }
}
