package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Waterlogged;

/**
 * 'bottom' indicates whether the scaffolding is floating or not.
 * <br>
 * 'distance' indicates the distance from a scaffolding block placed above a
 * 'bottom' scaffold.
 * <br>
 * When 'distance' reaches {@link #getMaximumDistance()} the block will drop.
 */
public interface Scaffolding extends Waterlogged {

    /**
     * Gets the value of the 'bottom' property.
     *
     * @return the 'bottom' value
     */
    boolean isBottom();

    /**
     * Gets the value of the 'distance' property.
     *
     * @return the 'distance' value
     */
    int getDistance();

}
