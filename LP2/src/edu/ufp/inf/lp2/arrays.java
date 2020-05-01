package edu.ufp.inf.lp2;
import edu.ufp.inf.lp2.Intro.Point;
import edu.ufp.inf.lp2.Intro.Rectangle;

import java.util.ArrayList;
import java.util.Date;

public class arrays {

    private char arrayChar[] = new char[4];
    private Point arrayPoint[] = new Point[4];
    private String arrayString[] = {"ola", "mundo"};
    private Object arrayObjs[] = new Object[4];
    private ArrayList<String> str = new ArrayList<>();
    private int matriz[][] = new int[4][4];
    private Point m[][] = new Point[4][];//linhas, colunas, podemos só inicializar o numero de linhas

    ArrayList alo = new ArrayList();

    public void percorrerArray() {
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
        for (String s : arrayString) { //s nome da var, arrayString colecao de dados
            System.out.println(s);
        }
        arrayObjs[0] = new Object();
        arrayObjs[1] = new Point(1, 1);
        arrayObjs[2] = new Rectangle();
        arrayObjs[3] = "ola";
    }

    public void arL() {
        alo.add("ola");
        alo.add(new Point(1, 2));
        alo.add(new Date());

        Point p1 = (Point) alo.remove(1);
    }
}