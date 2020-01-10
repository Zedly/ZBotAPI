package zedly.zbot.event;

public class SkyFadeEvent extends Event {

    public double value;

    public SkyFadeEvent(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
