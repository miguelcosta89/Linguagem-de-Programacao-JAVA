/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

/**
 *
 * @author Marcelo Costa
 */
public class Pessoa {
    String nome;
    String cpf;
    byte idade;
    float altura;
    float peso;
    String profissao;
    
    void mostrarTudo(){
        System.out.print("Meu nome é " + this.nome+ ", CPF: "+ this.cpf);
        System.out.print(", tenho "+ this.idade+" anos, " +this.altura);
        System.out.println(" de altura e "+ this.peso +"kg. Sou "+ this.profissao);
}
    void fazerAniversario(){
        this.idade++;
    }
    void fazerAtividadeFisica(int quantAtividadeFisica){
    this.peso-=quantAtividadeFisica*0.10;
}
    void comer(int quantComida){
     this.peso+=quantComida*0.10;   
    }
    void mudaProfissao(String novo){
        this.profissao=novo;
    }
}
