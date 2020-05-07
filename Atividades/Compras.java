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
public class Compras {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int idade, i=1, compras50=0, pessoas=0;
        double salario, compras, comsala=0, media=0;
        
        while(i>0){
            System.out.println("Informe idade:");
            idade= leia.nextInt();
            if(idade<0){
                break;
            }
            System.out.println("Informe salario:");
            salario=leia.nextDouble();
            System.out.println("Informe o valor da compra:");
            compras = leia.nextDouble();
            
            if(idade>50){
                compras50++;
            }
            if(salario>5000){
                comsala=comsala+compras;
            }
            media= media +compras;
            pessoas++;
        }
        media = (double) media / pessoas;
        System.out.printf("Quantidade de compras para pessoas maiores que 50 anos: %d\n",compras50);
        System.out.printf("Vendas para pessoas com salário maior que R$ 5000,00: R$ %.2f\n", comsala);
        System.out.printf("Média das compra: R$ %.2f", media);
    }
}
