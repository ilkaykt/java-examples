/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uygulama1;


public class Uygulama1 {
int a; int b;
Uygulama1(){
    int a=10;
    int b=20;
}

Uygulama1(int a,int b){
    this.a=a;
    this.b=b;
    
}

void goster(Uygulama1 ab){
    System.out.println(a+" "+b);
}
void get(){
    goster(this);
}
    public static void main(String[] args) {
 Uygulama1 nesne=new Uygulama1();
 Uygulama1 nesne2=new Uygulama1(5,2);
 nesne.goster(nesne);
 nesne2.get();
    }
    
}
