package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
	
		String path = "C:/web1_오후_java/abc/bbb";
		File f = new File(path);
		
		//File클래스의 path경로가 물리적으로 모두 존재하는지 확인
		if(!f.exists()) {//f.exists() == false
			//현재 파일클래스의 경로에는 물리적으로 abc폴더가 없으므로 if문으로 들어온다
			
			//현재 존재하지 않는 abc폴더를 강제로 생성
			f.mkdirs();//폴더생성(파일생성X) make directory
			
		}else {
			System.out.println("폴더가 이미 존재함");
		}
		
		//파일, 폴더 등 path 경로에 있는 마지막 데이터를 삭제
		//단, 폴더를 지우고자 하는 경우 해당 폴더 안에 file이 포함되어 있다면
		//삭제되지 않는다.
		//특정 폴더 안에 file이 함께 들어가 있을 경우에는 
		//안에 있는 파일을 먼저 제거하고 폴더를 제거하는 형태로 진행
		//f.delete();
		
	}//main
}
