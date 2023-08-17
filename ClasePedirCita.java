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
    String textoCom = "";

    public void AgregarCita(ClaseCitas[] pCitas) {
        for (int i = 0; i < pCitas.length; i++) {
            String nameCliente = JOptionPane.showInputDialog("Digite su nombre:");
            String idCliente = JOptionPane.showInputDialog("Digite su id:");
            String numTelefonico = JOptionPane.showInputDialog("Digite su número telefonico:");
            pCitas[i] = new ClaseCitas(nameCliente, idCliente, numTelefonico);

        }
        JOptionPane.showMessageDialog(null, "Cita realizada exitosamente");
        
        
    }
    public String visualizarCita(ClaseCitas[] pCitas) {
        for (int i = 0; i < pCitas.length; i++) {
            textoCom += "Nombre: " + pCitas[i].getNameCliente()+ "\n" + "Id: " + pCitas[i].getIdCliente() + "\n" + "Número Telefonico: " + pCitas[i].getNumTelefonico();
        }
        JOptionPane.showMessageDialog(null, textoCom);
        return textoCom;
    }
}


