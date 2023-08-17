/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_2;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class Barbero {
public String nombreBarbe;
public String horaAlmuerzo;
private double saldo; 
public String horario;
        
    public Barbero (String nombreBarbe, String horaAlmuerzo){
        this.nombreBarbe = nombreBarbe;
        this.horaAlmuerzo = horaAlmuerzo;
    }
    
    public Barbero(){
        
    }
    
    public String getNombreBarbe() {
        return nombreBarbe;
    }

    public String getHoraAlmuerzo() {
        return horaAlmuerzo;
    }
}




