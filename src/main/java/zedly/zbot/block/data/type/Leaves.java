package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * 'persistent' indicates whether or not leaves will be checked by the server to
 * see if they are subject to decay or not.
 * <br>
 * 'distance' denotes how far the block is from a tree and is used in
 * conjunction with 'persistent' flag to determine if the leaves will decay or
 * not.
 */
public interface Leaves extends BlockData {

    /**
     * Gets the value of the 'persistent' property.
     *
     * @return the persistent value
     */
    boolean isPersistent();

    /**
     * Gets the value of the 'distance' property.
     *
     * @return the 'distance' value
     */
    int getDistance();

}
