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

        System.out.println(lotteryLine);
    }
}