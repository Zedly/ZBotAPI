package zedly.zbot.entity;

import zedly.zbot.inventory.ItemStack;

/**
 * Represents a firework.
 */
public interface Firework extends Entity
{
	/**
	 * @return the ItemStack this firework came from.
	 */
	ItemStack getItemStack();
}
