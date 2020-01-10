package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Ageable;

/**
 * 'leaves' represents the size of the leaves on this bamboo block.
 */
public interface Bamboo extends Ageable, Sapling {

    /**
     * Gets the value of the 'leaves' property.
     *
     * @return the 'leaves' value
     */
    Leaves getLeaves();

    /**
     * Bamboo leaf size.
     */
    public enum Leaves {

        /**
         * No leaves.
         */
        NONE,
        /**
         * Small leaves.
         */
        SMALL,
        /**
         * Large leaves.
         */
        LARGE;
    }
}
