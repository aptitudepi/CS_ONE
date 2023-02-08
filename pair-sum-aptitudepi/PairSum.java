import java.util.Scanner;

public class PairSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //INPUT
    // Get First number, make an array with that ,any 'slots', make a boolean saying that there are no pairs.
    boolean noPairs = true;
    int numInputs = sc.nextInt();
    int[] data = new int[numInputs];
    for (int i = 0; i < numInputs; i++) {
      data[i] = sc.nextInt();
    }
    //OUTPUT
    // If both numbers add to target, make boolean false, and print out the values that add to target.
    int targetSum = sc.nextInt();
    for (int i = 0; i < numInputs; i++) {
      for (int j = i + 1; j < numInputs; j++) {
        if (data[i] + data[j] == targetSum) {
          System.out.printf("%d and %d sum to %d\n", data[i], data[j], targetSum);
          noPairs = false;
        }
      }   
    }
    // If boolean is still true, print that no pairs were found that sum to target value.
    if (noPairs) {
      System.out.printf("No pairs sum to %d\n", targetSum);
    }
    sc.close();
  }
}