package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;
import test.mypac.UseRemocon;

public class MainClass02 {
	public static void main(String[] args) {
		// 다형성 확인
		MyRemocon r1 = new MyRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
		
		// 직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon() 메소드를 여기서 호출해보세요
		UseRemocon r4 = new UseRemocon();
		
		useRemocon(r4);
		// 나만의 기능도 호출해보기
		r4.reserve(); //여기는 R4 가능
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		//r.reserve(); 사용 불가능하다 ↑타입 다름 (Remocon r)
		//만일 여기서 reserve() 메소드를 활용하고 싶으면 방법이 없을까?
		//UseRemocon r2 = (UseRemocon)r;
		// r2.reserve();
		
	}
}
