
package ornekk;

import java.util.Random;




public class ornekk{
   public static int i,j;
   public static int dizi[];
   public static int eb1=0;
    public static int eb2=0;
    public static void main(String[] args) {
        int a;
        int b;
        Random k=new Random();       
      dizi = new int[100];
        for (int l = 0; l < dizi.length; l++) {
            dizi[l]=k.nextInt(100);
            System.out.println(dizi[l]);
        }
       Thread t1= new Thread(){
           
            public void run(){
                for ( i = 0; i < 50; i++) {   
                    System.out.println("++");
                    if (dizi[i]>eb1) {
                       eb1=dizi[i];                          
                    }
                }
                if (eb1>eb2) {
                    System.out.println("EN BUYUK"+eb1);
                }
                else System.out.println("EN BUYUK2"+eb2);
        }
        };
        Thread t2=new Thread(){
           
                    
            public void run(){
                
                for ( j = 50; j < 100; j++) {
                    System.out.println("--");
                    if (dizi[j]>eb2) {
                       eb2=dizi[j];
                    }
                }
            }
            
        };
        t1.start();
        t2.start();
        
                }
}
        

