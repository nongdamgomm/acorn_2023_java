package frame09;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener{
	//필드 선언 ( 오버라이드 메소드 안에서 사용하기 위해 )
	JTextField tf_num1, tf_num2;
	JLabel la2;
	
	public MyFrame (String title) {
		super(title);
		setBounds(100, 100, 900, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//레이아웃 잡기//
		tf_num1 = new JTextField(10); //필드 선언 했으므로 앞에 지윰
		tf_num2 = new JTextField(10);
		
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		JButton multiBtn = new JButton("*");
		JButton divideBtn = new JButton("/");
		
		JLabel la1 = new JLabel("=");
		la2 = new JLabel("0"); //필드 선언 (지역변수 선언을 지워야 필드에 들어갈 수 있음)
		
		//add 순서대로 배치
		add(tf_num1);
		add(plusBtn);
		add(minusBtn);
		add(multiBtn);
		add(divideBtn);
		add(tf_num2);
		add(la1);
		add(la2);
		
		//Btn 사용을 위한 ActionListener 등록하기
		plusBtn.addActionListener(this); //누르면 맨밑에 내용 호출
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		
		//버튼에 action command 다 다르게 설정해서 다른 
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
		multiBtn.setActionCommand("multi");
		divideBtn.setActionCommand("divide");
		
		
		//열기
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("계산기");
	}

	//ActionListner 인터페이스 구현했기 떄문에 강제 오버라이드 된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//입력한 문자열 읽어오기
		String strNum1=tf_num1.getText();
		String strNum2=tf_num2.getText();
		try {
			//입력한 문자열을 실수(double)로 변경하기
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			
			
			//눌러진 버튼의 command 읽어오기
			String cmd =e.getActionCommand();
			
			//연산의 결과값을 담을 변수를 미리 선언하고 초기값 대입하기 (왜 미리 선언해야하나를 알아야함_)
			// if() {double result =num1 + num2;} 사용하면 밖에서 result를 사용할 수 없으니까...
			double result = 0;
			
			//눌러진 버튼의 맞는 command 마다 실행되는 if 문
			if(cmd.equals("plus")) {
				result =num1 + num2;
			}else if(cmd.equals("minus")) {
				result =num1 - num2;
			}else if(cmd.equals("multi")) {
				result =num1 * num2;
			}else if(cmd.equals("divide")) {
				if(num2==0) {
					JOptionPane.showMessageDialog(this, "어떤 수를 0으로 나눌수는 없어요");
					//여기서 메소드를 종료 (리턴) 시키기
					return;
				}
				result =num1 / num2;
			}
			//결과값 출력을 위해 결과값 숫자를 문자로 변경하기
			String resultText = Double.toString(result);
			
			//결과 값을 JLabel에 출력하기
			la2.setText(resultText);
		}catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "숫자 형식으로 입력해주세요");
		}
	}
}
