package org.example;

// Cada pieza de pan tiene un precio de 5$
// si el cliente compra mas de 50 piezas, le costará $4.50
// si el cliente compra mas de 100 piezas, le costara $4
// Crear un programa que pida capturar la cantidad de piezas que el cliente compró, y
// el total que pagara


import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        double descuento = 0;
        double total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de panes que deseas comprar: ");
        double cantidadPan = scanner.nextInt();
        scanner.close();

        double piezaPan = cantidadPan * 5;

        for(int i=0; i<1; i++){
            if(cantidadPan > 50 && cantidadPan < 99){
                total = cantidadPan * 4.50;
            }

            if(cantidadPan>100){
                total = cantidadPan * 4;
            }

            if(cantidadPan<50){
                total = piezaPan;
            }
        }
        System.out.println("Total a pagar es: " + total);

    }
}
