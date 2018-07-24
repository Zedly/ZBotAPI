/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event;

import zedly.zbot.inventory.Inventory;

/**
 *
 * @author Dennis
 */
public class WindowCloseEvent extends Event {
    
    private final Inventory inv;
    
    public WindowCloseEvent(Inventory inv) {
        this.inv = inv;
    }
    
    public Inventory getInventory() {
        return inv;
    }
    
}
