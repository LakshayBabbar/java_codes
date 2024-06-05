package swings
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class AppletBak extends JFrame implements ActionListener {
    private JRadioButton red, green, blue;

    public AppletBak() {
        JLabel title = new JLabel("Choose the background color");
        JButton submit = new JButton("Submit");
        submit.addActionListener(this);
        red = new JRadioButton("Red");
        green = new JRadioButton("Green");
        blue = new JRadioButton("Blue");
        ButtonGroup bak = new ButtonGroup();
        bak.add(red);
        bak.add(green);
        bak.add(blue);
        add(title);
        add(red);
        add(green);
        add(blue);
        add(submit);
        setLayout(new GridLayout(5, 1));
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (red.isSelected()) {
            setBackground(Color.RED);
        } else if (green.isSelected()) {
            setBackground(Color.GREEN);
        } else if (blue.isSelected()) {
            setBackground(Color.BLUE);
        }

    }

    public static void main(String[] args) {
        new AppletBak();
    }
}
