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
public class ClaseCitas {
    /*creaccion de las variables del cliente
    */
    private String nameCliente = ""; 
    private String idCliente = "";
    private String numTelefonico = "";
    private String mes;
    private int dia;
    private String barber;
    private String hora;
    private double precio;

    // constructor sin parametros 
    public ClaseCitas (){
    }
    /* se muestra con get el nombre del cliente, no se hace modificaciones en este
    */
    public String getNameCliente() {
        return nameCliente;
    }
    /* se muestra el id solo que en vez de mostrarlo completo solo se muestar los primeros 3 numeros 
    */
    public String getIdCliente() {
        return idCliente;
    }

    /* se muuestra el numero y se agrega el +506 a la hora de visualizar el número
    */
    public String getNumTelefonico () {
        String comun1 = "+506 ";
        return comun1+this.numTelefonico.substring(0, 3)+"-"+this.numTelefonico.substring(4, 7);
    }
    //get para conseguir el barbero de la cita
    public String getBarber() {
        return barber;
    }
    //get para conseguir el dia de la cita
    public int getDia() {
        return dia;
    }
    //get para conseguir la hora de la cita
    public String getHora() {
        return hora;
    }
    //get para conseguir el mes de la cita
    public String getMes() {
        return mes;
    }
    //get para conseguir el precio
    public double getPrecio() {
        return precio;
    }
    
    //constructor con parametros, guarda el nombre,id y telefono del clientes, ademas guarda al barbero que lo atinde, la hora, el dia y mes de la cita y el precio que tendra que pagar
    public ClaseCitas(String pNombre, String pId,String pTelefono,String pMesElegido,int diaElegido,String barberoElegido,String horaElegida, double pPrecio){
        this.nameCliente = pNombre;
        this.idCliente = pId;
        this.numTelefonico = pTelefono;
        this.barber = barberoElegido;
        this.dia = diaElegido;
        this.mes = pMesElegido;
        this.hora = horaElegida;
        
    }  
    //metodo para poder visualizar la informacion de la cita completada
    public String visualizarCita(ClaseCitas[] pCitas) {
        String textoCom = "";
        for (int i = 0; i < pCitas.length; i++) {
            textoCom = "Mes: " + pCitas[i].mes +"\nDia: " + pCitas[i].dia + "\nBarbero: " + pCitas[i].barber + "\nHora: " + pCitas[i].hora + "\nNombre: " + pCitas[i].getNameCliente()+ "\n" + "Id: " + pCitas[i].getIdCliente() + "\n" + "Número Telefonico: " + pCitas[i].getNumTelefonico() + "\nTotal:" + pCitas[i].getPrecio();
        }
        JOptionPane.showMessageDialog(null, textoCom);
        return textoCom;
    }
   
}
