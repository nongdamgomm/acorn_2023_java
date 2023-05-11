package test.mypac;
/*
 *  [ 메소드를 만들때 고려 해야 하는것 ]
 *  
 *  1. 접근 지정자 ( 모르면 public )
 *  2. static 또는 non static ( 모르면 static )
 *  3. 리턴 type ( 모르면 void )
 *  4. 메소드명
 *  5. 메소드에 전달하는 인자의 갯수와 데이터 타입
 */
public class Test {
	public void walk() {
		System.out.println("걸어요!");
	}
	
	public int getNumber() {
		// int num = 10;
		// return num;
		return 10;
	} // 이전에 햇던 public비교해보기 
	
	public String getGreeting() {
		// String greet="안녕하세요";
		// return greet;
		return "안녕하세요";
	}
	
	public Airplane getPlane() {
		// Airplane plane = new Airplane();
		// return plane;
		return new Airplane(); // Airplane 타입의 참조값
	}
	
	
	// 5.
	// int type 을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
	
	}
	
	// string type 을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		
	}
	
	// Airplane type 을 메소드의 인자로 전달 받는 메소드
	public void setPlane(Airplane plane) {
			
	}
	
	//int type, String type, Airplane type 세개를 전달 받는 메소드
	public void doSomething(int num, String name, Airplane plane) {
		
	}
	
	public void send() {
		System.out.println("무언가를 전송해요");
	}
	
	public void send(int num) {
		System.out.println(num+"을 전송해요");
	}
	
	public void send(String name) {
		System.out.println(name+"을 전송해요");
	}
	
	public void send(Airplane plane) {
		System.out.println(plane+"을 전송해요");
	}
		
	
}
