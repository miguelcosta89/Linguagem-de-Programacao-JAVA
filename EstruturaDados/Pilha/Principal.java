/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fevereiro28;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        Alunos.ALUNO topo=null;
        int op, codigo;
        double nota;
        Scanner leia = new Scanner (System.in);
        
        do{
            System.out.println("-- MENU --");
            System.out.println("");
            System.out.println("1-Cadastrar Aluno");
            System.out.println("2-Cadastrar Nota");
            System.out.println("3-Calcular média");
            System.out.println("4-Mostrar Todos");
            System.out.println("5-Consultar Aluno Cadastrado");
            System.out.println("6- Excluir Aluno");
            System.out.println("7- Sair");
            op = leia.nextInt();
            
            if(op==1){
                System.out.println("Informe o codigo do aluno: ");
                topo = Alunos.inserirAluno(leia.nextInt(),topo);
            }
            if(op==2){
                System.out.println("Informe o codigo do aluno: ");
                codigo=leia.nextInt();
                System.out.println("Informe a nota do aluno: ");
                nota=leia.nextDouble();
                Alunos.inserirNota(codigo,topo,nota);
            }
            if(op==3){
                Alunos.mediaNota(topo);
            }
            if(op==4){
                Alunos.exibirAluno(topo);
            }
            if(op==5){
                System.out.println("Informe o codigo: ");
                Alunos.confCad(topo, leia.nextInt());
            }
            if(op==6){
                topo=Alunos.excluir(topo);
            }
            if(op==7){
                System.out.println("Saindo...");
            }
            if(op<1 || op>7){
                System.out.println("Opção Incorreta");
            }
            
            
        }while(op!=7);
    }
}
