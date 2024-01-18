package java04_control.loop;

//Quiz.
//첫날에 10원을 예금하고,
//다음날에는 전날의 2배를
//예금하는 방식으로
//보름(15일) 동안 저축한 금액은?
// -> 327670

public class For_07_1 {

	public static void main(String[] args) {
			
		int save = 0;
		for(int day=1, bank_money = 10 ; day<16; save +=  bank_money, bank_money *= 2, day++);
		System.out.println(save + "원");
		
	}

}
