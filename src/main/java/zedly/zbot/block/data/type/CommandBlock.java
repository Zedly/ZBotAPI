package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Directional;

/**
 * 'conditional' denotes whether this command block is conditional or not, i.e.
 * will only execute if the preceeding command block also executed successfully.
 */
public interface CommandBlock extends Directional {

    /**
     * Gets the value of the 'conditional' property.
     *
     * @return the 'conditional' value
     */
    boolean isConditional();
    
}
