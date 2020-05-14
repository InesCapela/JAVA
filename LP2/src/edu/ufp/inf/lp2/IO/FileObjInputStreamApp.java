package edu.ufp.inf.lp2.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileObjInputStreamApp {

    public static void main(String args[]) {
        String filename = (args.length == 1 ? args[0] : "data/Date.bin");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

           /* String msg = (String) ois.readObject();
            Date today = (Date) ois.readObject();
            Point p= (Point) ois.readObject();
            Rectangle r = (Rectangle) ois.readObject();
            Circle c =(Circle) ois.readObject();

            System.out.println(msg);
            System.out.println(today);
            System.out.println(p);
            System.out.println(r);
            System.out.println(c);*/
            ArrayList al = (ArrayList) ois.readObject();
            System.out.println(al);


        } catch (IOException e) {
            Logger.getLogger(FileObjInputStreamApp.class.getName()).log(Level.SEVERE, null, e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
