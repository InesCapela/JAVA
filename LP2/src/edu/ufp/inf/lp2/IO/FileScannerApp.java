package edu.ufp.inf.lp2.IO;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScannerApp {
    public static void main(String[] args) throws IOException {
        Scanner s=null;

        try {
            //Create scanner for txt file
            s=new Scanner(new BufferedReader(new FileReader("data/Alunos.txt")));

            //Walk through the file content (token by token)
            while (s.hasNext()) {
                String token=s.next();
                if (token.contains(",")){
                    String str = token.replace(',', ' ');
                    System.out.println(str.trim());
                    if(!str.contains(".") && str.contains("1")){
                        int num= Integer.parseInt(str.trim());
                        System.out.println("Num: "+num);
                    }
                } else {
                    System.out.println(token);
                }
            }
        } finally {
            if (s != null) s.close();
        }
    }
}
