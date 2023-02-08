# Pen Class

## Due: Wed 2/8 at 11:59 PM

- Create a program called `Pen.java`
- The Pen class should have the following data members:
  - The brand
  - The color
  - The thickness
  - The ink level
  - The status of whether the pen is clicked or not
- The Pen class should have the following constructors:
  - Default
    - The ink level should be set to 50
    - The status of whether the pen is clicked or not should be set to not clicked
  - A constructor that takes the brand, the color, and the thickness
    - The ink level should be set to 50
    - The status of whether the pen is clicked or not should be set to not clicked
- The Pen class should have getter and setter methods for each data member except for the status of whether the pen is clicked or not
- The Pen class should have a toString method that returns the color and brand of the Pen separated by a space and followed by the word "pen"
- The Pen class should have the following other methods:
  - a click method that toggles the status of whehter the pen is clicked or not
  - a twirl method that prints "OOOH" to the screen
  - a write method that takes a String and prints it to the screen if it is able to do so
    - the Pen can only write if it is clicked
      - if the Pen cannot write, nothing should be printed to the screen
    - the Pen can only write as many characters as it has ink for
      - each character requires 1 ink to write
    - decrease the ink level of the Pen after writing
    - each call to the write method should start on a new line
- - - -
- Create a program called `PenTester.java`
- Create a Pen object using the default constructor
- Prompt the user for the following values and store them in variables:
  - The brand
  - The color
  - The thickness
- Use the setter methods to assign those values to the Pen object
- Prompt the user again for the following values and store them in variables:
  - The brand
  - The color
  - The thickness
- Use those values to create another Pen object using the parameterized constructor
- For the first Pen:
  - Print the Pen
  - Try to write "Hello there"
  - Click the Pen
  - Try to write "This is where the fun begins"
  - Click the Pen twice
  - Try to write "I've got a bad feeling about this"
  - Twirl the Pen
- For the second Pen:
  - Print the Pen
  - Try to write "General Kenobi"
  - Click the Pen
  - Try to write "This is getting out of hand. Now there are two of them"
  - Click the Pen
  - Twirl the Pen
- - - -
***Example Input:***\
Pilot\
Maroon\
0.5\
Papermate\
Blue\
0.7\
***Example Output:***\
Maroon Pilot pen\
This is where the fun begins\
I've got a bad feeling\
OOOH\
Blue Papermate pen\
This is getting out of hand. Now there are two of \
OOOH
