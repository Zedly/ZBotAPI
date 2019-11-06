package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Directional;

/**
 * 'extended' denotes whether the piston head is currently extended or not.
 */
public interface Piston extends Directional {

    /**
     * Gets the value of the 'extended' property.
     *
     * @return the 'extended' value
     */
    boolean isExtended();

}
