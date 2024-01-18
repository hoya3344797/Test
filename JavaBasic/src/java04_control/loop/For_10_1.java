package java04_control.loop;

public class For_10_1 {

	public static void main(String[] args) {
		
		// Quiz. 2~9단 구구단 출력
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<=9; j++) {
				
			int	result = i*j;
				System.out.print(i + "x" + j + "=" + result + ",\t");
			}
			
			System.out.println();

		}

	}

}
