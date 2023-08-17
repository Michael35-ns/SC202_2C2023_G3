/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2;

import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class ClaseMes {
    String mesEncontrado = "";
    public String ConseguirMes (String[] pMeses) {
        ClaseDias arrDia[] = new ClaseDias[30];
        for (int i = 0; i < arrDia.length; i++) {
            arrDia[i] = new ClaseDias(i+1);
        }
        int indice = -1;
        String buscarMes = "";
        
        do {
            buscarMes =  JOptionPane.showInputDialog("Enero\nFebrero\nMarzo\nAbril\nMayo\nJunio\nJulio\nAgosto\nSeptiembre\nOctubre\nNoviembre\nDiciembre\nDigite el nombre del mes que desea realizar la cita", "");
            for(int i = 0; i<pMeses.length; i++) {
                if (pMeses[i].equals(buscarMes)){
                    indice = i;
                    mesEncontrado = pMeses[i];
                    break;
                }
            }
        }while(indice ==-1);
        
        return mesEncontrado; 
    }
}
