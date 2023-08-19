/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin
 */
public class MetodosBarber {
    //cracion del atributo barberoEncontrado
    public String barberoEncontrado;
    double precioTotal; // Declaración de precioTotal
    //se utilizar para visualizar el arreglo de barbero, se usa como parametros el arreglo de barbero
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
    //metodo para encontra el barbero
     public String ConseguirBarbero(Barbero[] pBarber){
        int indice = -1;
        String buscarBarbero = "";        
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
                //metodo para conseguir el precio total, se usa como parametro el mes obtenido, el dia y las horas totales
     public double obtenerPrecio(int mesOptenido,int diaObtenido,int pHorasTotal){
        int año = 2023; // Puedes cambiar el año según sea necesario
        SimpleDateFormat formato = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        try {
            Date fecha = formato.parse(mesOptenido + " " + diaObtenido + ", " + año);
            calendar.setTime(fecha);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
        double precioConIVAFinSemana;
        double precioConIVAEntreSemana;
        if (diaSemana == Calendar.SUNDAY || diaSemana == Calendar.SATURDAY) {
            precioConIVAFinSemana = 3000 + (3000 * 0.13);
            precioTotal = precioConIVAFinSemana * pHorasTotal;
        } else{
            precioConIVAEntreSemana = 2500 + (2500 * 0.13);
            precioTotal = precioConIVAEntreSemana * pHorasTotal;
       }
        return precioTotal;
     }
}