package java05_array.ArrayQuiz;

public class ArrayQuiz_04 {

	public static void main(String[] args) {
		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		 int[] ranks = new int[10] ;
		 
		 for(int i = 0; i < arr.length; i++) {
			 ranks[i] = 1;
			 
			 for(int j = 0; j < arr.length; j++) {
				 if(arr[i] < arr[j]) {
					 ranks[i] = ranks[i] + 1;
				 }
			 }
		 }
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(ranks[i] + "\t");
		}
		 
	}

}
