/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.inventory;

import java.util.function.Predicate;

/**
 *
 * @author Dennis
 */
public interface ExternalInventory {
    
    int takeItems(Predicate<ItemStack> filter, int maxAmount);
    
    int storeItems(Predicate<ItemStack> filter, int maxAmount);
    
}
