/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2;

/**
 *
 * @author crisn
 */

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin
 */
public class Barbero1 {
    public String barberoEncontrado = "";
    
     public String visualizarBarber(Barbero[] pBarber){
         String mostrarBarberos = "";
         String textoComp = "";
         for(int i = 0; i < pBarber.length; i++){
              mostrarBarberos = pBarber[i].getNombreBarbe() + pBarber[i].getHoraAlmuerzo();
              textoComp += "Barbero " + pBarber[i].getNombreBarbe() + " - Hora de almuerzo " + pBarber[i].getHoraAlmuerzo()+"\n";
         }
         JOptionPane.showMessageDialog(null, textoComp);
         return mostrarBarberos;
    }
    
     public String ConseguirBarbero(Barbero[] pBarber){
        int indice = -1;
        String buscarBarbero = "";
        barberoEncontrado = "";
        
            do {
                buscarBarbero =  JOptionPane.showInputDialog("Digite el nombre del barbero que desea que lo atiende:");
                for(int i = 0; i < pBarber.length; i++) {
                    if (pBarber[i].getNombreBarbe().equals(buscarBarbero)){
                        indice = i;
                        barberoEncontrado = pBarber[i].getNombreBarbe();
                        break;
                    }
                }
            }while(indice == -1);
            return barberoEncontrado;
    }
}

