package hafta5;
class Cember {

    double yaricap;
    static int say = 0;

    Cember() {
        yaricap = 1;
        say++;
    }

    Cember(double yc) {
        yaricap = yc;
        say++;
    }

    double Cevre() {
        return 2 * Math.PI * yaricap;
    }

    double alan() {
        return Math.PI * yaricap * yaricap;
    }

    static int nesnesay() {
        return say;
    }

}

public class Hafta5 {
   

    public static void main(String[] args) {
        
        Cember cemberim = new Cember();
        Cember cember2 = new Cember(5.0);
        System.out.println(cemberim.yaricap);
        System.out.println(cemberim.Cevre());
        System.out.println(cemberim.alan());
        System.out.println(cember2.yaricap);
        System.out.println(cember2.Cevre());
        System.out.println(cember2.alan());
       
               

    }
}
