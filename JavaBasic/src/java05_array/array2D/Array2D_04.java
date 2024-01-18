package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {

	public static void main(String[] args) {
		
		//	학생 성적 관리 프로그램
		//	-> 국영수 3과목 점수
		
		//	점수 1개				-> int
		//	3과목 점수				-> int[3]
		// 4학생의 점수들 			-> int[4][3]
		// 2개의 학급				-> int[2][4][3]
		
		Scanner sc = new Scanner(System.in);
		
		final int STU_NUM = 2;		// 학생 수
		final int SUBJECT_NUM = 3;	// 과목 수
		
		// 과목 이름
		final String[] SUBJECT = {"국어", "영어", "수학"};
		
		
		int[][] score = new int[STU_NUM][SUBJECT_NUM];
		int[] sum = new int[STU_NUM];
		double[] avg = new double[STU_NUM];

		for(int i=0; i<score.length; i++) {	//	i번째 학생
			
			for (int j=0; j<SUBJECT_NUM; j++) {//	j번째 과목
				
				System.out.print((i+1) + "번 학생의 " + SUBJECT[j] + "점수는? ");
				score[i][j] = sc.nextInt();
				
				
			}
			
			System.out.println();
		
		}
		
		//	총점 계산
		for (int i=0; i<STU_NUM; i++) { // 	i번째 학생
			for (int j=0; j<score[i].length; j++) {
				sum[i] += score[i][j];
			}
		}
			
		
		//	평균 계산
		for (int i=0; i<STU_NUM; i++) {
			avg[i] = sum[i] / SUBJECT_NUM;
		}
		
		
		//	출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<STU_NUM; i++) {
			
////		번호   
			System.out.print((i+1) + "번" + "\t");			
////		국어   
//			System.out.print(score[i][0]);
////		영어   
//			System.out.print(score[i][1]);	
////		수학   
//			System.out.print(score[i][2]);	
			
			// 학생의 과목 점수 개수만큼 반복
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			
//		총점   
			System.out.print(sum[i] + "\t");
			
			
//		평균
//			System.out.println(avg[i]);
			
//			System.out.println(String.format("%.2f", avg[i]));
			
//			System.out.printf("%.2f\n", avg[i]);
			
			System.out.printf("%.2f", avg[i]);
			System.out.println();
			
			
			
		}

	}
}