/*
EggBoxes.java
Carmine Calicchio
20181001
*/

public class EggBoxes{
    //declare variables
    private int numberOfEggs;
    private int numberOfBoxes;
    private int eggsLeftOver;
    final private int dozen=12;

    //Constructor
    public EggBoxes(){
        numberOfEggs=0;
        numberOfBoxes=0;
        eggsLeftOver=0;
    }

    //Setters
    public void setNumberOfEggs(int numberOfEggs){
        this.numberOfEggs = numberOfEggs;
    }

    //compute
    public void compute(){
        numberOfBoxes=numberOfEggs/dozen;
        eggsLeftOver=numberOfEggs%dozen;
    }

    //Getters
    public int getNumberOfEggs(){
        return numberOfEggs;
    }

    public int getNumberOfBoxes(){
        return numberOfBoxes;
    }

    public int getEggsLeftOver(){
        return eggsLeftOver;
    }
}
