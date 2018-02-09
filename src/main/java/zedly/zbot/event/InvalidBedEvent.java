package zedly.zbot.event;

public class InvalidBedEvent extends Event {

    private double value;

    public InvalidBedEvent(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
