package swings;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

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
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("./database.txt", true))) {
                writer.write("\n\n**New User**\n");
                writer.write("Username: " + username.getText() + "\n");
                writer.write("Email: " + email.getText() + "\n");
                writer.write("Password: " + password.getText() + "\n");
                result.setText("Your response is submitted!");
            } catch (IOException err) {
                System.err.println(err.toString());
                result.setText("An error occured: " + err);
            } finally {
                username.setText(null);
                email.setText(null);
                password.setText(null);
            }
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
