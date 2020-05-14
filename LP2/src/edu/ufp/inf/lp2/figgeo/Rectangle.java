package edu.ufp.inf.lp2.figgeo;

import java.awt.*;
import java.awt.Point;

public class Rectangle extends FigGeo  {   /*fig geo tem de implemntar todas os metodos da interface de figgeo (apesar desta nao so implemntar todos)*/

    public Rectangle(Color color, java.awt.Point lup, java.awt.Point rdp) {
        super(color);
        this.addPoint(lup);
        this.addPoint(rdp);
    }

    public Rectangle(Color blue, edu.ufp.inf.lp2.figgeo.Point point, edu.ufp.inf.lp2.figgeo.Point point1) {
    }

    @Override
    public double area() {
        java.awt.Point lup=this.getPoint(0);
        java.awt.Point rdp=this.getPoint(1);
        double dx=lup.distanceX(rdp);
        double dy=lup.distanceY(rdp);
        return dx * dy ;
    }

    @Override
    public double perimeter() {
        java.awt.Point lup=this.getPoint(0);
        java.awt.Point rdp=this.getPoint(1);
        double dx=lup.distanceX(rdp);
        double dy=lup.distanceY(rdp);

        return 2*dx+ 2*dy;
    }

    @Override
    public boolean isInside(FigGeo f) {
        java.awt.Point lup=this.getPoint(0);
        java.awt.Point rdp=this.getPoint(1);
        if(f instanceof Rectangle) {
            Rectangle rect = (Rectangle) f;
            return rect.containsPoint(lup)&&rect.containsPoint(rdp);
        }
        //fazer verificacoes para ciclre e triangle
        return false;

    }

    @Override
    public boolean isInterceptedBy(FigGeo f) {
        java.awt.Point lup=this.getPoint(0);
        java.awt.Point rdp=this.getPoint(1);
        java.awt.Point ldp= new java.awt.Point(lup.getX(),rdp.getY());
        java.awt.Point rup = new java.awt.Point(rdp.getX(),lup.getY());
        if(f instanceof Rectangle) {
            Rectangle rect = (Rectangle) f;
            return !isInside(f) && rect.containsPoint(lup)||
                                   rect.containsPoint(rdp)||
                    rect.containsPoint(rup)||
                    rect.containsPoint(ldp);
        }
        return false;
    }

    @Override
    public boolean containsPoint(java.awt.Point p) { //ispoint inside
        java.awt.Point lup=this.getPoint(0);
        Point rdp=this.getPoint(1);
        return p.xBetweenPoints(lup,rdp) && p.yBetweenPoints(lup,rdp);
    }


    @Override
    public String toString() {
        return "Rectangle{"+super.toString()+"}";
    }
}