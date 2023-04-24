/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursividad24042023;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class MetodosRecursividad {
    Scanner entrada;
    public MetodosRecursividad(){
        this.entrada = new Scanner(System.in);
    }
    
    public int menu(){
    System.out.println("Factorial   [1]:");
    System.out.println("Fibonaccio  [2]:");
    System.out.println("Potencia    [3]:");
    System.out.println("MCD         [4]:");
    System.out.println("Salir       [5]:");
    return entrada.nextInt();
    }
    
    public int factorial(int num){
        if ((num == 1) || (num == 0))
            return 1;
        else
            return num*factorial(num-1);
    }
    
    public int fibo(int num){
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return fibo(num - 1) + fibo (num - 2);
    }
    
    public int potencia(int base, int exp){
        if(exp == 0)
            return 1;
        else if (exp == 1)
            return base;
        else
            return base * potencia(base, exp - 1);
    }
}   
