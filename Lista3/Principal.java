/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

import java.util.Scanner;

/**
 *
 * @author Marcelo Costa
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Carro carro= new Carro();
        boolean menu=true;
        byte opcao;
        System.out.println("Informe a marca: ");
        carro.marca=leia.next();
        
        System.out.println("Informe o modelo: ");
        carro.modelo=leia.next();
        
        System.out.println("Informe a cor: ");
        carro.cor=leia.next();
        
        System.out.println("Informe a placa: ");
        carro.placa=leia.next();
        
        while(menu){
            System.out.println("");
            System.out.println("1-Mostrar tudo");
            System.out.println("2-Pintar");
            System.out.println("3-Ligar");
            System.out.println("4-Desligar");
            System.out.println("5-Aumentar marcha");
            System.out.println("6-Diminuir marcha");
            System.out.println("7-Acelerar");
            System.out.println("8-Frear");
            System.out.println("9-Sair");
            opcao=leia.nextByte();
            switch(opcao){
                case 1:
                    carro.mostraTudo();
                break;
                    
                case 2:
                System.out.println("Informe a nova cor:");   
                carro.pintar(leia.next());
                break;
                
                case 3:
                    carro.ligar();
                break;
                
                case 4:
                    carro.desligar();
                break;
                
                case 5:
                    carro.aumentarMarcha();
                break;
                
                case 6:
                    carro.diminuirMarcha();
                break;
                
                case 7:
                    System.out.println("Informe Aceleração: ");
                    carro.acelerar(leia.nextInt());
                break;
                
                case 8:
                    System.out.println("Informe Desaceleração");
                    carro.frear(leia.nextInt());
                break;
                
                case 9:
                    menu=false;
                break;
                
                default:
                    System.out.println("Nenhuma opção escolhida");
                    
                    
            }
        }
    }
   
}
