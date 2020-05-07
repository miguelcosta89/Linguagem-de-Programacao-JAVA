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
public class Alunos {
    public static void main(String[] args) {
        double matriz [][] = new double[5][5];
        Scanner leia = new Scanner (System.in);
        String nome[] = new String [5];
        
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe o nome do aluno");
                nome[j]=leia.nextLine();
            }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if(j==0){
                    System.out.println("N1");
                matriz [i][j] = leia.nextDouble();
                }
                if(j==1){
                    System.out.println("N2");
                matriz [i][j] = leia.nextDouble();
                }
                
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 2; j < 4; j++) {
                if(j==2){
                    matriz[i][j]=(matriz [i][0]+matriz[i][1])/2;
                }
                if(j==3 && matriz[i][2]>=6){
                    matriz[i][3]=1;
                }
                else{
                    matriz[i][3]=0;
                }
            }
        }
        System.out.println("Aluno | N1 | N2 | Média | Condição |");
        for (int i = 0; i < 5; i++) {
            System.out.print(nome[i]+"| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"| ");  
            }
            if(matriz[i][3]!= 0){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
        }
    }
}
