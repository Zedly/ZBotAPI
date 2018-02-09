package zedly.zbot.event;

public class ChangeGamemodeEvent extends Event {

    private double value;

    public ChangeGamemodeEvent(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
