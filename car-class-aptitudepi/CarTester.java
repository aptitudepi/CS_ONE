import java.util.Scanner;
public class CarTester {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    Car car = new Car();
    String[] input = new String[6], inputTwo = new String[6];
    for (int i = 0; i < input.length; i++) {
      input[i] = stdin.nextLine().trim();
      switch (i) {
        case 0:
          car.setMake(input[i]);
          break;
        case 1:
          car.setModel(input[i]);
          break;
        case 2:
          car.setNumDoors(Integer.parseInt(input[i]));
          break;
        case 3:
          car.setNumSeats(Integer.parseInt(input[i]));
          break;
        case 4:
          car.setMPG(Double.parseDouble(input[i]));
          break;
        case 5:
          car.setTankSize(Double.parseDouble(input[i]));
          break;
      }
    }
    for (int i = 0; i < inputTwo.length; i++) {
      inputTwo[i] = stdin.nextLine().trim();
    }
    Car carTwo = new Car(inputTwo[0], inputTwo[1], Integer.parseInt(inputTwo[2]), Integer.parseInt(inputTwo[3]), Double.parseDouble(inputTwo[4]), Double.parseDouble(inputTwo[5]));
    double distance = stdin.nextDouble();
    Car[] arrCar= new Car[2];
    arrCar[0] = car;
    arrCar[1] = carTwo;
    for (Car cars: arrCar) {
      System.out.printf("%s %s\n", cars.getMake(), cars.getModel());
      if (cars.isGasGuzzler()) {  
        System.out.printf("The %s %s is a gas guzzler\n", cars.getMake(), cars.getModel());
      } else {
        System.out.printf("The %s %s is not a gas guzzler\n", cars.getMake(), cars.getModel());
      }
      if (cars.isSpacious()) {  
        System.out.printf("The %s %s is spacious\n", cars.getMake(), cars.getModel());
      } else {
        System.out.printf("The %s %s is not spacious\n", cars.getMake(), cars.getModel());
      }      
      cars.honk();
      if (cars.canTravelDistance(distance)) {  
        System.out.printf("The %s %s can travel %.1f miles on a full tank of gas\n", cars.getMake(), cars.getModel(), distance);
      } else {
        System.out.printf("The %s %s cannot travel %.1f miles on a full tank of gas\n", cars.getMake(), cars.getModel(), distance);
      }
    }
    stdin.close();
  }
}