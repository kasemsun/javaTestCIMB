# Quick guide
1. install JDK 21 https://www.oracle.com/java/technologies/downloads/#java21
2. install MVN https://maven.apache.org/download.cgi
3. run java project

## Question 1 
  Initialization:
  The function starts by initializing two variables:
    buy: Represents the minimum price encountered so far (initialized with the first price in the array).
    profit: Represents the maximum profit obtained (initialized with 0).
  Loop through Prices:
    The function iterates through the array of prices (starting from the second price).
    For each price, it checks whether it’s less than the current buy price:
    If so, it updates buy to the current price (since we want to buy at the lowest possible price).
    Otherwise, it calculates the potential profit by subtracting buy from the current price.
    If this profit is greater than the current profit, it updates profit accordingly.
  Final Result:
    After processing all prices, the function returns the maximum profit obtained.

## Question 2
  Splitting Versions:
    Split both version1 and version2 into arrays of strings using the dot '.' as the delimiter.
    This gives arrays v1 and v2, where each element represents a revision.
  Comparing Revisions:
    Iterate through the revisions using a loop.
    For each index i, extract the integer value of the revision (defaulting to 0 if not present).
    compare num1 and num2.
  Comparison Result:
    If num1 is less than num2, return -1.
    If num1 is greater than num2, return 1.
    Otherwise, if all revisions are equal, return 0.

## Question 3
  The logic used is based on the Fibonacci sequence, where each step can be reached by either taking one step from the previous step or two steps from the step before that.
  Initialize three variables: possibleWay, previousPossibleway, and beforePreviousPossibleWay  .
  Iterate through the steps using a for loop.
  Inside the loop, update beforePreviousPossibleWay by adding previousPossibleway and possibleWay.
  Then update previousPossibleway with the value of possibleWay, and possibleWay with the value of currentPossibleWay.
  Finally, return the value of possibleWay.

## Question 4
  The most hardest question is question 2 compareVersion
   - Why it is hard?
     - it cant direct compare as a numeric like other question
     - it had to handle case  like version1 = "1.0", version2 = "1.0.0" is equal version
     - it had to handle case  version1 = "01", version2 = "1" is equal version
   - What kind of solution that you solve it?
    1.Splitting Versions: First, we split the input version strings (version1 and version2) into lists of revisions using the dot '.' character. Each revision represents a part of the version number.
    2.Comparing Revisions: We then compare each revision from left to right. For each index i, we:
      - Get the integer value of the revision at that index in both versions (defaulting to 0 if not present).
      - Compare these integer values.
    3.Comparison Result:
      - If version1 is less than version2, we return -1.
      - If version1 is greater than version2, we return 1.
      - Otherwise, if all revisions are equal, we return 0.
