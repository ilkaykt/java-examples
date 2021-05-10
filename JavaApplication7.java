/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
class saat{
    int dakika;
    int saat;
    int akrep;
    int yelkovan;

saat(int saat,int dakika){
    this.saat=saat;
    this.dakika=dakika;
}
void aciyibul(){
    akrep=saat*(360/12);
    yelkovan=dakika*(360/60);
    
}
void aciyiyazdir(){
    System.out.println(Math.abs(akrep-yelkovan));
}


}
public class JavaApplication7 {
      public static void main(String[] args) {
        saat kac=new saat(9,15);
        kac.aciyibul();
        kac.aciyiyazdir();
      
    }
        
    }
    
