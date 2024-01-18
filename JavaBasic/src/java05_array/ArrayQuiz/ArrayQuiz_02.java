package java05_array.ArrayQuiz;

import java.util.Arrays;

public class ArrayQuiz_02 {

	public static void main(String[] args) {
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};	
		
		int[] invert_arr = new int[arr.length];
		
//		for (int i = 0; i < arr.length; i++) {
//			
//			// arr.length-1 : 마지막 인덱스 번호
//			invert_arr[ arr.length-1 -i ] = arr[i];
//		}
//		
//		for (int i = 0; i < invert_arr.length; i++) {
//			System.out.println(Arrays.toString(invert_arr));
//			
//		}
		
//		invert_arr[9] = arr[0];
//		invert_arr[8] = arr[1];
//		invert_arr[7] = arr[2];
//		invert_arr[6] = arr[3];
//		invert_arr[5] = arr[4];
//		invert_arr[4] = arr[5];
//		invert_arr[3] = arr[6];
//		invert_arr[2] = arr[7];
//		invert_arr[1] = arr[8];
//		invert_arr[0] = arr[9];
		
		for(int i= arr.length - 1, j = 0; i >= 0; i--, j++) {            
			invert_arr[j] = arr[i];    
			}
		
		System.out.println(Arrays.toString(invert_arr));
		
		
		
		
		
	}

}
