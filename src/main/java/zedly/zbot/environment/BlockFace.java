/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.environment;

/**
 *
 * @author Dennis
 */
public enum BlockFace {

    UP(0, 1, 0), DOWN(0, -1, 0), NORTH(0, 0, -1), EAST(1, 0, 0), SOUTH(0, 0, 1), WEST(-1, 0, 0);

    private final int dx, dy, dz;

    private BlockFace(int dx, int dy, int dz) {
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
    }

    public int getX() {
        return dx;
    }

    public int getY() {
        return dy;
    }

    public int getZ() {
        return dz;
    }
}
