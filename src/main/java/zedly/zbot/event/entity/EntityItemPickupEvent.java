/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event.entity;

import zedly.zbot.entity.Entity;
import zedly.zbot.entity.Item;
import zedly.zbot.event.Event;

/**
 *
 * @author Dennis
 */
public class EntityItemPickupEvent extends Event {

    private final Item item;
    private final Entity collector;

    public EntityItemPickupEvent(Entity collector, Item item) {
        this.collector = collector;
        this.item = item;
    }

    public Entity getCollector() {
        return collector;
    }

    public Item getItem() {
        return item;
    }

}
