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
public class Livro {
    private String nome;
    private int anoLancamento;
    private int qtdeExemplaresDisponiveis;

    public Livro(String nome, int anoLancamento, int qtdeExemplaresDisponiveis){
        this.nome=nome;
        this.anoLancamento=anoLancamento;
        this.qtdeExemplaresDisponiveis=qtdeExemplaresDisponiveis;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return this.nome;
        
    }
    
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento=anoLancamento;
    }
    
    public int getAnoLancamento(){
        return this.anoLancamento;
    }
    
    public void setQtdeExemplaresDisponiveis(int qtdeExemplaresDisponiveis){
        this.qtdeExemplaresDisponiveis=qtdeExemplaresDisponiveis;
    }

    public int getQtdeExemplaresDisponiveis(){
        return this.qtdeExemplaresDisponiveis;
    }

    public boolean podeSerEmprestado(){
        if(qtdeExemplaresDisponiveis>0){
            return true;
        }
        else{
            return false;
        }
    }
    public void emprestar(){
        this.qtdeExemplaresDisponiveis-=1;
    }

    
    public void devolver(){
        this.qtdeExemplaresDisponiveis+=1;
    }

    public void printAll(){
        System.out.println("Nome: "+getNome());
        System.out.println("Ano de lançamento: "+getAnoLancamento());
        System.out.println("Quantidade de exemplares disponivel: "+getQtdeExemplaresDisponiveis());
    }

}
