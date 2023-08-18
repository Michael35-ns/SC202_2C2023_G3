/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobarbershop;

import javax.swing.JOptionPane;

/**
 *
 * @author Ghost
 */
public class ClaseAgenda {
    private ClaseCitas[] citasAgendadas;
    private int cantidadCitas;

    public ClaseAgenda(int capacidad) {
        citasAgendadas = new ClaseCitas[capacidad];
        cantidadCitas = 0;
    }

    public void agregarCita(ClaseCitas cita) {
        if (cantidadCitas < citasAgendadas.length) {
            citasAgendadas[cantidadCitas] = cita;
            cantidadCitas++;
            JOptionPane.showMessageDialog(null, "Cita agendada exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "La agenda está llena, no se pueden agregar más citas.");
        }
    }

    public void mostrarAgenda() {
        String agendaText = "Agenda de Citas:\n";
        for (int i = 0; i < cantidadCitas; i++) {
            agendaText += "Cita " + (i + 1) + ":\n";
            agendaText += "Nombre: " + citasAgendadas[i].getNameCliente() + "\n";
            agendaText += "ID: " + citasAgendadas[i].getIdCliente() + "\n";
            agendaText += "Teléfono: " + citasAgendadas[i].getNumTelefonico() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, agendaText);
    }
}