package test.mypac;

//가상의 옛날 가정용 전확 객체를 생성할 설계도 라고 가정
public class Phone {
	//생성자 (클래스명과 이름이 같음 / 리턴타입 없음 )
	public Phone() { // 어떤 클래스도 상속받지 않으면 자동으로 extends object 된다. ( object > Phone > HandPhone )
		System.out.println("Phone 생성자 호출됨");
	}
	//전화거는 메소드
	public void call() {
		System.out.println("전화를 걸어요");
	}
}
