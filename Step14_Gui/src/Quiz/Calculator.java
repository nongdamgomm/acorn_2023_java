package Quiz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	JTextField input1;
	
	public Calculator (String title) {
		setTitle(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		input1 = new JTextField(10);
		JButton btn1 = new JButton("+");
		JButton btn2 = new JButton("-");
		JButton btn3 = new JButton("*");
		JButton btn4 = new JButton("/");
		JTextField input2 = new JTextField(10);
		JLabel label1 = new JLabel("=");
		JLabel label2 = new JLabel("0");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn3.addActionListener(this);
		
		
		
		add(input1);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(input2);
		add(label1);
		add(label2);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Calculator("계산기");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String num1 = input1.getText();
		Double num2 = Double.parseDouble(num1);
	}
}
