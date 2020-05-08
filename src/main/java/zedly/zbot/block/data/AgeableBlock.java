package zedly.zbot.block.data;

/**
 * 'age' represents the different growth stages that a crop-like block can go
 * through.
 * <br>
 * A value of 0 indicates that the crop was freshly planted, whilst a value
 * equal to {@link #getMaximumAge()} indicates that the crop is ripe and ready
 * to be harvested.
 */
public interface AgeableBlock extends BlockData {

    /**
     * Gets the value of the 'age' property.
     *
     * @return the 'age' value
     */
    int getAge();

}
