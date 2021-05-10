package tekcift;

import java.io.*;
import java.util.*;

public class Tekcift {

    public static void main(String[] args) {

        File dosya = new File("sayilar.txt");
        File dosya2 = new File("tek.txt");
        File dosya3 = new File("cift.txt");
        Scanner oku = null;
         PrintWriter pw1=null;
            PrintWriter pw2=null;
        try {
            dosya2.createNewFile();
            dosya3.createNewFile();
            pw1=new PrintWriter(dosya2);
            pw2=new PrintWriter(dosya3);
            oku = new Scanner(dosya);
           
           
            while (oku.hasNext()) {
                int s = oku.nextInt();
                if (s % 2 == 0) {
                    pw2.print(s+" ");
               } else {
                    pw1.print(s+" ");
                }
            }
            pw1.close();
            pw2.close();
            oku.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
