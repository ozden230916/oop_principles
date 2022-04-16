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
}
