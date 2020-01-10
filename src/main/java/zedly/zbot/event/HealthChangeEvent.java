package zedly.zbot.event;

public class HealthChangeEvent extends Event {

    private double health;
    private int food;
    private double saturation;

    public HealthChangeEvent(double health, int food, double saturation) {
        this.health = health;
        this.food = food;
        this.saturation = saturation;
    }

    public double getHealth() {
        return health;
    }

    public int getFood() {
        return food;
    }

    public double getSaturation() {
        return saturation;
    }
}
