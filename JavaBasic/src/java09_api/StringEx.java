package java09_api;

public class StringEx {

	public static void main(String[] args) {

		String str1 = "Apple"; // 리터럴 상수
		String str2 = new String("Banana"); // 객체로 생성 (동적 할당)

		// ------------------------------------------------------

		System.out.println("----- length() -----");

		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());

		System.out.println("\"Cherry\"의 길이 : " + "Cherry".length());

		System.out.println("\n--- toLowerCase() ------");
		// str1 문자열의 모든 알파벳을 소문자로 변경한 결과를 반환
		String lower = str1.toLowerCase();
		System.out.println("lower : " + lower);

		System.out.println("\n--- toUpperCase() ------");
		// str2 문자열의 모든 알파벳을 대문자로 변경한 결과를 반환
		String upper = str1.toUpperCase();
		System.out.println("upper : " + upper);

		System.out.println("\n--- charAt(int) ------");
		// sr1의 3번째 인덱스 값을 추출
		System.out.println("str1의 3번째 인덱스 값 : " + str1.charAt(3));

		System.out.println("\n--- replace(char, char) ------");
		// str2 문자열의 'n'을 'x'로 변환한다
		String replace = str2.replace('n', 'x');
		System.out.println("replace : " + replace);

		System.out.println("\n--- contains() ------");
		// 특정 문자열을 포함하고 있는지 확인

		boolean b = str1.contains("pp");
		System.out.println(b);

		System.out.println("\n--- substring() -------");
		// 문자열 일부를 발췌한다

		String sub1 = str1.substring(2);
		System.out.println("sub1 : " + sub1);

		String sub2 = str1.substring(1, 3);
		System.out.println("sub1 : " + sub2);

	}

}
