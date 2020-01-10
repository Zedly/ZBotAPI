package zedly.zbot.event;

public class DemoMessageEvent extends Event {

    private double value;

    public DemoMessageEvent(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
