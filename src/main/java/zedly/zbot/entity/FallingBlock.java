package zedly.zbot.entity;

import zedly.zbot.Material;
import zedly.zbot.Location;

/**
 * Represents a falling block.
 */
public interface FallingBlock extends Object {

    Location getSpawnPosition();
    
    Material getBlockType();
}
