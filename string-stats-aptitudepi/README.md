# File StringStats

## Due: Tue 1/10 at 11:59 PM

- Create a program called `StringStats.java`
- Prompt the user for a filename
- Read in all the lines in this file and store them in an array of Strings
- After you have read in everything, determine the following:
  - The shortest word
    - If there are multiple words with the same shortest length, use the one that comes first in the file
  - The longest word
    - If there are multiple words with the same longest length, use the one that comes first in the file
  - The average word length (formatted to three decimal places)
  - The word that comes first alphabetically
  - The word that comes last alphabetically
- Write those values (with a label, see example output) to a file called `output.txt`

***Example Input:***\
input1.txt\
***Example Contents of input1.txt:***\
cat\
fire\
dog\
apple\
barbecue\
elephant\
***Example Contents of output.txt:***\
Shortest word: cat\
Longest word: barbecue\
Average word length: 5.167\
Alphabetically first word: apple\
Alphabetically last word: fire
