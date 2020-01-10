package zedly.zbot.block.data.type;

import zedly.zbot.block.data.BlockData;

/**
 * 'mode' represents the different modes in which this structure block may
 * operate.
 */
public interface StructureBlock extends BlockData {

    /**
     * Gets the value of the 'mode' property.
     *
     * @return the 'mode' value
     */
    Mode getMode();

    /**
     * Operating mode of a structure block.
     */
    public enum Mode {
        /**
         * Allows selection and saving of a structure.
         */
        SAVE,
        /**
         * Allows loading of a structure.
         */
        LOAD,
        /**
         * Used for detection of two opposite corners of a structure.
         */
        CORNER,
        /**
         * Dummy block used to run a custom function during world generation
         * before being removed.
         */
        DATA;
    }
}
