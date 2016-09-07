package zedly.zbot.entity;

import zedly.zbot.inventory.ItemStack;

/**
 * Represents a potion.
 */
public interface Potion extends Entity
{
	/**
	 * @return the item stack this potion came from.
	 */
	ItemStack getItemStack();
}
