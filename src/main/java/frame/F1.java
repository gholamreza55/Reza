package frame;

import javax.swing.*;
import java.awt.*;

public class F1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JTextField userId = new JTextField();
        JLabel userlabel = new JLabel("userId :");
        userlabel.setBounds(50, 75,75, 25);

        JTextField password = new JTextField();
        JLabel passwordlabel = new JLabel("password :");
        passwordlabel.setBounds(50, 125, 75,25 );

        JButton login = new JButton("login");
        login.setBounds(50, 200, 75, 25);

        JButton reset = new JButton("reset");
        reset.setBounds(150, 200, 75, 25);

        JLabel messageLable = new JLabel();
        messageLable.setBounds(150 ,125, 75, 25);
      //  messageLable.setFont(new Font(null, Font.ITALIC, 25));
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(125, 125, 75, 25);


      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(userId);
        frame.add(userlabel);
        frame.add(password);
        frame.add(passwordlabel);
        frame.add(login);
        frame.add(reset);
        frame.add(messageLable);
        frame.add(passwordField);
    }
}
