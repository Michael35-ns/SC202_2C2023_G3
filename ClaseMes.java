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
public class ClaseMes {
    String NameMeses[];
    public String ConseguirMes () {
        int indice = -1;
        String buscarMes = "";
        String mesEncontrado = "";
        do {
            buscarMes =  JOptionPane.showInputDialog("Digite el mes que desea realizar la cita");
            for(int i = 0; i<NameMeses.length; i++) {
                if (NameMeses[i].equals(buscarMes)){
                    indice = i;
                    mesEncontrado = NameMeses[i];
                    break;
                }
            }
        }while(indice ==-1);
            if (NameMeses[indice] == "Enero") {
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
                
            }else if (NameMeses[indice] == "Febrero"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Marzo"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Abril"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Mayo"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Junio"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Julio"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Agosto"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Septiembre"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Octubre"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Noviembre"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }else if (NameMeses[indice] == "Diciembre"){
                ClaseDias nuevoDia = new ClaseDias();
                nuevoDia.buscarDia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia que desea realizar la cita"));
                nuevoDia.AgregarDia();
            }            
        return mesEncontrado; 
    }
}
