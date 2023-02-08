import java.util.Scanner;

public class MathRandom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(), y = sc.nextInt();
    int max = Math.max(x, y);
    int min = Math.min(x, y);
    int z = (int) (Math.random()*(max - min) + min);
    System.out.println(z);
    sc.close();
  }
}