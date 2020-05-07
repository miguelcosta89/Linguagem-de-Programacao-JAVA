/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

import java.util.Scanner;

/**
 *
 * @author Marcelo Costa
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome,cpf,agen,num;
        Pessoa corrente;
        double valor;
        int idade,op;
        boolean veri;
        
        System.out.println("Informe nome, idade e cpf da primeira pessoa: ");
        nome=leia.next();
        idade=leia.nextInt();
        cpf=leia.next();
        Pessoa pessoa1=new Pessoa(nome,idade,cpf);
        
        System.out.println("Informe a agencia e numero da primeira pessoa: ");
        corrente=pessoa1;
        agen=leia.next();
        num=leia.next();
        ContaCorrente conta1=new ContaCorrente(corrente,0,agen,num);
        
        
        System.out.println("Informe nome, idade e cpf da segunda pessoa: ");
        nome=leia.next();
        idade=leia.nextInt();
        cpf=leia.next();
        Pessoa pessoa2=new Pessoa(nome,idade,cpf);
        
        System.out.println("Informe a agencia e numero da segunda pessoa: ");
        corrente=pessoa2;
        agen=leia.next();
        num=leia.next();
        ContaCorrente conta2=new ContaCorrente(corrente,0,agen,num);
        
        do{
            System.out.println("");
            System.out.println("1-Depositar na conta 1");
            System.out.println("2-Sacar da conta 1");
            System.out.println("3-Transferir da conta 1 para conta 2");
            System.out.println("4-Ver todos os dados da conta 1");
            System.out.println("5-Depositar na conta 2");
            System.out.println("6-Sacar da conta 2");
            System.out.println("7-Transferir da conta 2 para conta 1");
            System.out.println("8-Ver todos os dados da conta 2");
            System.out.println("9-Sair");
            op=leia.nextInt();
            System.out.println("");
            
            switch(op){
                case 1:
                    System.out.println("Informe o valor de deposito: ");
                    valor=leia.nextDouble();
                    conta1.deposito(valor);
                    break;
                    
                case 2:
                    System.out.println("Informe o valor de saque: ");
                    valor=leia.nextDouble();
                    veri=conta1.saque(valor);
                    if(veri==true){
                        System.out.println("Retire seu dinheiro");
                    }
                    else{
                        System.out.println("Saldo Insuficiente");
                    }
                    break;
                    
                case 3:
                    System.out.println("Informe o valor a ser transferido: ");
                    valor=leia.nextDouble();
                    veri=conta1.transferencia(valor, conta2);
                    if(veri==true){
                        System.out.println("Valor transferido");
                    }
                    else{
                        System.out.println("Saldo Insuficiente");
                    }
                    break;
                    
                case 4:
                    pessoa1.printAll();
                    conta1.printAll();
                    break;
                    
                case 5:
                    System.out.println("Informe o valor de deposito: ");
                    valor=leia.nextDouble();
                    conta2.deposito(valor);
                    break;
                    
                case 6:
                    System.out.println("Informe o valor de saque: ");
                    valor=leia.nextDouble();
                    veri=conta2.saque(valor);
                    if(veri==true){
                        System.out.println("Retire seu dinheiro");
                    }
                    else{
                        System.out.println("Saldo Insuficiente");
                    }
                    break;
                    
                case 7:
                    System.out.println("Informe o valor a ser transferido: ");
                    valor=leia.nextDouble();
                    veri=conta2.transferencia(valor, conta1);
                    if(veri==true){
                        System.out.println("Valor transferido");
                    }
                    else{
                        System.out.println("Saldo Insuficiente");
                    }
                    break;
                    
                case 8:
                    pessoa2.printAll();;
                    conta2.printAll();
                    break;
                    
                case 9:
                    System.out.println("Saindo");
                    break;
                
                default:
                    System.out.println("Opção Invalida");
            }

            
        }while(op!=9);
    }
}
