/* Write a method that will take an array as a parameter, calculate and return the product of the elements in the array. Call the method passing an array with values into it in the main() method so that the program works. Display the result of the product also.	 */

class ProductOfArray {
  public static void main(String[] args){
    int[] numbers = {2, 3, 5, 1, 7};

    int result = multiply(numbers);

    System.out.println("The result is " + result);
  }

  /* 
   * Method: multiply
   * calculate the product of elements of an array
   * parameter: an array
   * return: the product
   */
  public static int multiply(int[] array){
    int product = 1;

    for(int i = 0; i < array.length; i++){
      product *= array[i];
    }

    return product;
  }
}
