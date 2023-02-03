package frame;

import org.junit.jupiter.api.Test;

import javax.swing.*;

public class Fra {
    @Test
    void name() {

        JFrame frame1 = new JFrame();
        JTextField userIdField = new JTextField();
        JLabel userlabel1 = new JLabel("salam");
        userlabel1.setBounds(400, 50, 75, 25);
        frame1.setSize(500, 500);
        frame1.add(userIdField);
        frame1.add(userlabel1);
        frame1.setVisible(true);
        frame1.setLayout(null);
    }

    @Test
    void name1() {
        JFrame frame = new JFrame();
        JTextField useIdField = new JTextField();
        JLabel userlabel = new JLabel("userId:");
        userlabel.setBounds(50, 100, 75, 25);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(userlabel);
        frame.add(useIdField);
        frame.setSize(420, 420);
    }
}
