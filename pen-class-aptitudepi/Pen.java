public class Pen {
  //Instance Vars
  private String brand, color;
  private double thickness;
  private int inkLevel;
  private boolean isClicked;
  //Constructors
  public Pen() {
    brand = color = null;
    inkLevel = 50;
    isClicked = false;
  }
  public Pen(String iBrand, String iColor, double iThickness) {
    setBrand(iBrand);
    setColor(iColor);
    setThickness(iThickness);
    inkLevel = 50;
    isClicked = false;
  }
  //Getters
  public String getBrand() {
    return brand;
  }
  public String getColor() {
    return color;
  }
  public double getThickness() {
    return thickness;
  }
  public double getInkLevel() {
    return inkLevel;
  }
  //Setters
  public void setBrand(String iBrand) {
    brand = iBrand;

  }
  public void setColor(String iColor) {
    color = iColor;
  }
  public void setThickness(double iThickness) {
    thickness = iThickness;
  }
  public void setInkLevel(double iInkLevel) {
    thickness = iInkLevel;
  }
  //toString Method
  public String toString() {
    return String.format("%s %s pen", color, brand);
  }
  // Other Methods:
  public void click() {
    isClicked = !isClicked;
  }
  public void twirl() {
    System.out.println("OOOH");
  }
  public void write(String input) {
    if (isClicked) {
      if (inkLevel < input.length()) {
        System.out.println(input.substring(0, inkLevel));
        inkLevel = 0;
      } else {
        System.out.println(input);
        inkLevel -= input.length();
      }   
    } 
  }
}
