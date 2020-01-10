package zedly.zbot.event.block;

import zedly.zbot.Material;
import zedly.zbot.Location;
import zedly.zbot.block.data.BlockData;
import zedly.zbot.event.Event;

public class BlockChangeEvent extends Event {

    private final Location location;
    private final BlockData newBlockData;

    public BlockChangeEvent(Location location, BlockData newBlockData) {
        this.location = location;
        this.newBlockData = newBlockData;
    }

    public Location getLocation() {
        return location;
    }
    
    public Material getType() {
        return newBlockData.getMaterial();
    }
    
    public BlockData getBlockData() {
        return newBlockData;
    }
}
