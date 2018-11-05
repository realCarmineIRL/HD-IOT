/*
CharacterSample2
Carmine Calicchio
20181105
*/

import javax.swing.*;

public class CharacterSample2{
    public static void main(String[] args) {
        int len;
        String word;

        word=JOptionPane.showInputDialog(null,"Please input a word ");

        len = word.length()-1;

        for (int i=0; i<=len; i++){
            JOptionPane.showMessageDialog(null,word.charAt(i));
        }

        JOptionPane.showMessageDialog(null,word);
    }
}
