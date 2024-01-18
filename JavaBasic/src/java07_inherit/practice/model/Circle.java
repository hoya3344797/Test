package java07_inherit.practice.model;
import static java.lang.Math.PI;


public class Circle extends Point{
	
	//Field
	private int radius;
	
	
	//Constructor
	public Circle() {}
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		
	}

	//Method
	@Override
	public void draw() {
		
		//중심점
		System.out.print("중심점 : ");
		super.draw();
		
		//원면적
		System.out.printf("면적 : %.1f", (Math.PI * radius * radius));
		System.out.println();
		
		//원둘레
		System.out.printf("둘레 : %.1f", (2 * Math.PI * radius));
		System.out.println();
		
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
	

	

