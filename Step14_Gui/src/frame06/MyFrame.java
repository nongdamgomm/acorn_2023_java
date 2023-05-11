package frame06;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	//필드 - 메소드에서 필요한 값을 담고있다 (어디서든 사용 가능하게 ) 
//	JButton sendBtn;
//	JButton deleteBtn;
//	JButton updateBtn;
	JButton sendBtn, deleteBtn,updateBtn; //동일한 타입일 경우 한줄에 선언할수 있다..
	
   
   //생성자
   public MyFrame(String title) {
      super(title);
      
      // setBounds(x, y, width, height)  창의 위치와 크기 설정
      this.setBounds(100, 100, 500, 500);
      // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new FlowLayout());
      
      //전송 버튼의 참조값을 필드에 저장 (this.은 생략가능)
      this.sendBtn=new JButton("전송");
      add(sendBtn);
      
      this.deleteBtn=new JButton("삭제");
      add(deleteBtn);
      
      //JButton updateBtn=new JButton("수정");
      this.updateBtn=new JButton("수정");
      add(updateBtn);
      //전송, 삭제, 수정 버튼 모두 다 하나의 리스너 등록하기
      sendBtn.addActionListener(this);
      deleteBtn.addActionListener(this);
      updateBtn.addActionListener(this);
      
      
      // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
      setVisible(true);
   }
   
   public static void main(String[] args) {
      //MyFrame 객체 생성
      new MyFrame("나의 프레임");
      System.out.println("main 메소드가 종료 됩니다.");
   }

   @Override
   public void actionPerformed(ActionEvent e) {  //actionPerformed 메소드
	  //메소드의 매개변수로 전달되는 ActionEvent 객체에 이벤트에 대한 정보가 들어있다
	  //이 객체를 활용하면 어떤 버튼이 눌러졌는데 구별 할 수 있다
      //System.out.println("어떤 버튼을 눌렀는지 어떻게 알까");
	   
	  //눌러진 버튼의 참조값 얻어오기
	   Object which =e.getSource();
	   if(which == sendBtn) {  //메소드안에서 생성자에서 선언된 지역변수를 참조할수 있을까 -> 필드 선언으로 가능하다.
		   //전송버튼을 누른 것이다
		   JOptionPane.showMessageDialog(this, "전송합니다.");
	   }else if(which == deleteBtn) {
		   JOptionPane.showConfirmDialog(this, "삭제");
	   }else if(which == updateBtn) {
		   JOptionPane.showConfirmDialog(this, "수정");
	   }
	   
   }
}






