/* Write a program that will calculate and display the sum of the numbers from 11 to 20. */
class LoopSum {
  public static void main(String[] args){
    int sum = 0;
    for(int i = 11; i < 21; i ++){
      sum += i;
    }
    System.out.println("Sum is " + sum);
  }
}
