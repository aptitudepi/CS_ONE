import java.util.Scanner;

public class Modulus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    if (a % 2 == 0) {
        System.out.println("even");
    } else {
        System.out.println("odd");
    }
    if (b % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
    if (a < b) {
      System.out.println("smaller");
    } else if (a > b) {
      System.out.println("greater");
    } else {
      System.out.println("equal");
    }
    sc.close();
  }
}