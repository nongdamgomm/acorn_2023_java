package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0으로 초기화 된 방 3개짜리 int[] 객체 만들어서 참조값을 지역 변수 nums에 담기
		int[] nums = {0, 0, 0};
		
		// 대입 연산자
		// 대입할 곳을 지칭 ( 지역 변수 or 어떤 객체의 필드(.) or 배열의 특정 index 해당하는방 ) = 넣을 값;
		// 0번방에 10, 1번방에 20, 2번방에 30을 저장해 보세요
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		
		
		
		
		// 0으로 초기화된 방 500개짜리 int[] 객체 만들어서 참조값을 지역변수 nums2에 담기
		// new + 배열에 저장할 데이터 타입+ [ 방의 개수 ]
		int[] nums2= new int[500];
		
		/*
		 *  0번방에 1
		 *  1번방에 2
		 *  2번방에 3
		 *  . 
		 *  .
		 *  .
		 *  499번방에 500을 저장해 보세요.
		 */
		// 배열의 사이즈 만큼 반복문 돌면서
		for (int i=0; i<nums2.length; i++) {
			//배열의 i번쨰 방에 i에 1을 더한값을 대입한다. 
			nums2[i] = i+1;
		}
		
		
}
	}
