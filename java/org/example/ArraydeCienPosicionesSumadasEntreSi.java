// Crear un array de numeros de 100 posiciones, que contendra los numeros del 1 al 100
//Obten la suma de todos ellos y la media.

// crear el array de 100 posiciones
// llenarlo con los numeros de 1 al 100
// sumar todos los numeros que tiene el array y la media
//mostrar por pantalla la suma y la media

//para halla la media debemos sumar los valores y dividirlos por la cantidad de numeros en el conjunto.


package org.example;

public class ArraydeCienPosicionesSumadasEntreSi {
    public static void main(String[] args) {

        int cien[] = new int[100];
        int suma= 0;
        for (int i=0; i<100; i++){
            cien[i] = i+ 1;
            suma = suma + cien[i];
        }

        int media = suma/100;
        System.out.println("la suma de todos los 100 numeros del array es: "+ suma);
        System.out.println("Y la media es: "+media);
    }
}
