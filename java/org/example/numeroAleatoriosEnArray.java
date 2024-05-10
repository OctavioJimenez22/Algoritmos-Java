package org.example;

import javax.swing.*;
import java.util.Random;

public class numeroAleatoriosEnArray {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese el tamaño del array");
        int totalPosiciones = Integer.parseInt(texto);

        Random random = new Random();
        int[] numeros = new int[totalPosiciones];

        int suma = 0;

        for(int i = 0; i<totalPosiciones; i++){
            numeros[i] = random.nextInt(10);
            suma += numeros[i];
            System.out.println("En la posicion "+ i + " esta el numero: "+numeros[i]);
        }

        System.out.println("La suma de los numeros del array es: " + suma);
    }
}
