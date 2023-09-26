/*Write a program that will generate and display a random number from 1 to 7 and display the corresponding day of the week where 1 for Monday, 2 for Tuesday and so on.*/

class Weekday {
  public static void main(String[] args) {
    // generate a random number bewteen 1 and 7;
    int number = (int)(Math.random() * 7 + 1);

    // if statement

    // if (number == 1) {
    //   System.out.println("Monday");
    // } else if (number == 2) {
    //   System.out.println("Tuesday");
    // } else if (number == 3) {
    //   System.out.println("Wednesday");
    // } else if (number == 4) {
    //   System.out.println("Thursday");
    // } else if (number == 5) {
    //   System.out.println("Friday");
    // } else if (number == 6) {
    //   System.out.println("Saturday");
    // } else if (number == 6){
    //   System.out.println("Sunday");
    // } else {
    //   System.out.println("Error.");
    // }

    // switch case
    switch(number){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }

  }
}
