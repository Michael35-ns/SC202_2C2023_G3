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
    menu = Integer.parseInt(JOptionPane.showInputDialog(" Opciones: \n 1. Administraci�n del personal " + "\n 2. Reservaci�n" + "\n 3. Devoluciones"
            + "\n 4. Revisi�n de agendas" + "\n 5. Salir del sistema"));
    switch(menu){
        case 1:
            JOptionPane.showMessageDialog(null,"Su opci�nn es la de administrar el personal");
            break;
        case 2:
            JOptionPane.showMessageDialog(null,"Su opci�n es la de reservar citas");
            break;
        case 3:
            JOptionPane.showMessageDialog(null,"Su opci�n es la de devoluciones");
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Su opci�n es la de revisar agendas");
            break;
        case 5:
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

