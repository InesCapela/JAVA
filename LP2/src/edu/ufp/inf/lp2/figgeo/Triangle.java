package edu.ufp.inf.lp2.figgeo;

import java.awt.*;
import java.awt.Point;

public class Triangle extends FigGeo {

    public Triangle(Color color, java.awt.Point lup, java.awt.Point ldp, java.awt.Point rdp) {
        super(color);
        super.addPoint(lup);
        this.addPoint(ldp);
        addPoint(rdp);
    }

    @Override
    public double area() {
        java.awt.Point lup=this.getPoint(0);
        java.awt.Point rdp=this.getPoint(1);
        java.awt.Point ldp=this.getPoint(1);
        double altura=Math.abs(lup.distanceY(rdp));
        double base=ldp.distanceX(rdp);

        return Math.abs((base*altura)/2) ;

    }

    @Override
    public double perimeter() {
        java.awt.Point lup=this.getPoint(0);
        java.awt.Point rdp=this.getPoint(1);
        java.awt.Point ldp=this.getPoint(1);

        double c1=lup.distanceY(rdp);
        double c2=lup.distanceY(ldp);
        double c3=rdp.distanceX(ldp);
        return c1+c2+c3;
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
}