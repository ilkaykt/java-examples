package korkut;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Korkut {

    /*
    public static int[] bul(int[] a, int[] b) {
        int dizi[] = new int[a.length];
        int dizi3[] = new int[a.length];
        int sayac = 0, y = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                dizi[i] = a[i];
                dizi3[i] = i;
                sayac++;
            }
        }
        int dizi2[] = new int[sayac * 2];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && b[i] == 0 || dizi[i] != 0) {
                dizi2[y] = dizi[i];
                dizi2[y + 1] = dizi3[i];
                y = y + 2;
            }
        }
        return dizi2;
    }
    public static void main(String[] args) {
     int sayac = 0;
    int d1[] = {3, 5, 5, 0, 9, 5, 8, 5, 2, 5, 6, 8, 5, 2, 4, 5, 2, 5, 8, 7, 6, 5, 4, 2, 4};
    int d2[] = {5, 5, 7, 0, 9, 5, 2, 4, 8, 6, 4, 5, 7, 2, 1, 5, 8, 7, 5, 6, 4, 5, 2, 1, 4};
    int[] k = bul(d1, d2);
    for (int i = 0; i< k.length ;i++) {
            System.out.print(k[i] + "\t");
        sayac++;
        if (sayac == 2) {
            System.out.println();
            sayac = 0;
        }
    }
}
}
     */
 /*
    public static void main(String[] args) {
        //...5 SAYIDAN EN BUYUK 2. ELEMAN...
        /* 
        Scanner klavye = new Scanner(System.in);

        int s1,s2,eb1,eb2=0;

        s1 = klavye.nextInt();
        eb1 = s1;
        for (int i = 1; i <=4; i++) {
            s2 = klavye.nextInt();
            if (s2 > eb1)
            {
                eb2=eb1;
                eb1= s2;
             }
            else if (s2>eb2)
            {    
                eb2=s2;  
            }
            }
       System.out.println(eb2);
        }    
    }

     */

 /*
    //KLAVYEDEN GİRİLEN SAYI KADAR BASAMAĞA SAHİP DİK ÜÇGEN//
    Scanner klavye= new Scanner(System.in);
    int yildiz;
        System.out.println("Kaç basamaklı üçgen olsun?");
    yildiz=klavye.nextInt();
    
    
        for (int i =1; i<=yildiz-1; i++) {
            
            System.out.print("*");
            System.out.println();
            for (int j =1; j <=i; j++) {
                
                
                System.out.print("*");
                
            }
            
        }
        System.out.print("*");
        System.out.println();
    
    
    


    }
}
     */
    //KLAVYEDEN GİRİLEN SAYI KADAR BASAMAKLI ÜÇGEN ÇİZEN PROGRAM//
    /*
public static void main(String[]args){
Scanner klavye=new Scanner(System.in);
    int yildiz;
        System.out.println("Kaç basamaklı üçgen olsun?");
    yildiz=klavye.nextInt();
        for (int i =1; i <=yildiz; i++) {
            for (int j=0; j<yildiz-i; j++) {
                System.out.print(" ");
            }
            for (int m = 0; m <i; m++) {
                System.out.print("*");   
            }
            for (int k = 0; k<=i-2; k++) {
                
                System.out.print("*");
            }
              System.out.println();  
            }              
            }   
            }
     */
 /*

     
   for (int i = 0; i <= 5; i++) 
    { 
     for (int j = 0; j <= (5 + 1) - i; j++) 
     System.out.print(" ");  
       for (int k = 0; k <= 2 * i - 2; k++) 
           System.out.print("*"); 
           System.out.println();  
    } 
   for (int m = 0; m <= 5; m++) 
    { 
    for (int n = 0; n <= m; n++) 
    System.out.print(" "); 
     for (int z = m * 2; z <= 5 * 2; z++) 
       System.out.print("*");  
       System.out.println(); 
    } 
 
    }
}

     */
 /*
//üs alma// 
long a=5,t=1;


        for (long i =1; i <=64; i++) {
            
            t=t*a;
            
            
            
        
                    System.out.println(t);
        }
    }
}

     */
//ASAL SAYI BULMA//
/*
        int sayi, b = 0, sayac = 0;

        Scanner klavye = new Scanner(System.in);
        System.out.println("Sayı giriniz");

        sayi = klavye.nextInt();

        if (sayi < 2)
        {
               System.out.println("Sayı asal değildir.");
        }
        else 
        {
            for (int i = 2; i <= sayi/2; i++) {
                b = sayi / i;
                if (b * i == sayi) {
                    sayac = sayac + 1;
                }
            }
            if (sayac != 0) {
                System.out.println("Sayı asal değildir");
            }
            else
            {
                System.out.println("Sayı asaldır");
            }
        }
    }
}
     */

 /*
//KLAVYEDEN GİRİLEN KELİMEDE i HARFİNİ BULAN PROGRAM//
Scanner klavye= new Scanner(System.in);
int sayi=0;
String kelime;

        System.out.println("Kelimeyi gir");
        
        kelime=klavye.nextLine();
        for (int i =0; i <kelime.length(); i++) { 
            if (kelime.charAt(i)=='i') {      
                sayi++;      
            }
        System.out.println(sayi);
    }
}
     */
 /*
Scanner klavye=new Scanner(System.in);

String kelime;

        System.out.println("Kelimeyi gir");
        kelime=klavye.nextLine();
        for (int i=0; i < kelime.length(); i++) {
            if(kelime.charAt(i)=='i'){
                
            kelime=kelime.replace("i", "u");
                
            }
        }
            System.out.println(kelime);
        }
}


     */
 /*
  Scanner klavye= new Scanner(System.in);
  int s1,s2;
        System.out.println("İlk sayıyı giriniz");
        s1=klavye.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        s2=klavye.nextInt();
        
        for (int i=2; i<s1/2 ; i++) {
                    
            
            
            
        }
  
    }
}
     */
 /*
 //ARALARINDA ASAL MI DEĞİL Mİ KONTROL EDEN PROGRAM//
        Scanner klavye = new Scanner(System.in);
        int sayi1, sayi2, buyuksayi, kucuksayi;
        System.out.println("İlk sayıyı gir");
        sayi1 = klavye.nextInt();
        System.out.println("İkinci sayıyı gir");
        sayi2 = klavye.nextInt();
        while (sayi1 == sayi2) {
            System.out.println("Farklı sayılar giriniz");
            System.out.println("Birinci sayıyı giriniz");
            sayi1 = klavye.nextInt();
            System.out.println();
            System.out.println("İkinci sayıyı giriniz");
            sayi2 = klavye.nextInt();
        }
        if (sayi1 > sayi2) {
            buyuksayi = sayi1;
            kucuksayi = sayi2;

        } else {
            buyuksayi = sayi2;
            kucuksayi = sayi1;
        }
        boolean aralarindaasal = true;
        for (int i = 2; i <= kucuksayi; i++) {
            if (kucuksayi % i == 0 && buyuksayi % i == 0) {
                aralarindaasal = false;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if (aralarindaasal) {
            System.out.println(kucuksayi +" " + "ve" + " " + buyuksayi +" " + "aralarında asaldır.");
        } else {
            System.out.println(kucuksayi +" " + "ve"+ " " + buyuksayi +" " + "aralarında asal değildir.");
        }
    }
}
     */
 /*
 //SAYIYI TAHMİN ETME OYUNU//
 
        Scanner klavye = new Scanner(System.in);
        int sayi = 0, tahmin = 25;

        int tekrar = 0;
        while (sayi != tahmin) {
            System.out.println("Tahmin sayısını gir");
            sayi = klavye.nextInt();
            if (sayi < tahmin) {
                System.out.println("Küçük tahmin ettin");
            } else if (sayi > tahmin) {
                System.out.println("Buyük tahmin ettin");
            }
            tekrar++;
        }
        System.out.println(tekrar + " " + "denemede buldunuz, tebrikler.");
    }
}
     */
 /*
 //GİRİLEN 10 SAYIDAN EN BÜYÜĞÜNÜ BULAN VE KAÇINCI SIRADA YAZILDIĞINI BULAN PROGRAM//
 
 Scanner klavye=new Scanner(System.in);
int sayi,eb=0,indis=1;
        System.out.println("Klavyeden bir sayı giriniz");
        sayi=klavye.nextInt();
        eb=sayi;
        for (int i=2; i<=10; i++) {
         sayi=klavye.nextInt();
            if (sayi>eb) {
                
                eb=sayi;
                indis=i;
                
            }
        }
        System.out.println(eb+" "+indis);
    }
}
     */
 /*
 //ÇARPIM TABLOSUNU OLUŞTURAN PROGRAM//
 int sayi=1;
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                System.out.println(i+"x"+j+"="+i*j);
            
                
            }
            
        }
    }
}
     */
 /*
 //KLAVYEDEN GİRİLEN BİR X SAYISINA KADAR 1223334444...XXXX YAZDIRAN PROGRAMI OLUŞTUR//
 Scanner klavye=new Scanner(System.in);
 int sayi;
        System.out.println("Sayı giriniz");
        sayi=klavye.nextInt();
        for (int i=1; i<=sayi; i++) {
            for (int j=1; j <=i; j++) {
                System.out.print(i);
            }
        }
    }
}
     */
 /*
 BİRİNCİ YOL
     */
 /*
//KLAVYEDEN BİR STRİNG GİRİLİYOR, STRİNGİN AŞAĞIDAKİ FORMATTA EKRANA YAZAN PROGRAMI OLUŞTUR: String bilgi ekrana her harfi alt alta yaz ve arttır//
Scanner klavye=new Scanner(System.in);
String kelime;
kelime=klavye.nextLine();
        for (int i=0; i<kelime.length(); i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(kelime.charAt(j));
                
            }
            System.out.println();
           
        }
    }
}
     */
 /*İKİNCİ YOL
     */
 /*
        Scanner klavye = new Scanner(System.in);
        String kelime;
        kelime = klavye.nextLine();
        for (int i = 0; i < kelime.length(); i++) {
            System.out.println(kelime.substring(0, i + 1));
        }

    }
}
     */
    //KLAVYEDEN GİRİLEN STRİNG PALİNDROM MUDUR? KELEK-MUM...//
    /*
 Scanner klavye=new Scanner(System.in);
 String kelime;
 int bas, son;
        System.out.println("Kelime giriniz");
 kelime=klavye.nextLine();
 boolean pal=true;
 bas=0;
 son=kelime.length()-1;
       while(bas<son){
           if(kelime.charAt(bas)!=kelime.charAt(son)){
               pal=false;
               
           break;
           }
           bas++;
           son--;
           
       }
        if(pal){
            System.out.println("Palindrom");
        }
            
            else
            {
                    System.out.println("değil");
                    }
        }
    }
     */
 /*
Scanner k=new Scanner(System.in);
String metin
     */
 /*
//İLK 10 FİBONACHHİ SAYISINI EKRANA YAZAN JAVA PROGRAMI OLUŞTUR//
     int a=1; int b=1; int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < 10; i++) 
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
     */
 /*
//TOPLAM SEMBOLÜ 1 DEN 5 E ÇARPIM SEMBOLÜ 1 DEN 3 E İ İLE J Yİ TOPLA//
int top=0, car=1;
        for (int i=1; i<=5; i++) {
            
        
            for (int j=1; j<=3; j++) {
                car=car*(i+j);
            }
            top=top+car;
            car=1;
        }
        System.out.println(top);
    }
}
     */
//DEFTERDEKİ İNTEGRAL SORUSU//
/*
double f1,f2,t=0.0,x=2.0;
f1=x*x;
        for (double i=2.001; i<5.0; i=i+0.001) {
            f2=i*i;
            t=t+(f1+f2)*0.001/2;
            f1=f2;
            
        }
        System.out.println(t);
    }
}
     */
 /*
//ÖDEV
1.//KLAVYEDEN GİRİLEN STRİNGİ TERSTEN EKRANA YAZAN PROGRAMI OLUŞTUR//
2. KLAVYEDEN GİRİLEN STRİNGTE KAÇ TANE KELİME VARDIR
3. KLAVYEDEN GİRİLEN STRİNGİ ali geldi, ila idleg formatında yazan java programlarını yazınız.
4. KLAVYEDEN GİRİLEN SAYI ASAL SAYI MIDIR? JAVA PROGRAMINI YAZINIZ
     */
 /*
Scanner klavye=new Scanner(System.in);
        System.out.println("Kelime gir");
String kelime=klavye.nextLine();
int s;
s=kelime.length()-1;
        for (int i=0; i<kelime.length(); i++) {
            System.out.print(kelime.charAt(s));
            s--;
        }
        System.out.println();
    }
}
     */
 /*
2.

Scanner klavye=new Scanner(System.in);
        System.out.println("Cümleyi giriniz.");
        String kelime=klavye.nextLine();
        int t=0;
        for (int i =0; i <kelime.length(); i++) {
            
            if (kelime.charAt(i)==' ')
            {
               t++;                
            }
            
        }
        System.out.println(t+1);
    }
}
     */
 /*
//GİRİLEN HARFLERİN KELİMEDE SIRALI MI DEĞİL Mİ OLDUKLARINI VE HANGİ SIRADA OLDUĞUNU YAZAN PROGRAM//
Scanner klavye=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String kelime=klavye.nextLine();
        System.out.println("Bu kelimeden bulmak istediğiniz ilk harf");
        String harf=klavye.next();
        System.out.println("İkinci harf");
        String harf2=klavye.next();
        int s = 0;
        for (int i=0; i<kelime.length(); i++) 
        {
            if (kelime.charAt(i)==harf.charAt(0))
            {
               if (kelime.charAt(i+1)==harf2.charAt(0)) 
               {
               System.out.println("Birinci harf:"+"\n"+(i+1)+"\n"+"İkinci harf:"+"\n"+(i+2)+"\n"+"Girdiğiniz harfler sıralıdır.");
            }
       
        }
         
        }
        
}
}
     */
 /*
1111
0111
0011
0001
1000
1100
1110
1111
....
args 0 yaz ne geldiğini bul
     */
 /*
        int dizi[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i <= j) {
                   dizi[i][j]=1;
                } else {
                    dizi[i][j]=0;
                }
            }  
        }
        for (int i=0; i<4; i++) {
            for (int j=0;j<4; j++) {
                System.out.print(dizi[i][j]);
 
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < j) {
                    dizi[i][j]=0;
                } else {
                    dizi[i][j]=1;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) 
            {
             System.out.print(dizi[i][j]);

            }
            System.out.println();
        } 
    }
}
     */
    //RASTGELE 5 5 MATRİSTEN EN BÜYÜK SATIR VE SÜTUNDAKİ SAYILARI BULUP YAZAN PROGRAM
    /*
        int dizi[][] = new int[6][6];
        Random k = new Random();
        int ebsa = 0, ebsu = 0, eb = 0;
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = 0; j < dizi.length - 1; j++) {
                dizi[i][j] = k.nextInt(100);
                if (dizi[i][j] > eb) {
                    eb = dizi[i][j];
                }
                if (dizi[i][j] > ebsa) {
                    ebsa = dizi[i][j];
                }
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.print("|" + ebsa);
            ebsa = 0;
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            System.out.print("__" + "\t");
        }
        System.out.println();
        for (int j = 0; j < dizi.length - 1; j++) {
            for (int i = 0; i < dizi.length - 1; i++) {
                if (dizi[i][j] > ebsu) {
                    ebsu = dizi[i][j];
                }
            }
            System.out.print(ebsu + "\t");
            ebsu = 0;
        }
        System.out.print("|");
        System.out.print(eb);
    }
}
     */
 /*
   public static int bul(String s){
       int sayac=0;
       for (int i = 0; i <s.length()-1; i++) {
           if (s.charAt(i)=='a') {
               if (s.charAt(i+1)=='a') {
                   i++;
                   sayac++;
                   
               }
               
           }
       }
     return sayac;
    }
   public static void main(String[]args){
       String k="aaaas sssaaasd aaasfsaaz aa";
       int s=bul(k);
       System.out.println(s);
   }
}
     */
    //kucukten buyuge dizi sıralama//
    /*
    public static void main(String[] args) {
        int dizi[] = {1,2,3,3,1,2};
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] < dizi[j]) {
                    int p = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = p;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
     */
    //üç harflileri ayıran program//
    /*
    public static void main(String[]args){
    String k="aaa ss ddd svv dsfsd gsd aa";
    int sayac=0;
        for (int i = 0; i <k.length(); i++) {
            if (k.charAt(i)!=' ') {
                sayac++;
            }
            if (k.charAt(i)==' ') {
                if (sayac==3) {
                    System.out.println(k.substring(i-3,i));
                    
                }
                sayac=0;
            }
        }
    }
}
     */
 /*
    public static void main(String[] args) {
        int x, y, z, t = 0, p = 0, s = 0;
        Scanner k = new Scanner(System.in);
        x = k.nextInt();
        y = k.nextInt();
        z = k.nextInt();
        for (int i = 0; i < x; i++) {
            t = t + y;
        }
        while (t > s) {
            s = 0;
            for (int i = 0; i < z; i++) {
                s = s + p;
            }
            if (t > s) {
                p++;
            }
        }
        System.out.println(p);
    }
}
     */
 /*
    public static void main(String[] args) {
        int fib1 = 0, fib2 = 1, fib3;
        Scanner k = new Scanner(System.in);
        int s = k.nextInt();
        if (s == 0) {
            System.out.print("");
        } else {
            if (s == 1) {
                System.out.println(fib1);
            } else {
                System.out.println(fib1);
                System.out.println(fib2);
                for (int i = 2; i < s; i++) {
                    fib3 = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = fib3;
                    System.out.println(fib3);
                }
            }
        }
    }
}
     */
    //bir diziyi bir eleman sağa kaydıran program//
    /*
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Random r = new Random();
        int a;
        int s = k.nextInt();
        int dizi[] = new int[s];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = r.nextInt(10);
        }
        System.out.println();
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("[" + dizi[i] + "]");
        }
        a = dizi[0];
        
        dizi[0] = dizi[dizi.length-1];
        for (int i = dizi.length-1; i > 1; i--) {
            dizi[i] = dizi[i - 1];
        }
        dizi[1] = a;
        System.out.println();
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("[" + dizi[i] + "]");
        }
    }
}
     */
    //aynı problemin metodlusu//
    /*
    public static int[] bul(int p[]) {

        int a;
        System.out.println();
        for (int i = 0; i < p.length; i++) {
            System.out.print("[" + p[i] + "]");
        }
        a = p[0];
        p[0] = p[p.length - 1];
        for (int i = p.length - 1; i > 1; i--) {
            p[i] = p[i - 1];
        }
        p[1] = a;
        System.out.println();
        return p;
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner k = new Scanner(System.in);
        int s = k.nextInt();
        int di[] = new int[s];
        for (int i = 0; i < di.length; i++) {
            di[i] = r.nextInt(10);
        }
        int[] f = bul(di);
        for (int i = 0; i < f.length; i++) {
            System.out.print("[" + f[i] + "]");
        }

    }
}
     */
    //sa kac tane bulan program//
    /*
    public static int bul(String a){
        int sayac=0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='s') {
                if (a.charAt(i+1)=='a') {
                    sayac++;
                    i++;
                }
                
            }
        }
return sayac;    
    }
    public static void main(String []args){
        Scanner k=new Scanner(System.in);
        String kelime;
        kelime=k.nextLine();
        int p=bul(kelime);
        System.out.println(p);
    }
}
     */
    //girdiğin sayı 3 olursa 1 1 2 1 2 3 diziye atan program//
    /*
    public static int[] yaz(int a) {
int bsmk=0;
        int s = a * (a + 1) / 2;
        int dizi[] = new int[s];
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=i; j++) {
                
                
                dizi[bsmk]=j;
                bsmk++;
            }
            
      
        }
return dizi;
        }
     
public static void main(String []args){
    Scanner k=new Scanner(System.in);
    int sayi=k.nextInt();
    int p[]=yaz(sayi);
    for (int i=0; i <p.length; i++) {
        System.out.print("["+p[i]+"]");
    }
    
    
}
}
    /*
     */
 /*
    public static int[] degis(int a[]){
        int dizi[]=new int[a.length];
    int s=a.length;
        for (int i = 0; i < a.length; i++) {
            dizi[i]=a[s-1];
            s--;
        }
        return dizi;
    }
    public static void main(String[]args){
        
  
        Scanner k=new Scanner(System.in);
        int sayi=k.nextInt();
        int dz[]=new int[sayi];
        Random r= new Random();
        for (int i = 0; i <sayi ; i++) {
            dz[i]=r.nextInt(100);
        }
        for (int i = 0; i < dz.length; i++) {
            System.out.print("["+dz[i]+"]");
        }
        System.out.println();
        int s[]=degis(dz);
        for (int i = 0; i < dz.length; i++) {
            System.out.print("["+s[i]+"]");
        }
    }
}
     */
 /*
public static void main(String[] args){
    int sayi,top=0;
   int dizi[][] = new int[2][2];
   Scanner k=new Scanner(System.in);
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j <2 ; j++) {
            dizi[i][j]=k.nextInt();
            sayi=dizi[i][j];
            top=top+sayi;
        }  
    }
    System.out.println(top);
   
  
   
    
}
}
     */
 /*
    public static int ebob(int a,int b,int c){
        if (a%c==0 && b%c==0) {
            return c;
        }
            else    return ebob(a,b,c);
        }
        public static void main(String[] args){
            System.out.println(ebob(6,4,4));
        }
    }
     */
 /*
static int sifirabolme(int a,int b){
    int sonuc=a/b;
    return sonuc;
}
public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    System.out.println("iki sayi git");
    int x=k.nextInt();
    int y=k.nextInt();
    try {
        int s=sifirabolme(x,y);
        System.out.println("sonuc="+s);
    }
    catch (ArithmeticException e){
        System.out.println("sifira bolme");
        System.out.println(e.getMessage());
    }
     }
}
     */
 /*//harf aşımı hatası söyleme
public static void main(String[] args){
String S="Bilgisayar Muhendisliği";
Scanner k=new Scanner(System.in);
    System.out.println("Bulmak istediğiniz karakter indisi");
    int s=k.nextInt();
    try {
        int sayi=S.length()/s;
        System.out.println("Karakter"+S.charAt(s));
        System.out.println("Sayi"+sayi);
    }
    catch (StringIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }
    catch (ArithmeticException e){
    System.out.println(e.getMessage());
}
}
}
     *///txt olusturma ve metin girme//
    /*
   public static void main(String[] args) throws IOException{
       File dosya=new File("deneme.txt");
       FileWriter yazici= new FileWriter(dosya,true);
       PrintWriter p=null;
      
       if (!dosya.exists()) {
           dosya.createNewFile();
           System.out.println("Dosya oluşturuldu.");
                   
           
       }
       else{
           System.out.println("Dosya mevcut");
           System.out.println(dosya.getAbsolutePath());
           p=new PrintWriter(new FileOutputStream(dosya,true));
           Scanner klavye=new Scanner(System.in);
           System.out.println("Ad soyad gir");
           String ad=klavye.nextLine();
           String soyad=klavye.nextLine();
           int not=klavye.nextInt();
           p.print(ad);
           p.print(soyad);
           p.println(not);
           p.close();
       }
   }
   }
     */
 /*
    public static void main(String[]args)throws IOException{
        File dosya=new File("sayilar.txt");
        FileWriter yazici=new FileWriter(dosya,true);
        PrintWriter p=null;
        if (dosya.exists()) 
        {
            dosya.createNewFile();
            System.out.println("Dosya olusturuldu");
        }
        else{
            int sayi;
            p=new PrintWriter(new FileOutputStream(dosya,true));
            Random k=new Random();
            for (int i = 0; i < 10; i++) {
            
            sayi=k.nextInt(100);
            p.println(sayi);
            }
           
            p.close();
        }
        
}
}
     */
 /*
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sonuc;
        int sayi1 = k.nextInt();
        String islem=k.next();
        //char a=islem.charAt(0);
        int sayi2 = k.nextInt();
        try {
            switch (islem) {
                case "+":
                    sonuc = sayi1 + sayi2;
                    System.out.println(sonuc);
                    break;
                case "-":
                    sonuc = sayi1 - sayi2;
                    System.out.println(sonuc);
                    break;
                case "*":
                    sonuc = sayi1 * sayi2;
                    System.out.println(sonuc);
                    break;
                case "/":
                    sonuc = sayi1 / sayi2;
                    System.out.println(sonuc);
                    break;
                default: System.out.println("Lütfen doğru operatör"); 
            }
        } catch (Exception e) {
            System.out.println("Yanlıs işlem girdiniz.");
        }
        System.out.println("");                     
    }
}
     */
 /*
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
       try{
            int s1=k.nextInt();
            int s2=k.nextInt();
           int  s=s1+s2;
       }
       catch(InputMismatchException e){
           System.out.println(e.getMessage());
       }
     
        
    }
}
     */
 /*
    java.util.Scanner kütüphaneleri
    +Scanner(Sunucu:File)
    +close
    +hasNext();
    +next()
    +nextLine()
    +nextInt()
    ve diğer değişkenler...
     */
 /*
public static void main(String[] args){
    Scanner k=new Scanner(System.in);
    File dosya=new File("ders1.txt");
    Scanner oku=new Scanner(dosya);
    
    
            }
}
     *///ÖRNEK 1
/*
    public static void main(String[] args){
        String path="d:\\ogrenciler.txt";
        File dosya=new File(path);
        Scanner oku=null;
        try{
            oku=new Scanner(dosya);
            while  (oku.hasNext()){
                String isim=oku.next();
                String soyad=oku.next();
                int notu=oku.nextInt();
                System.out.println(isim+""+soyad+""+notu);
                oku.close();
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    }
    //ODEV:bir dosyada bir sürü değerler bulunmakta. amacımız, her satırdaki değerlerin toplamını ekranda göstermek(double)
    ///odev2:Bir txt dosyasında metinler mevcuttur. Bu dosyada okuma yaparak karakter sayısı, kelime sayısı ve satır sayısını bulup gösteren bir java kodu.
     */
 /*
    public static void main(String[] args) {
        try {
            Scanner oku = new Scanner(new File("test.txt"));
            while (oku.hasNext()) {
                String getir = oku.nextLine();
            }
            oku.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
     */
//bir dosyada rakamlar var bu dosyadaki rakamları okuyup toplayan program
/*
publpublic static void main(String[]args){
    int toplam=0;
 FilFile dosya=new File("sayilar.txt");
 ScaScanner oku=null;
 try{
     oku=new Scanner(dosya);
     while(oku.hasNextInt()){
        int sayi=oku.nextInt();
         toplam=toplam+sayi;
         
                 
         
     }
     System.out.println(toplam);
     oku.close();
 }
 catcatch(Exception e){
     System.out.println(e.getMessage());
 }
}
}
     */
//bufferedreader bir dosyadan okuma yapmak için kullanılan diğer bir yöntemdir.
//bu yöntem daha çok karakterler, diziler ve satırları okumak çin kullanılır. 
//bufferedreader ile bir nesne olustururken dosyanın adı direk girilmez, firereaderden olusturulan nesne kullanılır.
//metin dosyasından bi satır okunurken readLine() metodu kullanılır.
/*
    public static void main(String[]args){
        try{
            BufferedReader oku=new BufferedReader(new FileReader("ornek.txt"));
            String satir=oku.readLine();
            while(satir!=null){
                System.out.println(satir);
                satir=oku.readLine();
                
            }
            oku.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }
     */
//FileReader-- Bir text dosyasından karakter biçiminde veri okumak için kullanılır.
// FileWriter(Dosyaya karakter yazmak için oldukça kullanışlıdır.
//Karakter dışında dosyaya string ve karakter dizisi yazdırılabilir.ve FireWriter yazar.
/*
    public static void main(String[] args)throws IOException {
        File dosya=new File("bilgi.txt");
        String s="Fırat Üniversitesi Bilgisayar Mühendisliği";
        FileWriter yaz=new FileWriter(dosya,true);
        for (int i = 0; i <s.length(); i++) {
            yaz.write(s.charAt(i));
        }
            yaz.close();
    }
}
    //filereader komutları: oku.read();
    //
     */
 /*
    public static void main(String[] args) throws IOException{
        int ch;
        FileReader oku=null;
        File dosya=new File("karakter.txt");
        ch=oku.read();
        while(ch!=-1){
            System.out.println(ch);
            ch=oku.read();
        }
        oku.close();
    }
}
     */
 /*
    //nesne tabanlı programlama, nesneleri içeren programlar yazılmasını sağlar.
   //nesne(object) gerçek dünyadaki herhangi bir varlığı gösterir.örnegi: öğrenci masa buton.. birer nesnelerdir.
    //nesnelerin iki tanımlayıcısı vardır. biri durumu ikincisi ise davranış.
    //bir java dosyasının içinde birden fazla sınıf olabilir.
    //UML class(sınıf) diyagramı*
    //kurucu method  sınıfın aıyla aynı olan metodlardır. baslangıc değerlerini atamasıyla kullanılır.bir nesneyi farklı parametrelerle kullanmak için kullanıslıdır.
    bir sınıf birden fazla kurucu metoda sahip olabilir.
    kurucu metodların çağırılması new anahtar sözcüğüyle bir nesne oluşumu gerçekleşir.
    kurucu metod sınıf adıyla aynı olmalı.
    kurucu metodlar geri dönüş tipine sahip değildir.
    kurucu metodlar sınıftan bir nesne olusturulduğunda new anahtar sözcüğüyle çağırılırlar.
    
     */
 /*
    public void listele(String klasor_yolu, String k){
        File klasor=new File(klasor_yolu);
        File[] dosyalar=klasor.listFiles();
        for (int i = 0; i < dosyalar.length; i++) {
            if (dosyalar[i].getName().startsWith(k)) {
                
            
            System.out.println((i+1)+"."+"dosya = " + dosyalar[i].getName());
            }
        }
    }
    public void olustur(String klasor_adi){
        Scanner klavye=new Scanner(System.in);
        System.out.println("dosya ismi :");
        String dosya_adi=klavye.next();
        File dosya=new File(klasor_adi+dosya_adi+".txt");
        try{
            dosya.createNewFile();
            System.out.println("Dosya oluşturma başarılı");
        }
        catch(Exception e){
            System.out.println("Dosya oluşturma hatalı");
        }
    }
        public static void main(String[]args){
           
            Korkut uy1=new Korkut();
             String yol="test/";
          
           
            Scanner klavye=new Scanner(System.in);
            System.out.println("Kaç tane dosya oluşturulsun?");
            int dosya_sayisi=klavye.nextInt();
            for (int i = 0; i <dosya_sayisi; i++) {
                 uy1.olustur(yol);
            }
           uy1.listele(yol,"a");
               uy1.listele(yol,"b");
                   uy1.listele(yol,"c");
        }
    }
     */
    //ODEV:bir dosyada bir sürü değerler bulunmakta,
    //amacımız, her satırdaki değerlerin toplamını ekranda göstermek(double)//
    //odev2:Bir txt dosyasında metinler mevcuttur,
    //Bu dosyada okuma yaparak karakter sayısı, kelime sayısı ve satır sayısını bulup gösteren bir java kodu.//
    /*
    public static void main(String[] args) {

        File dosya = new File("sayilarrr.txt");
        try {
            FileWriter yazici = new FileWriter(dosya, true);
            PrintWriter p = null;
            if (dosya.exists()) {
                dosya.createNewFile();
                System.out.println("Dosya oluşturuldu.");
                double sayi;
            p=new PrintWriter(new FileOutputStream(dosya,true));
            Random k=new Random();
                for (int i = 0; i < 10; i++) {
                    sayi=k.nextDouble();
                    p.println(sayi);
                    
                }
                p.close();
            }
        } catch (Exception e) {
            System.out.println("Dosya oluşturma hatalı.");
        }
       

    }
}
*/
    /*
    public static void main(String[] args)throws IOException {
        double s =0;
        double x =0;
        File dosya=new File("odev.txt");
        BufferedReader oku =new BufferedReader(new FileReader(dosya));
        String satir=oku.readLine();
        x = Double.parseDouble(satir);
        while(satir!=null)
        {
          s = s+x;
        }
        System.out.println(s);
    }
}
*//*
    public static void main(String[] args) throws IOException{
        
  String sayilar="C:\\Users\\Ilkay\\Documents\\NetBeansProjects\\korkut\\sayilarrr.txt" ; 
        File file=new File(sayilar);
        Scanner oku=null;
        try{
            oku=new Scanner(file);
            while(oku.hasNext()){
                double top=0.0;
                String s=oku.nextLine();
                String[] dizi=s.split(" ");
                for (int i = 0; i < 10; i++) {
                    double a=Double.parseDouble(dizi[i]);
                    top=top+a;
                }
                System.out.println(top);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }
    //kendi matematik ve string sınıfı oluşturacaksın. dört işlem üs alın asal sayı vb.
//OKULDA YAPILAN; çember sınıfı yaz iki veri alanı var, yarıçap nesne sayısı, kurucu metot, parmetresiz ve parametreli

  */
    public static void main(String[] args) {
        int sayi=0;
        for (int i = 0; i < 10; i++) {
            sayi++;
            if (i==5) {
               
            }
        }
        System.out.println(sayi);
    }
}