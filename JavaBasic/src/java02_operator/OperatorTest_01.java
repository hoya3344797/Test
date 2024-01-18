package java02_operator;

public class OperatorTest_01 {

	public static void main(String[] args) {
		
//		   int a = 5, b = 6, c = 10, d;
//		      
//		      d = ++a * b--;
//		      
//		      System.out.println("a=" + a + ", b=" + b + ", d=" + d);
//		      
//		      d = a++ + ++c - b--;
//		      
//		      System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
//		      
		      int a = 5, b = 6, c = 10;

		      boolean res1;
		      res1 =  a < b || --a > c++;
		      System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		      System.out.println(res1);
		      
		      boolean res2;
		      res2 = c < b++ && c-- > ++a;
		      System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		      System.out.println(res2);
		      
		      //	논리 연산의 단축수행
		      //	AND연산은 왼쪽 피연산자가 false라면 오른쪽항 연산을 수행하지 않는다.
		      //	OR연산은 왼쪽 피연산자가 true라면 오른쪽항 연산을 수행하지 않는다.
		      
	}

}
