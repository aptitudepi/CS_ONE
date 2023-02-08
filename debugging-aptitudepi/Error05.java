import java.util.Scanner;

public class Error05 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of apples you wish to buy: ");
    int numApples = in.nextInt();
    System.out.println("Enter the cost of one apple: ");
    double costApple = in.nextDouble();
    System.out.printf("The total cost of all the apples is %.2f", (numApples * costApple));
  in.close();
  }
}
