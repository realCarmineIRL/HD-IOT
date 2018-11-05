/*
Reverse.java
Carmine Calicchio
20181105
*/

import javax.swing.*;

public class Reverse{
    public static void main(String[] args) {
        int len;
        String word;

        word=JOptionPane.showInputDialog(null,"Please input a word ");

        len = word.length()-1;

        for (int i=len; i>=0; i--){
            JOptionPane.showMessageDialog(null,word.charAt(i));
        }

        JOptionPane.showMessageDialog(null,word);
    }
}
