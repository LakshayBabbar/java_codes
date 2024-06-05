package swings;

import javax.swing.*;
import java.awt.event.*;
import IO.WriteFile;

public class FormApplet {
    public FormApplet() {
        JFrame frame = new JFrame();
        JTextField username = new JTextField("username");
        JTextField email = new JTextField("email");
        JTextField password = new JTextField("password");
        JButton submit = new JButton("Submit");
        JLabel formTitle = new JLabel("Registeration Form");
        JLabel result = new JLabel("Fill all the required fields");

        formTitle.setBounds(100, 50, 200, 40);
        username.setBounds(100, 100, 150, 40);
        email.setBounds(100, 150, 150, 40);
        password.setBounds(100, 200, 150, 40);
        submit.setBounds(100, 250, 150, 40);
        result.setBounds(100, 300, 200, 40);

        submit.addActionListener(e -> {
            result.setText(null);
            final String data = "\n\nNew User\nUsername: " + username.getText() + "\nEmail: " + email.getText()
                    + "\nPassword: " + password.getText();
            WriteFile file = new WriteFile("database.txt", data);
            result.setText("Your response is submitted!");
            username.setText(null);
            email.setText(null);
            password.setText(null);

        });
        frame.add(formTitle);
        frame.add(username);
        frame.add(email);
        frame.add(password);
        frame.add(submit);
        frame.add(result);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
