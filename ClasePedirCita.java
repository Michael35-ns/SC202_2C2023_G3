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

    public class ClasePedirCita {
    ClaseCitas arrCitas[] = new ClaseCitas[1];
    public void AgregarCita() {
        String textoCom = "";
        for (int i = 0; i < arrCitas.length; i++) {
            String nameCliente = JOptionPane.showInputDialog("Digite su nombre:");
            String idCliente = JOptionPane.showInputDialog("Digite su id:");
            String numTelefonico = JOptionPane.showInputDialog("Digite su número telefonico:");
            arrCitas[i] = new ClaseCitas(nameCliente, idCliente, numTelefonico);

        }
        JOptionPane.showMessageDialog(null, "Cita realizada exitosamente");
        
        for (int i = 0; i < arrCitas.length; i++) {
            textoCom += "Nombre: " + arrCitas[i].getNameCliente()+ "\n" + "Id: " + arrCitas[i].getIdCliente() + "\n" + "Número Telefonico: " + arrCitas[i].getNumTelefonico();
        }
        JOptionPane.showMessageDialog(null, textoCom);
    }
}


