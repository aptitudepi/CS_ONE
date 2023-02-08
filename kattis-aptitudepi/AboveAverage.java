/** 
Problem Name: AboveAverage
Difficulty: 2.6pts
Submission ID: 9492679
**/

import java.util.Scanner;
public class AboveAverage {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    for (int i = 0; i < c; i++) {
      double[] average = new double[c];
      int total = 0;
      int n = sc.nextInt();
      int[] nums = new int[n];
      int totalAA = 0;
      for (int j = 0; j < n; j++) {
        nums[j] = sc.nextInt();
        total += nums[j];
      } 
      average[i] = total/n;
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] > average[i]) {
          totalAA++;
        }
      }
      double aa = (double) totalAA/n;
      double percent = aa * 100;
      System.out.printf("%.3f%%\n", percent);
    }
    sc.close();
  }
}