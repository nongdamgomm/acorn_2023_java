package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		// 아래의 useRemocon() 메소드를 호출하기 위해서는 Remocon 인터페이스 타입의 참조값이 필요하다
		// 익명의 Local inner class를 이용해서 Remocon type의 참조값을 만들어서 호출ㄹ해보자
		Remocon r1 =new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("볼륨을 올려");
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("볼룸내려");
			}
		};
		
		useRemocn(r1);
	
	}
	
	public static void useRemocn(Remocon r) {
		r.up();
		r.down();
	}
}
