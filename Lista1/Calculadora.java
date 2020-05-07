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
public class Calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double v1,v2,result;
        int opcao;
        boolean sair = false;
        
        do{
            System.out.println("Informe o primeiro valor: ");
            v1 = leia.nextDouble();
            System.out.println("Informe o segundo valor: ");
            v2 = leia.nextDouble();
            
            System.out.print("Opção 1: Soma\nOpção 2: Subtração\nOpção 3: Multiplicação\nOpção 4: Divisão\n");
            opcao = leia.nextInt();
            switch(opcao){
                case 1:
                    result= v1+v2;
                    System.out.printf("%f + %f = ", v1,v2); 
                    System.out.print(result);
                    break;
                    
                case 2:
                    result = v1-v2;
                    System.out.printf("%f - %f = ", v1,v2);
                    System.out.print(result+"\n");
                    break;
                    
                case 3:
                    result = v1*v2;
                    System.out.printf("%f * %f = ", v1,v2);
                    System.out.print(result+"\n");
                    break;
                    
                case 4:
                    result = v1/v2;
                    System.out.printf("%f / %f = ", v1,v2);
                    System.out.print(result+"\n");
                    break;
                    
                default:
                    System.out.println("Você não escolheu nenhuma opção do menu.");
            }
            System.out.println("Deseja continuar? 0-não  1-sim");
            sair=leia.nextInt()==0;
            if(opcao==0){
                sair=true;
            }

            
        }while(sair == false); 
    }
}
