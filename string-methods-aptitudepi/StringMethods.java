public class StringMethods {
  public static void main(String[] args) {
    String first = "Devkumar";
    String last = "Banerjee";
    String full = first + " " + last;
    System.out.println(first.substring(0,3));
    System.out.println(last.substring(last.length() - 3, last.length()));
    System.out.println(full.charAt(3));
    System.out.println(full.indexOf(" "));
  }
}