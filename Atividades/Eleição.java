/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Eleição {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int votos, candidato1=0, candidato2=0, nulos=0;
        double porcentagem = 0;
        for(int i=0; i<4000; i++){
            System.out.println("Informe o seu voto: (João Vicente = 1 e Maria Aparecida = 2");
            votos= leia.nextInt();
            switch(votos){
                case 1 :
                    candidato1++;
                    break;
                case 2 :
                    candidato2++;
                    break;
                default:
                    nulos = nulos + 1;
            }
            
        }
        System.out.printf("João Vicente: %d\nMaria Aparecida: %d\nNulos: %d\n\n", candidato1, candidato2, nulos);
        if(candidato1 > candidato2){
            System.out.println("João Vicente ganhou o primeiro turno");
            porcentagem = (double) (candidato1*100)/4000;
        }
        if(candidato2 > candidato1){
            System.out.println("Maria Aparecida ganhou o primeiro turno");
            porcentagem = (double) (candidato2*100)/4000;
        }
        if(candidato1==candidato2){
            System.out.println("Maria Aparecida e João Viscente empataram");
            porcentagem = (double)(candidato2*100)/4000;
        }
        if(porcentagem > 50){
            System.out.println("Não havera segundo turno");
        }
        else{
            System.out.println("Havera segundo turno");
        }
    }
}
