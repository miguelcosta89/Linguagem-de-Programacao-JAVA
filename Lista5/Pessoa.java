/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5;

/**
 *
 * @author Marcelo Costa
 */
public class Pessoa {
    private String nome;
    private char tipo ;
    private int qtdeLivrosEmprestados;
    
    public Pessoa(String nome, char tipo){
        this.nome=nome;
        this.tipo=tipo;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return this.nome;
    
    }
    
    public boolean setTipo(char tipo){
        if(this.tipo=='A' || this.tipo=='P'){
            return false;
        }
        else{
            this.tipo=tipo;
            return true;
        }
    }
    
    public  char getTipo(){
        return this.tipo;  
    }
    
    public void setQtdeLivrosEmprestados(int qtdeLivrosEmprestados){
        this.qtdeLivrosEmprestados=qtdeLivrosEmprestados;
    }

    public int getQtdeLivrosEmprestados(){
        return this.qtdeLivrosEmprestados;
    }
    
    public boolean podeEmprestar(){
        if(this.tipo=='P' || this.tipo=='p' && this.qtdeLivrosEmprestados<5){
            return true;
        }
        else{
            return this.tipo=='A' || this.tipo=='a' && this.qtdeLivrosEmprestados<3;
        }
    }

    public void emprestar(){
        this.qtdeLivrosEmprestados+=1;
    }

    public void devolver(){
        this.qtdeLivrosEmprestados-=1;
    }

    public void printAll() {
        System.out.println("Nome: "+getNome());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Quantidade de Livros Emprestados: "+getQtdeLivrosEmprestados());
    }
}
