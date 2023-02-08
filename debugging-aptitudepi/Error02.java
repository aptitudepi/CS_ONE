import java.util.Scanner;

public class Error02 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    String name = in.nextLine();
    int pos = name.indexOf(' ');
    String sub = name.substring(0, pos);
    System.out.println(sub);
    in.close();
  }
}
/*
Use input
Will Smith

Expected output:
Will
*/
