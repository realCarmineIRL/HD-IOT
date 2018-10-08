/*
Pay.java
Carmine Calicchio
20181008
*/

public class Pay{
    //Data Members
    private double basicRate;
    private double basicHours;
    private double overTimeHours;
    private final double OVERTIMERATE;
    private double basicPay;
    private double overTimePay;
    private double totalPay;

    //Constructor
    public Pay(){
        basicRate=0.00;
        basicHours=0.00;
        overTimeHours=0.00;
        OVERTIMERATE=1.50;
        basicPay=0.00;
        overTimePay=0.00;
        totalPay=0.00;
    }

    //Setters
    public void setBasicRate(double basicRate){
        this.basicRate=basicRate;
    }

    public void setBasicHours(double basicHours){
        this.basicHours=basicHours;
    }

    public void setOverTimeHours(double overTimeHours){
        this.overTimeHours=overTimeHours;
    }

    //Compute
    public void compute(){
        basicPay=basicRate*basicHours;
        overTimePay=overTimeHours*(basicRate*OVERTIMERATE);
        totalPay=basicPay+overTimePay;
    }

    //Getters
    public double getBasicPay(){
        return basicPay;
    }

    public double getOverTimePay(){
        return overTimePay;
    }

    public double getTotalPay(){
        return totalPay;
    }

}
