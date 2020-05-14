package edu.ufp.inf.lp2.IO;

import edu.ufp.inf.lp2.figgeo.*;
import edu.ufp.inf.lp2.figgeo.Point;
import edu.ufp.inf.lp2.figgeo.Rectangle;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileObjOutputStreamApp {
    public static void main(String args[]) {
        String filename = (args.length == 1 ? args[0] : "data/Date.bin");
        //ObjectOutputStream oos = null;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            //oos = new ObjectOutputStream(new FileOutputStream(filename));
            // Create message and Date objects
            String msg = "Today's Date:";
            Date today = new Date(System.currentTimeMillis());
            // Write String object followed by Date object


            // Manipulate the class Point to mae it persistable (Serializable)...
            // also create default constructor: Point(){}
            Point p = new Point(1.0f, 1.0f);

            // Since Rectangle uses Point, then it needs to be serializable too
            // NB: Point and FigGeo must implement Serializable
            // NB: Rectangle extends FigGeo, hence, it does not need to implement Serializable
            Rectangle r = new Rectangle(Color.BLUE, new Point(0.0, 1.0), new Point(1.0, 0.0));

            Circle c = new Circle(Color.BLUE, 1.0, new Point(0.0f, 0.0f));
            ArrayList al = new ArrayList();
            al.add(msg);
            al.add(today);
            al.add(p);
            al.add(r);
            al.add(c);
            oos.writeObject(al);


            // Write serialized objects into file
           /* oos.writeObject(msg);
            oos.writeObject(today);
            oos.writeObject(p);
            oos.writeObject(r);
            oos.writeObject(c);*/


        } catch (IOException e) {
            Logger.getLogger(FileObjOutputStreamApp.class.getName()).log(Level.SEVERE, null, e);
        }
        /*
        finally {
            try {
                // Flush and close
                if (oos != null) {
                    oos.flush();
                    oos.close();
                    System.out.println("Done writing objects to file " + filename);
                }
            } catch (IOException ex) {
                Logger.getLogger(FileObjOutputStreamApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        */
    }
}
