/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class Barbero {
private String nombreBarbe;
private String horaAlmuerzo;
public  String calendario[][] = {{"1","2","3","4","5","6"},{"7","8","9","10","11","12"},{"13","14","15","16","17","18"},{"19","20","21","22","23","24"},{"25","26","27","28","29","30"}};

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

    public void setNombreBarbe(String nombreBarbe) {
        this.nombreBarbe = nombreBarbe;
    }

    public void setHoraAlmuerzo(String horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }
    

    

    
    
    

    
    
}
