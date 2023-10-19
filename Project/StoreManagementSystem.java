/* A management system for a store. 
The user (owner of the store) can do followings with menu
1. view all items
2. add items one by one until reach the maximum
3. search item with its name
4. update items name, stock, price
5. exit program
*/

package Project;

public class StoreManagementSystem {
  public static void main(String[] args){

    // declare contents of store managment system
    String[] items = new String[10];
    int[] stock = new int[10];
    float[] price = new float[10];

    // Menu for users
    System.out.println("====== Ms.Shiro's Store Management System ====== ");
    System.out.println("Welcom Ms.Shiro!");
    System.out.println("Choose your option:");
    System.out.println("1. view all items");
    System.out.println("2. add items");
    System.out.println("3. search item");
    System.out.println("4. update item");
    System.out.println("5. exit");
    
  }
}
