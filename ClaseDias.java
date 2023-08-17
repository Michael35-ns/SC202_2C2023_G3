/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class ClaseDias {
    public int dia;
    int diaEncontrado = 0;
    
    public ClaseDias(int pdia){
        this.dia = pdia;
    }

    public ClaseDias() {
    }
    
    int buscarDia = 0;
    public int AgregarDia(ClaseDias[] pDia) {
        int indice = -1;
        
            buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
            for(int i = 0; i<pDia.length; i++) {
                if (pDia[i].dia == buscarDia){
                    indice= i;
                    diaEncontrado = pDia[i].dia;
                    break;
                }
            }
        return diaEncontrado;
    }
    
    public double Precio(ClaseDias[] pDias) {
         double totalPago = 0.0;
         Calendar calendario = Calendar.getInstance();
         for (int dia = 0; dia < pDias.length; dia++) {
            calendario.set(Calendar.DAY_OF_MONTH, dia);
            int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
            if (diaSemana == Calendar.SATURDAY || diaSemana == Calendar.SUNDAY) {
                double precioIvaSabadoYDomingo = 3000+(3000*0.13);
                
            } else {
                double precioIvaLunesAViernes = 2500+(2500*0.13);
            }
        }
        return totalPago;
    }
}
