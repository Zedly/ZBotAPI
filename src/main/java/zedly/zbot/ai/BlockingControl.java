/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.ai;

import zedly.zbot.BlockFace;
import zedly.zbot.Location;
import zedly.zbot.entity.Entity;
import zedly.zbot.inventory.Inventory;

/**
 *
 * @author Dennis
 */
public interface BlockingControl extends Control {

    boolean moveTo(Location target) throws InterruptedException;

    void breakBlock(Location loc, int millis) throws InterruptedException;

    void breakBlock(Location loc) throws InterruptedException;

    void breakBlock(int x, int y, int z) throws InterruptedException;

    void breakBlock(int x, int y, int z, int millis) throws InterruptedException;

    void clickSlot(int slotId) throws InterruptedException;

    void clickSlot(Inventory inv, int slotId) throws InterruptedException;

    void tick() throws InterruptedException;

    void tick(int ticks) throws InterruptedException;

}
