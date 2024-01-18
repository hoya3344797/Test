package java06_class.getset;

public class GetSetEx {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		//	에러, 외부 객체의 접근이 막혀있다
//		data.num = 1234;
//		System.out.println(data.num);
		
		//----------------------------------------------
		
//		//	Setter 호출을 통해 멤버필드에 값 저장
//		data.setNum(22);
//		
//		//	Getter 호출을 통해 멤버필드의 값 불러오기
//		System.out.println(data.getNum());
//		
//		//	name Setter
//		data.setName("홍길동");
//		
//		//	name Getter
//		System.out.println(data.getName());
//		
//		//	phone Setter
//		data.setPhone("010-1234-5678");
//		
//		//	phone Getter
//		System.out.println(data.getPhone());
		
		//----------------------------------------------
		
		data.getName();
		data.getPhone();
		
		data.setName("ALice");
		data.setPhone("01011112222");
		
	}

}
