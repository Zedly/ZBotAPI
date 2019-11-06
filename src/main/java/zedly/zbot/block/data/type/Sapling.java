package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * 'stage' represents the growth stage of a sapling.
 * <br>
 * When the sapling reaches {@link #getMaximumStage()} it will attempt to grow
 * into a tree as the next stage.
 */
public interface Sapling extends BlockData {

    /**
     * Gets the value of the 'stage' property.
     *
     * @return the 'stage' value
     */
    int getStage();

}
