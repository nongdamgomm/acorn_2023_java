package test.main;

public class MainClass04 {
	// 내부 클래스
	public static class Gura{
		public void say() {
			System.out.println("안녕 나는 구라야");
		}
	}
	
	//static 메소드 
	public static void main(String[] args) {
		Gura g = new Gura();
		g.say(); // 지역변수
		
		// 메소드 안에 클래스 정의할 수 있다
		// 메소드 안에 정의한 클래스를 '지역 내부 클래스'라고 한다. (Local inner class)
		class Cat{
			public void say() {
				System.out.println("야옹");
			}
		}
		
		Cat c = new Cat();
		c.say();
	}
}
