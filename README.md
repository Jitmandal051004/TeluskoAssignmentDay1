# TeluskoAssignmentDay1
---------------------------------------------------------------
1) Iteration Method
1. This Java program generates Pascal's Triangle using a list-based approach(Iterative). Here's a simplified explanation of the steps involved:

2. Set the maximum height of the triangle: In the main method, the variable maxHeight is initialized to 7, which determines the number of rows in Pascal's Triangle.

3. Initialize the list to store the triangle: The program creates an empty list of lists called answer, which will store the values of Pascal's Triangle.

4. Iterate through each row: A for loop is used to iterate through each row of the triangle. The loop variable i starts from 0 and goes up to maxHeight - 1.

5. Create a list for the current row: Within the outer loop, a new list col is created to represent the current row of Pascal's Triangle.

6. Iterate through each column in the row: Another for loop is used to iterate through each column in the current row. The loop variable j starts from 0 and goes up to i (the current row number).

7. Calculate the cell value: Inside the inner loop, an if-else statement checks if the current column is either the first column (j == 0) or the last column (j == i). If it is, the value 1 is added to the current row col. Otherwise, the value is calculated by summing the corresponding elements from the previous row (answer) at indices j-1 and j.

8. Add the row to the triangle: After calculating all the values in the current row, the list col representing the row is added to the answer list, which stores the entire triangle.

9. Print the triangle: Finally, a nested for-each loop is used to iterate through each row in the answer list and print the values of Pascal's Triangle to the console.

10. By following this process, the program generates Pascal's Triangle with the specified number of rows and prints it to the console using a list-based approach. Each number in the triangle represents a combination of the row and column it belongs to.

---------------------------------------------------------------------------------------------------------------------------------------
2)Recursive Method
This Java program generates Pascal's Triangle using a Recursive approach. Here's a simplified explanation of the steps involved:

1. Set the maximum height of the triangle: In the main method, the variable maxHeight is initialized to 7. This determines the number of rows in the triangle. We could also use Scanner and nextInt() if we want to take value from the user.

2. Iterate through each row: A for loop is used to iterate through each row of the triangle. The loop variable i starts from 0 and goes up to maxHeight - 1.

3. Iterate through each column in the row: Within the outer loop, there is another for loop that iterates through each column in the current row. The loop variable j starts from 0 and goes up to i (the current row number).

4. Printing the pattern: The System.out.print statement is used to print the value returned by the pattern method. The pattern method calculates the value of the current cell based on its row and column numbers.

5. Moving to the next line: After printing all the values in a row, the System.out.println statement is used to move to the next line, creating the triangular shape.

6. Implementing the pattern method: The pattern method is a recursive function that calculates the value of a specific cell in Pascal's Triangle.

7. Base cases: The if statement checks if the column number (colnum) is either 0 or equal to the row number (rownum). In these cases, the method returns 1, as these are the boundary cells of the triangle and their values are always 1.

8. Recursive calculation: If the column number is not a boundary case, the method recursively calls itself twice, passing the row number decremented by 1 and the column number decremented by 1 for the first call, and passing the row number decremented by 1 and the same column number for the second call. The two values returned by the recursive calls are added together and stored in the variable k.

9. Returning the calculated value: The value of k is returned as the final value of the current cell in Pascal's Triangle.

By following this process, the program generates Pascal's Triangle with the specified maximum height and prints it to the console. Each number in the triangle represents a combination of the row and column it belongs to.

-----------------------------------------------------------------------------------------------------------------------------------
3) Memoization Method
Here the basic difference from recursive mtd is that we have introduced caching which will get stored thus the code doesn't have to produce the same result again. Thus improving performance and reducing meaningless calculations again and again.

