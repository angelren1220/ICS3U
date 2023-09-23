/* Write a program that will assign the marks of Math, Physics and Chemistry separately, then calculate and display the average mark.	 */

class CourseMarks {
  public static void main(String[] args) {
    float math = 94.5f;
    float physics = 88.1f;
    float chemistry = 90.0f;
    float average = (math + physics + chemistry)/3;
    System.out.println("The average is " + average);

  }
}
