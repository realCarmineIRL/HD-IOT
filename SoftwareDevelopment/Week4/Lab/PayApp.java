/*
PayApp.java
Carmine Calicchio
20181008
*/
import java.util.*;

public class PayApp{
    public static void main(String[] args) {
        //Declare variables
        double basicRate;
        double basicHours;
        double overTimeHours;
        double basicPay;
        double overTimePay;
        double totalPay;
        //Objets
        Scanner Keyboard;
        Keyboard=new Scanner(System.in);
        Pay myPay;
        myPay=new Pay();

        //Input
        System.out.println("Enter Basic Pay Rate:");
        basicRate=Keyboard.nextDouble();
        myPay.setBasicRate(basicRate);

        System.out.println("Enter Basic Number of Hours:");
        basicHours=Keyboard.nextDouble();
        myPay.setBasicHours(basicHours);

        System.out.println("Enter Overtime Number of Hours:");
        overTimeHours=Keyboard.nextDouble();
        myPay.setOverTimeHours(overTimeHours);

        //compute
        myPay.compute();

        //Output
        basicPay=myPay.getBasicPay();
        overTimePay=myPay.getOverTimePay();
        totalPay=myPay.getTotalPay();

        System.out.println("Total Basic Pay = " + basicPay);
        System.out.println("Total Overtime Pay = " + overTimePay);
        System.out.println("Total Pay = " + totalPay);
    }
}
