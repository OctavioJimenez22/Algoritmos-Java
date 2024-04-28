package org.example;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int [] num = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese los valores: ");

        for(int i=0; i < num.length; i++){
            System.out.println("Posición = " + i);
            num[i] = scanner.nextInt();
        }

        for(int j=0; j<num.length; j++  ){
            System.out.println("El numero es= "+ num[j] + " en la posicion " + j);
        }

        System.out.println(" ");
        int menor = num[0];
        for(int h=0; h<num.length; h++){
             if(num[h] < menor){
                 menor = num[h];
             }
        }
        System.out.println("El numero menor en el array es: " + menor);
    }
}
