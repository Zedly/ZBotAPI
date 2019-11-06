package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * 'unstable' indicates whether this TNT will explode on punching.
 */
public interface TNT extends BlockData {

    /**
     * Gets the value of the 'unstable' property.
     *
     * @return the 'unstable' value
     */
    boolean isUnstable();
}
