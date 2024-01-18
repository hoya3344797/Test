package java01_variables;

//유용한 단축키

//	선택영역 조절하기 : shift + 방향키
//	커서 고정하고 화면 이동 : ctrl + 방향키 위/아래	
//	선택한 줄 위/아래로 이동 : alt + 방향키 위/아래
//	선택한 줄 위/아래로 복사 : ctrl + alt + 방향키 위/아래
//	선택한 줄 삭제 : ctrl + d
//	전체 코드 선택 : ctrl + a	
//	글자 단위 선택 : 마우스 클릭 + 드래그
//	단어 단위 선택 : 더블클릭 + 드래그
//	줄 단위 선택 : 트리플클릭 + 드래그
//	커서 아래쪽에 줄 삽입 : shift+ enter
//	커서 위쪽에 줄 삽입 : ctrl + shift + enter
//	이클립스 단축키 목록 불러오기 : ctrl + shift + l

public class Variables_04 {

	public static void main(String[] args) {
		int data1;
		int data2 = 777;
		int data3;
		
//		같은 자료형의 변수를 여러 개 선언할 때, (콤마)로 나열한다
//		각각 변수에 선언과 동시에 초기화 가능
		int data4, data5 = 999, data6 = 888;

//		에러
//		서로 다른 자료형의 변수를 ,(콤마)로 한번에 선언할 수 없다.
//		int data7, data8, double data9;
		
//		-----------------------------------------------------------------
		
//		사람의 키
		double height;
		
		height = 216.8;
		
		System.out.println("height변수의 값은 " + height);
//		System.out.println("height변수의 값은 " + 216.8);		
//		System.out.println("height변수의 값은 216.8");
		
//		-----------------------------------------------------------------

	}

}
