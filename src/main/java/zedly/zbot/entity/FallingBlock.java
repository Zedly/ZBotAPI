package zedly.zbot.entity;

import org.bukkit.Material;
import zedly.zbot.Location;

/**
 * Represents a falling block.
 */
public interface FallingBlock extends Object {

    Location getSpawnPosition();
    
    Material getBlockType();
}
