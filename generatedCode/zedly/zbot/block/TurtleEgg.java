package zedly.zbot.block;

import zedly.zbot.data.int;


public class TurtleEgg extends BlockState {

    private final int eggs;
    private final int hatch;

    public TurtleEgg(int eggs, int hatch) {
        this.eggs = eggs;
        this.hatch = hatch;
    }

    public int getEggs() {
        return eggs;
    }

    public int getHatch() {
        return hatch;
    }

}