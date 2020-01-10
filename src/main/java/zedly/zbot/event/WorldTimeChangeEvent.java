/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event;

/**
 *
 * @author Dennis
 */
public class WorldTimeChangeEvent extends Event {
    
    private final long timeOfDay, worldAge;
    
    public WorldTimeChangeEvent(long timeOfDay, long worldAge) {
        this.timeOfDay = timeOfDay;
        this.worldAge = worldAge;
    }
    
    public long getTimeOfDay() {
        return timeOfDay;
    }
    
    public long getWorldAge() {
        return worldAge;
    }
    
}
