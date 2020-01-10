package zedly.zbot.block.data;

/**
 * 'lit' denotes whether this block (either a redstone torch or furnace) is
 * currently lit - that is not burned out.
 */
public interface Lightable extends BlockData {

    /**
     * Gets the value of the 'lit' property.
     *
     * @return the 'lit' value
     */
    boolean isLit();

}
