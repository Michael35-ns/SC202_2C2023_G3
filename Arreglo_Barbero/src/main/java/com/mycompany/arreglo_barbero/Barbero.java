/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglo_barbero;

/**
 *
 * @author jeanc
 */
public class Barbero {
    // Metodos de la clase
    private String nombre;
    private String horaAlmuerzo;
    public String mostrarInfo() 
    {
        return "nombre: " + this.nombre + "\nhora de almuerzo: " + this.horaAlmuerzo;
    }

    // Constructor de la clase
    public Barbero(String nombre, String horaAlmuerzo) {
        this.nombre = nombre;
        this.horaAlmuerzo = horaAlmuerzo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoraAlmuerzo() {
        return horaAlmuerzo;
    }

    public void setHoraAlmuerzo(String horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }
    
    

    
    
    
}
