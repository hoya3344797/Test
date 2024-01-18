package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx2 {

	public static void main(String[] args) throws IOException {

		// 입력대상 파일
		File src = new File("./src/java13_io/fileStream/", "Source.txt");
		System.out.println("src : " + src.exists());

		// 출력대상 파일
		File dest = new File("./src/java13_io/fileStream/", "Destination.txt");
		System.out.println("dest : " + dest.exists());

		// 파일 입출력 보조 변수
		byte[] buf = new byte[1024]; // 데이터 임시 저장
		int len = -1; // 입출력 크시
		int total = 0; // 총 입출력 크기

		try (FileInputStream fis = new FileInputStream(src); FileOutputStream fos = new FileOutputStream(dest)) {

			// 파일 입력
			while ((len = fis.read(buf)) != -1) {

				// 파일 출력
				fos.write(buf, 0, len);
				fos.flush();

				// 복사된 바이트 수 총 합
				total += len;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println(" >> " + total + " 바이트 복사 완료");

	}
}
