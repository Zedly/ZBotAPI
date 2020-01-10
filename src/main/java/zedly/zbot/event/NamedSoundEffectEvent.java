/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event;

import zedly.zbot.Location;

/**
 *
 * @author Dennis
 */
public class NamedSoundEffectEvent extends Event {
    
    private final String soundName;
    private final int soundCategory;
    private final int x;
    private final int y;
    private final int z;
    private final double volume;
    private final double pitch;
    
    
    public NamedSoundEffectEvent(String soundName, int soundCategory, int x, int y, int z, double volume, double pitch) {
        this.soundName = soundName;
        this.soundCategory = soundCategory;
        this.x = x;
        this.y = y;
        this.z = z;
        this.volume = volume;
        this.pitch = pitch;
    }

    /**
     * @return the soundName
     */
    public String getSoundName() {
        return soundName;
    }

    /**
     * @return the soundCategory
     */
    public int getSoundCategory() {
        return soundCategory;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the z
     */
    public int getZ() {
        return z;
    }

    /**
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @return the pitch
     */
    public double getPitch() {
        return pitch;
    }
    
    
}
