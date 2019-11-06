/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.environment;

import zedly.zbot.BlockFace;
import zedly.zbot.Material;
import zedly.zbot.Location;
import zedly.zbot.block.Tile;
import zedly.zbot.block.data.BlockData;

/**
 *
 * @author Dennis
 */
public interface Block {

    Material getType();

    BlockData getData();
    
    boolean hasTile();
    
    Tile getTile();

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
