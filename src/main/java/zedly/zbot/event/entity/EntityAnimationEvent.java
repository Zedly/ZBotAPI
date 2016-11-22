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
public class EntityAnimationEvent extends Event {

    private final Entity entity;
    private final int animationId;

    public EntityAnimationEvent(Entity entity, int animationId) {
        this.entity = entity;
        this.animationId = animationId;
    }

    public Entity getEntity() {
        return entity;
    }

    public int getAnimationId() {
        return animationId;
    }

}
