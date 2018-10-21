/*
CarService.java
Carmine Calicchio
20181021
*/

public class CarService{
    //Variables
    private final String[] WEEKDAY = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    private String selectedService;
    private String selectedLocation;
    private String message;

    //Constructor
    public CarService(){
        selectedService = "";
        selectedLocation = "";
        message = "";
    }

    //Setters
    public void setSelectedService(String selectedService){
        this.selectedService = selectedService;
    }

    public void setSelectedLocation(String selectedLocation){
        this.selectedLocation = selectedLocation;
    }

    public void setmessage(String message){
        this.message = message;
    }

    //Compute
    public void compute(){
        if(selectedService.toLowerCase().equals("full") && selectedLocation.toLowerCase().equals("blanchardstown")) {
            message = WEEKDAY[0];
        } else if(selectedService.toLowerCase().equals("full") && selectedLocation.toLowerCase().equals("stilorgan")) {
            message = WEEKDAY[1];
        } else if(selectedService.toLowerCase().equals("interim") && selectedLocation.toLowerCase().equals("blanchardstown")) {
            message = WEEKDAY[2];
        } else if(selectedService.toLowerCase().equals("interim") && selectedLocation.toLowerCase().equals("stilorgan")) {
            message = WEEKDAY[3];
        } else if(selectedService.toLowerCase().equals("pre-check") && selectedLocation.toLowerCase().equals("blanchardstown")) {
            message = WEEKDAY[4];
        } else if(selectedService.toLowerCase().equals("pre-check") && selectedLocation.toLowerCase().equals("stilorgan")) {
            message = WEEKDAY[5];
        } else {
            message = "Please Try Again";
        }
    }

    //Getters
    public String getMessage(){
        if(message.equals("Please Try Again")) {
            return message;
        }

        return "the selected " + selectedService + " service for " + selectedLocation + " is on " + message;
    }
}
