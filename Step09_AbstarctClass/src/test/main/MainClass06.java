package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		//아래에 있는 useWeapon() 메소드를 호출하려면 Weapon type 의 참조값이 필요하다
		//new 클래스명 () {}
		Weapon w1 = new Weapon() { //new Weapon()가 public ? (){} 생성자를 호출하는 표현식 
			//이름이 없는 익명의 클래스, extends Weapon한 클래스이다 (익명의 내부 클래스) 
			@Override
			public void attack() {
				System.out.println("아무나 공격하자");	
			}
		};
		useWeapon(w1);
		
		// 메소드를 호출할때 바로 익명 클래스를 이용해서 Weapon type의 참조값을 얻어내서 사용하기
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				
			}
		});
	}
	
	
	
	//Weapon type 의 참조값을 전달 받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
	// 이름이 있는 클래스를 따로 만들지 않고 추상 클래스 weapon type 의 참조값을 얻어낼수 있을까
}
