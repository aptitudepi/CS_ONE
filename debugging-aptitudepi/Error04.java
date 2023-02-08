import java.util.Scanner;

public class Error04 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int age = in.nextInt();
    System.out.println("Your age is " + age);
    in.close();
  }
}
