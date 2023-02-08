# Car Class

## Due: Wed 2/1 at 11:59 PM

- Create a program called `Car.java`
- The Car class should have the following data members:
  - The make
  - The model
  - The number of doors
  - The number of seats
  - The miles per gallon (as a floating point number)
  - The gas tank size in gallons (as a floating point number)
- The Car class should have the following constructors:
  - Default
  - A constructor that takes the make and model
  - A constructor that takes parameters for all six data members
- The Car class should have getter and setter methods for each data member
- The Car class should have a toString method that returns the make and model of the Car separated by a space
- The Car class should have the following other methods:
  - an isGasGuzzler method that returns true if the miles per gallon is less than 15.0
  - an isSpacious method that returns true if the number of seats is greater than 5
  - a maximumDistance method that returns the maximum distance the Car can travel with a full tank of gas
  - a honk method that prints "HONK" to the screen
  - a canTravelDistance that takes a double as a parameter which is the distance to be traveled and returns true if the Car can travel that distance with a full tank of gas
- - - -
* Create a program called `CarTester.java`
* Create a Car object using the default constructor
* Prompt the user for the following values and store them in variables:
  * Make
  * Model
  * Number of doors
  * Number of seats
  * Miles per gallon
  * Gas tank size
* Use the setter methods to assign those values to the Car object
* Prompt the user again for the following values and store them in variables:
  * Make
  * Model
  * Number of doors
  * Number of seats
  * Miles per gallon
  * Gas tank size
* Use those values to create another Car object using the parameterized constructor
* Prompt the user for a double
  * This will be the distance to be traveled
* For each Car:
  * Print the make and model of that Car
  * Print whether the Car is or is not a gas guzzler
  * Print whether the Car is or is not spacious
  * Call that Car's honk method
  * Print whether the Car can travel the distance the user entered
- - - -
***Example Input:***\
Chevy\
Suburban\
4\
7\
21.1\
27.8\
Ford\
Mustang\
2\
4\
13.4\
16.0\
332.5\
***Example Output:***\
Chevy Suburban\
The Chevy Suburban is not a gas guzzler\
The Chevy Suburban is spacious\
HONK\
The Chevy Suburban can travel 332.5 miles on a full tank of gas\
Ford Mustang\
The Ford Mustang is a gas guzzler\
The Ford Mustang is not spacious\
HONK\
The Ford Mustang cannot travel 332.5 miles on a full tank of gas
