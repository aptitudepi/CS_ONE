/** 
Problem Name: R2
Difficulty: 1.1pt
Submission ID: 9276622
**/
import java.util.Scanner;

public class CompoundOperators {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int whole = sc.nextInt();
    whole *= 14;
    System.out.println(whole);
    whole += 21;
    System.out.println(whole);
    whole /= 7;
    System.out.println(whole);
    whole -= 3;
    System.out.println(whole);
    whole--;
    System.out.println(whole);
    whole++;
    System.out.println(whole);
    sc.close();
  }
}