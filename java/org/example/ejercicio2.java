package org.example;
// EJERCICIO DE ARRAY  (ARREGLOS MAYORQUE- MENORQUE)

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int [] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los números: ");

        for( int i=0; i< numeros.length; i++){
            System.out.println("números: " + (i));
            numeros[i]= scanner.nextInt();
        }

        for( int j=0; j< numeros.length; j++){
            System.out.println("El numero es: " + numeros[j] + " en la posición: " + j);
        }

        int mayor= numeros[0];
        for(int h=0; h<numeros.length; h++){
            if(numeros[h] > mayor){
                mayor = numeros[h];
            }
        }

        System.out.println("El número mayor es: " + mayor);

    }
}
