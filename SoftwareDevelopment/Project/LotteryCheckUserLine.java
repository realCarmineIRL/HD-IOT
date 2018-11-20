/*
LotteryCheckUserLine.java
Carmine
20181114
*/
import java.util.*;

public class LotteryCheckUserLine{

    private String line;
    private String[] numbers;
    private List<Integer> userLine;

    public LotteryCheckUserLine(){
       this.line = "";
    }

    public void setUserLine(String line){
        this.line = line;
    }

    public void compute() {
        numbers = line.split(",");

        userLine = new ArrayList<>();

        for (int i=0; i<numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            userLine.add(number);
        }
    }

    public List<Integer> getUserLine(){
        return userLine;
    }

}