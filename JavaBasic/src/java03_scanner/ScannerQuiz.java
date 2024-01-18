package java03_scanner;
import java.util.Scanner;
//3과목 점수 관리 프로그램


//   국어, 영어, 수학
//   점수를 저장할 수 있는 변수를 만들고
//   3과목 점수를 입력받는다

//   총점과 평균을 포함한 결과를 출력한다

//동작 예시)

//===== 입력 =====
//Input Korean : 100
//Input English : 99
//Input Mathematics : 97

//===== 출력 =====
//국어   영어   수학   총점   평균
//100   99   97   296   98.666666667
public class ScannerQuiz {

	public static void main(String[] args) {
		
	
		//	키보드 입력 
		Scanner sc = new Scanner(System.in);
		
		//	국어 점수 입력
		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		
		//	영어 점수 입력
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		//	수학 점수 입력
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		//	총점 계산
		int score = korean + eng + math;
		
		//	평균 계산
		double avg = score/3.d;
		
		//	출력
		System.out.println("------ 출력 ------");
		System.out.println("국어 : " + korean + ", 영어 : " + eng + ", 수학 : " + math + ", 총점 : " + score + ", 평균 : " + avg);
		
		
	}

}
