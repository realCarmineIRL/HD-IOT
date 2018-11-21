/*
LotteryApp.java
Carmine
20181114
*/
import java.util.*;
import javax.swing.*;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class LotteryApp{
    public static void main(String[] args) {
        
        List<Integer> lotteryLine;
        LotteryGenLine myLotteryGenLine;
        LotteryCheckUserLine myLotteryCheckUserLine;
        LotteryPrize myLotteryPrize;
        List<String> gameHistory;
        String gameResult;
        String prize;
        String option;
        
        gameHistory = new ArrayList<>();
        
        do {

            myLotteryGenLine = new LotteryGenLine();
            myLotteryCheckUserLine = new LotteryCheckUserLine();
            myLotteryPrize = new LotteryPrize();

            myLotteryGenLine.genLotteryLine();
            lotteryLine = myLotteryGenLine.getLotteryLine();

            String[] userLines = new String[3];

            for (int i=0; i<userLines.length; i++) {
                userLines[i] = JOptionPane.showInputDialog(null,"Please enter your line number " + (i+1) +":");
            }

            System.out.println(lotteryLine);

            for(int i=0; i<userLines.length; i++) {

                myLotteryCheckUserLine.setUserLine(userLines[i]);

                myLotteryCheckUserLine.compute();
        
                List<Integer> matchedNumbers = myLotteryCheckUserLine.getUserLine();
        
                matchedNumbers.retainAll(lotteryLine);

                myLotteryPrize.setGuessedNumbers(matchedNumbers.size());
                myLotteryPrize.checkPrize();
                prize = myLotteryPrize.getPrize();

                gameResult = "Lottery Line = " + lotteryLine + 
                             " your line was = " + userLines[i] + 
                             " you have guessed " + matchedNumbers.size() + " numbers " +
                             " and your prize is " + prize;

                gameHistory.add(gameResult);
                
            }

            option = JOptionPane.showInputDialog(null,"Would you like to continue Y or N:");
            
        } while (option.equals("Y"));

        for (int i = 0; i<gameHistory.size(); i++) {
            System.out.println(gameHistory.get(i));
        }
    }
}