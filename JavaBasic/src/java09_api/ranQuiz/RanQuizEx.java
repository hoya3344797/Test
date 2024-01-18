package java09_api.ranQuiz;

import java.util.Scanner;

public class RanQuizEx {

	public static void main(String[] args) {

		// 랜덤 퀴즈 메뉴 만들기
		// 1. Up&Down 게임
		// 2. Baskin 31 게임
		// 3. 종료
		// -------------------------------
		Scanner sc = new Scanner(System.in);
		RanQuiz ranQuiz = new RanQuiz();

		// 게임 실행 메소드
//		ranQuiz.UpDown();

//		ranQuiz.baskin();

		// -------------------------------

		System.out.println("1. Up&Down ");
		System.out.println("2. Baskin31 ");
		System.out.println("3. 종료 ");
		System.out.println("게임을 선택하시오. : ");
		int game = sc.nextInt();

		if (game == 1) {
			ranQuiz.UpDown();
		}

		if (game == 2) {
			ranQuiz.Baskin31();
		}

		if (game == 3) {
			System.exit(0);
		}

		if (game != 1 && game != 2) {

			System.out.println("다시 선택하시오.");
		}

	}

}
