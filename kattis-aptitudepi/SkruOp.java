/** 
Problem Name: Skru Op
Difficulty: 1.3-1.5pt
Submission ID: 9449832
**/

import java.util.Scanner;
public class SkruOp {  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int volume = 7;
    for (int i = 0; i < n+1; i++) {
      String inp = s.nextLine();
      if (inp.contains("op") && volume < 10) {
        volume++;
      } else if (inp.contains("ned") && volume > 0) {
        volume--;
      }
    }
    System.out.println(volume);
    s.close();
  }
}