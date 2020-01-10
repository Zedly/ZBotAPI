package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Bisected;
import zedly.zbot.block.data.Directional;

/**
 * Similar to {@link Bisected}, 'part' denotes which half of the bed this block
 * corresponds to.
 * <br>
 * 'occupied' property is a quick flag to check if a player is currently
 * sleeping in this bed block.
 */
public interface Bed extends Directional {

    /**
     * Gets the value of the 'part' property.
     *
     * @return the 'part' value
     */
    Part getPart();

    /**
     * Horizontal half of a bed.
     */
    public enum Part {

        /**
         * The head is the upper part of the bed containing the pillow.
         */
        HEAD,
        /**
         * The foot is the lower half of the bed.
         */
        FOOT;
    }
}
