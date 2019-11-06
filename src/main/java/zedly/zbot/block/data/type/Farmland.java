package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * The 'moisture' level of farmland indicates how close it is to a water source
 * (if any).
 * <br>
 * A higher moisture level leads, to faster growth of crops on this block, but
 * cannot be higher than {@link #getMaximumMoisture()}.
 */
public interface Farmland extends BlockData {

    /**
     * Gets the value of the 'moisture' property.
     *
     * @return the 'moisture' value
     */
    int getMoisture();
}
