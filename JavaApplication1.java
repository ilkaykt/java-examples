 import java.util.Scanner;

class apples{
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
        Scanner bucky = new Scanner (System.in);
        double fnum, snum, answer;
        System.out.println("Cıkartma islemi sonucu 10 olsun. ");
        System.out.println("Ilk Sayiyi gir: ");
        fnum = bucky.nextDouble();
        System.out.println("Ikınci sayiyi gir: ");
        snum = bucky.nextDouble();
        answer = fnum - snum;
        System.out.println(answer);{
        
          if (answer == 10) {
              System.out.println("Dogru. ");
            } else {
              System.out.println("Yanlis. ");
        }
    }
    }
    
}