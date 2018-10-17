/*
Cinema.java
Carmine Calicchio
20181015
*/

public class Cinema{
    //data members
    private int age;
    private String message;

    //constructor
    public Cinema(){
        age=0;
    }

    public void setAge(int age){
        this.age=age;
    }

    //compute
    public void compute(){
        if(age<=5||age>=60){
            message="your admision is free";
        }
        else if(age<=14){
            message="your admision is 5 euros";
        }
        else{
            message="your admision is 10 euros";
        }
    }

    //getters
    public String getMessage(){
        return message;
    }
}
