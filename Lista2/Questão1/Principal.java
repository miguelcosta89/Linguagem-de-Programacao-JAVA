/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

import java.util.Scanner;

/**
 *
 * @author Marcelo Costa
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        boolean menu = true;
        
        System.out.println("Informe seu nome: ");
        p1.nome=leia.next();
       
        System.out.println("Informe CPF: ");
        p1.cpf=leia.next();
        
        System.out.println("Informe idade: ");
        p1.idade=leia.nextByte();
        
        System.out.println("Informe altura: ");
        p1.altura=leia.nextFloat();
        
        System.out.println("Informe peso: ");
        p1.peso=leia.nextFloat();
        
        System.out.println("Informe profissao: ");
        p1.profissao=leia.next();
        
        while(menu){
            System.out.println("");
            System.out.println("1-Mostrar Informações.");
            System.out.println("2-Fazer Aniversario.");
            System.out.println("3-Fazer Atividade Fisica.");
            System.out.println("4-Comer.");
            System.out.println("5-Mudar profissão");
            System.out.println("6-Sair");
            byte opcao;
             int quant;
            opcao=leia.nextByte();
            switch(opcao){
                case 1:
                    p1.mostrarTudo();
                    break;
                
                case 2:
                    p1.fazerAniversario();
                    break;
                
                case 3:
                    System.out.println("Informe a quantidade de atividade fisica: ");
                    quant=leia.nextInt();
                    p1.fazerAtividadeFisica(quant);
                    break;
                
                case 4:
                    System.out.println("Informe a quantidade: ");
                    quant=leia.nextInt();
                    p1.comer(quant);
                    break;
                
                case 5:
                    System.out.println("Informe nova profissao :");
                    p1.mudaProfissao(leia.next());
                    break;
                case 6:
                    menu=false;
                    break;
                default:
                    System.out.println("Numero não existe no menu");
            }
        }
    }
}
