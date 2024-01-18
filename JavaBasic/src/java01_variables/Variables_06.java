package java01_variables;

public class Variables_06 {

	public static void main(String[] args) {
//		System.out.println( 11 + 22 );
		
//		리터럴 상수
		
		System.out.println( 3465L );
		
		System.out.println( 344.534f );
		
//		--------------------------------------------------
//		변수
		int num;
		num = 123;
		num = 456;
		num = 789;
		
//		--------------------------------------------------
		
//		이름있는 상수
//		변수의 상수화
		
		final int MAX;
		
		MAX = 100;
		
//		에러, 상수화된 변수는 값 대입을 한번만 할 수 있다.
//		max = 200;
		
		
//		--------------------------------------------------
		
		final int WORKING_DAY = 25;
		
		System.out.println("이번 달은 " + WORKING_DAY + "일 근무 하셨습니다.");
		
		System.out.println("이번 달 급여 : " + WORKING_DAY  * 150000);
		
		
	}

}











