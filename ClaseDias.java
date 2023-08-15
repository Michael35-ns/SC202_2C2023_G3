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
    int dias[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30
    };
    
    int buscarDia = 0;
    public void AgregarDia() {
        int indice = -1;
        int diaEncontrado = 0;
            for(int i = 0; i<dias.length; i++) {
                if (dias[i] == buscarDia){
                    indice= i;
                    diaEncontrado = dias[i];
                    break;
                }
            }
        if (dias[indice] == 1) {
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
            
        }else if (dias[indice] == 2){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 3){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 4){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 5){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 6){
           controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 7){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 8){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 9){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 10){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 11){
          controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 12){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 13){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 14){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 15){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 16){
           controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 17){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 18){
           controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 19){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 20){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 21){
           controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 22){
           controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 23){
          controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 24){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 25){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 26){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 27){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 28){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 29){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }else if (dias[indice] == 30){
            controlBarbe nuevoBarbero = new controlBarbe();
            nuevoBarbero.ConseguirBarbero();
        }
    }
    
    public int Precio() {
         double totalPago = 0.0;
        Calendar calendario = Calendar.getInstance();
         for (int dia : dias) {
            calendario.set(Calendar.DAY_OF_MONTH, dia);
            int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);

            if (diaSemana == Calendar.SATURDAY || diaSemana == Calendar.SUNDAY) {
                double precioIvaSabadoYDomingo = 3000+(3000*0.13);
                
                
            } else {
                double precioIvaLunesAViernes = 2500+(2500*0.13);
            }
        }
        return 0;
    }
}
