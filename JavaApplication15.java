package javaapplication15;
interface Calisan {
    public void mesaiyebasla();
    public void calis();
    public void mesaiyibitir();
}
abstract class Yonetici implements Calisan {

    public void toplantı() {
        System.out.println("toplantı yapıldı.");
    }
}
class Mudur extends Yonetici {
    public void reis() {
        System.out.println("reis oldu.");
    }
    @Override
    public void mesaiyebasla() {
    }
    @Override
    public void calis() {
    }
    @Override
    public void mesaiyibitir() {
    }
}
class Sef extends Yonetici {
    public void imzaAt() {
        System.out.println("imza atıldı.");
    }
    @Override
    public void mesaiyebasla() {
    }
    @Override
    public void calis() {
    }
    @Override
    public void mesaiyibitir() {
    }
}
abstract class Programci implements Calisan {
    public void programyaz() {
        System.out.println("program yazıldı.");
    }
}
class JavaProgramcı extends Programci {
    public void kahvele() {
        System.out.println("kahvelendin.");
    }
    @Override
    public void mesaiyebasla() {
    }
    @Override
    public void calis() {
    }
    @Override
    public void mesaiyibitir() {
    }
}
public class JavaApplication15 {

    public static void main(String[] args) {

    
    }
}
