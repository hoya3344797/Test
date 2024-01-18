package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		//Circle 배열 초기화 : 3개
		Circle[] circles = new Circle[3]; // 배열 생성
		circles[0] = new Circle(); // Circle 객체(인스턴스) 생성
		circles[0].draw();
		System.out.println("--------------------");
		
		circles[1] = new Circle(1, 2, 3); // Circle 객체(인스턴스) 생성
		circles[1].draw();
		System.out.println("--------------------");
		
		circles[2] = new Circle(5, 3, 2); // Circle 객체(인스턴스) 생성
		circles[2].draw();
		System.out.println("--------------------");
		
		//Rectangle 배열 초기화 : 3개
		Rectangle[] rectangles = new Rectangle[3]; // 배열 생성
		rectangles[0] = new Rectangle();
		rectangles[1] = new Rectangle(0, 0, 0, 0);
		rectangles[2] = new Rectangle(1, 2, 3, 4);
		
		for (int i=0; i<rectangles.length; i++) {
			rectangles[i].draw();
			System.out.println("--------------------");
		}
		
		System.out.println("=====================================");
		
		Point[] points = new Point[5];
		points[0] = new Point();
		points[1] = new Circle();
		points[2] = new Rectangle();
		points[3] = new Circle(3, 2, 1);
		points[4] = new Rectangle(5, 3, 2, 3);
		
		for (int i=0; i<points.length; i++) {
			points[i].draw();
			System.out.println("----------------------------------");
		}
		
		}
		
	}











