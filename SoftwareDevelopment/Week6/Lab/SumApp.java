/*
SumApp.java
Carmine Calicchio
20181022
*/

import javax.swing.*;
public class SumApp{
    public static void main(String[] args){
        //Variables
        int num;
        int sum;

        //Objects
        Sum mySum;
        mySum=new Sum();

        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Please input a number "));
        mySum.setNum(num);

        mySum.compute();

        sum=mySum.getSum();
        JOptionPane.showMessageDialog(null,sum);
    }
}
