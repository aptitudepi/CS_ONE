import java.util.Scanner;

public class Stats {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //INPUT
    int in = sc.nextInt();
    int[] data = new int[in];
    for (int i = 0; i < in; i++) {
      data[i] = sc.nextInt();
    }
    //PROCESS
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
    for (int i = 0; i < in; i++) {
      if (data[i] < min) {
        min = data[i];
      }
      if (data[i] > max) {
        max = data[i];
      }
      sum += data[i];
    }  
    double avg = (double) sum / in;
    //OUTPUT
    System.out.printf("Min: %d\n", min);
    System.out.printf("Max: %d\n", max);
    System.out.printf("Sum: %d\n", sum);
    System.out.printf("Average: %.3f", avg);
    sc.close();
  }
}