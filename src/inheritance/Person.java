package inheritance;

public class Person {
    //default constructor
    public Person(){

    }

    //4-args constructor

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    //instance variables
    public  String firstName;
    public String lastName;
    protected int age;
    protected String gender;
    double weight;
    double height;
    private String dateOfBirth;
    private String SSN;

    public void sleep(){
        System.out.println("People sleeps");
    }
    public void learn(){
        System.out.println("People learns");
    }
    public void walk(){
        System.out.println("People walks");
    }
    public void eat(){
        System.out.println("People eats");
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
