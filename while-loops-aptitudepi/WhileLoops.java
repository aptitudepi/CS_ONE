import java.util.Scanner;

public class WhileLoops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), i = 1, j = 0, k = 1, l=1, sum = 0;
    while (i <= a) {
        System.out.println(i * i);
        i++;
    }
    System.out.println("");
    while (j <= a) {
        sum += j;
        j++;
    }
    System.out.println(sum);
    while (k <= a) {
        l *= k;
        k++;
    }
    System.out.println(l);
    sc.close();
  }
}