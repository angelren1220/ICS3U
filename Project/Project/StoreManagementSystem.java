/**
 * StoreManagementSystem: A management system for a store.
 * The user (owner of the store) can:
 * - Add all items
 * - View all items
 * - Search for an item by its name
 * - Update an item's name, stock, or price
 * - Exit the program
 */

package Project;

import java.util.Scanner;

public class StoreManagementSystem {

  private static int maxItems = 5;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // declare contents of store managment system
    String[] items = new String[maxItems];
    int[] stock = new int[maxItems];
    double[] price = new double[maxItems];

    // Menu for users
    System.out.println("====== Ms.Shiro's Store Management System ======");
    System.out.println("Welcome Ms.Shiro!");
    displayMenu();

    while (true) {
      int option = getValidIntInput(scanner);
      scanner.nextLine(); // Consume newline

      switch (option) {
        case 0: // add all items
          addItems(items, stock, price, scanner);
          displayMenu();
          break;
        case 1: // view all items
          System.out.println("View all items:");
          viewAllItems(items, stock, price);
          displayMenu();
          break;

        case 2: // search item
          int index = searchItem(items, scanner);

          if (index != -1) {
            System.out.println(
                "Index: " + index + " " + items[index] + " " + stock[index] + " in stock price: $" + price[index]);
          } else {
            System.out.println("Could not find the item.");
          }
          displayMenu();
          break;

        case 3: // update item
          // Update options
          int updatedItemindex = searchItem(items, scanner);
          System.out.println("Choose an option to be updated:");
          System.out.println("1. name");
          System.out.println("2. stock");
          System.out.println("3. price");

          int updateOption = getValidIntInput(scanner);
          scanner.nextLine(); // Consume newline

          switch (updateOption) {
            case 1:
              updateItem(updatedItemindex, items, scanner);
              break;
            case 2:
              updateStock(updatedItemindex, stock, scanner);
              break;
            case 3:
              updatePrice(updatedItemindex, price, scanner);
              break;
            default:
              System.out.println("Invalid option. Back to main menu.");
              break;
          }
          displayMenu();
          break;

        case 4: // exit
          System.out.println("Goodbye, Ms.Shiro!");
          scanner.close();
          return;

        default:
          System.out.println("Invalid option. Please try again.");
          displayMenu();
          break;

      }

    }

  }

  /* Methods */

  /**
   * Add all items in the store.
   */
  public static void addItems(String[] items, int[] stock, double[] price, Scanner scanner) {
    for (int i = 0; i < maxItems; i++) {
      System.out.println("Enter name for item " + (i + 1));
      items[i] = scanner.nextLine();
      System.out.println("Enter stock for item " + (i + 1));
      stock[i] = getValidIntInput(scanner);
      scanner.nextLine(); // Consume newline
      System.out.println("Enter price for item " + (i + 1));
      price[i] = getValidDoubleInput(scanner);
      scanner.nextLine(); // Consume newline
    }
    System.out.println("All items added successfully!");
  }

  /**
   * Display all items in the store.
   */
  public static void viewAllItems(String[] items, int[] stock, double[] price) {
    System.out.println("Name\tStock\tPrice($)");
    System.out.println("-----------------------------");
    for (int i = 0; i < items.length; i++) {
      System.out.println(items[i] + "\t" + stock[i] + "\t" + price[i]);
    }

    int totalItems = sum(stock);
    System.out.println("-----------------------------");
    System.out.println("Total number of items: " + totalItems);
  }

  /**
   * Search for an item by name and return its index.
   * Returns -1 if not found.
   */
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

  /**
   * Update the name of an item by index.
   */
  public static void updateItem(int index, String[] items, Scanner scanner) {

    if (index != -1) {
      System.out.println("Enter the name:");
      String name = scanner.nextLine();
      items[index] = name;
      System.out.println("Update successfully!");
    } else {
      System.out.println("Could not find the item.");
    }

  }

  /**
   * Update the stock of an item by index.
   */
  public static void updateStock(int index, int[] stock, Scanner scanner) {

    if (index != -1) {
      System.out.println("Enter the updated stock:");
      int number = getValidIntInput(scanner);
      stock[index] = number;
      System.out.println("Update successfully!");
    } else {
      System.out.println("Could not find the item.");
    }

  }

  /**
   * Update the price of an item by index.
   */
  public static void updatePrice(int index, double[] price, Scanner scanner) {

    if (index != -1) {
      System.out.println("Enter the updated price:");
      double number = getValidDoubleInput(scanner);
      price[index] = number;
      System.out.println("Update successfully!");

    } else {
      System.out.println("Could not find the item.");
    }

  }

  /**
   * Calculate the total number of items in stock.
   */
  public static int sum(int[] stock) {
    int sum = 0;

    for (int i = 0; i < stock.length; i++) {
      sum += stock[i];
    }
    return sum;
  }

  /**
   * Display the menu for user
   */
  public static void displayMenu() {
    System.out.println("\n --------------- Main Menu ---------------");
    System.out.println("Choose your option:");
    System.out.println("0. add all items");
    System.out.println("1. view all items");
    System.out.println("2. search item");
    System.out.println("3. update item");
    System.out.println("4. exit\n");
  }

  /*
   * getValidIntInput
   */

  public static int getValidIntInput(Scanner scanner) {
    while (true) {
      try {
        if (scanner.hasNextInt()) {
          return scanner.nextInt();
        } else {
          System.out.println("Invalid input. Please enter a valid number.");
          scanner.nextLine(); // Consume the invalid input
        }
      } catch (Exception e) {
        System.out.println("Error reading input. Please try again.");
        scanner.nextLine(); // Consume any leftover input
      }
    }
  }

  /*
   * getValidDoubleInput
   */
  public static double getValidDoubleInput(Scanner scanner) {
    while (true) {
      try {
        if (scanner.hasNextDouble()) {
          return scanner.nextDouble();
        } else {
          System.out.println("Invalid input. Please enter a valid number.");
          scanner.nextLine(); // Consume the invalid input
        }
      } catch (Exception e) {
        System.out.println("Error reading input. Please try again.");
        scanner.nextLine(); // Consume any leftover input
      }
    }
  }

}
