package zedly.zbot.block.data;

import zedly.zbot.Material;

public interface BlockData extends Cloneable {

    /**
     * Get the Material represented by this block data.
     *
     * @return the material
     */
    Material getMaterial();

}
