import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame{
    JLabel l1;
    JLabel l2;
    Calculator(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1 = new JLabel("Simple Calculator");
        l1.setBounds(40,10,300,30);
        l1.setFont(new Font("Times New Roman", Font.BOLD,30));
        l1.setForeground(Color.BLUE);
        add(l1);
        JTextField t1 , t2;
        JButton b1,b2,b3,b4;
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mul");
        b4 = new JButton("Div");
        t1.setBounds(100,50,120,30);
        t2.setBounds(100,90,120,30);
        b1.setBounds(100,140,60,30);
        b2.setBounds(160,140,60,30);
        b3.setBounds(100,190,60,30);
        b4.setBounds(160,190,60,30);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        l2 = new JLabel("");
        l2.setBounds(240,90,120,40);
        add(l2);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                l2.setText("Sum of two No: "+(n1+n2));
                l2.setForeground(Color.BLUE);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                l2.setText("Sub of two No: "+(n1-n2));
                l2.setForeground(Color.RED);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                l2.setText("Mul of two No: "+(n1*n2));
                l2.setForeground(Color.BLUE);
                   
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                l2.setText("Div of two No: "+(n1/n2));
                l2.setForeground(Color.RED);
            }
        });

    }
}
class GUI_1_Calculator{
    public static void main(String[] args){
        Calculator ob = new Calculator();
        ob.setBounds(400,200,400,300);
        ob.setVisible(true);
    }
}
