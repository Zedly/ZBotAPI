package zedly.zbot.event;

public class EnterCreditsEvent extends Event {

    private double value;

    public EnterCreditsEvent(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
