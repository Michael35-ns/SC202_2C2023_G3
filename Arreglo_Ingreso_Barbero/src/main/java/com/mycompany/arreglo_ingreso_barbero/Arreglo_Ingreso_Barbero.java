/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglo_ingreso_barbero;

import javax.swing.JOptionPane;

/**
 *
 * @author jeanc
 */
public class Arreglo_Ingreso_Barbero 
{
    public static void main(String[] args) 
    {
        // Declaracion de arreglo
        String barbeList[] = new String [5];
        
        /** iniciacion de variables
         */
        int menu = 1;
        int menuAdmi = 1;
        int menuReser = 1;
        int menuDev = 10;
        int menuRevision = 1;
        String textoCom = "";
        String[] clientes = new String[5]; 
        JOptionPane.showMessageDialog(null, "Bienvenido a la Barberia ");

        
        /**menÃº principal 
         */
        boolean hayCliente = true;
        while (hayCliente) {
        menu = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                            Opciones: 
                                                                                            1. Administracion del personal 
                                                                                            2. Reservacion
                                                                                            3. Devoluciones
                                                                                            4. Revision de agendas
                                                                                            0. Salir del sistema"""));
            switch(menu){
                case 1:
                    int regresarAdmi = 1; 
                    while(regresarAdmi != 0){ 
                    menuAdmi = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                 Opciones:   
                                                                                                                 1. Visualizar Empleados
                                                                                                                 2. Agregar Empleados   
                                                                                                                 3. Modificar Empleados
                                                                                                                 0. Regresar al menu principal"""));
                switch(menuAdmi){
                    case 1: 
                        JOptionPane.showMessageDialog(null, "Visualizar empleados");
                        // Mostrar los barberos ingresados por el usuario
                        for (int i = 0; i < barbeList.length; i++) 
                        {
                            JOptionPane.showMessageDialog(null, "El barbero: " + i + " es: " + barbeList[i]);
                        }
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "Agregar Empleados");
                        // Asignacion de los nombres de los barberos (el usuario llena los datos)
                        for (int i = 0; i < barbeList.length; i++) 
                        { 
                            barbeList[i] = JOptionPane.showInputDialog(" Ingrese el nombre del barbero ");
                            JOptionPane.showMessageDialog(null, "El barbero " + i + " es " + barbeList[i]);
                        }
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "Modificar Empleados");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Regresando al menu principal");
                        regresarAdmi = 0;
                        break;
                    }
                }
                break;             
            case 2:
                int regresarReser = 1;
                while(regresarReser !=0){
                   menuReser = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                        Opciones:
                                                                                                                        1. Crear Reservacion
                                                                                                                        0. Salir
                                                                                                                                                   """));
                    switch(menuReser)
                    {
                        case 1:
                            double totalPago = 0.0;
                            ClienteProyecto clienteNuevo = new ClienteProyecto();
                            clienteNuevo.setNameCliente(JOptionPane.showInputDialog("Digite su nombre:"));
                            clienteNuevo.setIdCliente(JOptionPane.showInputDialog("Digite su identificacion:"));
                            clienteNuevo.setNumTelefonico(JOptionPane.showInputDialog("Digite su numero telefonico:"));
                            clienteNuevo.diaCita = JOptionPane.showInputDialog("Digite el di­a de la cita:");
                            clienteNuevo.horaCita = JOptionPane.showInputDialog("Digite la hora de comienzo de su cita:");
                            clienteNuevo.rangoHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite el rango de horas deseadas para de cita: "));
                            if ((clienteNuevo.diaCita == "Lunes") || (clienteNuevo.diaCita == "Martes") || (clienteNuevo.diaCita == "Miercoles") || (clienteNuevo.diaCita == "Jueves") || (clienteNuevo.diaCita == "Viernes")) {
                                double precioIvaLunesAViernes = 2500+(2500*0.13);
                                totalPago = clienteNuevo.rangoHoras * precioIvaLunesAViernes;
                            }
                            if ((clienteNuevo.diaCita == "Sabado")|| (clienteNuevo.diaCita == "Domindo")) {
                                double precioIvaSabadoYDomingo = 3000+(3000*0.13);
                                totalPago = clienteNuevo.rangoHoras * precioIvaSabadoYDomingo;
                                JOptionPane.showMessageDialog(null, totalPago);
                            } 
                            JOptionPane.showMessageDialog(null, "Se creÃ³ la reservaciÃ³n");
                            textoCom = "Datos Ingresados: \n Nombre: "+clienteNuevo.getNameCliente() + 
                                    "\nIdentificaciÃ³n: " + clienteNuevo.getIdCliente() + 
                                    "\nNumero de telefono: " + clienteNuevo.getNumTelefonico() +
                                    "\nDÃ¬a de la cita: " + clienteNuevo.diaCita + 
                                    "\nHora de la cita:" + clienteNuevo.horaCita +
                                    "\nRango de horas de la cita: " + clienteNuevo.rangoHoras +
                                    "\nTotal a pagar: " + totalPago;
                            JOptionPane.showMessageDialog(null, textoCom);
                            
                            break;
                        case 0: 
                            JOptionPane.showMessageDialog(null,"Regresando al menu principal" );
                            regresarReser = 0;
                            break;
                    }            
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Su opcion es la de devoluciones");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Su opcion es la de revisar agendas");
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Usted salio del menu, gracias! Nos vemos pronto.");
                hayCliente = false;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Su opcion es invalida, por favor ingrese un numero que se encuentre en el menu");
                break;
            }
        }
    }  
}
