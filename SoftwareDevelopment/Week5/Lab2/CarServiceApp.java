/*
CarServiceApp.java
Carmine Calicchio
20181021
*/
import javax.swing.*;
public class CarServiceApp{
    public static void main(String[] args) {
        //Variables
        String selectedService;
        String selectedLocation;
        String message;

        //Objects
        CarService myCarService;
        myCarService = new CarService();

        selectedService = JOptionPane.showInputDialog(null,"What type of service are you looking for full, interim or pre-check ? ");
        myCarService.setSelectedService(selectedService);

        selectedLocation = JOptionPane.showInputDialog(null,"Where would you like to go for your service Blanchardstown or Stilorgan ?");
        myCarService.setSelectedLocation(selectedLocation);

        myCarService.compute();

        message = myCarService.getMessage();
        JOptionPane.showMessageDialog(null,message);
    }
}
