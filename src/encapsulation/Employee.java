package encapsulation;

public class Employee {
    //default constructor
    public Employee(){

    }

    //instance variables
    private final static  int totalEmployees = 10;

    /*
    Define information below and encapsulate them
    fullName
    age
    address
    phone
     */
    private String fullname;
    private int age;
    private String address;
    private String phoneNumber;

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getFullname(){
        return fullname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static int getTotalEmployees(){
        return totalEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
