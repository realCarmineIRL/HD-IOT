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
    private boolean isValid;
    private String errorMsg;

    public LotteryCheckUserLine(){
       this.line = "";
       this.isValid = true;
       this.errorMsg = "";
    }

    public void setUserLine(String line){
        this.line = line;
    }

    public void compute() {
        numbers = line.split(",");

        userLine = new ArrayList<>();

        for (int i=0; i<numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            if(number <= 0 || number > 40) {
                isValid = false;
                errorMsg = "Number " + number + " in line out of range.";
            }
            userLine.add(number);
        }

        if(userLine.size() <= 5 || userLine.size() > 6) {
            isValid = false;
            errorMsg = "You have introduced invalid numbers, please make sure 6 numbers are introduced";
        }
    }

    public List<Integer> getUserLine(){
        return userLine;
    }

    public boolean getIsValid(){
        return isValid;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

}