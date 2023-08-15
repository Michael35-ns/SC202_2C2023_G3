/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2;

import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class ClaseHoras {
    String Horas[] = { "8:00","9:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00"
        };
    ClaseCitas citas[] = new ClaseCitas[1];
    public void conseguirHorario() {
        int indice = -1;
        String buscarHorario = "";
         
        do {
            buscarHorario =  JOptionPane.showInputDialog("8:00\n9:00\n10:00\n11:00\n12:00\13:00\n14:00\n15:00\n16:00\n17:00"+"\n"+"Digite el horario que desea reservar:", "");
            for(int i = 0; i < Horas.length; i++) {
                if (Horas[i].equals(buscarHorario)){
                    indice= i;
                    break;
                }
            }
        }while(indice ==-1);
        if (Horas[indice] == "8:00"){
            ClasePedirCita nuevaCita = new ClasePedirCita(); 
            nuevaCita.AgregarCita();
        }
        
        
    } 
}