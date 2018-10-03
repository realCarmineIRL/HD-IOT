/*
JohnTheFarmer.java
Carmine Calicchio
20181001
*/

import java.util.*;

public class JohnTheFarmer{
    public static void main(String[] args) {
        //declare variables
        int numberOfEggs;
        int numberOfBoxes;
        int eggsLeftOver;

        //Objects
        Scanner Keyboard;
        Keyboard=new Scanner(System.in);
        EggBoxes eggBoxes;
        eggBoxes=new EggBoxes();

        //input
        System.out.println("Enter number of eggs");
        numberOfEggs=Keyboard.nextInt();
        eggBoxes.setNumberOfEggs(numberOfEggs);

        eggBoxes.compute();

        numberOfBoxes=eggBoxes.getNumberOfBoxes();
        eggsLeftOver=eggBoxes.getEggsLeftOver();

        //outout
        System.out.println("Egg boxes = " + numberOfBoxes);
        System.out.println("Eggs left Over = " + eggsLeftOver);
    }
}
