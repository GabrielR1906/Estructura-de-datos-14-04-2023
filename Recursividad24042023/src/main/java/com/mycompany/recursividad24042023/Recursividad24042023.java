/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recursividad24042023;

/**
 *
 * @author SALA H
 */
public class Recursividad24042023 {

    public static void main(String[] args) {
        MetodosRecursividad obj = new MetodosRecursividad();
        int opc, num, exp, a, b;
        do{
            opc = obj.menu();
            switch (opc){
                case 1 -> {
                    System.out.println("Ingrese el numero ");
                    num = obj.entrada.nextInt();
                    System.out.println("El factorial de " + num + "es "
                    + obj.factorial(num));
                }
                case 2 ->{
                    System.out.println("Ingrese la posicion ");
                    num = obj.entrada.nextInt();
                    System.out.println("El fibo de la posicion " + num + "es"
                    + obj.fibo(num));
                }
                case 3 -> {
                    System.out.println("Ingrese base: ");
                    num = obj.entrada.nextInt();
                    System.out.println("Ingrese exponente: ");
                    exp = obj.entrada.nextInt();
                    System.out.println(num + " elevado a la potencia " + exp
                    + " es: " + obj.potencia(num, exp));
                }
                case 4 -> {
                    System.out.println("Ingrese primer numro: ");
                    a = obj.entrada.nextInt();
                    System.out.println("Ingrese segundo numero: ");
                    b = obj.entrada.nextInt();
                    System.out.println("El MCD entre " + a + " y " + b
                    + " es: " + obj.mcd(a,b));
                }
                default -> 1;
            }
            
        }while (opc != 0);
    }
}
