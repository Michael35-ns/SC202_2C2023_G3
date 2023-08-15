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
public class controlBarbe {
    public Barbero  arrBarber[] = new Barbero[2];
    public String texto = "";
    public String buscarBarbero = "";
    Barbero barbe1 = new Barbero();
    String  nombreBarbe = "";

public void guardarBarbe(){
         for(int i =0; i<arrBarber.length; i++){
            nombreBarbe = JOptionPane.showInputDialog("Ingrese el nombre del barbero");
                     arrBarber[i] = new Barbero(nombreBarbe);
        }
}
public void ver(){
    for(int i =0; i<arrBarber.length; i++){
       texto+= "El nombre del barbero es: "+arrBarber[i].nombreBarbe;
    }JOptionPane.showMessageDialog(null, texto);
}


public void ConseguirBarbero(){
        int indice = -1;
        do {
            buscarBarbero =  JOptionPane.showInputDialog("Digite el nombre del barbero que desea que lo atiende:");
            for(int i = 0; i < this.arrBarber.length; i++) {
                if (this.arrBarber[i].nombreBarbe.equals(buscarBarbero)){
                    indice= i;
                    break;
                }
            }
        }while(indice ==-1);
        if (this.arrBarber[indice].nombreBarbe ==this.arrBarber[0].nombreBarbe) {
            ClaseHoras horario = new ClaseHoras();
            horario.conseguirHorario();
        }
    }
}
