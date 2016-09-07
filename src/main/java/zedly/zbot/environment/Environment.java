package zedly.zbot.environment;

import java.util.Collection;
import zedly.zbot.entity.Entity;

import java.util.UUID;
import zedly.zbot.Location;
import zedly.zbot.block.Block;

public interface Environment {

    Collection<Entity> getEntities();
    
    Entity getEntityById(int entityId);

    String getPlayerNameByUUID(UUID uuid);

    Block getBlockAt(int x, int y, int z);

    Block getBlockAt(Location loc);
    
    int getDifficulty();
    
}
