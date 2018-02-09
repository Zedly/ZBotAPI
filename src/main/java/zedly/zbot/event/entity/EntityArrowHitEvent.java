package zedly.zbot.event.entity;

import zedly.zbot.event.Event;

public class EntityArrowHitEvent extends Event {

    private double value;

    public EntityArrowHitEvent(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
