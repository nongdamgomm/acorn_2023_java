package test.auto;

public class Bus extends Car {
	// 부모 생성자에서 필요한 값을 자식 생성자레서 받아서 전달해주는 코드가 있어야 문법이 성립된다
	public Bus(Engine engine) { //engine type 전달 받는 생성자
		// super() 호출 이전에 다른 코드를 한 줄이라도 실행하면 안된다
		// super() 는 부모 생성자를 가리키는 표현식
		super(engine); //
		// TODO Auto-generated constructor stub
	}
		public void powerDrive(){
			if(this.engine==null) {
				System.out.println("Engine 객체가 없어서 달릴수 없어요");
				return; // 메소드 끝내기
			}
			System.out.println("엔진이 없어서 못달려요");
			System.out.println("힘차게 달려요");
		}
	}

