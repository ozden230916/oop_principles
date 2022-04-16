package inheritance;

public class Dancer extends Person{
    public Dancer(){

    }

    public Dancer(String firstName, String lastName, int age, String gender) {
        super(firstName, lastName, age, gender);
    }
    public void dance(){
        System.out.println("Dancer dances");
    }
}
