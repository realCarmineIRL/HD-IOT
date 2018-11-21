/*
LotteryPrize.java
Carmine
20181114
*/
import java.util.*;

public class LotteryPrize{

    private int guessedNumbers;
    private String prize;

    public LotteryPrize(){
        guessedNumbers = 0;
        prize = "";
    }

    public void setGuessedNumbers(int guessedNumbers){
        this.guessedNumbers = guessedNumbers;
    }

    public void checkPrize() {
        switch(guessedNumbers) {
            case 3: 
                prize = "EUR100";
                break;
            case 4: 
                prize = "EUR250";
                break;
            case 5:
                prize = "EUR1000";
                break;
            case 6:
                prize = "Won the Lottery";
                break;
            default:
                prize = "0";
        }
    }

    public String getPrize(){
        return prize;
    }

}