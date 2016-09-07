/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event.entity;

import zedly.zbot.entity.Entity;
import zedly.zbot.event.Event;

/**
 *
 * @author Dennis
 */
public class EntityInLoveEvent extends Event {

    private final Entity entity;

    public EntityInLoveEvent(Entity ent) {
        this.entity = ent;
    }

    public Entity getEntity() {
        return entity;
    }

}
