package zedly.zbot.block.data;

import java.util.Set;
import zedly.zbot.Axis;

/**
 * 'axis' represents the axis along whilst this block is oriented.
 * <br>
 * Some blocks such as the portal block may not be able to be placed in all
 * orientations, use {@link #getAxes()} to retrieve all possible such
 * orientations.
 */
public interface Orientable extends BlockData {

    /**
     * Gets the value of the 'axis' property.
     *
     * @return the 'axis' value
     */
    Axis getAxis();
}
