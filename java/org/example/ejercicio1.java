// EJERCICIO DE ARRAY  (ARREGLOS)

package org.example;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        double[] ventas = new double[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las ventas del mes: ");

        //usamos el .length para recorrer todos los elementos del array
        for(int i=0; i<ventas.length; i++){
            //para ir llenando el array posicion por posicion
            System.out.println("venta " + (i+1));
            ventas[i]= scanner.nextDouble();
        }

        //para recorrer y mostrar el array
        for(int j=0; j<ventas.length; j++){
            System.out.println("El valor es: " + ventas[j] + " en la posición: " + j);
        }

        // para hayar los mayores de 50
        System.out.println("");
        int n =0;
        int cont = 0;

        while (n<ventas.length){
            if(ventas[n]>50 ){
                System.out.println("En la posición "+ n + "el número es mayor de 50");
                cont++;
            }
            n++;
        }
        System.out.println("");

        //Para mostrar la posiciones invertidas del array.
        // la linea de la declaracion de for en la parte de p=ventas.length -1; se usa ya que garantiza
        // que el contador inicie desde la ultima posicion del arreglo
        for(int p=ventas.length -1; p>= 0; p--){
            System.out.println("Valor:" + " en la posicion invertida: "+ ventas[p] );
        }

    }
}

