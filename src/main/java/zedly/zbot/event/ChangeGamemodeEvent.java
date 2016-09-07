package zedly.zbot.event;

public class ChangeGamemodeEvent extends Event {

    private float value;

    public ChangeGamemodeEvent(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
