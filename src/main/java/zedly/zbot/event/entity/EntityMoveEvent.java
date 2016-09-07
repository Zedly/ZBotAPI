package zedly.zbot.event.entity;

import zedly.zbot.Location;
import zedly.zbot.entity.Entity;
import zedly.zbot.event.Event;
import zedly.zbot.util.Vector;

public class EntityMoveEvent extends Event {

    private final Entity entity;
    private final Location oldLocation;
    private final Location newLocation;

    public EntityMoveEvent(Entity ent, Location oldLocation, Location newLocation) {
        this.entity = ent;
        this.oldLocation = oldLocation;
        this.newLocation = newLocation;
    }

    public Entity getEntity() {
        return entity;
    }

    public Location getNewLocation() {
        return newLocation;
    }
    
    public Location getOldLocation() {
        return oldLocation;
    }
    
    public double getDistance() {
        return oldLocation.distanceTo(newLocation);
    }
    
    public Vector getVector() {
        return oldLocation.vectorTo(newLocation);
    }
    
    public boolean isTeleport() {
        return false;
    }
}
