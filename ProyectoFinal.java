/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;

import javax.swing.JOptionPane;
/**
 *
 * @author Ghost
 */
public class ProyectoFinal {

    public static void main(String[] args) {
           Barbero[] barberos = {
            new Barbero("Jazmín", "7 A.M - 3 P.M"),
            new Barbero("Jean Carlo", "7 A.M - 3 P.M"),
            new Barbero("Joseph", "7 A.M - 3 P.M"),
            new Barbero("Cristopher", "3 P.M - 7 P.M"),
            new Barbero("Arturito", "3 P.M - 7 P.M")
        };

        while (true) {
            String mensaje = "Seleccione un barbero:\n";
            for (int i = 0; i < barberos.length; i++) {
                mensaje += (i + 1) + ". " + barberos[i].getNombre() + " - " + barberos[i].getJornadaLaboral() + "\n";
            }

            int opcionBarbero = 0;
            boolean seleccionValida = false;

            while (!seleccionValida) {
                try {
                    opcionBarbero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
                    if (opcionBarbero < 1 || opcionBarbero > barberos.length) {
                        throw new NumberFormatException();
                    }
                    seleccionValida = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción inválida. Favor intente nuevamente.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            Barbero barberoSeleccionado = barberos[opcionBarbero - 1];

            String confirmacion = "";

            while (!confirmacion.equalsIgnoreCase("si") && !confirmacion.equalsIgnoreCase("no")) {
                confirmacion = JOptionPane.showInputDialog(
                        null,
                        "Desea agendar una cita con " + barberoSeleccionado.getNombre() + "?\n"
                                + "Escriba 'si' para agendar cita o 'no' para volver al menú de selección.");

                if (!confirmacion.equalsIgnoreCase("si") && !confirmacion.equalsIgnoreCase("no")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción inválida. Favor intente nuevamente.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

            if (confirmacion.equalsIgnoreCase("si")) {
                String horariosDisponibles = "Seleccione una hora:\n";
                String[] horas = barberoSeleccionado.getHorariosDisponibles();

                for (int i = 0; i < horas.length; i++) {
                    horariosDisponibles += (i + 1) + ". " + horas[i] + "\n";
                }

                seleccionValida = false;
                int opcionHorario = 0;

                while (!seleccionValida) {
                    try {
                        opcionHorario = Integer.parseInt(JOptionPane.showInputDialog(null, horariosDisponibles));
                        if (opcionHorario < 1 || opcionHorario > horas.length) {
                            throw new NumberFormatException();
                        }

                        String horaSeleccionada = horas[opcionHorario - 1];
                        if (horaSeleccionada.equals("1 P.M")) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Lo sentimos, la hora que digitó es la hora de almuerzo de su barbero. Favor digite otra hora.",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Usted ha seleccionado agendar una cita con " + barberoSeleccionado.getNombre()
                                            + " a las " + horaSeleccionada + ".\n¡Le esperamos!");
                            seleccionValida = true;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Opción no válida. Intente nuevamente.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

            int confirmacionSalir = JOptionPane.showOptionDialog(
                    null,
                    "¿Desea salir del sistema?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Dale", "Nope"},
                    "No");

            if (confirmacionSalir == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "¡Sayonara!");
                System.exit(0);
            }
        }
    }

    static class Barbero {
        private String nombre;
        private String jornadaLaboral;

        public Barbero(String nombre, String jornadaLaboral) {
            this.nombre = nombre;
            this.jornadaLaboral = jornadaLaboral;
        }

        public String getNombre() {
            return nombre;
        }

        public String getJornadaLaboral() {
            return jornadaLaboral;
        }

        public String[] getHorariosDisponibles() {
            String[] horarios = null;

            if (jornadaLaboral.equals("7 A.M - 3 P.M")) {
                horarios = new String[]{"7 A.M", "8 A.M", "9 A.M", "10 A.M", "11 A.M", "12 P.M", "2 P.M", "3 P.M"};
            } else if (jornadaLaboral.equals("3 P.M - 7 P.M")) {
                horarios = new String[]{"3 P.M", "4 P.M", "5 P.M", "6 P.M", "7 P.M"};
            }

            return horarios;
        }
    }
}

        
        
    
