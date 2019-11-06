package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Directional;
import zedly.zbot.block.data.Powerable;

/**
 * Similar to {@link Powerable}, 'triggered' indicates whether or not the
 * dispenser is currently activated.
 */
public interface Dispenser extends Directional {

    /**
     * Gets the value of the 'triggered' property.
     *
     * @return the 'triggered' value
     */
    boolean isTriggered();

}
