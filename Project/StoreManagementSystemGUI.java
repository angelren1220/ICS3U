import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StoreManagementSystemGUI {

  public StoreManagementSystemGUI() {
    JFrame frame = new JFrame("Ms.Shiro's Store Management System");
    frame.setSize(600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel menuPanel = new JPanel();
    JButton viewAllItemsButton = new JButton("View All Items");
    JButton searchItemButton = new JButton("Search Item");
    JButton updateItemButton = new JButton("Update Item");
    JButton exitButton = new JButton("Exit");

    menuPanel.add(viewAllItemsButton);
    menuPanel.add(searchItemButton);
    menuPanel.add(updateItemButton);
    menuPanel.add(exitButton);

    frame.add(menuPanel);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new StoreManagementSystemGUI();
  }
}
