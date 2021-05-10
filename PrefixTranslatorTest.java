/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınfixtopre;

import java.util.Scanner;

public class PrefixTranslatorTest{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the expression that you want to convert to prefix.");
        String expression = input.next();
        Infixtopre translator = new Infixtopre(expression);
        System.out.println(translator.translate());


    }

}