package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Lightable;
import zedly.zbot.block.data.Waterlogged;

/**
 * 'signal_fire' denotes whether the fire is extra smokey due to having a hay
 * bale placed beneath it.
 */
public interface Campfire extends Lightable, Waterlogged {

    /**
     * Gets the value of the 'signal_fire' property.
     *
     * @return the 'signal_fire' value
     */
    boolean isSignalFire();
}
