package zedly.zbot.block.data;

import java.util.Set;
import zedly.zbot.BlockFace;

/**
 * This class encompasses the 'north', 'east', 'south', 'west', 'up', 'down'
 * boolean flags which are used to set which faces of the block textures are
 * displayed on.
 * <br>
 * Some blocks may not be able to have faces on all directions, use
 * {@link #getAllowedFaces()} to get all possible faces for this block.
 */
public interface MultipleFacing extends BlockData {

    /**
     * Checks if this block has the specified face enabled.
     *
     * @param face to check
     * @return if face is enabled
     */
    boolean hasFace(BlockFace face);
}
