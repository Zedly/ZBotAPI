/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event.entity;

import zedly.zbot.entity.Enderman;
import zedly.zbot.event.Event;

/**
 *
 * @author Dennis
 */
public class EndermanScreamEvent extends Event {
    private final Enderman enderman;

    public EndermanScreamEvent(Enderman enderman) {
        this.enderman = enderman;
    }

    public Enderman getEntity() {
        return enderman;
    }
}
