package edu.ufp.inf.lp2.figgeo;

import java.awt.*;

public class Circle extends FigGeo {

    private double radius;

    public Circle(Color color, double radius, Point center) {
        super(color);
        this.setRadius(radius);
        this.addPoint(center);  //metodo extendido !
    }

    public Point getCenter() {
        return null;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public boolean isInside(FigGeo f) {
        return false;
    }

    @Override
    public boolean isInterceptedBy(FigGeo f) {
        return false;
    }

    @Override
    public boolean containsPoint(Point p) {
        return false;
    }


    /********************************************************************************************/

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public boolean containsPoint(java.awt.Point p) {
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}