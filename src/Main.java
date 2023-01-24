import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        JFrame myFrame = new JFrame("Bank Application");

        JLabel label = new JLabel("Enter customer ID:");
        JTextField Customer = new JTextField();
        JButton button1 = new JButton("Add Customer");
        JButton button2 = new JButton("CheckOut");
        JButton button3 = new JButton("View Customers");
        JComboBox services = new JComboBox<>();
        services.addItem("Customer Service");
        services.addItem("Other Services");

        myFrame.add(label);
        myFrame.add(Customer);
        myFrame.add(services);
        myFrame.add(button1);
        myFrame.add(button2);
        myFrame.add(button3);

        myFrame.setVisible(true);
        myFrame.setSize(500, 500);
        myFrame.setLayout(new GridLayout(6, 1));
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button1.addActionListener(e ->
                {
                    if (e.getSource() == button1) {
                        queue.enQueue(Customer.getText());
                        if (services.getSelectedItem() == "Customer Service") {
                            System.out.println("service1");
                        } else if (services.getSelectedItem() == "Other Services") {
                            System.out.println("service2");
                        } else {
                            System.out.println("PLease select a service");
                        }
                    } else {
                        System.out.println("Please enter CustomerId");
                    }
                }
        );
        button2.addActionListener(e ->
                {
                    if (e.getSource() == button2) {
                        queue.deQueue();
                    }
                }
        );

        button3.addActionListener(e ->
                {
                    if (e.getSource() == button3) {
                        queue.printQueue();
                    }
                }
        );
    }
}