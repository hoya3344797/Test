package java04_control.loop;

public class For_10 {

	public static void main(String[] args) {
		
		// Quiz. 2~9단 구구단 출력
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<=9; j++) {
				
			int	result = i*j;
				
				System.out.println(i + " x " + j + " = "+ result);
					
				
			}
			System.out.println("-----------");

		}

	}

}
