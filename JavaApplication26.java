/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

public class JavaApplication26 {

    public static void main(String[] args) {
        int yildiz=1;
        int bosluk=7;
        
            
        
        for (int i = 0; i <yildiz ; i++) {
           
            System.out.print("*");
            
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");               
                if (j==bosluk-1) {
                    for (int k = 0; k < yildiz; k++) {
                        System.out.print("*");
                    }
                    
                }
                
            }
            System.out.println();
            yildiz++;
                bosluk--;
                if (yildiz==5) {
                break;
            }
        }
    }
    
}
