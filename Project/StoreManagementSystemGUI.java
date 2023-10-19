import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StoreManagementSystemGUI {

  public StoreManagementSystemGUI(String[][] data) {
    // Create components
    JFrame frame = new JFrame("Ms.Shiro's Store Management System");
    JPanel menuPanel = new JPanel();
    JButton viewAllItemsButton = new JButton("View All Items");
    JButton searchItemButton = new JButton("Search Item");
    JButton updateItemButton = new JButton("Update Item");
    JButton exitButton = new JButton("Exit");

    // Add listeners to components
    viewAllItemsButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String[] columnNames = { "Name", "Stock", "Price" };
        JTable table = new JTable(data, columnNames);
        JOptionPane.showMessageDialog(null, new JScrollPane(table), "View All Items", JOptionPane.INFORMATION_MESSAGE);
      }
    });

    searchItemButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String itemName = JOptionPane.showInputDialog("Enter the name of the item to search:");
        int itemIndex = -1;
        for (int i = 0; i < data.length; i++) {
          if (data[i][0].equalsIgnoreCase(itemName)) {
            itemIndex = i;
            break;
          }
        }

        if (itemIndex != -1) {
          JOptionPane.showMessageDialog(null,
              "Name: " + data[itemIndex][0] + "\nStock: " + data[itemIndex][1] + "\nPrice: $" + data[itemIndex][2],
              "Item Found", JOptionPane.INFORMATION_MESSAGE);
        } else {
          JOptionPane.showMessageDialog(null, "Item not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    updateItemButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String itemName = JOptionPane.showInputDialog("Enter the name of the item to update:");
        int itemIndex = -1;
        for (int i = 0; i < data.length; i++) {
          if (data[i][0].equalsIgnoreCase(itemName)) {
            itemIndex = i;
            break;
          }
        }

        if (itemIndex != -1) {
          Object[] options = { "Name", "Stock", "Price" };
          int n = JOptionPane.showOptionDialog(null, "What would you like to update?", "Update Options",
              JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

          switch (n) {
            case 0: // Name
              String newName = JOptionPane.showInputDialog("Enter the new name:");
              data[itemIndex][0] = newName;
              break;

            case 1: // Stock
              String newStock = JOptionPane.showInputDialog("Enter the new stock count:");
              data[itemIndex][1] = newStock;
              break;

            case 2: // Price
              String newPrice = JOptionPane.showInputDialog("Enter the new price:");
              data[itemIndex][2] = newPrice;
              break;
          }

        } else {
          JOptionPane.showMessageDialog(null, "Item not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    exitButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

    // Add components to containers or the main frame
    frame.add(menuPanel);
    menuPanel.add(viewAllItemsButton);
    menuPanel.add(searchItemButton);
    menuPanel.add(updateItemButton);
    menuPanel.add(exitButton);

    // Set properties of the frame
    frame.setSize(600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the frame to visible
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    String[] itemNames = { "treat", "can", "litter", "toy", "collar" };
    int[] stock = { 44, 90, 100, 20, 8 };
    double[] price = { 69.99, 48.50, 9.99, 4.59, 18.45 };

    String[][] dataForTable = new String[itemNames.length][3];
    for (int i = 0; i < itemNames.length; i++) {
      dataForTable[i][0] = itemNames[i];
      dataForTable[i][1] = Integer.toString(stock[i]);
      dataForTable[i][2] = String.format("%.2f", price[i]);
    }

    new StoreManagementSystemGUI(dataForTable);
  }
}
