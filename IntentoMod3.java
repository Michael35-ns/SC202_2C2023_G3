/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject5;
import javax.swing.JOptionPane;
/**
 *
 * @author crisn
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nameCliente[] = {"0.Carlos","1.Roberto","2.José","3.Juan"};
        String nameBarbe[] = {"0.Josep", "1.Arturito","2.Beto"};
        String diaCita[] = {"0.Lunes","1.Miércoles","2.Viernes"};
        
        for (int i=0; i<nameCliente.length; i++){
             System.out.println(nameCliente[i]);
}int busCliente =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente a su nombre como cliente"));
String newSpace = nameCliente[busCliente] = "Vacío";
      
         for (int x=0; x<nameBarbe.length; x++){
                System.out.println(nameBarbe[x]);
}int busBarbe =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente a su barbero"));
String newBarbe = nameBarbe[busBarbe] = "Libre";
      
         for (int y=0; y<diaCita.length; y++){
                System.out.println(diaCita[y]);
}int busCita =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente a su cita"));
String newCite = diaCita[busCita] = "Libre";
      
      System.out.println("El espacio está " + newSpace+ " El barbero era: " + newBarbe + " El día de la cita era "+newCite);
      
      System.out.println(nameCliente[busCliente]);
      System.out.println(nameBarbe[busBarbe]);
      System.out.println( diaCita[busCita]);    
        }    
    }
    

