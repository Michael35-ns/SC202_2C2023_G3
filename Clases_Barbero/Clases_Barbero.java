/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases_barbero;

/**
 *
 * @author jeanc
 */
public class Clases_Barbero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Las variables de clases barberos se crean
        Barbero barb1 = new Barbero ();
        Barbero barb2 = new Barbero ("Edward", "Manos tijeras", "Cortes de cabello");
    
        // Se usan los getters para mostrar los datos de los barberos en consola
        System.out.println("El nombre del barbero es: " + barb2.getNombre());
        System.out.println("El apellido del barbero es: " + barb2.getApellido());
        System.out.println("La especialidad del barbero es: " + barb2.getEspecialidad());
        
        // Ahora se usan los setters para darle los métodos al barbero 1
        barb1.setNombre("Arturiro");
        barb1.setApellido("Ramon");
        barb1.setEspecialidad("Afeitar");
        
        // Se imprimen en consola los setters
        System.out.println("=================================================================");
        System.out.println("El nombre del barbero es: " + barb1.getNombre());
        System.out.println("El apellido del barbero es: " + barb1.getApellido());
        System.out.println("La especialidad del barbero es: " + barb1.getEspecialidad());
        
        // Se usa los setters para modificar la especialidad del barbero 2
        barb2.setEspecialidad("Cortes de cabello estilo Undercut");
        
        // Se imprime en consola la especialidad del barbero modificada
        System.out.println("=================================================================");
        System.out.println("El nombre del barbero es: " + barb2.getNombre());
        System.out.println("El apellido del barbero es: " + barb2.getApellido());
        System.out.println("La especialidad del barbero es: " + barb2.getEspecialidad());
    }
        
}
