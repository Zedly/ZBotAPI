package zedly.zbot.entity;

import zedly.zbot.inventory.ItemStack;

/**
 * Represents a firework.
 */
public interface Firework extends Object {

    /**
     * @return the ItemStack this firework came from.
     */
    ItemStack getItemStack();

    /**
     * @return the ItemStack this firework came from.
     */
    int getUserEntityId();

    boolean isShotAtAngle();
}
