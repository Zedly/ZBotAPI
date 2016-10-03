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
public class SoundEffectEvent extends Event {

    private final int soundId;
    private final int category;
    private final int x;
    private final int y;
    private final int z;
    private final float volume;
    private final float pitch;

    public SoundEffectEvent(int soundId, int category, int x, int y, int z, float volume, float pitch) {
        this.soundId = soundId;
        this.category = category;
        this.x = x;
        this.y = y;
        this.z = z;
        this.volume = volume;
        this.pitch = pitch;
    }

    /**
     * @return the soundId
     */
    public int getSoundId() {
        return soundId;
    }

    /**
     * @return the category
     */
    public int getCategory() {
        return category;
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
    public float getVolume() {
        return volume;
    }

    /**
     * @return the pitch
     */
    public float getPitch() {
        return pitch;
    }

}
