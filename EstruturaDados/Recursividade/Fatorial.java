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
public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Informe o numero fatorial: ");
        Scanner leia = new Scanner (System.in);
        long result, n=leia.nextInt();
        result = fatorial(n);
        System.out.println(result);
    }
    static long fatorial(long n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n * fatorial(n-1);
        }
    }
}
