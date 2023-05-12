package test.main;
/*
 * “안녕하세요” 라는 sample 문자열을 text 파일을 만들어서 저장하고자 한다

어떤 기능이 필요할까

1. 파일 시스템에 원하는 파일명으로 파일을 만드는 기능. = file 객체
2. 한글 한 줄을 파일에 출력하는 기능
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		//파일에 저장할 sample 문자열
		String msg = "안녕하세요";
		
		File f = new File("c:/acorn202304/myFolder/diary.txt");
		
			try {
				//만약 파일이 존재하지 않는 다면
				if(!f.exists()) {
					//파일을 만든다
					f.createNewFile();
					System.out.println("diary.txt 파일을 만들었습니다");
				}
				//파일에 문자열을 출력할 수 있는 객체의 참조값 얻어내기
				//new FileWriter(File 객체, append 모드여부)
				FileWriter fw = new FileWriter(f , true);
				fw.write(msg);// 출력할 준비
				fw.flush();//출력
				fw.close();//마무리..
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

