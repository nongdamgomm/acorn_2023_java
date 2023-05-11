package test.main;
/*
 *  java에서 배열도 객체이다
 *  즉 배열은 참조 데이터 타입이다
 *  
 *  NULL : 참조 데이터 값이 담길 수 있는 빈공간
 */
public class Mainclass01 {
	 public static void main(String[] args) {
		 // int type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역 변수에 담기
		 // int 값 5개를 순서대로 담고 있는 int 배열 객체 만들어짐
		 int[] nums = {10, 20, 30, 40, 50};
		 
		 // double type 5개를 가지고 있는 배열
		 double[] nums2 = {10.1, 10.2, 10.3, 10.4, 10.5};
		 
		 // boolean type 5개를 가지고 있는 배열
		 boolean[] nums3 = {true, false, false, true, true};
		 
		 //String type 5개를 가지고 있는 배열
		 String[] nums4 = {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		 
		 // 배열 객체의 복제본 얻어내기
		 int[] result = nums.clone();
		 
		 // 배열의 크기 얻어내기
		 int size = nums.length;
		 
		 // 배열의 순서가 있는 데이터이다. 특정 index 의 item 참조하는 방법
		 int first = nums[0];
		 int second = nums[1];
		 int third = nums[2];
	}
	 
}
