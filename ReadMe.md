# rotateArray

#Question:
The problem we would like you to solve deals with an array of integers. We want to rotate these integers to a specified 
number of positions to the left. If for example you have an array of integers [1,2,3,4,5,6,7] and we would like to rotate 
2 positions to the left, the solution expected would be [3,4,5,6,7,1,2]. Note: the solution should be able to handle a 
position value greater than the number of integers in the array. If, for example, we would like to rotate [1,2,3,4,5,6,7] 
8 positions to left, it would produce the result [2,3,4,5,6,7,1]. Negative values for the positions to rotate will throw 
an error which the code example should handle gracefully.

#Approach:
Main Function: src/main/java/com/himani/rotatearray/Main.java
Test Function: src/test/java/com/himani/rotatearray/MainTest.java

#Normal Solution:
Time Complexity: O(N)
Space Complexity: O(N)
I created a new function called rotateArray to rotate the given array and number of positions. Firstly, I created a new
array to store the rotated values from the original array, this was done by adding the number of rotations to the current 
index of the array. If that value is greater than array length we will divide the number by array length and the remainder 
will be the new index position. I have also added exceptions for the negative values and added different test cases to 
check my code.

#Optimized Solution:
Time Complexity: O(N)
Space Complexity: O(1) -> No extra space
I created a new function called reverseRotateArray to rotate the given array and number of positions. In this approach I 
did not use any extra space, hence it is more efficient. I have defined a new function called reverse to reverse the array 
from given start and end index.
