package java06_class.uml.manage2;

import java.util.Scanner;

public class StudentService {
	
	private Student[] stu = new Student[3];
	private Scanner input; 
	
	public StudentService() {
		
		for (int i=0; i<stu.length; i++) 
			stu[i] = new Student();
		
		input = new Scanner(System.in);
		
	}
	
	public void insertStudent(Student stu) {
		this.insertInfoOne(stu);
		this.insertScore(stu);
	}
	
	public void insertInfo() {
		for(int i=0; i<stu.length; i++) {
			this.insertInfoOne(stu[i]);
		}
		
	}
	
	//이름과 나이 입력
	public void insertInfoOne(Student stu) {
		
		System.out.println("Input Name : ");
		stu.setName(input.nextLine());

		System.out.println("Input Age : ");
		stu.setAge(input.nextInt());
		
		// 버퍼비우기 - '\n' 제거
		input.nextLine();
	}
	
	
	public void insertScore() {
		for(int i=0; i<stu.length; i++) {
			this.insertInfoOne(stu[i]);
		}
	}

	//국영수 점수 입력
	public void insertScore(Student stu) {
		
		System.out.print("Input Korean : ");
		stu.setKor(input.nextInt());
		
		System.out.print("Input English : ");
		stu.setEng(input.nextInt());
		
		System.out.print("Input Math : ");
		stu.setMath(input.nextInt());
		
		//총점 계산
		this.calcSum(stu);
		
		//평균 계산
		this.calcAvg(stu);
	}

	
	//총점 계산
	public void calcSum(Student stu) {
//		System.out.println("calcSum()");
	
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath());
		
	}
	//평균 계산
	public void calcAvg(Student stu) {
//		System.out.println("calcAvg()");
		
		stu.setAvg(stu.getSum() / (double)3);
		
	}
	
	public void printStu() {
		for(int i=0; i<stu.length; i++) {
			this.printStu(stu[i]);
		}
	}
	
		
	//학생 정보 출력
	public void printStu(Student stu) {
//		System.out.println("printStu()");
		
		System.out.println();
		System.out.println("- - - 학생 정보 - - -");
		
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		
		System.out.print(stu.getName() + "\t");
		System.out.print(stu.getAge() + "\t");
		System.out.print(stu.getKor() + "\t");
		System.out.print(stu.getEng() + "\t");
		System.out.print(stu.getMath() + "\t");	
		System.out.print(stu.getSum() + "\t");
		System.out.printf("%.2f", stu.getAvg());
		System.out.println();
		
	}
	
	
}















