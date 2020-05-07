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
public class Prova {
    public static double [] geravetor(){
        double vetor [] = new double [10];
        for (int i = 0; i < 10; i++) {
            vetor[i]= (Math.random()*4000)+1000;
        }
        return vetor;
    }
    
    public static double mediavetor(double[] vetor){
        double cont=0;
        for (int i = 0; i < vetor.length; i++) {
            cont += vetor[i];
        }
        cont=cont/10;
        return cont;
    }
    
    public static double metademedia(double[] vetor){
        double metade;
        metade=mediavetor(vetor);
        metade=metade/2;
        return metade;
    }
    
    public static double[] valoraumentado(double[] vetor, double numero){
        double corrigido []= new double [vetor.length];
        for (int i = 0; i < vetor.length; i++) {
           corrigido[i]= vetor[i]+numero; 
        }
        
        return corrigido;
    }
    
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int opcao= 0;
        double vetor[] = null;
        double aumento = 0;
        double subvetor[];
        
        while(opcao!=4){
            System.out.println("1) Salário atual");
            System.out.println("2) Valor do aumento");
            System.out.println("3) Salário corrigido");
            System.out.println("4) Sair");
            opcao=leia.nextInt();
            
            switch(opcao){
                case 1 :
                    vetor=geravetor();
                    System.out.println("Funcionario      Salario atual");
                    for (int i = 0; i < 10; i++) {
                     System.out.printf("Pessoa%d          R$%6.2f\n",i,vetor[i]);    
                    }
                    break;
                case 2 :
                    aumento = metademedia(vetor);
                    System.out.printf("O valor do aumento é R$%.2f\n", aumento);
                    break;
                case 3 :
                     subvetor= valoraumentado(vetor, aumento);
                    System.out.println("Funcionario      Salario atual       Salario Corrigido");
                    for (int i = 0; i < subvetor.length; i++) {
                        System.out.printf("Pessoa%d          R$%.2f           R$%.2f\n",i,vetor[i], subvetor[i]); 
                    }
 
                    break;
                case 4 :
                    System.out.println("Encerrando....");
                    break;
                default:
                    System.out.println("Opção não existe");  
            }
        }
        
    }
}
