package zedly.zbot.entity;

import zedly.zbot.inventory.ItemStack;

/**
 * Represents an item, for example on the ground.
 */
public interface Item extends Object {

    /**
     * @return the item stack of this item.
     */
    ItemStack getItemStack();
}
