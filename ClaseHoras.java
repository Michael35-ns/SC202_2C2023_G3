/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin
 */
public class ClaseHoras {
    //se crea el atributo de horas y se utilizar el atributo de horarioEncontrado para guardar despues en el modulo de citas
    String horas;
    String horarioEncontrado = "";
    //constructor con el parametro de horas 
    public ClaseHoras(String horas) {
        this.horas = horas;
    }
    //constructor vacio
    public ClaseHoras() {
    }
    
    //metodo para buscar el horario del barbero, se usar el parametro del arreglo de barbero y de horas, y el del nombre encontrado
    public String conseguirHorarioBarbe0(ClaseHoras[] pHoras,Barbero[] pBarber,String pNombreEncontrado) {
        // se utiliza un indice para determinar si volver a preguntar la variable de busqueda
        int indice = -1;
        //se inicializa la variable que va a buscar
        String buscarHorario = "";
        // se usa un do while 
        do {
            buscarHorario =  JOptionPane.showInputDialog("8:00\n9:00\n10:00\n11:00\n12:00\n13:00\n14:00\n15:00\n16:00\n17:00"+"\n"+"Digite el horario que desea reservar:", "");
            for(int i = 0; i < pHoras.length; i++) {
                    //se utiliza un if para determinar que la hora este en el arreglo de horas
                    if (pHoras[i].horas.equals(buscarHorario)){
                        //aqui se valida si la hora seleccionada por el usuario es la hora de almuerzo del barbero. Se utiliza el indice = -1 para que vuelva a consultar por una nueva hora
                    if (pBarber[0].getNombreBarbe().equals(pNombreEncontrado) && pBarber[0].getHoraAlmuerzo().equals(buscarHorario)){
                        JOptionPane.showMessageDialog(null, "El barbero esta en su almuerzo");
                        indice = -1;
                    }else if(pBarber[1].getNombreBarbe().equals(pNombreEncontrado) && pBarber[1].getHoraAlmuerzo().equals(buscarHorario)){
                        JOptionPane.showMessageDialog(null, "El barbero esta en su almuerzo");
                        indice = -1;
                    }else if(pBarber[2].getNombreBarbe().equals(pNombreEncontrado) && pBarber[2].getHoraAlmuerzo().equals(buscarHorario)){
                        JOptionPane.showMessageDialog(null, "El barbero esta en su almuerzo");
                        indice = -1;
                    }else if(pBarber[3].getNombreBarbe().equals(pNombreEncontrado) && pBarber[3].getHoraAlmuerzo().equals(buscarHorario)){
                        JOptionPane.showMessageDialog(null, "El barbero esta en su almuerzo");
                    }else if (pBarber[4].getNombreBarbe().equals(pNombreEncontrado) && pBarber[4].getHoraAlmuerzo().equals(buscarHorario)){
                        JOptionPane.showMessageDialog(null, "El barbero esta en su almuerzo");
                        indice = -1;
                        //si no es la hora se valida los requisitos para que se pueda agendar
                    }else if (pHoras[i].horas.equals(buscarHorario) || (pHoras[i].horas == null) || (pHoras[i].horas.isEmpty())){
                        //  la variable indice es dirente a -1 por lo que saldria del bucle
                        indice= i;
                        horarioEncontrado = pHoras[i].horas;
                        break;
                    }
                }   
            }
   
        }while(indice ==-1);
        //se retorna la variable horarioEncontrado
        return horarioEncontrado;
    } 
}
