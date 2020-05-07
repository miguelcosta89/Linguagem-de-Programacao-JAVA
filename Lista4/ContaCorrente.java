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
public class ContaCorrente {
    Pessoa correntista;
    double saldo;
    String agencia;
    String numero;
    
    public ContaCorrente(Pessoa correntista, double saldo, String agencia, String numero){
        this.correntista=correntista;
        this.saldo=saldo;
        this.agencia=agencia;
        this.numero=numero;
    }
    
    public void printAll(){
        System.out.printf("Saldo: %.2f\n",this.saldo);
        System.out.println("Agencia: "+this.agencia);
        System.out.println("Numero: "+this.numero);
    }
    
    public void deposito(double valor){
        this.saldo+=valor;
    }
    
    public boolean saque(double valor){
        if(valor>this.saldo){
            this.saldo-=valor;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean transferencia(double valor, ContaCorrente contaDestino){
        if(valor<=this.saldo){
            this.saldo-=valor;
            contaDestino.saldo+=valor;
            return true;
        }
        else {
            return false;
        }
        
    }



}
