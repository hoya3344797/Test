package java04_control.loop;

//Quiz.
//첫날에 10원을 예금하고,
//다음날에는 전날의 2배를
//예금하는 방식으로
//보름(15일) 동안 저축한 금액은?
// -> 327670

public class For_07 {

	public static void main(String[] args) {
			int save = 0;
			int bank_money = 10;
			int day;
			
		for(day=1; day<16; day++) {
			save +=  bank_money;
			bank_money *= 2;
		}
		System.out.println(save + "원");
		
	}

}
