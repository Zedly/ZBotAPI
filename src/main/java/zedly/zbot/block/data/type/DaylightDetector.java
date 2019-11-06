package zedly.zbot.block.data.type;

import zedly.zbot.block.data.AnaloguePowerable;

/**
 * 'inverted' denotes whether this daylight detector is in the inverted mode,
 * i.e. activates in the absence of light rather than presence."
 */
public interface DaylightDetector extends AnaloguePowerable {

    /**
     * Gets the value of the 'inverted' property.
     *
     * @return the 'inverted' value
     */
    boolean isInverted();

}
