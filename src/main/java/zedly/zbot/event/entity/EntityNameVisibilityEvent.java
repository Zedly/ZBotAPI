/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event.entity;

import zedly.zbot.entity.Entity;
import zedly.zbot.entity.EntityMeta;

/**
 *
 * @author Dennis
 */
public class EntityNameVisibilityEvent extends EntityMetaEvent {
    
    private final boolean isVisible;
    
    public EntityNameVisibilityEvent(Entity ent, EntityMeta meta) {
        super(ent);
        isVisible = meta.asBoolean();
    }
    
    public boolean isVisible() {
        return isVisible;
    }
    
}
