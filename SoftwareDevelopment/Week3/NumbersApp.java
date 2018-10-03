/*
NumbersApp.java
Carmine Calicchio
20181001
*/

import java.util.*;

public class NumbersApp{
    public static void main(String[] args) {
        //declare variables
        int num1;
        int num2;
        int sum;

        //objets
        Scanner Keyboard;
        Keyboard = new Scanner(System.in);
        Numbers myNumbers;
        myNumbers = new Numbers();

        //input
        System.out.println("Enter num1");
        num1 = Keyboard.nextInt();
        myNumbers.setNum1(num1);

        System.out.println("Enter num2");
        num2 = Keyboard.nextInt();
        myNumbers.setNum2(num2);

        //process
        myNumbers.compute();

        sum = myNumbers.getSum();

        System.out.println("Sum = " + sum);
    }
}
