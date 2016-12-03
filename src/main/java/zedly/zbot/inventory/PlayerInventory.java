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
public interface PlayerInventory {

    public static int CRAFT_OUTPUT_SLOT = 0;
    public static int HELMET_SLOT = 5;
    public static int CHESTPLATE_SLOT = 6;
    public static int PANTS_SLOT = 7;
    public static int BOOTS_SLOT = 8;

    public static int craftingSlot(int slot) {
        if (slot < 0 || slot > 3) {
            return -999;
        }
        return 1 + slot;
    }
}
