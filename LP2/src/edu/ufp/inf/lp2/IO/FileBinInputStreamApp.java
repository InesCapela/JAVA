package edu.ufp.inf.lp2.IO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileBinInputStreamApp {
    public static void main(String args[]) {
        DataInputStream dis = null;
        try {
            String filename = (args.length == 1 ? args[0] : "data/Test.bin");
            // Open file and wrappers
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)));

            //write size of array
            int lenght = dis.readInt();

            double data[] = new double[lenght];;

            // Write doubles into the file
            for (int i = 0; i < data.length; i++) {
                data[i]=dis.readDouble();
                System.out.println(data[i]);
            }

        } catch (Exception e) {
            //Logger.getLogger(FileBinIntputStreamApp.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (Exception ex) {
                //Logger.getLogger(FileBinIntputStreamApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
