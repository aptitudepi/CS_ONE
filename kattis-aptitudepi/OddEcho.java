/** 
Problem Name: Odd Echo
Difficulty: 1.4pt
Submission ID: 9288459
**/

import java.util.Scanner;

public class OddEcho {  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int totalLines = s.nextInt() + 1;
    String[] line = new String[totalLines];
    for (int i = 0; i < totalLines; i++) {
      line[i] =  s.nextLine();
    }
    for (int i = 0; i < totalLines; i++) {
      if (i % 2 == 1) {
        System.out.println(line[i]);
      }
    }
    s.close();
  }
}