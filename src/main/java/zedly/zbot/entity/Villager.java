package zedly.zbot.entity;

import zedly.zbot.VillagerProfession;

/**
 * Represents a villager found in a generated village.
 */
public interface Villager extends Ageable
{
	/**
	 * @return the profession of this villager, for example
	 * librarian, blacksmith, etc.
	 */
	VillagerProfession getProfession();
}
