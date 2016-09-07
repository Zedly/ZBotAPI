/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event.entity;

import zedly.zbot.entity.Entity;
import zedly.zbot.event.Event;
import zedly.zbot.inventory.ItemStack;

/**
 *
 * @author Dennis
 */
public class ItemFrameContentEvent extends Event {
    
    private final Entity entity;
    private final ItemStack oldItem;
    private final ItemStack newItem;
    
    public ItemFrameContentEvent(Entity entity, ItemStack oldItem, ItemStack newItem) {
        this.entity = entity;
        this.oldItem = oldItem;
        this.newItem = newItem;
    }

    public Entity getEntity() {
        return entity;
    }

    public ItemStack getOldItem() {
        return oldItem;
    }

    public ItemStack getNewItem() {
        return newItem;
    }
    
    
}
