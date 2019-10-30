package zedly.zbot.entity;

/**
 * Represents primed tnt (tnt which is going to blow up).
 */
public interface PrimedTNT extends Object
{
	/**
	 * @return the time until this primed tnt explodes.
	 */
	int getFuseTime();
}
