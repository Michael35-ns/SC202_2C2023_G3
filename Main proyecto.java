/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prueba;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin
 */
public class MainProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables de los menus
        int menu = -1;
        int menuAdmi = -1;
        int menuReser = -1;
        int menuDev = -1;
        int menuRevision = -1;
        //objetos de las clases
        //arreglos universales a utilizar
        
        
        JOptionPane.showMessageDialog(null, "Bienvenido a la Barbería ");

        
        /**menú principal 
         */
    while (menu != 0) {
        menu = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                            Opciones: 
                                                                                            1. Administración del personal 
                                                                                            2. Reservaciones
                                                                                            3. Devoluciones
                                                                                            4. Revisión de agendas
                                                                                            0. Salir del sistema"""));
        switch(menu){
            case 1:
                boolean hayAdministracion = true;
                while(hayAdministracion){ 
                menuAdmi = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                 Opciones:   
                                                                                                                 1. Agregar Empleados
                                                                                                                 2. Visualizar Empleados   
                                                                                                                 0. Regresar al menú principal"""));
                switch(menuAdmi){
                    case 1: 
                        
                        break;
                    case 2:
                        
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Regresando al menú principal");
                        hayAdministracion = false; 
                        break;
                    }
                }
                break;             
            case 2:
                boolean hayReservacion = true;
                while(hayReservacion){
                   menuReser = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                        Opciones:
                                                                                                                        1. Crear Reservación
                                                                                                                        0. Salir
                                                                                                                                                   """));
                    switch(menuReser){
                        case 1:
                            
                            
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null,"Regresando al menú principal" );
                            hayReservacion = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Su opción es inválida, por favor ingrese un número que se encuentre en el menú");
                            break;
                    }
                }
                break;
            case 3:
                boolean hayDevoluciones = true;
                while(hayDevoluciones){
                    menuDev = Integer.parseInt(JOptionPane.showInputDialog("1.Realizar devolucion\n0.Salir", ""));
                    switch (menuDev) {
                        case 1:
                            break;
                        case 0: 
                            JOptionPane.showMessageDialog(null,"Regresando al menú principal" );
                            hayDevoluciones = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Su opción es inválida, por favor ingrese un número que se encuentre en el menú");
                            break;
                    }
                }
                break;
            case 4:
                boolean hayRevision = true;
                while(hayRevision){
                    menuRevision = Integer.parseInt(JOptionPane.showInputDialog("1.Revisar Agenda\n0.Salir", ""));
                    switch (menuRevision) {
                        case 1:
                            break;
                        case 0: 
                            JOptionPane.showMessageDialog(null,"Regresando al menú principal" );
                            hayRevision = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Su opción es inválida, por favor ingrese un número que se encuentre en el menú");
                            break;
                    }
                }
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"¡Gracias por usar el programa!"
                        + "¡Nos vemos pronto.");
                menu = 0;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Su opción es inválida, por favor ingrese un número que se encuentre en el menú");
                break;
            }
        }
    
    }
}
