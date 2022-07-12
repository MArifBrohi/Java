import javax.swing.*;
import java.awt.*;
class GuiProgram{
	public static void main(String[] args){
	JFrame frame = new JFrame("Chat Frame");
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.setSize(400,400);
	
	JMenuBar mb = new JMenuBar();
	
	JMenu m1 = new JMenu("File");
	JMenu m2 = new JMenu("Help");
	JMenu m3 = new JMenu("Edit");
	mb.add(m1);
	mb.add(m2);
	mb.add(m3);
	
	JMenuItem m11 = new JMenuItem("Open");
	JMenuItem m22 = new JMenuItem("Save as");
	JMenuItem m33 = new JMenuItem("Properties");
	JMenuItem m44 = new JMenuItem("Copy");
	JMenuItem m55 = new JMenuItem("Select all");
	m1.add(m11);
	m1.add(m22);
	m3.add(m33);
	m3.add(m44);
	m3.add(m55);
	
	
	JPanel panel = new JPanel();
	JLabel label = new JLabel("Enter Text");
	JTextField tf = new JTextField(10);
	JButton send = new JButton("Send");
	JButton reset = new JButton("Reset");
	panel.add(label);
	panel.add(tf);
	panel.add(send);
	panel.add(reset);

	JTextArea ta = new JTextArea();
	
	frame.getContentPane().add(BorderLayout.SOUTH,panel);
	frame.getContentPane().add(BorderLayout.NORTH,mb);
	frame.getContentPane().add(BorderLayout.CENTER,ta);

	frame.setVisible(true);
}
}
