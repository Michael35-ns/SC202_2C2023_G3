/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2;

import com.mycompany.proyecto_2.ClaseCitas;
import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin
 */
public class ClaseDevoluciones{
    String dev[] = new String[1];
    public String Devolucion(ClaseCitas[]  pCita, Barbero[] arrBarber, ClaseHoras[] horasEmpleados) {
        String buscarCita = "";
        int indice = -1;
       
        String citaEncontrada = "";
        String barbeEncontrado = "";
        String horaEncontrada = "";
            buscarCita = JOptionPane.showInputDialog("Digite su id");
         String  name = JOptionPane.showInputDialog(null, "Ingrese el nombre del barbero");
            String citaH = JOptionPane.showInputDialog("Ingrese la hora de su cita");
            for(int i = 0; i < 1; i++) {
                if (pCita[i].getIdCliente() == buscarCita){
                    indice= i;
                    citaEncontrada = pCita[i].getIdCliente()+pCita[i].getNameCliente()+pCita[i].getNumTelefonico();
                    break;
                }
                else if(arrBarber[i].nombreBarbe == name){
                    indice= i;
                    barbeEncontrado = arrBarber[i].nombreBarbe;
                    break;                    
                }
                else if(horasEmpleados[i].equals(citaH)){
                    indice= i;
                     horasEmpleados[i] = null;
                    break;   
                
            }citaEncontrada = null;

    }
             return "Cita cancelada";
}
   
}
