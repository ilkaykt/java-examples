/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agac;
class Eleman{
    int icerik;
    Eleman ileri;
    public Eleman(int icerik){
        this.icerik=icerik;
        this.ileri=null;
    }
}
public class kuyruk {
    Eleman bas,son;
    public kuyruk(){
        
        bas=null;
        son=null;
        
    }
    boolean bosmu(){
        return bas==null;
    }
    void Ekle(Eleman yeni){
        if (!bosmu()) {
            son.ileri=yeni;
        }
        else {bas=yeni;}
        son=yeni;
    }
    Eleman sil(){
        Eleman sonuc;
        sonuc=bas;
        if(!bosmu()){            
            bas=bas.ileri;
            if(bas==null)
                son=null;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        kuyruk k=new kuyruk();
        Eleman p=new Eleman(5);
       
        
        
    }
}
