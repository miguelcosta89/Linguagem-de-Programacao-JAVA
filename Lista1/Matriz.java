/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fevereiro06;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Matriz {
    public static int [][] criamatriz(int a, int b) {
        int matriz [][]= new int [a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matriz [i][j]= (int) (Math.random()*20);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        return matriz;
        
    }
    public static int calculolinha(int a, int b, int matriz[][], int n) {
            int soma=0;
            for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(i==n){
                    soma += matriz [i][j];
                }
            }
        }
        return soma;
        
    }
     public static int calculocoluna(int a, int b, int matriz[][], int n) {
            int soma=0;
            for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(j==n){
                    soma += matriz [i][j];
                }
            }
        }
        return soma;
        
    }
     public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int a, b,soma;
        int matriz [][];
         System.out.println("Informe o tamanho da matriz: ");
         a = leia.nextInt();
         b = leia.nextInt();
         
         matriz = criamatriz(a,b);
         System.out.println("");
         for (int i = 0; i < a; i++) {
             soma = calculolinha(a,b, matriz, i);
             System.out.printf("A soma na linha %d é: %d\n",i+1 , soma);
         }
         System.out.println("");
         for (int i = 0; i < b; i++) {
             soma = calculocoluna(a,b, matriz, i);
             System.out.printf("A soma na coluna %d é: %d\n",i+1,soma );
         }
        
    }
}
