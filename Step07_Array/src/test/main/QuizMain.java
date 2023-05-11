package test.main;

import java.util.Random;

public class QuizMain {
	/*
	 * 	1. run 했을때 
	 *     cherry, apple, banana, melon ,7
	 *     5개의 문자열 중에서 한개가 랜덤하게 출력되게해주세요
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		
		String[] items = {"cherry","apple","banana","melon","7"};
		
		int ranNum = ran.nextInt(5);
		
		System.out.println(items[ranNum]);
	}
}
