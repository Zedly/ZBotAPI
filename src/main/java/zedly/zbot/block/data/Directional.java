package zedly.zbot.block.data;

import java.util.Set;
import zedly.zbot.BlockFace;

/**
 * 'facing' represents the face towards which the block is pointing.
 * <br>
 * Some blocks may not be able to face in all directions, use
 * {@link #getFaces()} to get all possible directions for this block.
 */
public interface Directional extends BlockData {

    /**
     * Gets the value of the 'facing' property.
     *
     * @return the 'facing' value
     */
    BlockFace getFacing();

}
