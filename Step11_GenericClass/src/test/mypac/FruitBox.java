package test.mypac;

/*
 *	클래스 안에서 사용하는 특정 타입을 고정하지 않고
 *	클래스를 사용하는 시점에 타입을 정할 수 있게 한다
 *
 *  - 아래 선언한 T는 마음대로 스펠링이나 단어를 정할 수 있다
 *  보통 type 이라는 의미에서 T라고 많이 정한다
 *  - T를 포괄클래스 (Generic Class) 라고 한다
 */

//가상의 과일 박스
public class FruitBox<T> {
	//필드
	private T Item;
	
	//과일을 포장하는 메소드
	public void pack(T item) {
		this.Item = item;
	}
	
	//과일을 리턴하는 메소드
	public T unPack() {
		return Item;
	}
}


/*
 *	Apple 타입이 고정이 아니고 동적으로 지정되도록 하기 (다른 과일도 사용가능하게) 
 *	Apple 을 전부 T 로 변경 ( 타입을 전달받아서 클래스를 사용할수있도록)
 *	포괄 클래스 ( 그때 그때 필요한 클래스 타입을 전달받아서 사용함)
 *  
 */
