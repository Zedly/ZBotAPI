package zedly.zbot.block.data;

/**
 * 'half' denotes which half of a two block tall material this block is.
 * <br>
 * In game it may be referred to as either (top, bottom) or (upper, lower).
 */
public interface Bisected extends BlockData {

    /**
     * Gets the value of the 'half' property.
     *
     * @return the 'half' value
     */
    Half getHalf();

    /**
     * The half of a vertically bisected block.
     */
    public enum Half {
        /**
         * The top half of the block, normally with the higher y coordinate.
         */
        UPPER,
        /**
         * The bottom half of the block, normally with the lower y coordinate.
         */
        LOWER;
        
        public static Half safeValueOf(String value) {
            switch(value) {
                case "UPPER":
                case "TOP":
                    return UPPER;
                case "LOWER":
                case "BOTTOM":
                    return LOWER;
                default:
                    throw new IllegalArgumentException("No enum constant for "  + value);
            }
        }
    }
}
