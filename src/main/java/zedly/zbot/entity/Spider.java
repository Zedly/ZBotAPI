package zedly.zbot.entity;

/**
 * Represents a spider.
 */
public interface Spider extends Monster
{
	/**
	 * @return whether this spider is climbing a surface.
	 */
	boolean isClimbing();
}
