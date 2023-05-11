package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	//필드
	JTextField inputMsg;
	JLabel label;
	
	//생성자
	public MyFrame(String title) {
		super(title);
		//초기 위치와 크기 선정
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		//앞에 this 생략
		
		//문자열을 한줄 입력할 수 있는 JTextField 객체 생성
		//JTextField 
		inputMsg = new JTextField(10);
		JButton sendBtn = new JButton("전송");
		JButton sendBtn2 = new JButton("전송2");
		//문자열을 단순히 출력할 수 있는 JLabel 객체
		JLabel label = new JLabel("...");
		
		
		//MyFrame 을 액션 리스너로 등록을 한다.
		sendBtn.addActionListener(this);
		
		//전송2 버튼을 눌렀을 때 실행되는 
		sendBtn2.addActionListener((e)->{
			String msg = inputMsg.getText();
			JOptionPane.showMessageDialog(this, msg);
			label.setText(msg);
		});
	
		//프레임에 UI를 추가한다 
		//add() 메소드로 추가해준다. 
		//전달받는 부모 메소드 확인해보기 
		//component a = new JTextFiled();
		//            = new JButton();
		//            = new JLabel();
		add(inputMsg);
		add(sendBtn);
		add(sendBtn2);
		add(label);
		
		//UI를 모두 배치하고 나중에 호출하려는 것이 원칙이다...
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 1.JTexField 에 입력한 문자열을 읽어온다
		String msg = inputMsg.getText();
		// 2. 읽어온 문자열을 알림창에 띄운다
		JOptionPane.showMessageDialog(this, msg);
		// 3.읽어온 문자열을 JLable에 출력하기
		label.setText(msg);
	}
}
