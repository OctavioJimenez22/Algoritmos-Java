package org.example;

//Crea un algoritmo de numero donde le indicamos por teclado el tamaño del array, rellenamos el array
// con numero aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posicion
// y la suma de todos los valores. Haz un metodo para rellenar el array(que tenga como parametros
// los nuemeros entre los que tenga que generar), para mostrar el contenido y la suma del array
// y un metodo privado para generar numero aleatorio.


//  pedirle al cliente que indique el tamaño del array --
//  hacer el array y llenarlo con numeros aleatorios entre 0 y 9
//  mostrar por pantalla la posicion y el numero corresponde ahi
//  sumas los valores del array


import javax.swing.*;

public class arrayNumeroAleatorios {

    String texto = JOptionPane.showInputDialog("Ingrese el tamaño del array");
    int totalPosiciones = Integer.parseInt(texto);


}
