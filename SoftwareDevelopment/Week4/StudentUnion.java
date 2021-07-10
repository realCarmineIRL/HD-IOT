/*
StudenUnion.java
Carmine Calicchio
20181008
*/

public class StudentUnion{
    //Data Members
    private int capAmount;
    private int hoodyAmount;
    private int shirtAmount;
    private final double CAPCOST;
    private final double HOODYCOST;
    private final double SHIRTCOST;
    private double totalCost;

    //Constructor
    public StudentUnion(){
        capAmount=0;
        hoodyAmount=0;
        shirtAmount=0;
        CAPCOST=5.00;
        HOODYCOST=20.00;
        SHIRTCOST=10.00;
        totalCost=0.00;
    }

    //Setters
    public void setCapAmount(int capAmount){
        this.capAmount=capAmount;
    }

    public void setHoodyAmount(int hoodyAmount){
        this.hoodyAmount=hoodyAmount;
    }

    public void setShirtAmount(int shirtAmount){
        this.shirtAmount=shirtAmount;
    }

    //Compute
    public void compute(){
        totalCost=(capAmount*CAPCOST)+(hoodyAmount*HOODYCOST)+(shirtAmount*SHIRTCOST);
    }

    //Getters
    public double getTotalCost(){
        return totalCost;
    }

}
