package calcu;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    JFrame frame = new JFrame();
    JButton numButton = new JButton();
    JButton mathButton = new JButton();

    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, minpButton, squButton;
    JTextField textField = new JTextField();
    JPanel panel;
    Font myfont = new Font("Tahoma", Font.BOLD, 25);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator(){
        frame = new JFrame("Calculator");
        frame.setSize(265, 248);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
