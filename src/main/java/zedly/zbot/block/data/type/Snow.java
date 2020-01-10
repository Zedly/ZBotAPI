package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * 'layers' represents the amount of layers of snow which are present in this
 * block.
 * <br>
 * May not be lower than {@link #getMinimumLayers()} or higher than
 * {@link #getMaximumLayers()}.
 */
public interface Snow extends BlockData {

    /**
     * Gets the value of the 'layers' property.
     *
     * @return the 'layers' value
     */
    int getLayers();
}
