package encapsulation;

public class Car {
    //instance variables
    public String make;
    private int year;
    private double price;


    //Providing indirect access to year to set and get info
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setPrice(double price, String password){
        if (password.equals("abcd1234"))this.price = price;
        else throw new RuntimeException("The password entered is not valid!!!");
    }

    public double getPrice(){
        return this.price;
    }
}
