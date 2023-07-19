/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglo_ingreso_barbero;

import javax.swing.JOptionPane;

/**
 *
 * @author jeanc
 */
public class Barbero 
{
    String barbeList[] = new String[5];
    public String nombreBarbero = "";
    public String horaAlmuerzo= "";
    
    public void AgregarBarbero()
    {
        for(int i = 0; barbeList.length>i; i++)
        {
            barbeList[i] = JOptionPane.showInputDialog("Ingrese el nombre del barbero");
        }
    }

    public void ModificarBarbero()
    {
     int  modPosicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del barbero que desea cambiar"));
     String cambio = JOptionPane.showInputDialog("Ingrese el nombre del nuevo barbero");
     barbeList[modPosicion] = cambio;
    } 
}
