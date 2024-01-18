package java04_control.loop;

public class For_10_2 {

	public static void main(String[] args) {
		
		// Quiz. 2~9단 구구단 출력
		
		for(int num=1; num<10; num++) {
			 
			for(int dan=2; dan<=9; dan++) {
				
			int	result = num*dan;
				System.out.print(dan + "x" + num + "=" + result + ",\t");
			}
			
			System.out.println();

		}

	}

}
