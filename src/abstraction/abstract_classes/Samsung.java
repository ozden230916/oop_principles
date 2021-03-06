package abstraction.abstract_classes;

public class Samsung extends Phone {
    public static final String OS = "Android";
    // default constructor
    public Samsung() {
    }
    //4-args constructor
    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }
}
