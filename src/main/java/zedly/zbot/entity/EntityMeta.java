/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.entity;

import java.util.UUID;
import net.minecraft.server.NBTBase;
import zedly.zbot.Direction;
import zedly.zbot.Location;
import zedly.zbot.inventory.ItemStack;

/**
 *
 * @author Dennis
 */
public interface EntityMeta {
    
    int asInt();
    
    float asFloat();
    
    String asString();
    
    ItemStack asSlot();
    
    boolean asBoolean();
    
    float[] asVector();
    
    Direction asDirection();
    
    UUID asUUID();
    
    Location asLocation();
    
    NBTBase asNBT();
    
}
