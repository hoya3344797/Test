package java04_control.loop;

public class Star_13 {

	public static void main(String[] args) {
		
		final int LINE = 9;
		final int HALF_LINE = LINE/2;
		
		for(int i=0; i<LINE; i++) {
			
			if(i < HALF_LINE) {
				
				for(int j=0; j<(HALF_LINE)-i+1; j++) {
					System.out.print("*");
				}
				
			}else{	
					for(int j=0; j<i+1 - (HALF_LINE); j++) {
						System.out.print("*"); 
					}
			}
			System.out.println();
		}
	}

}
