/* Write a method in a program to find the average marks storing in an array. Also write a test plan to test the method. */

public class AverageMark {
  
  public static void main(String[] args) {
    double[] sampleMarks = {90, 85, 78, 92, 88};
    System.out.println("Average marks: " + findAverage(sampleMarks));
  }

  public static double findAverage(double[] marks) {
      
      double sum = 0;
      for (int i = 0; i < marks.length; i ++) {
          sum += marks[i];
      }
      
      return sum / marks.length;
  }
}
