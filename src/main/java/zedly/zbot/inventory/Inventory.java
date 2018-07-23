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
public interface Inventory {
    
    @Deprecated
    int getSelectedSlot();

    @Deprecated
    ItemStack getItemInHand();
    
    @Deprecated
    ItemStack getItemOnCursor();
    
    ItemStack getSlot(int i);
    
    int size();
    
    boolean isOpen();
    
    void click(int slot, int mode, int button);
    
}
