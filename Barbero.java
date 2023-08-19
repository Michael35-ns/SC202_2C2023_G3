/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class Barbero {
    //creacion de atributos
    public String nombreBarbe;
    public String horaAlmuerzo;
    public String horario;
    // Constructor de la clase, toma en cuenta el nombre y hora de alumerzo
    public Barbero (String nombreBarbe, String horaAlmuerzo){
        this.nombreBarbe = nombreBarbe;
        this.horaAlmuerzo = horaAlmuerzo;
    }
    //constructor sin parametros
    public Barbero(){
        
    }
    //get para conseguir el nombre
    public String getNombreBarbe() {
        return nombreBarbe;
    }
    //get para conseguir la hora de almuerzo
    public String getHoraAlmuerzo() {
        return horaAlmuerzo;
    }
}
