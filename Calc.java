import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calci extends JFrame implements ActionListener {
    JTextField display;
    String op = "", num1 = "", num2 = "";

    calci(){
        setSize(600, 500);
        setTitle("!Calculator By Lalith!");
        setBackground(Color.cyan);

        GridBagLayout l = new GridBagLayout();
        GridBagConstraints g = new GridBagConstraints();

        setLayout(l);

        g.fill = GridBagConstraints.BOTH;

        display = new JTextField();
        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 4;
        g.ipady = 30;
        add(display, g);

        g.gridwidth = 1;
        g.ipady = 20;

        JButton b1 = new JButton("1");
        g.gridx = 0;
        g.gridy = 1;
        add(b1, g);
        b1.addActionListener(this);

        JButton b2 = new JButton("2");
        g.gridx = 1;
        g.gridy = 1;
        add(b2, g);
        b2.addActionListener(this);

        JButton b3 = new JButton("3");
        g.gridx = 2;
        g.gridy = 1;
        add(b3, g);
        b3.addActionListener(this);

        JButton m = new JButton("/");
        g.gridx = 3;
        g.gridy = 1;
        add(m, g);
        m.addActionListener(this);

        JButton b4 = new JButton("4");
        g.gridx = 0;
        g.gridy = 2;
        add(b4, g);
        b4.addActionListener(this);

        JButton b5 = new JButton("5");
        g.gridx = 1;
        g.gridy = 2;
        add(b5, g);
        b5.addActionListener(this);

        JButton b6 = new JButton("6");
        g.gridx = 2;
        g.gridy = 2;
        add(b6, g);
        b6.addActionListener(this);

        JButton m1 = new JButton("*");
        g.gridx = 3;
        g.gridy = 2;
        add(m1, g);
        m1.addActionListener(this);

        JButton b7 = new JButton("7");
        g.gridx = 0;
        g.gridy = 3;
        add(b7, g);
        b7.addActionListener(this);

        JButton b8 = new JButton("8");
        g.gridx = 1;
        g.gridy = 3;
        add(b8, g);
        b8.addActionListener(this);

        JButton b9 = new JButton("9");
        g.gridx = 2;
        g.gridy = 3;
        add(b9, g);
        b9.addActionListener(this);

        JButton m2 = new JButton("-");
        g.gridx = 3;
        g.gridy = 3;
        add(m2, g);
        m2.addActionListener(this);

        JButton m3 = new JButton("C");
        g.gridx = 0;
        g.gridy = 4;
        add(m3, g);
        m3.addActionListener(this);

        JButton m4 = new JButton("0");
        g.gridx = 1;
        g.gridy = 4;
        add(m4, g);
        m4.addActionListener(this);

        JButton m5 = new JButton("=");
        g.gridx = 2;
        g.gridy = 4;
        add(m5, g);
        m5.addActionListener(this);

        JButton m6 = new JButton("+");
        g.gridx = 3;
        g.gridy = 4;
        add(m6, g);
        m6.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("C")) {
            display.setText("");
            num1 = num2 = op = "";
        } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            num1 = display.getText();
            op = s;
            display.setText("");
        } else if (s.equals("=")) {
            num2 = display.getText();

            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            double res = 0;

            if (op.equals("+"))
                res = a + b;
            if (op.equals("-"))
                res = a - b;
            if (op.equals("*"))
                res = a * b;
            if (op.equals("/")) {
                res = a / b;
            }
            display.setText(num1 + op + num2 + "=" + res);
        } else {
            display.setText(display.getText() + s);
        }
    }
}

public class Calc {
    public static void main(String args[]) {
        
        calci c = new calci();

    }
}