
package javaapplication12;
class araba{
    int uretim;
    String model;
    int km;

 araba(){
    System.out.println("Arabanın özellikleri olusturuldu");
}
 araba(int uretim, String model, int km){
    this.km=km;
    this.model=model;
    this.uretim=uretim;
           
}
void goster(){
    System.out.println(model+km+uretim);
}
}
public class JavaApplication12 {

    public static void main(String[] args) {
        araba iki=new araba(1998,"kamyon",0);
  araba bir=new araba();
  bir.model="sedan";
  bir.uretim=1990;
  bir.goster();
  iki.goster();
    }
    
}
