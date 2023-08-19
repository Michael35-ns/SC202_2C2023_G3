package com.mycompany.prueba;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yazmin
 */
public class ClaseMes {
    //creacion del atributo mes y de la variable mesEncontrado
    public String meses;
    String mesEncontrado = "";
    //Constructor sin paramentros 
    public ClaseMes() {
    }
    //constructor con parametros
    public ClaseMes(String meses) {
        this.meses = meses;
    }
    
    int indice = -1;
    //metodo para buscar el mes, se usa el parametro de arreglo meses
    public String ConseguirMes (ClaseMes[] pMeses) {
        //variable para buscar el mes
        String buscarMes = "";
        //se usa do while
        do {
            //se pregunta el mes al usuario
            buscarMes =  JOptionPane.showInputDialog("Enero\nFebrero\nMarzo\nAbril\nMayo\nJunio\nJulio\nAgosto\nSeptiembre\nOctubre\nNoviembre\nDiciembre\nDigite el nombre del mes que desea realizar la cita", "");
            //for para buscar el mes dentro del arreglo
            for(int i = 0; i<pMeses.length; i++) {
                //validar si el bus a buscar esta dentro del arreglo, si es asi el indice se vuelve i y mes encontrado se vuelve en la posicion de arreglo
                if (pMeses[i].meses.equals(buscarMes)){
                    indice = i;
                    mesEncontrado = pMeses[i].meses;
                    break;
                }
            }
            //si no es asi entonces el indice sigue siendo -1 entonces vuelve con el bucle
        }while(indice ==-1);
        //se retorna la variable de mesEncontrado
        return mesEncontrado; 
    }
}
