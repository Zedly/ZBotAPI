package zedly.zbot.entity;

import zedly.zbot.inventory.ItemStack;

/**
 * Represents a potion.
 */
public interface ThrownPotion extends Throwable
{
	/**
	 * @return the item stack this potion came from.
	 */
	ItemStack getItemStack();
}
