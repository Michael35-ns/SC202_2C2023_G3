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
        Barbero1 nuevoBarber = new Barbero1();
        ClaseMes nuevoMes = new ClaseMes();
        ClaseDias nuevoDia = new ClaseDias();
        ClaseHoras nuevaHora = new ClaseHoras();
        ClasePedirCita nuevaCita = new ClasePedirCita();
        ClaseDevoluciones nuevaDevolucion = new ClaseDevoluciones();
        //arreglos universales a utilizar
        Barbero arrBarber[] = new Barbero[1];
        String[] arrMeses = { "","Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        ClaseDias arrDia[] = new ClaseDias[30];
        for (int i = 0; i < arrDia.length; i++) {
            arrDia[i] = new ClaseDias(i+1);
        }
        ClaseHoras horasEmpleados[] = {
         new ClaseHoras("8:00"),
         new ClaseHoras("9:00"),
         new ClaseHoras("10:00"),
         new ClaseHoras("11:00"),
         new ClaseHoras("12:00"),
         new ClaseHoras("13:00"),
         new ClaseHoras("14:00"),
         new ClaseHoras("15:00"),
         new ClaseHoras("16:00"),
         new ClaseHoras("17:00"),
        };
        
        ClaseCitas arrCitas[] = new ClaseCitas[1];
        
        
        

        
        
        JOptionPane.showMessageDialog(null, "Bienvenido a la Barbería ");

        
        /**menú principal 
         */
        boolean hayBarbe = true;
    while (hayBarbe) {
        menu = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                            Opciones: 
                                                                                            1. Administración del personal 
                                                                                            2. Reservaciones
                                                                                            3. Devoluciones
                                                                                            4. Revisión de agendas
                                                                                            0. Salir del sistema"""));
        switch(menu){
            case 1:
                while(menuAdmi != 0){ 
                menuAdmi = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                 Opciones:   
                                                                                                                 1. Agregar Empleados
                                                                                                                 2. Visualizar Empleados   
                                                                                                                 0. Regresar al menú principal"""));
                switch(menuAdmi){
                    case 1: 
                        for(int i = 0; i < arrBarber.length; i++){
                            String nombreBarbe = JOptionPane.showInputDialog("Ingrese el nombre del barbero "+i);
                            String horaAlmuerzo = JOptionPane.showInputDialog("Ingrese la hora de almuerzo del barbero "+i);
                            arrBarber[i] = new Barbero(nombreBarbe, horaAlmuerzo);
                        }
                        JOptionPane.showMessageDialog(null, "Barberos agregados correctamente");
                        break;
                    case 2:
                        nuevoBarber.visualizarBarber(arrBarber);
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Regresando al menú principal");
                        menuAdmi = 0;
                        break;
                    }
                }
                break;             
            case 2:
                while(menuReser !=0){
                   menuReser = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                                        Opciones:
                                                                                                                        1. Crear Reservación
                                                                                                                        0. Salir
                                                                                                                                                   """));
                    switch(menuReser){
                        case 1:
                            nuevoMes.ConseguirMes(arrMeses);
                            nuevoDia.AgregarDia(arrDia);
                            nuevoBarber.ConseguirBarbero(arrBarber);
                            nuevaHora.conseguirHorarioBarbe0(horasEmpleados);
                            nuevaCita.AgregarCita(arrCitas);
                            
                            JOptionPane.showMessageDialog(null, "Mes:" + nuevoMes.mesEncontrado + "\nDía:" + nuevoDia.diaEncontrado + "\nBarbero:" + nuevoBarber.barberoEncontrado + "\nHora:" + nuevaHora.horarioEncontrado + "\n" + nuevaCita.visualizarCita(arrCitas));
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null,"Regresando al menú principal" );
                            menuReser = 0;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Su opción es inválida, por favor ingrese un número que se encuentre en el menú");
                            break;
                    }
                }
                break;
            case 3:
                while(menuDev != 0){
                    menuDev = Integer.parseInt(JOptionPane.showInputDialog(null, menuDev));
                    switch (menuDev) {
                        case 1:
                           nuevaDevolucion.Devolucion(arrCitas, arrBarber,horasEmpleados );
                            break;
                        case 0: 
                            JOptionPane.showMessageDialog(null,"Regresando al menú principal" );
                            menuDev = 0;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Su opción es inválida, por favor ingrese un número que se encuentre en el menú");
                            break;
                    }
                }
                break;
            case 4:
                while(menuRevision != 0){
                    menuRevision = Integer.parseInt(JOptionPane.showInputDialog(null, menuDev));
                    switch (menuRevision) {
                        case 1:
                            break;
                        case 0: 
                            JOptionPane.showMessageDialog(null,"Regresando al menú principal" );
                            menuRevision = 0;
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
                hayBarbe = false;
                break;
            default:
                JOptionPane.showMessageDialog(null,"Su opción es inválida, por favor ingrese un número que se encuentre en el menú");
                break;
            }
        }
    
    }
    }

