package test.mypac;

public class Rect {
	public int width;
	public int height;
	
	public void printArea() {
		// 면적 계산하기
		int area = this.width*this.height;
		System.out.println("사각형의 넓이: "+area );
	}
}
