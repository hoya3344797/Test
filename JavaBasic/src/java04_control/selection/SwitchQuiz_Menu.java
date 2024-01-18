package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu {
//	- 메뉴 만들기
//
//	===============================
//		M  e  n  u
//	===============================
//		1. Hello World 출력
//		2. 이름 출력
//		3. 성별 출력
//		4. 종료
//	===============================
//
//	  >> _
//
//	 -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//	 -> 동작은 간단한 출력으로 해결

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//-----------------------------------------------------------
		
		//메뉴 번호 상수
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		//-----------------------------------------------------------

		System.out.println("===============================");
		System.out.println("\tM  e  n  u");
		System.out.println("===============================");
		System.out.println("\t1. Hello World 출력");
		System.out.println("\t2. 이름 출력");
		System.out.println("\t3. 성별 출력");
		System.out.println("\t4. 종료");
		System.out.println("===============================");
		
		System.out.println();
		System.out.print("\t>> ");
		int menu = sc.nextInt();
		
		System.out.print("\t>> ");
		
		switch( menu ) {
		case HELLO_MENU:
			System.out.println("Hello World");
			break;

		case NAME_MENU:
			System.out.println("Clare");
			break;
			
		case GENDER_MENU:
			System.out.println("Female");
			break;
			
		case EXIT_MENU:
			System.out.println("Good Bye~!!");
			break;
			
		default:
			System.out.println("메뉴를 잘못 선택하셨습니다");
		}
		
	}
}














