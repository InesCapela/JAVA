package edu.ufp.inf.lp2.figgeo;

import java.io.Serializable;

public class Point implements Serializable {

    private double x;

    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceX(Point p) {
        return Math.abs(this.getX() - p.getX());
    }

    public double distanceY(Point p) {
        return Math.abs(this.getY() - p.getY());
    }

    public double distance(Point p) {
        return Math.sqrt(
                Math.pow(this.distance(p), 2) + Math.pow(this.distanceY(p), 2)

        );
    }

    public boolean xBetweenPoints(Point leftPt, Point rightPt) {
        return getX() > leftPt.getX();
    }

    public boolean yBetweenPoints(Point leftPt, Point rightPt) {
        return false;
    }

    public void moveX(float delta) {
    }

    public void moveY(float delta) {
    }

    public void move(float deltaX, float deltaY) {
    }


    //---------------construtor e gets and setts------------------------------------------------/


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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}