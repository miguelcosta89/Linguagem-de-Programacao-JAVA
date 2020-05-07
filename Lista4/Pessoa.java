/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

/**
 *
 * @author Marcelo Costa
 */
public class Pessoa {
    String nome;
    int idade;
    String cpf;
    
    Pessoa(String nome, int idade, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }
    void printAll(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("CPF: "+this.cpf);
    }


}
