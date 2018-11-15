/*
LotteryApp.java
Carmine
20181114
*/
import java.util.*;

public class LotteryApp{
    public static void main(String[] args) {
        
        List<Integer> lotteryLine;
        LotteryGenLine myLotteryGenLine;

        myLotteryGenLine = new LotteryGenLine();
        myLotteryGenLine.genLotteryLine();

        lotteryLine = myLotteryGenLine.getLotteryLine();

        List<Integer> userLine = new ArrayList<Integer>(Arrays.asList(1,7,22,26,35,39));

        List<Integer> matchedNumbers = userLine;

        matchedNumbers.retainAll(lotteryLine);

        System.out.println(lotteryLine);

        System.out.println(matchedNumbers);
    }
}