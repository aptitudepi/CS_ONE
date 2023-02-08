import java.util.Scanner;

public class UserInput {  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String name = s.nextLine();
    int age = s.nextInt() + 30;
    System.out.println("Hello " + name + ", you will be " + age + " in 30 years.");
    s.close();
  }
}