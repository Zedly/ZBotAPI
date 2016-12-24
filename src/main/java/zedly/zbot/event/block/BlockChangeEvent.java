package zedly.zbot.event.block;

import org.bukkit.Material;
import zedly.zbot.Location;
import zedly.zbot.event.Event;

public class BlockChangeEvent extends Event {

    private final Location location;
    private final int typeId;
    private final int blockData;

    public BlockChangeEvent(Location location, int blockId) {
        this.location = location;
        this.typeId = blockId >> 4;
        this.blockData = blockId & 0xF;
    }

    public Location getLocation() {
        return location;
    }
    
    public Material getType() {
        return Material.getMaterial(typeId);
    }

    public int getTypeId() {
        return typeId;
    }
    
    public int getBlockData() {
        return blockData;
    }
}
