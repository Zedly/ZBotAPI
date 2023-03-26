/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zedly.zbot.event.block;

import zedly.zbot.event.Event;

/**
 *
 * @author Dennis
 */
public class ActionAcknowledgedEvent extends Event {
    
    private final int sequenceID;
    
    public ActionAcknowledgedEvent(int sequenceID) {
        this.sequenceID = sequenceID;
    }

    /**
     * @return the sequenceID
     */
    public int getSequenceID() {
        return sequenceID;
    }
    
}
