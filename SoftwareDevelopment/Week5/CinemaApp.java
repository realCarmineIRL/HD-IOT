/*
CinemaApp.java
Carmine Calicchio
20181015
*/
import javax.swing.*;
public class CinemaApp{
    public static void main(String[] args) {
        int age;
        String message;

        Cinema myCinema;
        myCinema=new Cinema();

        age=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age:"));
        myCinema.setAge(age);

        myCinema.compute();

        message=myCinema.getMessage();
        JOptionPane.showMessageDialog(null,message);

    }
}
