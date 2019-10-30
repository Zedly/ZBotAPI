package zedly.zbot.block;

import zedly.zbot.data.boolean;
import zedly.zbot.data.BedComponent;
import zedly.zbot.data.Direction;


public class Bed extends BlockState {

    private final Direction facing;
    private final boolean occupied;
    private final BedComponent part;

    public Bed(Direction facing, boolean occupied, BedComponent part) {
        this.facing = facing;
        this.occupied = occupied;
        this.part = part;
    }

    public Direction getFacing() {
        return facing;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public BedComponent getPart() {
        return part;
    }

}