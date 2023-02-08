/** 
Problem Name: Sort Two Numbers
Difficulty: 1.3pt
Submission ID: 9371986
**/
import java.util.Scanner;

public class TriangleArea {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt(), b = s.nextInt();
    double triarea = 0.5*a*b;
    System.out.println(triarea);
    s.close();
  }
}
