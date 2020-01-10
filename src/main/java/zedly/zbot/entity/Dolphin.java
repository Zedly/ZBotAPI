/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.entity;

import zedly.zbot.Location;

/**
 *
 * @author Dennis
 */
public interface Dolphin extends WaterMob {
    
    Location getTreasurePosition();
    
    boolean canFindTreasure();
    
    boolean hasFish();
    
}
