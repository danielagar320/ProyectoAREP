package com.example.demo.model;

public class Data {


    private int id;

    private String severity;
    private double x;
    private double y;
    private double radius;

    public Data(int id, String severity, double x, double y, double radius){
        this.id = id;
        this.radius = radius;
        this.severity = severity;
        this.x = x;
        this.y = y;
    }



    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", severity='" + severity + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
