/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class MaiorMenorMedia {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int x, y, z,aux ;
        double media;
        System.out.println("Informe o primeiro número:");
        x= leia.nextInt();
        
        System.out.println("Informe o segundo número:");
        y = leia.nextInt();
        
        System.out.println("Informe o terceiro número:");
        z = leia.nextInt();
        
        if(x>y){
            aux = x;
            x = y ;
            y = aux ;
        }
        if(x>z){
            aux = x;
            x = z;
            z = aux;
        }
        if(y>z){
            aux = y;
            y = z;
            z = aux;
        }
        media = (double)(x + z)/2;
        
        System.out.printf("O menor numero é %d\nO maior número é %d\nA média é %.1f\n",x ,z ,media);
    }
}
