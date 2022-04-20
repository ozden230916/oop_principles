package abstraction.abstract_classes;

public class Iphone extends Phone{
    public static final String OS = "IOS";
    // default constructor
    public Iphone() {
    }
    //4-args constructor
    public Iphone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("IPhone calls");
    }

    @Override
    public void ring() {
        System.out.println("IPhone rings");
    }

    @Override
    public void text() {
        System.out.println("IPhone texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }
}
