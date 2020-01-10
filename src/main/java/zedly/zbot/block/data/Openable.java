package zedly.zbot.block.data;

/**
 * 'open' denotes whether this door-like block is currently opened.
 */
public interface Openable extends BlockData {

    /**
     * Gets the value of the 'open' property.
     *
     * @return the 'open' value
     */
    boolean isOpen();
}
