/* A management system for a store. 
The user (owner of the store) can do followings with menu
1. view all items
2. search item with its name
3. update items name, stock, price
4. exit program
*/

package Project;

import java.util.Scanner;

public class StoreManagementSystem {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // declare contents of store managment system
    String[] items = { "treat", "can", "litter", "toy", "collar" };
    int[] stock = { 44, 90, 100, 20, 8 };
    double[] price = { 69.99, 48.50, 9.99, 4.59, 18.45 };

    // Menu for users
    System.out.println("====== Ms.Shiro's Store Management System ====== ");
    System.out.println("Welcom Ms.Shiro!");
    System.out.println("Choose your option:");
    System.out.println("1. view all items");
    System.out.println("2. search item");
    System.out.println("3. update item");
    System.out.println("4. exit");

    while (true) {
      int option = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (option) {
        case 1: // view all items
          System.out.println("View all items:");
          viewAllItems(items, stock, price);
          break;

        case 2: // search item
          int index = searchItem(items, scanner);

          if (index != -1) {
            System.out.println("Index: " + index + items[index] + stock[index] + " in stock price: $" + price[index]);
          } else {
            System.out.println("Could not find the item.");
          }
          break;

        case 3: // update item
          updateItem(items, scanner);
          break;

        case 4: // exit
          System.out.println("Goodbye, Ms.Shiro!");
          scanner.close();
          return;

        default:
          System.out.println("Invalid option. Please try again.");

      }

    }

  }

  /* Methods */
  public static void viewAllItems(String[] items, int[] stock, double[] price) {
    System.out.println("Name\tStock\tPrice($)");
    for (int i = 0; i < items.length; i++) {
      System.out.println(items[i] + "\t" + stock[i] + "\t" + price[i]);
    }
  }

  public static int searchItem(String[] items, Scanner scanner) {
    System.out.println("Enter item name to search:");
    String name = scanner.nextLine();
    for (int i = 0; i < items.length; i++) {
      if (name.equals(items[i])) {
        return i;
      }
    }
    return -1;
  }

  public static void updateItem(String[] items, Scanner scanner) {
    System.out.println("Enter the item index to be updated:");
    int index = scanner.nextInt();
    scanner.nextLine(); // consume new line

    System.out.println("Enter the name:");
    String name = scanner.nextLine();
    items[index] = name;

  }
}
