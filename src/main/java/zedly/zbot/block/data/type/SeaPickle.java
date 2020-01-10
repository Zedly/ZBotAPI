package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Waterlogged;

/**
 * 'pickles' indicates the number of pickles in this block.
 */
public interface SeaPickle extends Waterlogged {

    /**
     * Gets the value of the 'pickles' property.
     *
     * @return the 'pickles' value
     */
    int getPickles();

}
