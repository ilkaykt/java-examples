
package liste;

import java.util.Scanner;

public class demo {

        public static void main(String[] args) {
            Scanner klavye=new Scanner(System.in);
            listele elemanlar=new listele();
           
int secim=-1;
do{
    System.out.println("1-Polinom katsayi ve derece gir");
    System.out.println("2- Yazdir");
    secim=klavye.nextInt();
    switch(secim){
        case 1: System.out.println("Katsayi giriniz");
        int katsayi=klavye.nextInt();
            System.out.println("Derece giriniz");
            int derece=klavye.nextInt();
            elemanlar.gecicid=derece;
            elemanlar.eb=derece;
            elemanlar.ekle(derece, katsayi);
            elemanlar.basaekle(yeni);
            break;
       case 2: elemanlar.goster();
       break;
    }
}
while(secim!=0);{
            
        }
    }
    
}
