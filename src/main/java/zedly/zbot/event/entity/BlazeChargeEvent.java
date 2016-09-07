/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event.entity;

import zedly.zbot.entity.Blaze;
import zedly.zbot.event.Event;
import zedly.zbot.entity.Blaze;

/**
 *
 * @author Dennis
 */
public class BlazeChargeEvent extends Event {

    private final Blaze blaze;

    public BlazeChargeEvent(Blaze blaze) {
        this.blaze = blaze;
    }

    public Blaze getEntity() {
        return blaze;
    }

}
