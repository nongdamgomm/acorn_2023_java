package test.mypac;

// Weapon을 상속받은 MyWeapon class
public class MyWeapon extends Weapon{
	
	// 추상 클래스를 상속받은 자식 클래스는 부모의 추상 메소드를 모두 오버라이드 (재정의) 해야한다.
	@Override
	public void attack () {
		System.out.println("지상 공격을 해요!");
	}
}

// MyWeapon 은 Object, Weapom, MyWeapon type 모두 가능하다.. ( 다형성 Polymorphism ) 
// 부모 클래스의 미완성된 메소드를 완성시키기 위한 매개체 
