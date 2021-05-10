/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

class Eleman{
    
    int icerik;
    Eleman ileri;
    
    Eleman(int icerik){
        this.icerik=icerik;
        this.ileri=null;
    }
    

}
public class JavaApplication35 {

    Eleman bas;
    Eleman son;
    public JavaApplication35(){
    bas=null;
    son=null;
}
    void bsekle(Eleman yeni){
        if (son==null) {
            bas=yeni;
            son=yeni;
        }
        else{
            yeni.ileri=bas;
            bas=yeni;
        }
    }
    void sonaekle(Eleman yeni){
        if (bas==null) {
            bas=yeni;
            son=yeni;
        }
        else{
            son.ileri=yeni;
            son=yeni;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
