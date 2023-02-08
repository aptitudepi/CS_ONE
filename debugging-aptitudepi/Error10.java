import java.util.Scanner;

public class Error10 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String name = in.nextLine();
    char ch = name.charAt(0);
    System.out.print(ch);
    in.close();
  }
}
/*
Use input
Will

Excpected output
W
*/
