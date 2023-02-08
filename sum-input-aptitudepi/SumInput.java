import java.util.Scanner;

public class SumInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = 0;
    String rawInput = sc.nextLine();
    while ((rawInput.equals("") || rawInput.equals("quit")) != true) {
        total += Integer.parseInt(rawInput);
        rawInput = sc.nextLine();
    }
    System.out.println("The sum is " + total);
    sc.close();
  }
}