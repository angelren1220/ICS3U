/* Write a program that will declare and initialize an array with the odd integers from 1 to 30. */

import java.util.Arrays;

class OddNumbers{
  public static void main(String[] args){
    int[] oddNumbers = new int[15];
    int oddNumber = 1;
    for(int i = 0; i < oddNumbers.length; i++){
      oddNumbers[i] = oddNumber;
      oddNumber += 2;
    }

    System.out.println(Arrays.toString(oddNumbers));
  }
}