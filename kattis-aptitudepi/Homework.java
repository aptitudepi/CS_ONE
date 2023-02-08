/** 
Problem Name: Hommework
Difficulty: 1.1-1.5pt
Submission ID: 9293139
**/
import java.util.Scanner;

public class Homework {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    String[] inputParts = input.split("\\;");
    int total = 0;
    for (int i = 0; i < inputParts.length; i++) {
      if (inputParts[i].contains("-")) {
        String[] dashParts = inputParts[i].split("\\-");
        int[] intDashParts = new int[dashParts.length];
        for (int k = 0; k < dashParts.length; k++) {
          intDashParts[k] = Integer.parseInt(dashParts[k]); 
        } 
        int diff = intDashParts[1] - intDashParts[0] + 1;
        total += diff;
      } else {
        total += 1;
      }
    }
    System.out.println(total);
    s.close();
  }
}