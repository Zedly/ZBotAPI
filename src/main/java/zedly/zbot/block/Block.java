package zedly.zbot.block;

import zedly.zbot.Location;

public interface Block {

    Location getLocation();

    //Material getType();

    int getTypeId();

    int getData();
    
    int getBlockLight();
    
    int getSkyLight();
}
