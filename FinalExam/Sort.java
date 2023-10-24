/* What is algorithm? Write algorithm using pseudo code to sort a list of numbers. */

// Algorithm is a process or set of rules or steps to solve a problem. Before writing a program, you need to find out the steps to be followed to solve a problem. This process is called algorithm. Algorithm is written in simple English like code called pseudo code which is not specific to any programming language.

// Algorithm: Bubble Sort
// Input: A list of numbers 'array'
// Output: A sorted list 'array'

// 1. Begin
// 2. For i from 0 to length of array - 2
//     2.1 Set 'swapped' to False
//     2.2 For j from 0 to length of array - i - 2
//         2.2.1 If array[j] > array[j+1]
//             2.2.1.1 Set 'temp' to array[j]
//             2.2.1.2 Set array[j] to array[j+1]
//             2.2.1.3 Set array[j+1] to 'temp'
//             2.2.1.4 Set 'swapped' to True
//     2.3 End For
//     2.4 If 'swapped' is False
//         2.4.1 Break
// 3. End For
// 4. Return array
// 5. End


import java.util.Arrays;

public class Sort {
  public static void main(String[] args){
    int[] numbers = {3, 9, 0, 2, 8, 7};
    System.out.println("Original array: " + Arrays.toString(numbers));
    numbers = bubbleSort(numbers);
    System.out.println("Sorted array: " + Arrays.toString(numbers));
  }

  public static int[] bubbleSort(int[] array){
    int i , j, temp;
    boolean swapped;

    for(i = 0; i < array.length - 1; i ++){
      swapped = false;
      for(j = 0; j < array.length - i - 1; j ++){
        if(array[j] > array[j + 1]){
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }
      if(swapped == false){
        break;
      }
    }
    return array;
  }
}
