/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event.entity;

import zedly.zbot.entity.Creeper;
import zedly.zbot.event.Event;

/**
 *
 * @author Dennis
 */
public class CreeperFuseEvent extends Event {

    private final Creeper creeper;
    private final boolean lit;

    public CreeperFuseEvent(Creeper creeper, boolean lit) {
        this.creeper = creeper;
        this.lit = lit;
    }

    public Creeper getEntity() {
        return creeper;
    }
    
    public boolean isFuseLit() {
        return lit;
    }

}
