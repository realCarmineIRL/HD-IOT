/*
Averga.java
Carmine Calicchio
20181112
*/

import javax.swing.JOptionPane;

public class Average{
    public static void main(String[] args) {
        int arr[];
        int sum;
        int avg;

        arr=new int[5];
        sum=0;
        avg=0;

        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Please introduce number  " + (i+1)));
        }

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        avg=sum/arr.length;

        JOptionPane.showMessageDialog(null,avg);
    }
}
