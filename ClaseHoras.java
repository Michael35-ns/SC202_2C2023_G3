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
    String horas;
    String horarioEncontrado = "";

    public ClaseHoras(String horas) {
        this.horas = horas;
    }

    public ClaseHoras() {
    }
    
    
    public String conseguirHorarioBarbe0(ClaseHoras[] pHoras) {
        int indice = -1;
        String buscarHorario = "";
        
         
        do {
            buscarHorario =  JOptionPane.showInputDialog("8:00\n9:00\n10:00\n11:00\n12:00\n13:00\n14:00\n15:00\n16:00\n17:00"+"\n"+"Digite el horario que desea reservar:", "");
            for(int i = 0; i < pHoras.length; i++) {
                
                if (pHoras[i].horas.equals(buscarHorario) || (pHoras[i].horas == null) || (pHoras[i].horas.isEmpty())){
                    indice= i;
                    horarioEncontrado = pHoras[i].horas;
                    break;
                }
            }
        }while(indice ==-1);
        return horarioEncontrado;
    } 
}