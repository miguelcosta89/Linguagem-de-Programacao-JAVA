/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Março06;

/**
 *
 * @author aluno
 */
public class Fila {
    static class FILA{
        String nome;
        int senha;
        FILA prox;
    }
    
    static void inserirFila(FILA inicio, FILA fim, String nome, int senha){
        
        System.out.println(inicio);
        System.out.println(fim);
        System.out.println(nome);
        System.out.println(senha);
        
        FILA novo = new FILA();
        novo.nome = nome;
        novo.senha=senha;
        novo.prox=null;
        if(inicio==null){ 
            inicio = novo;
            fim = novo;
        }
        else{
            fim.prox = novo;     
            fim = novo;            
        }
        
        System.out.println("Usuario inserido");
        System.out.println(novo);
    }
    
    static void printAll(FILA inicio){
        FILA aux = inicio;
        while(aux!=null){
            System.out.println("Senha: "+ aux.senha);
             aux=aux.prox;
        }
    }
    
    static void consultarSenha(FILA inicio, int senha){
        FILA aux = inicio;
        if(aux!=null){
        while(aux!=null && aux.senha != senha){
            aux = aux.prox;
        }
        if(aux.senha==senha){
            System.out.println("Senha encontrada");
        }
        else{
           System.out.println("Senha não encontrada");
        }
        }
        else{
            System.out.println("Senha não encontrada");
        }
    }
    
    static void consultarNome(FILA inicio, String nome){
        FILA aux = inicio;
        if(aux!=null){
        while(aux!=null && aux.nome != nome){
            aux = aux.prox;
        }
        if(aux.nome==nome){
            System.out.println("Nome encontrado");
        }
        else{
           System.out.println("Nome não encontrada");
        }
        }
        else{
            System.out.println("Nome não encontrada");
        }
    }
    
    static void excluirUsuario(FILA inicio){
        inicio = inicio.prox;
        System.out.println("Usuario removido");
    }
    
    static void excluirTudo(FILA inicio){
        inicio = null;
        System.out.println("Todas as senhas canceladas");
    }
}
