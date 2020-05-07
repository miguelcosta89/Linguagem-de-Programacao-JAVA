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
public class Produtos {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
       
        int codigo, quantidade;
        double total;
        System.out.println("Informe o codigo do produto:");
        codigo = leia.nextInt();
        System.out.println("Informe a quantidade: ");
        quantidade = leia.nextInt();
        switch(codigo){
            case 1:
                total = (double) quantidade * 5;
                System.out.printf("O valor da compra é: R$ %.2f\n", total);
                break;
            case 2 :
                total = (double) quantidade * 3;
                System.out.printf("O valor da compra é: R$ %.2f\n", total);
                break;
            case 3 :
                total = (double) quantidade * 8;
                System.out.printf("O valor da compra é: R$ %.2f\n", total);
                break;
            default:
                System.out.println("Produto inexistente");
        }
    }
}
