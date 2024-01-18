package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {
    private String name;
    private int money;
    
    private Product prod;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
        
    }

    public void buy(Product product) {
    	
    	if (this.money < product.getPrice()) {
    		System.out.println("[SYSTEM] 잔액 부족");
    		System.out.println("[잔액] " + this.money + "원");    		
    		return;	//메소드 중단
    	}
    	this.prod = product;
    	this.money -= product.getPrice();
    	System.out.println(this.name + "님이 " + product.getPrice() + "원을 지불하고 " + product.getModel() + "를 구매함");
    	System.out.println("[잔액] " + this.money + "원");
    	
//        if (this.money >= product.getPrice()) {
//            this.money -= product.getPrice();
//            this.prod = product; // 전달된 제품을 멤버 필드에 저장
//            System.out.println(getName() + "님이 " + product.getPrice() + "원을 지불하고 " + product.getModel() + "를 구매함");
//        } else {
//            System.out.println(getName() + "님은 " + product.getModel() + "를 살 돈이 없습니다.");
//        }
//        System.out.println("[잔액] " + getMoney() + "원");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }
}

