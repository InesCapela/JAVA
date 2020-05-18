package edu.ufp.inf.lp2.figgeo;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class FigGeo implements FigGeoRelsI, FigGeoDimsI, Serializable {

  private Color color;

  private ArrayList<Point> points = new ArrayList<>();

  public FigGeo() {
  }

  /******************************************************************************************************/


  public Point getPoint(int index) {

  //return this.getPoints().get(index);
  return this.points.get(index);
  }

  public void addPoint(Point p) {
    this.points.add(p);
  }

//**************************************************************************************************/
  public FigGeo(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public ArrayList<Point> getPoints() {
    return points;
  }

    public abstract boolean containsPoint(java.awt.Point p);

    @Override
  public String toString() {
    return "FigGeo{" +
            "color=" + color +
            ", points=" + points +
            '}';
  }
}