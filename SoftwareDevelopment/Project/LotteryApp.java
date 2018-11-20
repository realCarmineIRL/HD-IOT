/*
LotteryApp.java
Carmine
20181114
*/
import java.util.*;
import javax.swing.*;

public class LotteryApp{
    public static void main(String[] args) {
        
        List<Integer> lotteryLine;
        LotteryGenLine myLotteryGenLine;
        LotteryCheckUserLine myLotteryCheckUserLine;
        String option;

        myLotteryGenLine = new LotteryGenLine();
        myLotteryCheckUserLine = new LotteryCheckUserLine();
        
        do {

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
        
                System.out.println(userLines[i]);
                System.out.println(matchedNumbers);

            }

            option = JOptionPane.showInputDialog(null,"Would you like to continue Y or N:");
            
        } while (option.equals("Y"));
    }
}