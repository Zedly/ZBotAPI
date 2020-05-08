/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.block.data.type;

import zedly.zbot.block.data.Directional;

/**
 * Properties of Bee Hives and Bee Nests.
 * @author Dennis
 */
public interface BeeHome extends Directional {
    
    /**
     * Returns the Honey level of this block
     * @return 
     */
    int getHoneyLevel();
    
}
