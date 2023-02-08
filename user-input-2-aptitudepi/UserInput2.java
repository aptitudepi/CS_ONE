import java.util.Scanner;

public class UserInput2 {  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("What is your full name?");
    String name = s.nextLine();
    String fName = name.substring(0, name.indexOf(" "));
    System.out.println("How many apples would you like to buy?");
    int numApple = s.nextInt();
    System.out.println("What is the cost of an apple?");
    double costApple = s.nextDouble();
    double totalCost = costApple * numApple;
    System.out.print("Hi " + fName + ", you are buying " + numApple + " apples at");
    System.out.printf(" $%.2f for a total of $%.2f", costApple, totalCost);
    s.close();
  }
}