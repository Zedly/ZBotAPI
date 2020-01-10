package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * 'hanging' denotes whether the lantern is hanging from a block.
 */
public interface Lantern extends BlockData {

    /**
     * Gets the value of the 'hanging' property.
     *
     * @return the 'hanging' value
     */
    boolean isHanging();

}
