package test.main;
/*
 *  try { 
 *    예외(Exception)가 발생될 가능성이 있는 코드블럭
 *  }catch(예외 type 지역변수) {
 *  	해당 type의 예외가 발생하면 여기가 수행된다
 *  }
 */
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		//숫자 형식의 문자열을 입력 받는다 "10" "20" "10.1" 등등
		String inputNum = scan.nextLine();
		
		try {
			//입력한 숫자를(문자열) 실제 숫자로 바꾼다
			double num = Double.parseDouble(inputNum);
			//입력한 숫자에 100을 더한다
			double result = num+100;
			System.out.println("입력한 숫자 + 100 : " + result);
			System.out.println("무언가 중요한 마무리 작업을 하고 main 메소드가 종료됩니다");
			
		}catch(NumberFormatException nfe){
			/*
			 *  실행 스택에서 일어난 일을 콘솔창에 출력하기
			 *  (자세한 예외 정보를 예외객체가 콘솔창에 출력하게 하기)
			 */
			nfe.printStackTrace();
		}
	}
}
