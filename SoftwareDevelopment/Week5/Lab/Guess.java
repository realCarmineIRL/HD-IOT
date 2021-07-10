/*
Guess.java
Carmine Calicchio
20181015
*/
import java.lang.Math.*;

public class Guess{
    //data members
    private int guessedNumber;
    private int randomNumber;
    private String message;

    //constructor
    public Guess(){
        guessedNumber=0;
        randomNumber=(int)(Math.random()*10);
    }

    public void setGuessedNumber(int guessedNumber){
        this.guessedNumber=guessedNumber;
    }

    //compute
    public void compute(){
        if(guessedNumber>randomNumber){
            message="You guessed too high, sorry!";
        }
        else if(guessedNumber<randomNumber){
            message="you guessed to low, sorry!";
        }
        else{
            message="Congratulations, you guessed correctly!";
        }
    }

    //getters
    public String getMessage(){
        return message;
    }
}
