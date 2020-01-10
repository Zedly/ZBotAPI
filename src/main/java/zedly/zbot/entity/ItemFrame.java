package zedly.zbot.entity;

import zedly.zbot.inventory.ItemStack;

/**
 * Represents an item frame (a frame for items).
 */
public interface ItemFrame extends Hanging, Object {

    /**
     * @return the item stack inside this item frame.
     */
    ItemStack getItemStack();

    /**
     * @return the rotation of the itemstack inside of this item frame.
     */
    int getRotation();
}
