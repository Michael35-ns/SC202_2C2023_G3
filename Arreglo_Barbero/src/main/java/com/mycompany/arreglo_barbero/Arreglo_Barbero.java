/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo_barbero;

/**
 *
 * @author jeanc
 */
public class Arreglo_Barbero {

    public static void main(String[] args) {
        
        // Creacion de los array con objetos
        Barbero listaBarbero [] = new Barbero [5];
        
        // Introduccion de datos en los objetos creados
        listaBarbero [0] = new Barbero("Jazmin", "1pm");
        listaBarbero [1] = new Barbero("Jean Carlo", "2pm");
        listaBarbero [2] = new Barbero("Joseph", "3pm");
        listaBarbero [3] = new Barbero("Christopher", "4pm");
        listaBarbero [4] = new Barbero("Arturito", "5pm") ;
        
        // Recorrer el array de objetos por medio de ciclo for
        for (int i = 0;  i < listaBarbero.length ; i++) {
            System.out.println(listaBarbero[i].mostrarInfo());
}
  }
    }
    
