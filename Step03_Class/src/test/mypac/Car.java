package test.mypac;

/*
 * class 의 역할
 * 
 * 1. 객체의 설계도 역할
 *    - 객체는 heap 영역 (사물함) 에 들어 있는 물건이라고 생각하면 된다. 
 * 	  - class 를 이용하여 객체를 원하는 시점에 원하는 갯수만큼 만들어 낼 수 있다.
 *    - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class로 설계할 수 있다.
 * 
 * 2. data type 역할
 *    -  
 * 
 * 3. static 필드(저장소)와 메소드(기능)를 포함하는 역할
 *    - 필드는 자바에서 실행할 데이터를 저장하는 공간
 *    
 */
public class Car {
	/*
	 * [ 필드 정의하기 ]
	 * 
	 * - 클래스의 { } 중괄호 안에 아래와 같은 형식으로 필드를 정의 할 수 있다. 
	 * - 초기값을 부여하지 않으면 기본값이 들어간다 
	 * - int의 기본값 0, boolean의 기본 값은 false, 
	 *  참조 데이터 type의 기본값은 null
	 *  접근 지정자 + data type + 필드명 + 초기값 ;
	 */
	public String name;
	public int price;

	/*
	 * [메소드 정의하기]
	 * 
	 * - 접근 지정자 + return type + 메소드명(){} {}<=여기는 메소드 안쪽 블럭 
	 * - 메소드명()이 call 되었을 때 실행할 java code를 여러줄 모아 놓을 수 있다. 
	 * - 실행하기 위해서 .drive(); 
	 * - 객체안에서 자기 자신을 참조하기 위한 예약어
	 * this
	 */
	public void drive() {
		System.out.println(this.name + "가 달려요!");
	}

	Car a = this;

	public void showInfo() {
		System.out.println("저의 이름은" + this.name + "이고 가격은" + this.price + "만원 입니다");
	}
}