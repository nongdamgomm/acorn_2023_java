package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) { //Drill 은 인터페이스라서 미완성을 완성시켜서 참조값 전달시킴 
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				// TODO Auto-generated method stub
				System.out.println("바닥에 구멍을 뚫어요");
				
			}
		});// drill type의 참조값 
		
		useDrill(()->{
			System.out.println("천장에 구멍을 뚫어요");
		}); // 간략한 표현식 (줄인 표현) 추상 메소드가 오직 1개인 인터페이스에 한해서
	}
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}
