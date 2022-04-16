package inheritance;

public class Tester extends Person {
    public Tester(){

    }
    public Tester(String firstName, String lastName, int age, String gender) {
        super(firstName, lastName, age, gender);
    }
    public void code(){
        System.out.println("Tester codes");
    }

    @Override
    public void sleep() {
        System.out.println("Tester sleeps");
    }

    @Override
    public void learn() {
        System.out.println("Tester learns");
    }

    @Override
    public void walk() {
        System.out.println("Tester walks");
    }

    @Override
    public void eat() {
        System.out.println("Tester eats");
    }
}
