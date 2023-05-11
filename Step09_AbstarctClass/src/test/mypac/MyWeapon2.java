package test.mypac;
// @override가 달리면 부모 클래스로 해당 함수를 검색하는데 이 때 부모클래스에 똑같은 함수 이름이 없으면 에러가 난다
public class MyWeapon2 extends Weapon{
	@Override
	public void attack() {
		System.out.println("공중 공격을 해요");
	}
}
