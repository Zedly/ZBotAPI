package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * 'drag' indicates whether a force will be applied on entities moving through
 * this block.
 */
public interface BubbleColumn extends BlockData {

    /**
     * Gets the value of the 'drag' property.
     *
     * @return the 'part' value
     */
    boolean isDrag();

}
