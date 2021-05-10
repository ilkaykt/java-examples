
package liste;

public class listele {
    public int eb;
    public int gecicid;
    polinom ilk=null; polinom son=null;
    public void ekle(int derece, int katsayi){
        polinom p=new polinom(derece,katsayi);
        if (ilk==null) {
            ilk=p;
            son=p;
        }
        else{
            son.sonraki=p;
            son=p;
        }
            
    }
    public void goster(){
    polinom gecici=ilk;
    while(gecici!=null){
        
        System.out.print(gecici.katsayi+"x"+gecici.derece+"+");
        gecici=gecici.sonraki;
    }
}
    public void basaekle(polinom yeni){
    
            
    if(gecicid>eb){
        if (son == null) {
            ilk = yeni;
            son = yeni;
        } else {
            yeni.ileri = ilk;
            ilk = yeni;
        }
    }
    }
}

class polinom{
    int derece;
    int katsayi;    
    polinom sonraki;
    polinom ileri;
    polinom yeni;
    polinom(int derece, int katsayi){
        this.derece=derece;
        this.katsayi=katsayi;
        this.sonraki=null;
        this.ileri=null;
        this.yeni=null;
    }
}
