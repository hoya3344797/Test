package java01_variables;
import java.util.Scanner;

public class VariablesQuiz {

	  // 변수에 알맞은 타입을 골라
	   // 선언하고
	   // 대입한 후
	   // 모든 변수의 데이터를 출력해보자.

	   // 이름, 나이, 성별, 키

	   //   출력 예시
	   //   이름 : Alice
	   //   나이 : 99
	   //   성별 : 남
	   //   키 : 222.66

	   //   ex)
	   //   System.out.println("이름 : " + name);
	
	public static void main(String[] args) {

		String name = "Alice";
		int age = 99;
		char gender = '남';
		double height = 222.66;
		
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("성별 : " + gender);
//		System.out.println("키 : " + height);
//		System.out.println("이름 : " + name +", 나이 : " + age + ", 성별 : " + gender + ", 키 : " + height + "입니다.");
		
//		String name;
//		int age;
//		char gender;
//		double height;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하시요 : ");
//		name = sc.next();
//		
//		System.out.println("나이를 입력하시요 : ");
//		age = sc.nextInt();
//		
//		System.out.println("성별을 입력하시요 : ");
//		char gender1 = sc.next().charAt(0);
//		
//		System.out.println("키를 입력하시요 : ");
//		height = sc.nextDouble();
//		
//		System.out.println("이름은 "+name+", 나이는 "+age+", 성별은 "+gender1+", 키는 "+height+"입니다.");
//		
		System.out.println("----------------------------");
		
//		print() 출력은 마지막에 줄바꿈을 하지 않는다.
		
		System.out.print("AAA");
		System.out.print("BBB");
		
//		출력에서 줄바꿈을 해주는 코드
//		() 괄호를 비우고 println을 사용한다.
		System.out.println();
//		System.out.print("\n");
		
		System.out.println("----------------------------");
		
		System.out.print("이름 : " + name);
		System.out.print(", 나이 : " + age);
		System.out.print(", 성별 : " + gender);
		System.out.println(", 키 : " + height);
		
		System.out.println("----------------------------");
		
		System.out.println("HI HELLO HOLA");
		
		System.out.println("----------------------------");
		
		System.out.println("HI\nHELLO\nHOLA");
		
//		 \n : 줄 바꿈 문자, 개행 문자
//		( ASCII 10 - LF, Line Feed )
		
		System.out.println("----------------------------");
		
		System.out.println("Apple");
		
		System.out.print("Apple\n");
		
		System.out.print("Apple");
		System.out.print("\n");
		
		System.out.print("Apple");
		System.out.println(); // 줄 바꿈 출력 수행
		
		
	}

}
