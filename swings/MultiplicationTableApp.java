package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MultiplicationTableApp extends JFrame implements ActionListener {
    private JTextField numberField;
    private JTextArea tableArea;
    private JButton generateButton;

    public MultiplicationTableApp() {
        // Initialize the components
        numberField = new JTextField(5);
        tableArea = new JTextArea(10, 20);
        tableArea.setEditable(false);
        generateButton = new JButton("Generate Table");

        // Add action listener to the button
        generateButton.addActionListener(this);

        // Set up the layout
        setLayout(new FlowLayout());
        add(new JLabel("Enter a number:"));
        add(numberField);
        add(generateButton);
        add(new JScrollPane(tableArea));

        // Set the size of the window
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the number from the text field
        String numStr = numberField.getText();
        try {
            int num = Integer.parseInt(numStr);
            // Generate the multiplication table
            StringBuilder table = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                table.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
            }
            // Display the table in the text area
            tableArea.setText(table.toString());
        } catch (NumberFormatException ex) {
            tableArea.setText("Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        new MultiplicationTableApp();
    }
}
