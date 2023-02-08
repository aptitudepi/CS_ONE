import java.util.Scanner;

public class MinMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Set min to max value and Max to min value
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < 5; i++) {
      int num = sc.nextInt();
      //Look for a smaller number, then set it as new min
      min = Math.min(min, num);
      //Look for a larger number, then set it as new max
      max = Math.max(max,num);
    }
    System.out.println("The min is " + min);
    System.out.println("The max is " + max);
    sc.close();
  }
}