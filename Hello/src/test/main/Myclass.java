package test.main;

public class Myclass {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void exec() {
				System.out.println("익명의 메소드");
			}
		};
		action.exec();
	}
}
