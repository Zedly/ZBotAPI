package zedly.zbot.entity;

/**
 * Represents any unknown entity.
 */
public interface Unknown extends Entity
{

	/**
	 * @return the entity type ID of this unknown entity,
	 */
	int getEntityTypeId();
}
