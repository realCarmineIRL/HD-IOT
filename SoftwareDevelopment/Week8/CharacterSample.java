/*
CharacterSample
Carmine Calicchio
20181105
*/

import javax.swing.*;

public class CharacterSample{
    public static void main(String[] args) {
        int len;
        String word;

        word=JOptionPane.showInputDialog(null,"Please input a word ");

        len = word.length()-1;

        JOptionPane.showMessageDialog(null,len);
    }
}
