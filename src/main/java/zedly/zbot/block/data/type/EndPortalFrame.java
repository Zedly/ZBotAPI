package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Directional;

/**
 * 'eye' denotes whether this end portal frame has been activated by having an
 * eye of ender placed in it.
 */
public interface EndPortalFrame extends Directional {

    /**
     * Gets the value of the 'eye' property.
     *
     * @return the 'eye' value
     */
    boolean hasEye();

}
