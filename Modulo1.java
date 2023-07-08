/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Ghost
 */
public class Modulo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Barber joseph = new Barber("Joseph", "8:00 AM", "6:00 PM", "1:00 PM", "1:30 PM");
        Barber jazmin = new Barber("Jazmín", "8:00 AM", "6:00 PM", "1:30 PM", "2:00 PM");
        Barber jeanCarlo = new Barber("Jean Carlo", "8:00 AM", "6:00 PM", "1:30 PM", "2:00 PM");
        Barber cristopher = new Barber("Cristopher", "8:00 AM", "6:00 PM", "1:30 PM", "2:00 PM");
        Barber arturito = new Barber("Arturito", "8:00 AM", "6:00 PM", "1:00 PM", "1:30 PM");
        
        Barber selectedBarber = null;
        
        String[] barberNames = {"Joseph", "Jazmín", "Jean Carlo", "Cristopher", "Arturito"};
        int selectedOption = JOptionPane.showOptionDialog(null, "Seleccione un barbero",
                "Sistema de citas de la barbería", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, barberNames, barberNames[0]);
        
        if (selectedOption != JOptionPane.CLOSED_OPTION) {
            String selectedBarberName = barberNames[selectedOption];
            switch (selectedBarberName) {
                case "Joseph":
                    selectedBarber = joseph;
                    break;
                case "Jazmín":
                    selectedBarber = jazmin;
                    break;
                case "Jean Carlo":
                    selectedBarber = jeanCarlo;
                    break;
                case "Cristopher":
                    selectedBarber = cristopher;
                    break;
                case "Arturito":
                    selectedBarber = arturito;
                    break;
            }
            
            if (selectedBarber != null) {
                String selectedTime = JOptionPane.showInputDialog(null, "Ingrese la hora de la cita (formato: HH:MM AM/PM)");
                
                if (selectedTime != null) {
                    if (selectedBarber.isLunchTime(selectedTime)) {
                        JOptionPane.showMessageDialog(null, "NO se puede citar en hora de almuerzo.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usted ha agendado una cita con " + selectedBarber.getName() +
                                " a la hora " + selectedTime + ".\nLe esperamos.");
                    }
                }
            }
        }
    }
}

class Barber {
    private String name;
    private String startTime;
    private String endTime;
    private String lunchStartTime;
    private String lunchEndTime;
    
    public Barber(String name, String startTime, String endTime, String lunchStartTime, String lunchEndTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lunchStartTime = lunchStartTime;
        this.lunchEndTime = lunchEndTime;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isLunchTime(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1].substring(0, 2));
        String period = parts[1].substring(3);
        
        String[] lunchStartParts = lunchStartTime.split(":");
        int lunchStartHour = Integer.parseInt(lunchStartParts[0]);
        int lunchStartMinute = Integer.parseInt(lunchStartParts[1].substring(0, 2));
        String lunchStartPeriod = lunchStartParts[1].substring(3);
        
        String[] lunchEndParts = lunchEndTime.split(":");
        int lunchEndHour = Integer.parseInt(lunchEndParts[0]);
        int lunchEndMinute = Integer.parseInt(lunchEndParts[1].substring(0, 2));
        String lunchEndPeriod = lunchEndParts[1].substring(3);
        
        if (period.equals(lunchStartPeriod) && period.equals(lunchEndPeriod)) {
            return (hour >= lunchStartHour && hour < lunchEndHour) &&
                    (minute >= lunchStartMinute && minute < lunchEndMinute);
        } else if (period.equals(lunchStartPeriod)) {
            return (hour >= lunchStartHour) && (minute >= lunchStartMinute);
        } else if (period.equals(lunchEndPeriod)) {
            return (hour < lunchEndHour) && (minute < lunchEndMinute);
        }
        
        return false;
    }
    
}
