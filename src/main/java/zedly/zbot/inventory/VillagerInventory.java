/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.inventory;


/**
 *
 * @author Dennis
 */
public interface VillagerInventory extends ExternalInventory {
    
    Trade getTrade(int i);
    
    int getNumTrades();
    
    int getVillagerLevel();
    
    int getExperience();
    
    boolean isRegular();
    
    boolean canRestock();
    
    void selectTrade(int i);
    
}
