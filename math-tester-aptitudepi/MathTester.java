import java.util.Scanner;
import java.lang.Math;

public class MathTester {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int noabsnum = sc.nextInt(), absnum = Math.abs(noabsnum);
    double fp = sc.nextDouble(), fpceil = Math.ceil(fp), fpfloor = Math.floor(fp);
    int fprnd = (int)Math.round(fp);
    int num1 = sc.nextInt(), num2 = sc.nextInt(), minnum = Math.min(num1, num2), maxnum = Math.max(num1, num2);
    double base = sc.nextDouble(), power = sc.nextDouble(), exponent = Math.pow(base, power);
    System.out.println(absnum);
    System.out.println(fpceil);
    System.out.println(fpfloor);
    System.out.println(fprnd);
    System.out.println("Max: " + maxnum);
    System.out.println("Min: " + minnum);
    System.out.println(exponent);
    sc.close();
  }
}