package edu.ufp.inf.lp2.figgeo;

public interface FigGeoRelsI {

  public boolean isInside(FigGeo f);  //receve uma figura eometroca e retorna v ou f se estiver dentro da figura f

  public boolean isInterceptedBy(FigGeo f);

  public boolean containsPoint(Point p);

}