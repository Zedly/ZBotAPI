/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.inventory;

/**
 *
 * @author Dennis
 */
public interface FurnaceInventory extends ExternalInventory {

    public static final int FUEL_SLOT = 1;
    public static final int SMELT_SLOT = 0;
    public static final int OUTPUT_SLOT = 2;
    
    public int getMaxBurnTime();

    public int getRemainingBurnTime();

    public int getMaxProgress();

    public int getProgress();

}
