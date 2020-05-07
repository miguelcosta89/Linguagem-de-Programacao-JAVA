/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Março06;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        Fila.FILA inicio = null;
        Fila.FILA fim = null;
        int senha,op;
        String nome;
        
        do{
            System.out.println("1 - Inserir Senha.");
            System.out.println("2 - Exibir todas as senhas na fila;");
            System.out.println("3 - Consultar se uma senha está na fila de senhas;");
            System.out.println("4 - Consultar se uma pessoa está na fila de senhas;");
            System.out.println("5 - Registrar atendimento");
            System.out.println("6 - Cancelar todas as senhas");
            System.out.println("7 - Sair");
            op=leia.nextInt();
            if(op==1){
                System.out.println("Informe nome e senha: ");
                nome = leia.next();
                senha=leia.nextInt();
                Fila.inserirFila(inicio,fim,nome,senha);
            }
            if(op==2){
                Fila.printAll(inicio);
            }
            if(op==3){
                System.out.println("Informe a senha:");
                senha = leia.nextInt();
                Fila.consultarSenha(inicio, senha);
            }
            if(op==4){
                System.out.println("Informe o Nome: ");
                nome = leia.next();
                Fila.consultarNome(inicio, nome);
            }
            if(op==5){
                Fila.excluirUsuario(inicio);
            }
            if(op==6){
                Fila.excluirTudo(inicio);
            }
            if(op==7){
                System.out.println("Saindo");
            }
            if(op<1 || op>7){
                System.out.println("Opção invalida");
            }
            
        }while(op!=7);
    }
}
