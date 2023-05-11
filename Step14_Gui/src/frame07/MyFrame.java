package frame07;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
   
   //생성자
   public MyFrame(String title) {
      super(title);
      
      // setBounds(x, y, width, height)  창의 위치와 크기 설정
      this.setBounds(100, 100, 500, 500);
      // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new FlowLayout());
      
      
      JButton sendBtn=new JButton("전송");
      add(sendBtn);
      
      JButton deleteBtn=new JButton("삭제");
      add(deleteBtn);
      
      JButton updateBtn=new JButton("수정");
      add(updateBtn);
      
      //전송, 삭제, 수정 버튼 모두 다 하나의 리스너 등록하기
      sendBtn.addActionListener(this);
      deleteBtn.addActionListener(this);
      updateBtn.addActionListener(this);
      
      //각각의 버튼에 action 명령을 설정할수 있다
      sendBtn.setActionCommand("Send");
      deleteBtn.setActionCommand("Delete");
      updateBtn.setActionCommand("Update");
      
      // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
      setVisible(true);
   }
   
   public static void main(String[] args) {
      //MyFrame 객체 생성
      new MyFrame("나의 프레임");
      System.out.println("main 메소드가 종료 됩니다.");
   }

   @Override
   public void actionPerformed(ActionEvent e) {
	   //눌러진 버튼의 action command 읽어오기
	   String cmd=e.getActionCommand();
	   /*
	    * java 에서 문자열의 값이 참조값과 같은지 비교할때는 비교연산자 == 을 이용해서 비교하면 되지만 
	    * 문자열의 참조값이 아닌 애용이 같은지 비교할 때는 String의 .equals() 메소드를 이용해서 비교한다
	    * 
	    * 왜냐면 java에서는 문자열을 만드는 방법에 따라서 내용은 같지만 참조값이 다르게 나오는 경우도 
	    * 있기 때문이다, 따라서 문자열의 내용이 같은지 정확히 비교할떄는 반드시 equals() 메소드를
	    * 이용해야 한다 (이걸 까먹으면 밤 셀수도 잇음..)
	    */
	   if(cmd.equals("Send")) { // ==대신 사용
		   JOptionPane.showConfirmDialog(this, "전송");
	   }else if(cmd.equals("Delete")) {
		   JOptionPane.showConfirmDialog(this, "삭제");
	   }else if(cmd.equals("Update")) {
		   JOptionPane.showConfirmDialog(this, "수정");
	   }
   }
}






