/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.util;

/**
 * @author Dennis
 */
public class CylindricalVector extends Vector {

    private double yaw, y, radius;

    public CylindricalVector(double yaw, double hr, double y) {
        this.yaw = yaw;
        this.radius = hr;
        this.y = y;
    }

    @Override
    public double getX() {
        return toCartesian().getX();
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getZ() {
        return toCartesian().getZ();
    }

    @Override
    public double getYaw() {
        return yaw;
    }

    @Override
    public double getPitch() {
        return toSpherical().getPitch();
    }

    @Deprecated
    @Override
    public double getRadius() {
        return Math.sqrt(radius * radius + y * y);
    }

    @Override
    public double getLength() {
        return Math.sqrt(radius * radius + y * y);
    }

    @Override
    public double getHorizontalLength() {
        return radius;
    }

    @Override
    public Vector add(Vector v2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector multiply(double d) {
        return new CylindricalVector(yaw, radius * d, y * d);
    }

    @Override
    public Vector normalize() {
        return normalize(1);
    }

    @Override
    public Vector normalize(double d) {
        return multiply(d / getRadius());
    }

    @Override
    public Vector subtract(Vector v2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector cross(Vector v2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CartesianVector toCartesian() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CylindricalVector toCylindrical() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SphericalVector toSpherical() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "{CylindricalVector yaw:" + yaw + " y: " + y + " radius: " + radius + "}";
    }

}
