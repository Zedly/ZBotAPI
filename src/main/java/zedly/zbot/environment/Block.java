/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.environment;

import zedly.zbot.Material;
import zedly.zbot.Location;

/**
 *
 * @author Dennis
 */
public interface Block {

    Material getType();

    BlockData getData();

    int getBlockLight();

    int getSkyLight();
    
    int getX();
    
    int getY();
    
    int getZ();

    boolean isSolid();

    boolean isLiquid();
    
    Location getLocation();

    Block getRelative(int dx, int dy, int dz);

    Block getRelative(BlockFace bf);

    boolean isLoaded();
}
