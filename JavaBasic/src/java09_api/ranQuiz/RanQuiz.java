package java09_api.ranQuiz;

import java.util.Random;
import java.util.Scanner;

public class RanQuiz {

	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	boolean isSuccess = false;

	public void UpDown() {

		int ComNum = ran.nextInt(50) + 1;

		System.out.println("[컴퓨터] : " + ComNum);

		for (int i = 1; i <= 7; i++) {
			System.out.println("1~50까지 숫자를 입력하세요.");
			int UserNum = sc.nextInt();

			if (UserNum > ComNum) {
				System.out.println("Down");
			} else if (UserNum < ComNum) {
				System.out.println("UP");
			} else {
				System.out.println("[SYSTEM]" + i + "번안에 맞추셨습니다.");
				isSuccess = true;

				break;
			}

			if (isSuccess == false) {
				System.out.println("[SYSTEM]실패");
			}
		}
	}

	public void Baskin31() {

		int GameNum = 0;
		int UserNum = 0;

		{

		}
	}

}
