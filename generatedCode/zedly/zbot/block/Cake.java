package zedly.zbot.block;

import zedly.zbot.data.int;


public class Cake extends BlockState {

    private final int bites;

    public Cake(int bites) {
        this.bites = bites;
    }

    public int getBites() {
        return bites;
    }

}