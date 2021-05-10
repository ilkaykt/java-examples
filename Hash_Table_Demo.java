/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;


import java.util.*; 
  
public class Hash_Table_Demo { 
Object hash[]=new Object[6];
boolean empty;
int numara=6; int numara1=7; int numara2=11; int numara3=9; int numara4=8;
String Sirket="sirket"; String Sirket1="sirket1"; String Sirket2="sirket2"; String Sirket3="sirket3"; String Sirket4="sirket4"; 

     
void Ekle(int A){
    
    int a=A%5;
    for (int i = 0; i < hash.length; i++) {
        if (hash[a]==null) {
            hash[a]=A;
            break;
        }
        else{
            for (int j = a; j < hash.length; j++) {
                if (hash[j]==null) {
                    hash[j]=A;
                    break;
                }
            }
        }
        break;
    }
  
        
    
    
    
    
    }

void Arama(int S){
    
   for (int i = 0; i < hash.length; i++) {
        if (hash[i]==S) {
            System.out.println("Verdiğiniz numara hash tablosunda"+i+"nci yerdedir.");
        }
        else System.out.println("Verdiğiniz numara hash tablosunda yoktur");
    }
}
void sil(int K){
    hash[K]=0;
}
void goster(){
    for (int i = 0; i < hash.length; i++) {
        System.out.println(hash[i]);
    }
}
    public static void main(String[] args) 
    {	
	Hash_Table_Demo k=new Hash_Table_Demo();
        k.Ekle(k.numara);
        k.Ekle(k.numara1);
        k.Ekle(k.numara2);
        k.Ekle(k.numara3);
        k.Ekle(k.numara4);
        k.goster();
        
	} 
}

  
     
    