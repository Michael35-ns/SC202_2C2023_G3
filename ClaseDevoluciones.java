/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin
 */
public class ClaseDevoluciones {
    //creacion del metodo para realizar la devolucion, se usa el parametrod del arreglo de citas
    public void Devolucion(ClaseCitas[] pCita) {
        //inicializacion de la variable para buscar la cita
        String buscarCita = "";
        //inicializacion de la variable 
        String citaEncontrada = "";
        int indice = 0;
            //se busca el id del cliente
        buscarCita = JOptionPane.showInputDialog("Digite su id");
            //se busca el nombre del barbero que lo atiende
        String  name = JOptionPane.showInputDialog(null, "Ingrese el nombre del barbero");
            //se busca el dia de la cita
        String citaH = JOptionPane.showInputDialog("Ingrese la hora de su cita");
            //se utiliza el for para encontrar la cita
        for(int i = 0; i < pCita.length; i++) {
            //si se encuentra el id, el barbero y hora entonces el arreglo se vuelve nulo
            if (pCita[i].getIdCliente().equals(buscarCita) && pCita[i].getBarber() == name && pCita[i].getHora() == citaH){
                pCita[i] = null;
                break;

            }
        }
        JOptionPane.showMessageDialog(null, "Se realizo la devolcion de forma correcta");
    }
}
