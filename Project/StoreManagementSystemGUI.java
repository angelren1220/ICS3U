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
        String[] columnNames = {"Name", "Stock", "Price"};
        JTable table = new JTable(data, columnNames);
        JOptionPane.showMessageDialog(null, new JScrollPane(table), "View All Items", JOptionPane.INFORMATION_MESSAGE);
      }
    });

    searchItemButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Search Item Button Pressed");
      }
    });

    updateItemButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Update Item Button Pressed");
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
