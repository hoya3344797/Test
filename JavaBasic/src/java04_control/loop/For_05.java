package java04_control.loop;

public class For_05 {

	public static void main(String[] args) {

		// 1부터 10까지의 총합 구하기
		// -> 55
		//------------------------------------------
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			
			sum += i ;
		
			System.out.println(sum);
		}
	}

}
