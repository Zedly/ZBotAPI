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
public class CreeperChargeEvent extends Event {

    private final Creeper creeper;

    public CreeperChargeEvent(Creeper creeper) {
        this.creeper = creeper;
    }

    public Creeper getEntity() {
        return creeper;
    }
}
