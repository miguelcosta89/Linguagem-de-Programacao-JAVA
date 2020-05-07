/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fevereiro28;

/**
 *
 * @author aluno
 */
public class Alunos {
  public static class ALUNO{
      public int codigo;
      public double nota;
      public ALUNO prox;
  }
  //QUESTÃO1
   static ALUNO inserirAluno(int codigo, ALUNO topo){
      ALUNO aluno = new ALUNO();
      
      aluno.codigo=codigo;
      aluno.prox=topo;
      aluno.nota=-1;
      topo=aluno;
      return topo;
      
  }
  //QUESTÃO2
   static void inserirNota(int codigo, ALUNO topo, double nota){
      ALUNO aux = topo;
      int x=0;
      while(aux!=null){
          if(codigo==aux.codigo){  
              aux.nota= nota;
              System.out.println("Nota Cadastrada");
              x++;
          }
          aux=aux.prox;
      }
      if(x<0){
          System.out.println("Aluno Não Cadastrado");
      }
          
  }
  //QUESTÃO3
   static void mediaNota(ALUNO topo){
      ALUNO aux = topo;
      int cont=0;
      double notas=0;
      while(aux!=null){
          
          if(aux.nota>=0){
              notas+=aux.nota;
              cont++;
          }
          aux=aux.prox;
      }
      notas=notas/cont;
      System.out.println("A média é " + notas);
  }
  
  //QUESTÃO4
   static void exibirAluno(ALUNO topo){
      ALUNO aux = topo;
      while(aux!=null){
          System.out.println("Codigo: "+aux.codigo);
          if(aux.nota>=0){
          System.out.println("Nota: "+aux.nota);
          }
          else{
              System.out.println("Nota Não Cadastrada");
          }
          aux=aux.prox;
          System.out.println("");
      }
  }
  
  //QUESTÃO5
  static void confCad(ALUNO topo, int codigo){
      ALUNO aux = topo;
      int n=0;
      while(aux!=null){
          if(aux.codigo==codigo){
              n++;
          }
          aux=aux.prox;
      }
      if(n==0){
          System.out.println("Aluno não cadastrado.");
      }
      else{
          System.out.println("Aluno cadastrado.");
      }
  }
  
  //QUESTÃO6
  static ALUNO excluir(ALUNO topo){
      topo=topo.prox;
      return topo;
  }
  
}
