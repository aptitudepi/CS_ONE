# File CSV

## Due: Tue 1/17 at 11:59 PM

- Create a program called `FileCSV.java`
- Prompt the user for a filename
- The first line in the file describes the values in each line
  - It does not contain actual data
- Read in the rest of the lines in this file and store them in an array of Strings 
- For each element of that array, do the following:
  - Split the String on commas
  - Trim whitespace
  - For every person age 18 or older, print their name and the total wages earned that week

***Example Input:***\
input1.csv\
***Example Contents of input1.txt:***\
Last Name, First Name, Age, Hourly Wage, Hours Worked\
Smith, Sally, 17, 9.50, 20\
Davis, Phil, 18, 10.25, 30\
Wallace, Bob, 25, 12.50, 40\
Haynes, Betty, 16, 11.75, 25\
***Example Output:***\
Phil Davis, $307.50\
Bob Wallace, $500.00
