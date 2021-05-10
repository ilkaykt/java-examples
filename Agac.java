/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agac;
class Dugum{
    int icerik;
    int not;
    String ad;
    Dugum sol,sag;
    public Dugum(int icerik,int not,String ad){
        this.icerik=icerik;
        this.not=not;
        this.ad=ad;
        sol=null; sag=null;
    }
}
public class Agac {
    Dugum kok;
    Agac(){
        kok=null;
    }
    void Ekle(Dugum yeni){
        Dugum once=null;
        Dugum tmp=kok;
        while(tmp!=null){
            once=tmp;
            if (yeni.icerik<tmp.icerik) {
                tmp=tmp.sol;               
            }
            else tmp=tmp.sag;
        }
    if (once==null) {
   kok=yeni;}
   else{
           if (yeni.icerik<once.icerik) {
   once.sol=yeni;
}
           else once.sag=yeni;
}
}
    int min(Dugum kok){
        int miny=kok.icerik;
        while(kok.sol!=null){
            miny=kok.sol.icerik;
            kok=kok.sol;
        }
         return miny;
    }
   int max(Dugum kok){
       int maxy=kok.icerik;
       while(kok.sag!=null){
           maxy=kok.sag.icerik;
           kok=kok.sag;
       }
       return maxy;
   }
   Dugum ara(int eleman){
       Dugum tmp=kok;
       while(tmp!=null){
           if (tmp.icerik==eleman) {
               return tmp;
           }
           else{
               if (tmp.icerik>eleman) {
                   tmp=tmp.sol;
               }
               else tmp=tmp.sag;
           }
       }
       
       return null;
   }   
   void goster(Dugum g){
       
       if (g!=null) {
           goster(g.sol);
           System.out.println(g.icerik+" "+g.not+" "+g.ad);
           goster(g.sag);
       }
   }
   void sil(int icerik){
       kok=silonce(kok,icerik);
   }
   Dugum silonce(Dugum kok,int icerik){
       if (kok==null) {
           return kok;
       }
       if (icerik<kok.icerik){
           kok.sol = silonce(kok.sol, icerik); 
       }
        else if (icerik > kok.icerik) {
            kok.sag = silonce(kok.sag, icerik); 
        }
        else{
            if (kok.sol == null) 
                return kok.sag; 
            else if (kok.sag == null) 
                return kok.sol;
            kok.icerik=min(kok.sag);
            kok.sag = silonce(kok.sag, kok.icerik);
        }
       return kok;
   }
   void postorder(Dugum t){
       if (t==null) {
           return;
       }
       postorder(t.sol);
       postorder(t.sag);
       System.out.print(t.icerik+" ");
       
   }
   void inorder(Dugum t){
       if (t==null) {
           return;
       }
       inorder(t.sol);
       System.out.print(t.icerik+" ");
       inorder(t.sag);
   }
   void preorder(Dugum t){
       if (t==null) {
           return;
       }
       System.out.print(t.icerik+" ");
       preorder(t.sol);
       preorder(t.sag);
   }
   void levelorder(){
       
       kuyruk k=new kuyruk();
       Dugum s=new Dugum(s.icerik,s.not,s.ad);
       Eleman p=new Eleman(s.icerik);
       
       k.Ekle(p);
       while(!k.bosmu()){
            s = k.sil(); 
            System.out.print(s.+ " ");s
             if (s.sol != null) { 
                k.Ekle(s.sol); }
              if (s.sag != null) { 
                kuyruk.Ekle(s.sag); 
            } 
       }
   }
    public static void main(String[] args) {
        Agac k=new Agac();
        Dugum a1=new Dugum(5,66,"a");
        Dugum a2=new Dugum(6,40,"b");
        Dugum a3=new Dugum(3,90,"c");
        Dugum a4=new Dugum(2,10,"d");
        Dugum a5=new Dugum(7,21,"e");
        k.Ekle(a1); k.Ekle(a2); k.Ekle(a3); k.Ekle(a4); k.Ekle(a5);
        k.goster(k.kok);
        System.out.println("En kucuk:");
        System.out.println(k.min(k.kok));
        System.out.println("En buyuk:");
        System.out.println(k.max(k.kok));
        k.sil(2);
        System.out.println("Silindikten sonra:");
        k.goster(k.kok);
        k.Ekle(a4);
        System.out.println("Preorder:");
        k.preorder(k.kok);
        System.out.println();
        System.out.println("Inorder:");
        k.inorder(k.kok);
        System.out.println();
        System.out.println("Postorder:");
        k.postorder(k.kok);
        System.out.println();
    }
}
