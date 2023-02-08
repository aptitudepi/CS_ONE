/** 
Problem Name: Jack-O'-Lantern Juxtaposition
Difficulty: 1.3pt
Submission ID: 9905531
**/

import java.util.Scanner;

public class JackOLantern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(), t = s.nextInt(), m = s.nextInt();
    System.out.println(n*t*m);
    s.close();
    }
}
