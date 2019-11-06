package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * 'bites' represents the amount of bites which have been taken from this slice
 * of cake.
 * <br>
 * A value of 0 indicates that the cake has not been eaten, whilst a value of
 * {@link #getMaximumBites()} indicates that it is all gone :(
 */
public interface Cake extends BlockData {

    /**
     * Gets the value of the 'bites' property.
     *
     * @return the 'bites' value
     */
    int getBites();
}
