package zedly.zbot.block.data;

/**
 * 'waterlogged' denotes whether this block has fluid in it.
 */
public interface Waterlogged extends BlockData {

    /**
     * Gets the value of the 'waterlogged' property.
     *
     * @return the 'waterlogged' value
     */
    boolean isWaterlogged();

}
