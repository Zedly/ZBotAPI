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
public class EntityPotionEffectEvent extends Event {
    
    private final Entity entity;
    private final int potionColor;
    
    public EntityPotionEffectEvent(Entity entity, int potionColor) {
        this.entity = entity;
        this.potionColor = potionColor;
    }

    public Entity getEntity() {
        return entity;
    }

    public int getPotionColor() {
        return potionColor;
    }
    
}
