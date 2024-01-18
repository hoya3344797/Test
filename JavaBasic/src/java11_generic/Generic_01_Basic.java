package java11_generic;

import java.util.ArrayList;
import java.util.Iterator; // Iterator를 사용하기 위해 import 추가

public class Generic_01_Basic {

	public static void main(String[] args) {

		// 타입 파라미터 E를 String으로 결정하여 객체 변수 선언
		ArrayList<String> list;

		// 타입 파라미터를 결정하지 않으면 "raw type"이라고 부른다.
		// -> object 타입으로 자동 결정된다.
		ArrayList list2;

		// ---------------------------------------------------------------

		list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");

		// 에러, 타입 파라미터를 String으로 결정했기 때문에 String만 사용 가능하다.
		// list.add(12345); // 컴파일 오류를 피하기 위해 주석 처리

		// --------------------------------------------------------------

		// 에러, 타입 파라미터에는 기본 데이터 타입을 사용할 수 없다.
		// ArrayList<int> list3; // 컴파일 오류를 피하기 위해 주석 처리

		// Wrapper 클래스를 적용한다.
		ArrayList<Integer> list3 = new ArrayList<>();

		list3.add(123);
		list3.add(345);

		// --------------------------------------------------------------

		// 타입 안정성, Type Safety
		// 객체 또는 메소드가 의도한 데이터 타입으로만 사용되는 상황
		// 의도치 않은 형변환, 대입 등을 사전에 차단시키는 것

		// 제네릭 타입(타입 파라미터)을 특정 데이터 타입으로
		// 결정해야만 "타입 안정성"이 제공된다.
		// -> 결정하지 않으면 "raw type" - 타입 안정성이 없음

		ArrayList<String> list4 = new ArrayList<>(); // 타입 파라미터 명시

		list4.add("Hi");
		list4.add("Hello");
		list4.add("HOLA");

		// 에러, Object 타입으로 반환한다.
		// String str = list4.get(1); // 컴파일 오류를 피하기 위해 주석 처리

		// 형변환이 필요하다
		String str = list4.get(2); // 명시적 캐스팅 없이 수정

		// --------------------------------------------------------------

		ArrayList<Integer> list5 = new ArrayList<>();

		list5.add(100);
		list5.add(200);
		list5.add(300);

		int data = list5.get(1);

		System.out.println("-----");

		Iterator<Integer> iter = list5.iterator();

		while (iter.hasNext()) {
			int val = iter.next();
			System.out.println(val);
		}
	}
}
