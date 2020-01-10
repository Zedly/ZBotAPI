package zedly.zbot.block;

import zedly.zbot.data.Direction;


public class Orientable extends BlockState {

    private final Direction facing;

    public Orientable(Direction facing) {
        this.facing = facing;
    }

    public Direction getFacing() {
        return facing;
    }

}