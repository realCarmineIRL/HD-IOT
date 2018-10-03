/*
MakingChange.java
Carmine Calicchio
20180924
*/
import java.util.*;
public class MakingChange {
  public static void main(String[] args) {

    Scanner keyboard;

    keyboard = new Scanner(System.in);

    double shoppingCost;
    int paymentAmount;
    int changeAmount;
    int change;

    shoppingCost = 0;
    paymentAmount = 0;
    change = 0;

    System.out.println("Enter the Shopping Cost: ");
    shoppingCost = keyboard.nextDouble();

    System.out.println("Enter the Payment Amount: ");
    paymentAmount = keyboard.nextInt();

    changeAmount = paymentAmount - (int) shoppingCost;
    change = changeAmount;

    int notes[] = {50,20,10,5,2,1};

    int changeCount[] = new int[6];

    for (int i=0;i<notes.length;i++){
      if (change >= notes[i]) {
        changeCount[i] = (change / notes[i]);
        change = change - (notes[i] * changeCount[i]);
      }
    }

    System.out.println("Expected Change: " + changeAmount);

    for (int i=0;i<changeCount.length;i++){
        System.out.println("Number of " + notes[i] + " notes: " + changeCount[i]);
    }

  }
}
