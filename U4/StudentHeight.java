package U4;

import java.util.Arrays;
import java.util.Collections;

class StudentHeight {
  public static void main(String[] args) {
    Integer[] height = { 180, 190, 187, 167, 153, 175 };

    System.out.println("Original height:");

    // use for loop to print all items in array
    // option 1
    for(int i = 0; i < height.length; i++){
    System.out.println(height[i]);
    }

    Arrays.sort(height);
    //option 2

    System.out.println("Sorted height:");
    for (int item : height) {
      System.out.println(item);
    }

    // sort height array
    Arrays.sort(height, Collections.reverseOrder());

    System.out.println("Sorted height (reverse order):");

    for (int item : height) {
      System.out.println(item);
    }

  }
}
