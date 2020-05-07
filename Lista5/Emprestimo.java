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
public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;

    public Emprestimo(Pessoa pessoa, Livro livro){
        this.pessoa=pessoa;
        this.livro=livro;
    }

    public void setPessoa(Pessoa pessoa){
        this.pessoa=pessoa;
    }

    public Pessoa getPessoa(){
        return this.pessoa;
    }

    public void setLivro(Livro livro){
        this.livro=livro;
    }
    public Livro getLivro(){
        return this.livro;
    }

    public void printAll(){
        System.out.println("Pessoa: " + getPessoa().getNome());
        System.out.println("Livro: " + getLivro().getNome());
    }
}
