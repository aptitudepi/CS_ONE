import java.util.Scanner;

public class Error12 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String name = in.nextLine();
    System.out.printf("Your name is %10s", name);
    in.close();
  }
}
/*
Use input
Will
*/
