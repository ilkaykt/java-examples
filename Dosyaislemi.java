    
package dosyaislemi;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class Dosyaislemi {

    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
        System.out.println("Dosya ismi ne olsun?");
        String isim=k.nextLine();
        File dosya=new File(isim+".txt");
       try{
           if (!dosya.exists()) {
               dosya.createNewFile();
               System.out.println("Başarılı bir biçimde oluşturuldu.");
           }
           else System.out.println("Dosya zaten mevcut.");
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println("Dosyanın içine ne yazmak istersiniz?");
        String metin=k.nextLine();
        try{
            FileWriter yaz=new FileWriter(dosya,false);
            for (int i = 0; i <metin.length(); i++) {
                yaz.write(metin.charAt(i));
                
            }
            yaz.write("/t");
            
            yaz.close();
        }
        catch(Exception f){
            System.out.println(f.getMessage());
        }
        System.out.println("Dosyada ne yazıyor?");
        try{
       FileInputStream f=new FileInputStream(dosya);
       DataInputStream d=new DataInputStream(f);
       BufferedReader oku= new BufferedReader(new InputStreamReader(d));
        String str=oku.readLine();
            
            d.close();
            System.out.println(str);
        }
        
        catch(Exception c){
            System.out.println(c.getMessage());
        }
    }
}
