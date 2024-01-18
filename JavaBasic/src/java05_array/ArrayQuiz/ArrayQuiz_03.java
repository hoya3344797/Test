package java05_array.ArrayQuiz;

public class ArrayQuiz_03 {

	public static void main(String[] args) {
		
		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		 
		 int result = 0;
		 
		 for (int i = 0; i < arr.length; i++) {
			
			 if(i % 2 == 0) {	//	짝수 인덱스
				result += arr[i]; 
			 }else {	//	홀수 인덱스
				result -= arr[i]; 
				 
			 }
		}
		 System.out.println("결과 : " + result);
		 
//		 int odd = 0, even = 0;
//		 
//		 for(int i = 0; i < arr.length; i++) {
//			 if(i % 2 == 0) {
//				 even += arr[i];
//			 }
//			 else {
//				 odd += arr[i];
//			 }
//		 }
//		 
//		 System.out.println(even - odd);
		
	}
		 
	}


