package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu_v3 {
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

		//메뉴 선택 변수
		int menu;
		
		do {
			
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
			menu = sc.nextInt();
			
			
			
			//RunMenu객체 활성화
			//	-> RunMenu클래스의 기능을 사용할 수 있도록 연결됨
			RunMenu rm = new RunMenu();
			
			//메소드 호출 테스트
//		rm.banana();
			
			
			System.out.print("\t>> ");
			switch( menu ) {
			case HELLO_MENU:
				rm.printHello();
				break;
				
			case NAME_MENU:
				rm.printName();
				break;
				
			case GENDER_MENU:
				rm.printGender();
				break;
				
			case EXIT_MENU:
				rm.printExit();
				break;
				
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다");
			}
			
		} while( menu != EXIT_MENU );
		
	}
}














