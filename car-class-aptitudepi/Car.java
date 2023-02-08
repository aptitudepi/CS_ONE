public class Car {
  //Instance Vars
  private String make, model;
  private int numDoors, numSeats;
  private double MPG, tankSize;
  //Constructors
  public Car() {
    make = model = null;
    numDoors = numSeats = 0;
    MPG = tankSize  = 0;
  }
  public Car(String iMake, String iModel) {
    setMake(iMake);
    setModel(iModel);
  }
  public Car(String iMake, String iModel, int iNumDoors, int iNumSeats, double iMPG, double iTankSize) {
    setMake(iMake);
    setModel(iModel);
    setNumDoors(iNumDoors);
    setNumSeats(iNumSeats);
    setMPG(iMPG);
    setTankSize(iTankSize);
  }
  //Getters
  public String getMake() {
    return make;
  }
  public String getModel() {
    return model;
  }
  public int getNumDoors() {
    return numDoors;
  }
  public int getNumSeats() {
    return numSeats;
  }
  public double getMPG() {
    return MPG;
  }
  public double getTankSize() {
    return tankSize;
  }
  //Setters
  public void setMake(String iMake) {
    make = iMake;

  }
  public void setModel(String iModel) {
    model = iModel;
  }
  public void setNumDoors(int iNumDoors) {
    numDoors = iNumDoors;
  }
  public void setNumSeats(int iNumSeats) {
    numSeats = iNumSeats;
  }
  public void setMPG(double iMPG) {
    MPG = iMPG;
  }
  public void setTankSize(double iTankSize) {
    tankSize = iTankSize;
  }
  //toString Method
  public String toString() {
    return String.format("%s %s", make, model);
  }
  // Other Methods:
  public boolean isGasGuzzler() {
    if (MPG < 15.0) {
      return true;
    } else {
      return false;
    }
  }
  public boolean isSpacious() {
    if (numSeats > 5) {
      return true;
    } else {
      return false;
    }
  }
  public double maximumDistance() {
    return MPG * tankSize; 
  }
  public void honk() {
    System.out.println("HONK");
  } 
  public boolean canTravelDistance(double distance) {
    if (distance > maximumDistance()) {
      return false;
    } else {
      return true;
    }
  }
}