package zedly.zbot.event;

public class EnterCreditsEvent extends Event {

    private float value;

    public EnterCreditsEvent(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
