package zedly.zbot.event;

public class RainChangeEvent extends Event {

    boolean raining;
    double value;

    public RainChangeEvent(boolean raining, double value) {
        this.raining = raining;
        this.value = value;
    }

    public boolean isRaining() {
        return raining;
    }

    public double getValue() {
        return value;
    }
}
