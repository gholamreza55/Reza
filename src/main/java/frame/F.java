package frame;

import javax.swing.*;

public class F {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JTextField useIdField = new JTextField();
        JLabel userlabel = new JLabel("userId:");
        userlabel.setBounds(50, 100, 75, 25);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(userlabel);
        frame.add(useIdField);
        frame.setSize(420, 420);

        //  JButton login = new JButton("login");
       // JButton reset = new JButton("reset");
        // JPasswordField usePasswordField = new JPasswordField();

        //  JLabel passwordlabel = new JLabel("password:");
       // JLabel messagelabel = new JLabel();

       /* passwordlabel.setBounds(50, 150, 75, 25);
        messagelabel.setBounds(125, 250, 250, 35);
        messagelabel.setFont(new Font(null, Font.ITALIC, 25));

        useIdField.setBounds(125, 100, 200, 25);
        usePasswordField.setBounds(125, 150, 200, 25);

        login.setBounds(225, 200, 100, 25);
        reset.setBounds(125, 200, 100, 25);
       */
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // frame.add(passwordlabel);
       // frame.add(messagelabel);
     //   frame.add(usePasswordField);
       // frame.add(login);
       // frame.add(reset);

    }

}
