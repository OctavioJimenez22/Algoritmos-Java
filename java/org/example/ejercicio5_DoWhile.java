package org.example;

// algoritmo con do while
// Hacer un programa que el usuario trate de adivinar entre el numero 1 entre el 1 y el 10, dandole 5 oportunidades
//  si digita el 3 que se imprima "Casi aciertas. Intenta nuevamente". Si digita 9 que diga
// "Estas lejos de la opcion correcta". Y si digita un número distinto que se imprima "Debes seguir intentando"
//  Si elije el 1 que se imprima "La opcion es correcta!! Felicidades".
// Si no adivina nunca, dejar un mensaje.
// Si adivinó decir cuantos intentos necesito para hacerlo.


import java.util.Scanner;


public class ejercicio5_DoWhile {
    public static void main(String[] args) {
        int i = 1;


      do{

          System.out.println("TIENE 10 INTENTOS");
          System.out.println("Adivine el número entre el 1 y el 10");
          System.out.print("Digite el número: ");
          Scanner scanner = new Scanner(System.in);
          int opcion = scanner.nextInt();

         if(opcion == 1){
             System.out.println("La opcion es correcta!! Felicidades");
             break;
            }else{
             if ( opcion == 3){
                 System.out.println("Casi aciertas. Intenta nuevamente");

             }else{
                 if(opcion == 9){
                     System.out.println("Estas lejos de la opcion correcta");

                 }else{
                     System.out.println("Debes seguir intentando");

                 }
             }

         }

            i += 1;
        }while(i <= 5);

        if(i == 5){
            System.out.println("No acertaste nunca.");
        }else {
            System.out.println("Acerto en el intento: " + i );
        }
        //scanner.close();

    }
}
