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

    void placeBlock(Location loc, BlockFace bf) throws InterruptedException;

    void placeBlock(int x, int y, int z, BlockFace bf) throws InterruptedException;

    void interact(Entity ent) throws InterruptedException;

    void attack(Entity ent) throws InterruptedException;

    void sneak(boolean sneak) throws InterruptedException;

    void sprint(boolean sprint) throws InterruptedException;

    void clickSlot(int slotId) throws InterruptedException;

    void clickSlot(Inventory inv, int slotId) throws InterruptedException;

    void tick() throws InterruptedException;

    void tick(int ticks) throws InterruptedException;

    void closeWindow() throws InterruptedException;

    void performAction(int action) throws InterruptedException;

    void respawn() throws InterruptedException;

    void selectSlot(int i) throws InterruptedException;

    void sendChat(String message) throws InterruptedException;

    void setAbilities(int abilities) throws InterruptedException;

    void swingArm(boolean leftHand) throws InterruptedException;

    void useItem(boolean leftHand) throws InterruptedException;

    void writeToSign(Location loc, String line1, String line2, String line3, String line4) throws InterruptedException;
}
