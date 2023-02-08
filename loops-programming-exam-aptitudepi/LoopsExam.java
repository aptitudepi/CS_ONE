import java.util.Scanner;
public class LoopsExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //TASK ONE:
    boolean condition = true;
    int sum = 0;
    while (condition) {
      int inputTaskONE = sc.nextInt();
      if (inputTaskONE == -1) {
        condition = false;
      } else {
        sum += inputTaskONE;
      }
    }
    //TASK TWO:
    int inputTaskTWO = sc.nextInt();
    System.out.printf("The sum is %d\n", sum);
    for (int i = 1; i <= inputTaskTWO; i++) {
      System.out.print(i * i * i + " ");
    }
    System.out.println("");
    //TASK THREE:
    for (int i = 90; i >= 30; i -= 3) {
      System.out.print(i + " ");
    }
    sc.close();
  }
}
