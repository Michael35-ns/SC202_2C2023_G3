/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyecto_2;

import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class Proyecto_2 {

    public static void main(String[] args) {
  controlBarbe barbeUno = new controlBarbe();
        boolean hayBarbe = true;
        while (hayBarbe) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                    Opciones: 
                                                                    1. Registrar el personal
                                                                    2. Reservación
                                                                    3. Devoluciones
                                                                    4. Revisión de agendas
                                                                    0. Salir"""));
            switch (menu) {
                case 1:
                    barbeUno.guardarBarbe();
                    break;
                case 2:
                    ClaseMes nuevoMes = new ClaseMes();
                    nuevoMes.NameMeses = new String[12];
                    nuevoMes.NameMeses[0] = "Enero";
                    nuevoMes.NameMeses[1] = "Febrero";
                    nuevoMes.NameMeses[2] = "Marzo";
                    nuevoMes.NameMeses[3] = "Abril";
                    nuevoMes.NameMeses[4] = "Mayo";
                    nuevoMes.NameMeses[5] = "Junio";
                    nuevoMes.NameMeses[6] = "Julio";
                    nuevoMes.NameMeses[7] = "Agosto";
                    nuevoMes.NameMeses[8] = "Septiembre";
                    nuevoMes.NameMeses[9] = "Octubre";
                    nuevoMes.NameMeses[10] = "Noviembre";
                    nuevoMes.NameMeses[11] = "Diciembre";
                    nuevoMes.ConseguirMes();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "devol");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "rev");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "sal");
                    hayBarbe = false;
                    break;
            }
        }
    }

    }

