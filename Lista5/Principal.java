/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marcelo Costa
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int op, ano, qnt, a, b;
        String nome;
        char tipo;
        Pessoa p=null;
        Livro l=null;
        Emprestimo em=null;
        
        ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
        ArrayList<Livro> livro = new ArrayList<Livro>();
        ArrayList<Emprestimo> emprestimo = new ArrayList<Emprestimo>();
        do{
            System.out.println("");
            System.out.println("1-Criar uma pessoa"); 
            System.out.println("2-Visualizar todas as pessoas");
            System.out.println("3-Criar um livro");
            System.out.println("4-Visualizar todos os livros");
            System.out.println("5-Realizar um empréstimo");
            System.out.println("6-Visualizar todos os empréstimos");
            System.out.println("7-Realizar a devolução de um empréstimo");
            System.out.println("0-Sair");

            op=leia.nextInt();
            System.out.println("");
            switch(op){
                case 1:
                    System.out.println("");
                    System.out.println("Informe o nome: ");
                    nome= leia.next();
                    System.out.println("Informe o tipo: ");
                    tipo=leia.next().charAt(0);
                    p = new Pessoa(nome, tipo);
                    pessoa.add(p);
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("");
                    for (int i=0; i<pessoa.size();i++) {
                        System.out.println("Pessoa[" + i + "]:");
                        pessoa.get(i).printAll();
                    }
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.println("");
                    System.out.println("Informe o nome: ");
                    nome=leia.next();
                    System.out.println("Ano de lançamento: ");
                    ano = leia.nextInt();
                    System.out.println("Quantidade de exemplares: ");
                    qnt=leia.nextInt();
                    l= new Livro(nome, ano, qnt);
                    livro.add(l);
                    System.out.println("");
                    break;    
                
                case 4:
                    System.out.println("");
                    for (int i=0; i<livro.size();i++) {
                        System.out.println("Livro[" + i + "]:");
                        livro.get(i).printAll();
                    }
                    System.out.println("");
                    break;
                
                case 5:
                    System.out.println("");
                    System.out.println("Use a posição da lista em numeros");
                    System.out.println("Informe a pessoa: ");
                    a=leia.nextInt();
                    if(pessoa.get(a).podeEmprestar()){
                    System.out.println("Informe o livro: ");
                    b=leia.nextInt();
                    if(livro.get(b).podeSerEmprestado()){
                    em= new Emprestimo(pessoa.get(a), livro.get(b));
                    emprestimo.add(em);
                    pessoa.get(a).emprestar();
                    livro.get(b).emprestar();
                    }
                    else{
                        System.out.println("Não possui mais exemplares do livro");
                    }
                    }
                    else{
                        System.out.println("Pessoa não pode fazer emprestimo");
                    }
                    System.out.println("");
                    break;
                
                case 6:
                    System.out.println("");
                    for (int i=0; i<emprestimo.size();i++) {
                        System.out.println("");
                        emprestimo.get(i).printAll();
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                
                case 7:
                    System.out.println("");
                    System.out.println("Use a posição da lista em numeros");
                    System.out.println("Informe a pessoa: ");
                    a=leia.nextInt();
                    System.out.println("Informe o livro: ");
                    b=leia.nextInt();
                    pessoa.get(a).devolver();
                    livro.get(b).devolver();
                    System.out.println("");
                    break;
                
                case 0:
                    System.out.println("");
                    System.out.println("Encerrando...");
                    break;
                
                default:
                    System.out.println("");
                    System.out.println("Opção invalida");
                    System.out.println("");
            }
        }while(op!=0);
        
       


    }

}
