package test_main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		// MyUtil 클래스의 send() 메소드 호출해보기
		// static은 객체 유무 상관 없이 바로 사용 가능
		MyUtil.send();
		String v= MyUtil.version;
		
		System.out.println("dhdld");
		
		// class System{public static PrintStream out}
		
		// 1970년 1월 1일 자정으로 부터 현재까지 경과 시간을 mili second 단위로 알아내기
		long time =System.currentTimeMillis();
		System.out.println(time);
		
	}
}
