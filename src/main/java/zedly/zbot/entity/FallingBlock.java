package zedly.zbot.entity;

import org.bukkit.Material;

/**
 * Represents a falling block.
 */
public interface FallingBlock extends Entity {

    /**
     * @return the block type of this falling block.
     */
    Material getBlockType();

    /**
     * @return the block data of this falling block.
     */
    int getBlockData();
}
