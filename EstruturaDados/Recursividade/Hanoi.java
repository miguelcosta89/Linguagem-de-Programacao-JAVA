/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fevereiro20;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Hanoi {
    static void hanoi(int n, String org, String aux, String dst){
        if(n==1){
            System.out.println("Mova o disco 1 da torre "+ org+ " para "+ dst);
        }
        else{
            hanoi(n-1,org,dst,aux);
            System.out.println("Mova o disco "+ n+ " da torre "+org+" para "+ dst);
            hanoi(n-1,aux,org,dst);
        }
    }
    public static void main(String[] args) {
        int n;
        String origem,auxiliar, destino;
        Scanner leia = new Scanner (System.in);
        System.out.println("Escreva com o numero de discos e o nome de cada torre: ");
        n=leia.nextInt();
        origem=leia.next();
        auxiliar=leia.next();
        destino=leia.next();
        
        hanoi(n,origem,auxiliar,destino);
    }
}
