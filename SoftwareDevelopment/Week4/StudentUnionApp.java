/*
StudenUnion.java
Carmine Calicchio
20181008
*/
import java.util.*;

public class StudentUnionApp{
    public static void main(String[] args) {
        //Declare variables
        int capAmount;
        int hoodyAmount;
        int shirtAmount;
        double totalCost;
        //Objets
        Scanner Keyboard;
        Keyboard=new Scanner(System.in);
        StudentUnion studentUnion;
        studentUnion=new StudentUnion();

        //Input
        System.out.println("Enter Cap quantity:");
        capAmount=Keyboard.nextInt();
        studentUnion.setCapAmount(capAmount);

        System.out.println("Enter Hoody quantity:");
        hoodyAmount=Keyboard.nextInt();
        studentUnion.setHoodyAmount(hoodyAmount);

        System.out.println("Enter Shirt quantity:");
        shirtAmount=Keyboard.nextInt();
        studentUnion.setShirtAmount(shirtAmount);

        //compute
        studentUnion.compute();

        //Output
        totalCost=studentUnion.getTotalCost();
        System.out.println("Total Amount = " + totalCost);
    }
}
