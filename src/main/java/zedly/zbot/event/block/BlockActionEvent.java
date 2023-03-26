package zedly.zbot.event.block;

import zedly.zbot.Location;
import zedly.zbot.event.Event;

public class BlockActionEvent extends Event {

    private Location loc;
    private int blockType;
    private int actionId;
    private int actionParameter;

    public BlockActionEvent(Location loc, int blockType, int actionId, int actionParameter) {
        this.loc = loc;
        this.blockType = blockType;
    }

    public Location getLocation() {
        return loc;
    }

    public int getBlockType() {
        return blockType;
    }

    /**
     * @return the actionId
     */
    public int getActionId() {
        return actionId;
    }

    /**
     * @return the actionParameter
     */
    public int getActionParameter() {
        return actionParameter;
    }
}
