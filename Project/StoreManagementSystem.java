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
    String[] items = {"dry food", "canned food", "litter", "toy", "collar"};
    int[] stock = {44, 90, 100, 20, 8};
    double[] price = {69.99, 48.50, 9.99, 4.59, 18.45};

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

      switch (option) {
        case 1: // view all items
          System.out.println("View all items:");
          viewAllItems(items, stock, price);
          break;

        case 2: // search item
          searchItem();
          break;

        case 3: // update item
          updateItem();
          break;

        case 4: // exit
          System.out.println("Goodbye, Ms.Shiro!");
          return;

        default:
          System.out.println("Invalid option. Please try again.");

      }

      scanner.close();
    }

  }

  /* Methods */
  public static void viewAllItems(String[] items, int[] stock, double[] price) {
    System.out.println("Name\tStock\tPrice($)");
    for(int i = 0; i < items.length; i++){
      System.out.println(items[i]+"\t"+stock[i]+"\t"+price[i]);
    }
  }

  public static void searchItem() {
    System.out.println("search item");
  }

  public static void updateItem() {
    System.out.println("update item");
  }
}
