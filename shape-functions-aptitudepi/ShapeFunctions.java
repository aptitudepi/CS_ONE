import java.util.Scanner;
import java.io.*;
public class ShapeFunctions {
  public static double AreaTri(double base, double height) {
    return 0.5*base*height;
  }
  
  public static double AreaRect(double length, double width) {
    return length*width;
  }
  
  public static double AreaSqr(double side) {
    return Math.pow(side,2);
  }
  
  public static double AreaCirc(double radius) {
    return Math.PI*Math.pow(radius,2);
  }

  public static String[] trimArr(String[] arr) {
    String[] newArr = arr;
    for(int j = 0; j < arr.length; j++) {
      newArr[j] = arr[j];
    }
    return newArr;
  }

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in), fin = null;
    String filename = "";
    try {
      filename = stdin.next();
      fin = new Scanner(new File(filename));
    } catch (IOException IOErr) {
      System.out.println(
          "An IOException occurred, with message" + IOErr.getMessage() + ". The Stack Trace is shown below:\n\n");
      IOErr.printStackTrace();
    }
    int numLines = fin.nextInt() + 1;
    String[] lines = new String[numLines], cells;
    for (int i = 0; i < numLines; i++) {
      lines[i] = fin.nextLine();
      cells = trimArr(lines[i].split(","));
      switch (cells[0]) {
        case "triangle":
          System.out.printf("%s: %.2f\n", cells[0], AreaTri(Double.parseDouble(cells[1]), Double.parseDouble(cells[2])));
          break;
        case "rectangle":
          System.out.printf("%s: %.2f\n", cells[0], AreaRect(Double.parseDouble(cells[1]), Double.parseDouble(cells[2])));
          break;
        case "square":
          System.out.printf("%s: %.2f\n", cells[0], AreaSqr(Double.parseDouble(cells[1])));  
          break;
        case "circle":
          System.out.printf("%s: %.2f\n", cells[0], AreaCirc(Double.parseDouble(cells[1])));
          break;
      }
    }
    stdin.close();
  }
}