package zedly.zbot.block.data.type;

import java.util.Set;
import zedly.zbot.BlockFace;
import zedly.zbot.block.data.AnaloguePowerable;

/**
 * 'north', 'east', 'south', 'west' represent the types of connections this
 * redstone wire has to adjacent blocks.
 */
public interface RedstoneWire extends AnaloguePowerable {

    /**
     * Checks the type of connection on the specified face.
     *
     * @param face to check
     * @return connection type
     */
    Connection getFace(BlockFace face);

    /**
     * The way in which a redstone wire can connect to an adjacent block face.
     */
    public enum Connection {
        /**
         * The wire travels up the side of the block adjacent to this face.
         */
        UP,
        /**
         * The wire travels flat from this face and into the adjacent block.
         */
        SIDE,
        /**
         * The wire does not connect in this direction.
         */
        NONE;
    }
}
