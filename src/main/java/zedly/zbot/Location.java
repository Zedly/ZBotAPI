package zedly.zbot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import zedly.zbot.util.CartesianVector;
import zedly.zbot.util.Vector;

/**
 * @author Dennis
 */
public class Location {

    private double x, y, z, yaw, pitch;

    public Location() {
    }

    public Location(double x, double y, double z, double yaw, double pitch) {
        this(x, y, z);
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public Location(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Location(long l) {
        x = l >> 38;
        y = l & 0xFFF;
        z = (l << 26) >> 38;
    }

    public double getPitchTo(Location l2) {
        double distance = distanceTo(l2);
        if (distance == 0) {
            return 0;
        } else {
            return Math.atan((l2.getY() - getY()) / distance);
        }
    }

    public double distanceTo(Location l2) {
        return Math.sqrt(distanceSquareTo(l2));
    }

    public double distanceSquareTo(Location l2) {
        return (l2.getX() - x) * (l2.getX() - x)
                + (l2.getY() - y) * (l2.getY() - y)
                + (l2.getZ() - z) * (l2.getZ() - z);
    }

    public Location getRelative(double x, double y, double z) {
        return getRelative(x, y, z, 0, 0);
    }

    public Location getRelative(double x, double y, double z, double yaw, double pitch) {
        return new Location(this.x + x, this.y + y, this.z + z, this.yaw + yaw, this.pitch + pitch);
    }

    public Location getRelative(Vector v) {
        Vector w = v.toCartesian();
        return new Location(this.x + w.getX(), this.y + w.getY(), this.z + w.getZ(), this.yaw, this.pitch);
    }

    public CartesianVector vectorTo(Location l2) {
        return new CartesianVector(l2.getX() - x, l2.getY() - y, l2.getZ() - z);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public int getBlockX() {
        return (int) Math.floor(x);
    }

    public int getBlockY() {
        return (int) Math.floor(y);
    }

    public int getBlockZ() {
        return (int) Math.floor(z);
    }

    public double getYaw() {
        return yaw;
    }

    public double getPitch() {
        return pitch;
    }

    public long toLong() {

        return ((long) getBlockX() & 0x3FFFFFF) << 38 | (((long) getBlockZ() & 0x3FFFFFF) << 12) | ((long) getBlockY() & 0xFFF);

    }

    public Location center() {
        return new Location(getBlockX() + 0.5, getBlockY() + 0.5, getBlockZ() + 0.5, getYaw(), getPitch());
    }

    public Location centerHorizontally() {
        return new Location(getBlockX() + 0.5, getBlockY(), getBlockZ() + 0.5, getYaw(), getPitch());
    }

    public Location withYawPitch(double yaw, double pitch) {
        return new Location(getX(), getY(), getZ(), yaw, pitch);
    }

    public Location withYawPitch(Vector v) {
        return withYawPitch(180 / Math.PI * v.getYaw(), 180 / Math.PI * v.getPitch());
    }

    public Location withYawPitchFrom(Location previous) {
        return withYawPitch(previous.vectorTo(this));
    }

    public Location withYawPitchTo(Location next) {
        return withYawPitch(vectorTo(next));
    }

    @Override
    public Location clone() {
        return new Location(this.x, this.y, this.z, this.yaw, this.pitch);
    }

    public String toString() {
        return "{" + x + ", " + y + ", " + z + " : " + yaw + "," + pitch + "}";
    }

    @Override
    public int hashCode() {
        return ((int) z & 0xFF) | (((int) y & 0xFF) << 8) | (((int) x & 0xff) << 16);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Location)) {
            return false;
        }
        Location other = (Location) o;

        return x == other.x
                && y == other.y
                && z == other.z
                && yaw == other.yaw
                && pitch == other.pitch;
    }

    public boolean equalsBlock(Location other) {
        return (int) x == (int) other.x
                && (int) y == (int) other.y
                && (int) z == (int) other.z
                && (int) yaw == (int) other.yaw
                && (int) pitch == (int) other.pitch;
    }

}
