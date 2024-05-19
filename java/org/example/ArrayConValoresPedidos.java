//Crear un array de 10 posiciones de numeros con valores pedidos por teclado.
// Muestra por consola el indice y el valor al que corresponde. Haz dos metodos, uno para rellenar valores
// y otro para mostrar

// crear el arrary que tenga 10 posiciones
// pedirle al cliente que llene el array con numeros
//

package org.example;


import javax.swing.*;

public class ArrayConValoresPedidos {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            String texto = JOptionPane.showInputDialog("Ingrese el primer numero");
            array[i] = Integer.parseInt(texto);
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("El valor del indice " + j + " es: " + array[j]);
        }


    }
}
