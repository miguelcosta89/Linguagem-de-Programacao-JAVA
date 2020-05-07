/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

/**
 *
 * @author Marcelo Costa
 */
public class Carro {
     String marca;
     String modelo;
     String cor;
     String placa;
     int velocidade;
     byte marcha;
     boolean ligado;
     
     void mostraTudo(){
         System.out.print("Carro da marca "+this.marca+", modelo "+this.modelo+", cor "+this.cor+" e placa "+this.placa+(this.ligado == true ? ". Ligado." : ". Desligado."));
         if (this.ligado) {
             System.out.print(" A "+this.velocidade+"km/h, na marcha "+this.marcha+".");
         }
         System.out.println("");
     }
     void pintar(String cor){
         this.cor=cor;
     }
     void ligar(){
         this.ligado=true;
    }
     void desligar(){
         this.ligado=false;
     }
     void aumentarMarcha(){
         if(this.marcha<5){
             this.marcha++;}
     }
     void diminuirMarcha(){
         if(this.marcha>-1){
             this.marcha--;
         }
     }
     void acelerar(int velocidade){
         this.velocidade+=velocidade;
         if(this.velocidade>200){
             this.velocidade=200;
         }
         if(this.ligado==false){
             this.velocidade=0;
         }
     }
     void frear(int freio){
         this.velocidade-=freio;
         if(this.velocidade<0){
             this.velocidade=0;
         }
         if(this.ligado==false){
             this.velocidade=0;
         }
     }
     
}
