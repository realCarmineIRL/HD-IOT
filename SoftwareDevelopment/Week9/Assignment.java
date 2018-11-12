/*
Assignment.java
Carmine Calicchio
20181112
*/

import javax.swing.JOptionPane;

public class Assignment{
    public static void main(String[] args) {
        int arr[];

        arr=new int[7];

        for(int i=0;i<7;i++){
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Please introduce number  " + (i+1)));
        }

        for(int i=0;i<arr.length;i++){
            JOptionPane.showMessageDialog(null,arr[i]);
        }

    }
}
