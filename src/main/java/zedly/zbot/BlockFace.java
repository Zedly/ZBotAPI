/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot;

/**
 *
 * @author Dennis
 */
public enum BlockFace {
    DOWN(0), UP(1), NORTH(2), SOUTH(3), WEST(4), EAST(5);

    private int faceId;

    private BlockFace(int faceId) {
        this.faceId = faceId;
    }

    public int numeric() {
        return faceId;
    }
    
}
