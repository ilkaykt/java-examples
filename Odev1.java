package odev1;

public class Odev1{
}
class Cember{
    double r;
static int nesnesayisi=0;
Cember(){
    r=1.0;
    nesnesayisi++;
    
}
Cember(double nr){
    r=nr;
}
static int nesnesayisidondur(){
    return nesnesayisi;
}
double alan(){
    return Math.PI*r;
}
}
class test{
    public static void main(String[] args) {
        Cember C1=new Cember();
        System.out.println("Yaricap = " + C1.r+"Nesne sayisi"+C1.nesnesayisi+"Alan"+C1.alan());
        Cember C2=new Cember(2.3);
        System.out.println("Yaricap = " + C2.r+"Nesne sayisi"+C2.nesnesayisi+"Alan"+C2.alan());
    }
}
