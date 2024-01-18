package java07_inherit.practice2.product;

public class Tv extends Product{
//    private String model;
//    private int price;

    public Tv(String model, int price) {
        super(model, price);
//        this.model = model;
//        this.price = price;
    }

    @Override
    public void out() {
        System.out.println("Tv");
    }

//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
}
