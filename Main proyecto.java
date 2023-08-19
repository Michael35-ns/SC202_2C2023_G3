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
        MetodosBarber nuevoBarber = new MetodosBarber();
        ClaseMes nuevoMes = new ClaseMes();
        ClaseDias nuevoDia = new ClaseDias();
        ClaseHoras nuevaHora = new ClaseHoras();
        ClaseCitas nuevaCita = new ClaseCitas();
        ClaseDevoluciones nuevaDevolucion = new ClaseDevoluciones();
        //arreglos universales a utilizar
        Barbero arrBarber[] = new Barbero[5];
        ClaseMes[] arrMeses = {
            new ClaseMes("Enero"), 
            new ClaseMes("Febrero"), 
            new ClaseMes("Marzo"),
            new ClaseMes("Abril"), 
            new ClaseMes("Mayo"),
            new ClaseMes("Junio"),
            new ClaseMes("Julio"),
            new ClaseMes("Agosto"),
            new ClaseMes("Septiembre"),
            new ClaseMes("Octubre"),
            new ClaseMes("Noviembre"), 
            new ClaseMes("Diciembre")
        };
        ClaseDias arrDia[] = new ClaseDias[31];
        for (int i = 0; i < arrDia.length; i++) {
            arrDia[i] = new ClaseDias(i);
        }
        ClaseHoras horasEmpleados[] = {
         new ClaseHoras("8:000"),
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
                            for (int i =0; i< arrCitas.length; i++){
                                nuevoMes.ConseguirMes(arrMeses);
                                nuevoDia.AgregarDia(arrDia);
                                nuevoBarber.ConseguirBarbero(arrBarber);
                                int horasTotales = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas totales: "));
                                nuevaHora.conseguirHorarioBarbe0(horasEmpleados, arrBarber, nuevoBarber.barberoEncontrado);
                                String nameCliente = JOptionPane.showInputDialog("Digite su nombre:");
                                String idCliente = JOptionPane.showInputDialog("Digite su id:");
                                String numTelefonico = JOptionPane.showInputDialog("Digite su número telefonico:");    
                                nuevoBarber.obtenerPrecio(nuevoMes.mesEncontrado, nuevoDia.diaEncontrado, horasTotales);
                                arrCitas[i] = new ClaseCitas(nameCliente, idCliente, numTelefonico, nuevoMes.mesEncontrado, nuevoDia.diaEncontrado, nuevoBarber.barberoEncontrado, nuevaHora.horarioEncontrado, nuevoBarber.precioTotal);
                            }
                            nuevaCita.visualizarCita(arrCitas);
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
                           nuevaDevolucion.Devolucion(arrCitas);
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
                            String nombreBarbe = JOptionPane.showInputDialog("Digite el nombre del barbero");
                            int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia:"));
                            String output = "Agenda para el barbero " + nombreBarbe + " en el día " + dia + ":\n";
                            double totalGanado = 0.0;
                            boolean barberoEncontrado = false;
                            for (int i = 0; i < horasEmpleados.length; i++) {
                                boolean citaEncontrada = false;
                                boolean horaDeAlmuerzo = false;

                                for (int j = 0; j < arrCitas.length; j++) {
                                    if (arrCitas[j].getBarber().equalsIgnoreCase(nombreBarbe) && arrCitas[j].getDia() == dia && arrCitas[j].getHora().equals(horasEmpleados[i].horas)) {
                                        citaEncontrada = true;
                                        output += horasEmpleados[i].horas + " - Cliente: " + arrCitas[j].getNameCliente() + " (ID: " + arrCitas[j].getIdCliente() + ", Teléfono: " + arrCitas[j].getNumTelefonico() + ")\n";
                                        totalGanado += arrCitas[j].getPrecio();
                                        break;
                                    }
                                }

                                if (!citaEncontrada) {
                                    horaDeAlmuerzo = false; 
                                    for (int a = 0; a < arrBarber.length; a++) {
                                        if (horasEmpleados[i].horas.equals(arrBarber[a].horaAlmuerzo)) { // Usar 'a' para el índice de barberos
                                            output += horasEmpleados[i].horas + " - HORA DE ALMUERZO\n";
                                            horaDeAlmuerzo = true;
                                            break; // 
                                        }
                                    }

                                    if (!horaDeAlmuerzo) {
                                        output += horasEmpleados[i].horas + " - VACIO\n";
                                    }
                                }
                            }
                            output += "Total ganado por el barbero en el día: $" + totalGanado;
                            JOptionPane.showMessageDialog(null, output);
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
