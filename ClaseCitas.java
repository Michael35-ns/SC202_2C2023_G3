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
public class ClaseCitas {
    /*creaccion de las variables del cliente
    */
    private String nameCliente = ""; 
    private String idCliente = "";
    private String numTelefonico = "";

    // constructor
    public ClaseCitas (){
    }
    /*se solicita el nombre al cliente, si agrega nùmeros se le dice que da error
    */
    public void setNameCliente(String pNameCliente) {
        int contErrores = 0;
        for (int i = 0; i<pNameCliente.length(); i++) {
            if(Character.isDigit(pNameCliente.charAt(i))) {
               contErrores++;
            }
        }
        if (contErrores > 0) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar números, vuelva a intentarlo.");
        } else {
            this.nameCliente = pNameCliente;
        }    
    }
    /* se muestra con get el nombre del cliente, no se hace modificaciones en este
    */
    public String getNameCliente() {
        return nameCliente;
    }
    /* se solita el id con set, si es menor a 9 caractes o si se ingresa letras entonces da error
    */
    public void setIdCliente(String pIdCliente) {
        int contErrores = 0;
        for (int i = 0; i<pIdCliente.length(); i++) {
            if(Character.isAlphabetic(pIdCliente.charAt(i))) {
               contErrores++;
            }
        }
        if (pIdCliente.length()<9) {
            JOptionPane.showMessageDialog(null, "Su identificacion ingresada no cuenta con 9 digitos");
        } if (contErrores > 0) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar letras, vuelva a intentarlo.");
        }else{
            this.idCliente = pIdCliente;
        }
    }
    /* se muestra el id solo que en vez de mostrarlo completo solo se muestar los primeros 3 numeros 
    */
    public String getIdCliente() {
        String aste = "";
        for (int i = 5; i < this.idCliente.length(); i++) {
            aste += "*";
        }
        return idCliente.substring(0, 3)+ aste;
    }
    /* se solicita el numero con set, si se encuentra letras entonces da un error
    */
    public void setNumTelefonico (String pNumTelefonico) {
        int contErrores = 0;
        for (int i = 0; i<pNumTelefonico.length(); i++) {
            if(Character.isAlphabetic(pNumTelefonico.charAt(i))) {
               contErrores++;
            }
        if (contErrores>0) {
                JOptionPane.showMessageDialog(null, "No se puede ingresar letras, vuelva a intentarlo.");
        } else {
            this.numTelefonico = pNumTelefonico;
        }    
        }
    }
    /* se muuestra el numero y se agrega el +506 a la hora de visualizar el número
    */
    public String getNumTelefonico () {
        String comun1 = "+506 ";
        return comun1+this.numTelefonico.substring(0, 3)+"-"+this.numTelefonico.substring(4, 7);
    }

    public ClaseCitas(String pNombre, String pId,String pTelefono){
        this.nameCliente = pNombre;
        this.idCliente = pId;
        this.numTelefonico = pTelefono;
    }
}