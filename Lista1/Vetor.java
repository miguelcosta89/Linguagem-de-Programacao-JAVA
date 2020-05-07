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
public class Vetor {
    public static void main(String[] args) {
        int tama, maior, quant = 0, j=0;
        Scanner leia = new Scanner (System.in);
        tama = leia.nextInt();
        int vetor[] = new int[tama];
        
        for (int i = 0; i < tama; i++) {
            vetor[i]= (int) (Math.random()*20);
        }
        maior=vetor[0];
        for (int i = 0; i < tama; i++) {
            if(vetor[i]>maior){
                maior=vetor[i];
            }
        }
        for (int i = 0; i < tama; i++) {
            if(vetor[i]==maior){
                quant+=1;
            }
        }
        
        int vetorme[]= new int [quant];
        
        for (int i = 0; i < tama; i++) {
            if(vetor[i]==maior){
               vetorme[j]=i;
               j++;
            }
        }
        System.out.println("Maior: "+ maior);
        System.out.println("Quantidade de vezes que aparece: " + quant);
        System.out.print("Posições no vetor: ");
        for (int i = 0; i < quant; i++) {
            System.out.print(vetorme[i]+" ");
        }
        System.out.println("");
        
    }
}
