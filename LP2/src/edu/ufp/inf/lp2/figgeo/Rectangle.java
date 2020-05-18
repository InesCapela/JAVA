package edu.ufp.inf.lp2.figgeo;

import java.awt.*;

public class Rectangle extends FigGeo  {   /*fig geo tem de implemntar todas os metodos da interface de figgeo (apesar desta nao so implemntar todos)*/

    public Rectangle(Color color, Point lup, Point rdp) {
        super(color);
        this.addPoint(lup);
        this.addPoint(rdp);
    }


    @Override
    public double area() {
       Point lup=this.getPoint(0);
       Point rdp=this.getPoint(1);
        double dx=lup.distanceX(rdp);
        double dy=lup.distanceY(rdp);
        return dx * dy ;
    }

    @Override
    public double perimeter() {
        Point lup=this.getPoint(0);
        Point rdp=this.getPoint(1);
        double dx=lup.distanceX(rdp);
        double dy=lup.distanceY(rdp);

        return 2*dx+ 2*dy;
    }

    @Override
    public boolean isInside(FigGeo f) {
        Point lup=this.getPoint(0);
        Point rdp=this.getPoint(1);
        if(f instanceof Rectangle) {
            Rectangle rect = (Rectangle) f;
            return rect.containsPoint(lup)&&rect.containsPoint(rdp);
        }
        //fazer verificacoes para ciclre e triangle
        return false;

    }

    @Override
    public boolean isInterceptedBy(FigGeo f) {
        Point lup=this.getPoint(0);
        Point rdp=this.getPoint(1);
        Point ldp= new Point(lup.getX(),rdp.getY());
        Point rup = new Point(rdp.getX(),lup.getY());
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
    public boolean containsPoint(edu.ufp.inf.lp2.figgeo.Point p) {
        return false;
    }

    @Override
    public boolean containsPoint(java.awt.Point p) { //ispoint inside
        Point lup=this.getPoint(0);
        Point rdp=this.getPoint(1);
       // return p.xBetweenPoints(lup,rdp) && p.yBetweenPoints(lup,rdp);
        return false;
    }


    @Override
    public String toString() {
        return "Rectangle{"+super.toString()+"}";
    }
}