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
public interface Trade {

    ItemStack getInput1();

    ItemStack getInput2();

    ItemStack getOutput();

    int getNumTradeUses();

    int getMaxTradeUses();

    int getXPReward();

    int getSpecialPrice();

    double getPriceMultiplier();

    int getDemand();
}
