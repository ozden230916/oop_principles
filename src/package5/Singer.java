package package5;

import inheritance.Person;

public class Singer extends Person {
    public Singer(){

    }

    public Singer(String firstName, String lastName, int age, String gender) {
        super(firstName, lastName, age, gender);
    }
    public void sing(){
        System.out.println("Singer sings");
    }

}
