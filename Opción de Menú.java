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

JOptionPane.showMessageDialog(null, "Bienvenido a la BarberÃ­a ");
        

boolean hayCliente = true;
while (hayCliente) {
    menu = Integer.parseInt(JOptionPane.showInputDialog(" Opciones: \n 1. Administración del personal " + "\n 2. Reservación" + "\n 3. Devoluciones"
            + "\n 4. Revisión de agendas" + "\n 5. Salir del sistema"));
    switch(menu){
        case 1:
            JOptionPane.showMessageDialog(null,"Su opciónn es la de administrar el personal");
            break;
        case 2:
            JOptionPane.showMessageDialog(null,"Su opción es la de reservar citas");
            break;
        case 3:
            JOptionPane.showMessageDialog(null,"Su opción es la de devoluciones");
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Su opción es la de revisar agendas");
            break;
        case 5:
            JOptionPane.showMessageDialog(null,"Usted saliÃ³ del menÃº, gracias! Nos vemos pronto.");
            hayCliente = false;
            break;
        default:
        JOptionPane.showMessageDialog(null,"Su opciÃ³n es invÃ¡lida, por favor ingrese un nÃºmero que se encuentre en el menÃº");
        break;
       
            }
        }    
    }
}   

