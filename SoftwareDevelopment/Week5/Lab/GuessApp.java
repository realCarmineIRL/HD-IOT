/*
GuessApp.java
Carmine Calicchio
20181015
*/
import javax.swing.*;
public class GuessApp{
    public static void main(String[] args) {
        int guessedNumber;
        String message;

        Guess myGuess;
        myGuess=new Guess();

        guessedNumber=Integer.parseInt(JOptionPane.showInputDialog(null,"Please Guess a number:"));
        myGuess.setGuessedNumber(guessedNumber);

        myGuess.compute();

        message=myGuess.getMessage();
        JOptionPane.showMessageDialog(null,message);

    }
}
