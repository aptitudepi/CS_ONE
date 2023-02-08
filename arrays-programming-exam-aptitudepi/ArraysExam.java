import java.util.Scanner;
public class ArraysExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    /*
    Task 1
    */

    //INPUT
    int lengthOne = sc.nextInt(), numltseven = 0, numgtseven = 0;
    int[] dataOne = new int[lengthOne];
    for (int i = 0; i < lengthOne; i++) {
      dataOne[i] = sc.nextInt();
    }

    //PROCESS
    for (int i = 0; i < lengthOne; i++) {
      if (dataOne[i] > 7) {
        numgtseven++;
      } else if (dataOne[i] < 7) {
        numltseven++;
      }
    }

    //OUTPUT
    System.out.printf("Number of values greater than 7: %d\n", numgtseven);
    System.out.printf("Number of values less than 7: %d\n", numltseven);
    for (int i = 0; i < lengthOne; i++) {
      System.out.print(dataOne[i] + " ");
    }
    System.out.println(); // Separate Inputs from Outputs for better readability
    
    /*
    Task 2
    */

    //INPUT
    int lengthTwo = sc.nextInt(), sumOddVal = 0, sumEvenIndex = 0;
    int[] dataTwo = new int[lengthTwo];
    for (int i = 0; i < lengthTwo; i++) {
      dataTwo[i] = sc.nextInt();
    }

    //PROCESS
    for (int i = 0; i < lengthTwo; i++) {
      if (dataTwo[i] % 2 == 1) {
        sumOddVal += dataTwo[i];
      }
      if (i % 2 == 0) {
        sumEvenIndex += dataTwo[i];
      }
    }

    //OUTPUT
    System.out.printf("Sum of odd values: %d\n", sumOddVal);
    System.out.printf("Sum of values at even indexes: %d\n", sumEvenIndex);
    for (int i = 0; i < lengthTwo; i++) {
      System.out.print(dataTwo[i] + " ");
    } 


    //Close Scanner to prevent resource leaks

    sc.close();
  }
}
