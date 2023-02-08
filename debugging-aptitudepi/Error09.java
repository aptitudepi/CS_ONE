import java.util.Scanner;

public class Error09 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String fullName = in.nextLine();
    String firstName = fullName.substring(0, fullName.indexOf(" "));
    System.out.println(firstName);
    in.close();
  }
}
