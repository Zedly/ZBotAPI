package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Directional;
import zedly.zbot.block.data.Openable;
import zedly.zbot.block.data.Powerable;

/**
 * 'in_wall" indicates if the fence gate is attached to a wall, and if true the
 * texture is lowered by a small amount to blend in better.
 */
public interface Gate extends Directional, Openable, Powerable {

    /**
     * Gets the value of the 'in_wall' property.
     *
     * @return the 'in_wall' value
     */
    boolean isInWall();

}
