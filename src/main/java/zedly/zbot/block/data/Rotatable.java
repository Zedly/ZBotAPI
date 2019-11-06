package zedly.zbot.block.data;

import zedly.zbot.BlockFace;

/**
 * 'rotation' represents the current rotation of this block.
 */
public interface Rotatable extends BlockData {

    /**
     * Gets the value of the 'rotation' property.
     *
     * @return the 'rotation' value
     */
    BlockFace getRotation();

}
