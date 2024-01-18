package java04_control.condition;

import java.util.Scanner;

//+ 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//>> Input Number : -3
//>> 음수입니다
//
//+ 입력한 데이터가 3의 배수인지 판별하시오
//(% 연산자 사용)
//>> Input Number : 7
//>> 3의 배수가 아닙니다
//
//+ 두 수를 입력 받아 큰 수를 출력하시오
//>> Input Number1 : 44
//>> Input Number2 : 88
//>> 88 이 더 큰 수

public class IfQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나를 입력받아 양수인지 음수인지 판별하시오");
		System.out.println("Input Number : ");
		int number = sc.nextInt();
		
		
		if(number < 0) {
			System.out.println("음수입니다.");
			
		}
		
		if(number > 0) {
			System.out.println("양수입니다.");	
		}
		
		if(number == 0) {
			System.out.println("정수입니다.");
		}
		
		//--------------------------------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력한 데이터가 3의 배수인지 판별하시오");
//		System.out.println("Input Number : ");
//		int number = sc.nextInt();
//		
//		if(number%3 == 0 ) {
//			System.out.println("3의 배수입니다.");
//			
//		}
//		
//		if(number%3 != 0) {
//			System.out.println("3의 배수가 아닙니다.");
//		}
		
		//-----------------------------------------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 수를 입력 받아 큰 수를 출력하시오");
//		System.out.println("Input Number : ");
//		int number = sc.nextInt();
//		int number2 = sc.nextInt();
//		
//		if(number > number2) {	//	number가 큰 경우
//			System.out.println(number + "이 더 큰 수");
//		}
//		
//		if(number < number2) {	//	number2가 큰 경우
//			System.out.println(number2 + "이 더 큰 수");
//		}
//		
//		if(number == number2) {	//	두 수가 같은 경우
//			System.out.println(number + "두 숫자가 같음");
//		}
		
		
	}

}
