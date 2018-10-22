/*
Sum.java
Carmine Calicchio
20181022
*/

public class Sum{
    //Variables

    private int num;
    private int sum;

    //Constructor
    public Sum(){
        num=0;
        sum=0;
    }

    //Setters
    public void setNum(int num){
        this.num=num;
    }

    //Compute
    public void compute(){
        for(int i=1; i<=num; i++){
            sum+=i;
        }
    }

    //Getters
    public int getSum(){
        return sum;
    }
}
