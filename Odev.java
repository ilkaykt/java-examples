/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev;
class Bul{   
    int sayi=0;
   public int x=0;
           int[] Bul(int say){
               sayi=say;
               for (int i = 1; i <=sayi; i++) {
                   if (sayi%i==0) {
                       x++;
                   }
               }
               int dizi[]=new int[x];
               int sayac=0;
               for (int i =1 ; i <= sayi; i++) {
                   if (sayi%i==0) {
                       dizi[sayac]=i;
                       sayac++;
                   }
                      
                   }
               return dizi;
               }     
            }
public class Odev { 
    public static void main(String[] args) {
      Bul k=new Bul();
        int x[]=k.Bul(57);
        for (int i = 0; i < k.x; i++) {
            System.out.println(x[i]);
        }
    }
}
