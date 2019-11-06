package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * 'hatch' is the number of turtles which may hatch from these eggs.
 * <br>
 * 'eggs' is the number of eggs which appear in this block.
 */
public interface TurtleEgg extends BlockData {

    /**
     * Gets the value of the 'eggs' property.
     *
     * @return the 'eggs' value
     */
    int getEggs();

    /**
     * Gets the value of the 'hatch' property.
     *
     * @return the 'hatch' value
     */
    int getHatch();
}
