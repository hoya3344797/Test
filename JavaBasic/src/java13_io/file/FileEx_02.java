package java13_io.file;

import java.io.File;

public class FileEx_02 {

	public static void main(String[] args) {

		// 절대 경로 지정 - Absolute Path
//		File file1 = new File("D:/D/Desktop/JavaBasic/src/java13_io/file/", "Hello");
		File file1 = new File("D:/D/Desktop/JavaBasic/src/java13_io/file/", "Hello");

		System.out.println(file1.exists());
		System.out.println(file1.length());

		System.out.println("--------------------------");

		// 상대 경로 지정
		File file2 = new File("src/java13_io/file", "Hello");

		System.out.println(file2);
		System.out.println(file2.exists());
		System.out.println(file2.length());

		System.out.println(file2.getAbsolutePath());

		System.out.println("--------------------------");

		// 상대 경로 기준점 == 클래스 패스 == 프로젝트 폴더

		// D:\D\Desktop\JavaBasic\

//		File file3 = new File("./src/java13_io/file/../../java10_collection/","user.Properties");
//		
//		System.out.println("user properties : " + file3.exists());

//		File file3 = new File("/현재패키지폴더경로", "Hello");
//		File file3 = new File("/D/Desktop/JavaBasic/src/java13_io/file/", "Hello");
//		System.out.println("Hello : " + file3.exists());

//		File file3 = new File("../작성해보기", "Hello");
		File file3 = new File("../JavaBasic/src/java13_io/file/", "Hello");
		System.out.println("Hello : " + file3.exists());

	}
}