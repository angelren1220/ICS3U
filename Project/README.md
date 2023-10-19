## **Project Description**

**Ms. Shiro's Store Management System** is designed to aid Ms. Shiro in overseeing her store's inventory in a straightforward and efficient manner. Through a console interface, the system offers functionalities such as viewing all items, searching for a specific item, updating item details, and exiting the application. The primary goal is to provide a smooth experience for Ms. Shiro to manage her store without complex operations.

---

## **Class Diagram**

```
Class: StoreManagementSystem

Attributes:
- items: String[]
- stock: int[]
- price: double[]

Methods:
+ main(args: String[]): void
+ viewAllItems(items: String[], stock: int[], price: double[]): void
+ searchItem(items: String[], scanner: Scanner): int
+ updateItem(items: String[], scanner: Scanner): void
+ updateStock(stock: int[], scanner: Scanner): void
+ updatePrice(price: double[], scanner: Scanner): void
+ sum(stock: int[]): int
```

---

## **Documentation**

### **1. StoreManagementSystem Class**

This is the main class that runs the management system.

**Attributes:**
- `items`: An array that stores the names of all items.
- `stock`: An array that stores the stock count of each item.
- `price`: An array that stores the price of each item.

**Methods:**

- `main(String[] args)`: This is the entry point of the application. It displays the main menu and processes user input to navigate through various options.
  
- `viewAllItems(String[] items, int[] stock, double[] price)`: Displays all the items in the store with their respective stock counts and prices.

- `searchItem(String[] items, Scanner scanner)`: Searches for an item by name and returns its index. If the item is not found, it returns -1.

- `updateItem(String[] items, Scanner scanner)`: Allows the user to update the name of an item.

- `updateStock(int[] stock, Scanner scanner)`: Allows the user to update the stock count of an item.

- `updatePrice(double[] price, Scanner scanner)`: Allows the user to update the price of an item.

- `sum(int[] stock)`: Calculates the total number of items in the store.