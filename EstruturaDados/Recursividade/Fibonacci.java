/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fevereiro14;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Escreva a posição: ");
        Scanner leia = new Scanner (System.in);
        long n=leia.nextInt();
        long result;
        result=fibo(n);
        System.out.println(result);
    }
    static long fibo(long n){
        if(n==1 || n==2){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}
