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
public interface Control {

    boolean moveTo(Location target) throws InterruptedException;

    void breakBlock(Location loc, int millis) throws InterruptedException;

    void breakBlock(Location loc) throws InterruptedException;

    void breakBlock(int x, int y, int z) throws InterruptedException;

    void breakBlock(int x, int y, int z, int millis) throws InterruptedException;

    void clickBlock(Location loc) throws InterruptedException;

    void clickBlock(int x, int y, int z) throws InterruptedException;

    void placeBlock(Location loc, BlockFace bf);

    void placeBlock(int x, int y, int z, BlockFace bf);

    void interact(Entity ent);

    void attack(Entity ent);

    void sneak(boolean sneak);

    void sprint(boolean sprint);

    void clickSlot(int slotId);

    void clickSlot(Inventory inv, int slotId);

    void tick() throws InterruptedException;

    void tick(int ticks) throws InterruptedException;

    void closeWindow();

    void performAction(int action);

    void respawn();

    void selectSlot(int i);

    void sendChat(String message);

    void setAbilities(int abilities);

    void swingArm(boolean leftHand);

    void useItem(boolean leftHand);

    void writeToSign(Location loc, String line1, String line2, String line3, String line4);
}
