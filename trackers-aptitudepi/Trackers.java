import java.util.Scanner;

public class Trackers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Assign counter vars that show how many are odd, > 20, or both
    int odd = 0, gt20 = 0, both = 0;
    for (int i = 0; i < 8; i++) {
      //Assign input var
      int num = sc.nextInt();
      if (num % 2 == 1 && num > 20) {
        both++;
      }
      if (num % 2 == 1) {
        odd++;
      }
      if (num > 20) {
        gt20++;
      }
    }
    System.out.println("Number of odd numbers: " + odd);
    System.out.println("Number of numbers greater than 20: " + gt20);
    System.out.println("Number of odd numbers greater than 20: " + both);
    sc.close();
  }
}