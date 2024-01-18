package java05_array;

public class Array_03 {

	public static void main(String[] args) {
		
		int[] arr = {1, 12, 123, 1234, 12345, 123456, 1234567, 12345678, 123456789};
		
		//	배열의 길이
		//	요소의 개수
		//	배열의 크기
		
		//	-> 배열이름.length
		
//		ex)	arr.length
		
		//---------------------------------------------------------------
		
		System.out.println("배열의 길이 : " + arr.length);
		
		System.out.println("---------------------");
		
		//	비열의 모든 요소 출력하기 - for
		
//		0 ~ arr.length-1
		
		for (int i=0; i<arr.length; i++) {
		    System.out.println(arr[i]);
		}
		
		//---------------------------------------------------------------
		
		//	for 타이핑, ctrl + space
		//	-> for문 자동완성에 배열의 길이만큼으로 추천된다.
		for (int i = 0; i < arr.length; i++) {
			
		}
		
	}

}
