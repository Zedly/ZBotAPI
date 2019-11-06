package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Directional;
import zedly.zbot.block.data.Powerable;

/**
 * 'delay' is the propagation delay of a repeater, i.e. how many ticks before it
 * will be activated from a current change and propagate it to the next block.
 * <br>
 * Delay may not be lower than {@link #getMinimumDelay()} or higher than
 * {@link #getMaximumDelay()}.
 * <br>
 * 'locked' denotes whether the repeater is in the locked state or not.
 * <br>
 * A locked repeater will not change its output until it is unlocked. In game, a
 * locked repeater is created by having a constant current perpendicularly
 * entering the block.
 */
public interface Repeater extends Directional, Powerable {

    /**
     * Gets the value of the 'delay' property.
     *
     * @return the 'delay' value
     */
    int getDelay();

    /**
     * Gets the value of the 'locked' property.
     *
     * @return the 'locked' value
     */
    boolean isLocked();
}
