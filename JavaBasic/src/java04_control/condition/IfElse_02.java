package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number : ");
		int num = sc.nextInt();
		
		// Quiz. 입력한 숫자가  짝수/홀수인지 판별하는 코드
		
		if(num % 2 == 0) { // 짝수 (2의 배수)
			System.out.println("짝수입니다. ");
		}else { // 홀수 (2의 배수가 아님)
			System.out.println("홀수입니다. ");
		
		}
		
	}
}
