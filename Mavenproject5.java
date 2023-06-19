/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class Mavenproject5 {

public static void main(String[] args) {

       
int menu;

JOptionPane.showMessageDialog(null, "Bienvenido a la Barbería ");
        

boolean hayCliente = true;
while (hayCliente) {
    menu = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                            Opciones: 
                                                                                            1. Administraci\u00f3n del personal 
                                                                                            2. Reservaci\u00f3n
                                                                                            3. Devoluciones
                                                                                            4. Revisi\u00f3n de agendas
                                                                                            0. Salir del sistema"""));
    switch(menu){
        case 1:
            int regresarAdmi = 1; 
            while(regresarAdmi != 0){ 
            int menuAdmi = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                 Opciones:   
                                                                                                                 1. Visualizar Empleados
                                                                                                                 2.  Agregar Empleados   
                                                                                                                 3. Modificar Empleados
                                                                                                                 0. Regresar al menú principal"""));
            switch(menuAdmi){
                case 1: 
                    JOptionPane.showMessageDialog(null, "Visualizar empleados");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Agregar Empleados");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Modificar Empleados");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Regresando al menú principal");
                    regresarAdmi = 0;
                    break;
                }
            }
            break;             
        case 2:
            int regresarReser = 1;
            while(regresarReser !=0){
               int menuReser = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                        Opciones:
                                                                                                                        1. Crear Reservación
                                                                                                                        0. Salir
                                                                                                                                                   """));
            switch(menuReser){
                case 1:
                    JOptionPane.showMessageDialog(null, "Se creó la reservación");
                    break;
                case 0: 
                    JOptionPane.showMessageDialog(null,"Regresando al menú principal" );
                    regresarReser = 0;
                    break;
                }            
            }
            break;
        case 3:
            JOptionPane.showMessageDialog(null,"Su opción es la de devoluciones");
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Su opción es la de revisar agendas");
            break;
        case 0:
            JOptionPane.showMessageDialog(null,"Usted salió del menú, gracias! Nos vemos pronto.");
            hayCliente = false;
            break;
        default:
        JOptionPane.showMessageDialog(null,"Su opción es inválida, por favor ingrese un número que se encuentre en el menú");
        break;
       
            }
        }    
    }
}   

