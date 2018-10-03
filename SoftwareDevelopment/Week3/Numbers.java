/*
Numbers.java
Carmine Calicchio
20181001
*/
//create application called numbers
public class Numbers{
    //Data Members = variables
    private int num1;
    private int num2;
    private int sum;

    //Constructor
    public Numbers(){
        num1 = 0;
        num2 = 0;
        sum = 0;
    }

    //Setters - input
    public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    //Compute - process
    public void compute(){
        sum = num1 + num2;
    }

    //Getters - output
    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }

    public int getSum(){
        return sum;
    }
}
