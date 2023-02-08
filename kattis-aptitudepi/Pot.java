/** 
Problem Name: Pot
Difficulty: 1.3pt
Submission ID: 9306464
**/
import java.util.Scanner;

public class Pot {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int total = 0;
    for (int i = 0; i < n; i++) {
      String[] p = new String[n];
      p[i] = s.next();
      String[] partP = new String[2];
      partP[0] = p[i].substring(0, p[i].length() - 1);
      partP[1] = p[i].substring(p[i].length() - 1);
      int num1 = Integer.parseInt(partP[0]), num2 = Integer.parseInt(partP[1]);
      double num = Math.pow(num1, num2);
      total += num;
    }
    System.out.println(total);
    s.close();
  }
}