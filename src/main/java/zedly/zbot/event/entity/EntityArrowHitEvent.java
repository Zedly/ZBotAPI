package zedly.zbot.event.entity;

import zedly.zbot.event.Event;

public class EntityArrowHitEvent extends Event {

    private float value;

    public EntityArrowHitEvent(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }
}
