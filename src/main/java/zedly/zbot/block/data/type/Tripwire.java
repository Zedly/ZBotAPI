package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Attachable;
import zedly.zbot.block.data.MultipleFacing;
import zedly.zbot.block.data.Powerable;

/**
 * 'disarmed' denotes that the tripwire was broken with shears and will not
 * subsequently produce a current when destroyed.
 */
public interface Tripwire extends Attachable, MultipleFacing, Powerable {

    /**
     * Gets the value of the 'disarmed' property.
     *
     * @return the 'disarmed' value
     */
    boolean isDisarmed();

}
