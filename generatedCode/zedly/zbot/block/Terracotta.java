package zedly.zbot.block;

import zedly.zbot.data.Direction;


public class Terracotta extends BlockState {

    private final Direction facing;

    public Terracotta(Direction facing) {
        this.facing = facing;
    }

    public Direction getFacing() {
        return facing;
    }

}