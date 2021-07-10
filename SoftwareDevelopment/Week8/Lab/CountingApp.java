/*
CountingApp.java
Carmine Calicchio
20181022
*/

import javax.swing.*;
public class CountingApp{
    public static void main(String[] args){
        //Variables
        String phrase;
        int vowels;
        int consonants;
        int spaces;

        //Objects
        Counting myCounting;
        myCounting=new Counting();

        phrase=JOptionPane.showInputDialog(null,"Please input a phrase ");
        myCounting.setPhrase(phrase);

        myCounting.compute();

        vowels=myCounting.getVowels();
        consonants=myCounting.getConsonants();
        spaces=myCounting.getSpaces();
        JOptionPane.showMessageDialog(null,"vowels: " + vowels + ", consonants: " + consonants + ", spaces: " + spaces );
    }
}
