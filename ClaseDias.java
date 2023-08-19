/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin
 */
public class ClaseDias {
    //se crea el atributo de dias, y se escriben las variables a utilizar en agregar dia
    public int dia;
    int diaEncontrado = 0;
    int indice = -1;
    //constructor con parametros
    public ClaseDias(int pdia){
        this.dia = pdia;
    }
    //constructor sin parametros
    public ClaseDias() {
    }
    //se crea el metodo de agregar dia o buscar con parametros del arreglo dia
    public int AgregarDia(ClaseDias[] pDia) {
        //se crea la variable buscar dia
        int buscarDia = 0;
        //variable para buscar el dia en el arreglo
        buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
        // se crea el for para buscar el dia 
        for(int i = 0; i<pDia.length; i++) {
            if (pDia[i].dia == buscarDia){
                indice= i;
                //variable diaEncontrado obtiene el valor del arreglo de dia 
                diaEncontrado = pDia[i].dia;
                break;
            }
        }
        //se retonra el valor de diaEncontrado
        return diaEncontrado;
    }
    
}
