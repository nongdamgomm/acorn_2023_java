package test.mypac;
/*
 *  인터페이스를 inplements 하면 인터페이스에 정의 되어 있는 모든 추상메소드를 오버라이드 해야된다 (강제)
 */
public class MyRemocon implements Remocon{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("채널을 올려요");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("채널을 내려요");
	}
	
}
