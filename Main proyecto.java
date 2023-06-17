/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lecciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin
 */
public class Menu_proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /** iniciacion de variables globales
         */
        int menu;
        int menuAdmi;
        int menuReser;
        int menuDev;
        int menuRevision;


        
        
        /** iniciacion de variables 
         */
        JOptionPane.showMessageDialog(null, "Bienvenido a la Barbería ");
               
        
        
        /**menú principal 
         */
        while (true) {
            JOptionPane.showMessageDialog(null, " Opciones: \n 1. Administración del personal " + "\n 2. Reservación" + "\n 3. Devoluciones"
            + "\n 4. Revisión de agendas" + "\n 5. Salir del sistema");
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su opción:"));
            if (menu == 1) {
                while (true) {
                    JOptionPane.showMessageDialog(null, " Opciones: \n 1. Visualizar empleados " + "\n 2. Agregar empleados" + "\n 3. Modificar empleados" + "\n 4. Salir");
                    menuAdmi = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su opción:"));
                    if (menuAdmi == 1 ) {
                        System.out.println("Visualizar");
                    }
                    if (menuAdmi == 2) {
                        System.out.println("agregar");
                    }
                    if (menuAdmi == 3) {
                            System.out.println("Cambios");
                    }
                    if (menuAdmi == 4 ) {
                        JOptionPane.showMessageDialog(null, "Muchas gracias por estar en el apartado de administración, vas a volver al menú principal");
                        break;
                    }
                    else if ((menuAdmi !=1) && (menuAdmi !=2) && (menuAdmi != 3) && (menuAdmi != 4) ) {
                        JOptionPane.showMessageDialog(null, "No ha digitado una opción valida, vuelva a digitar una opción");

                    }
                }
            }
            if (menu == 2) {
                while (true) {
                    JOptionPane.showMessageDialog(null, " Opciones: \n 1. Crear Reservación \n 2. Salir");
                    menuReser = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su opción:"));
                }
            }
            if (menu == 3) {
                break;
            }
            if (menu == 4) {
                break;
            }
            if (menu == 5) {
                JOptionPane.showMessageDialog(null, "¡Hasta luego, gracias por usar el programas!");
                break;  

            }
            else if ((menu !=1) && (menu !=2) && (menu != 3) && (menu != 4) && (menu != 5)) {
                JOptionPane.showMessageDialog(null, "No ha digitado una opción valida, vuelva a digitar una opción");
            }
        
        }
        
    }
    
}
