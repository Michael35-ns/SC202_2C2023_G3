/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class Mavenproject5 {

public static void main(String[] args) {
Barbero barbe1 = new Barbero();
//Arrays
Barbero listaBarberos [] = new Barbero[5];
int cantCliente=0;
 ClienteProyecto listaCliente[] = new ClienteProyecto[cantCliente];

       
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
                JOptionPane.showMessageDialog(null,Arrays.toString(listaBarberos));
   
                       break;
                case 2:
                  for(int i =0; i < listaBarberos.length; i++){
                      String nombreBarbe = JOptionPane.showInputDialog("Ingrese el nombre del barbero: " + i);
                      String horaAlmuerzo = JOptionPane.showInputDialog("Ingrese la hora de almuerzo del barbero: " + i);
                      listaBarberos[i]= new Barbero(nombreBarbe, horaAlmuerzo);
                    }
                  break;

                case 3:
                    int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de barbero que desea modificar"));
                    String nombreBarbe = JOptionPane.showInputDialog("Ingrese el nombre del barbero");
                    String almuerzoBarbe = JOptionPane.showInputDialog("Ingrese la hora de almuerzo del barbero");
                    listaBarberos[posicion] = new Barbero(nombreBarbe,almuerzoBarbe);
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
                    cantCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de clientes a registrar"));
                    for(int i = 0; i<listaCliente.length; i++){
                        String pNameCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                        String pIdCliente = JOptionPane.showInputDialog("Ingrese el ID del cliente");
                        String pNumTelefonico = JOptionPane.showInputDialog("Ingrese el número telefonico del cliente");
                        listaCliente[i] = new ClienteProyecto(pNameCliente, pIdCliente, pNumTelefonico);
                    }
                    

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
            JOptionPane.showMessageDialog(null,barbe1.calendario);
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

