/*
LotteryGenLine.java
Carmine
20181114
*/
import java.util.*;

public class LotteryGenLine{

    private ArrayList<Integer> line;
    private List<Integer> lotteryLine;

    public LotteryGenLine(){
        line = new ArrayList<>(40);
    }

    public void genLotteryLine() {
        for(int i = 1; i <= 40; i++){
            line.add(i);
        }
    
        Collections.shuffle(line);

        lotteryLine = line.subList(0, 6);

        Collections.sort(lotteryLine);
    }

    public List<Integer> getLotteryLine(){
        return lotteryLine;
    }

}