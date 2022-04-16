package encapsulation;

import java.util.Scanner;

public class EmployeeClub {
    public static void main(String[] args) {
        /*
        Write a program that asks an employee to enter their information age, address and fullName

        Test Data:
        fullName = Alex Robert
        address = 1234 Abc St, Chicago IL 12345
        age = 32

        Print "Alex Robert is in the club" if user is from Chicago and age is more than 21
        Print "Alex Robert is not in the club" otherwise


        EXPECTED OUTPUT:
        Alex Robert is in the club
         */

        Scanner input = new Scanner(System.in);
        Employee emp1 = new Employee();

        System.out.println("Please enter your fullName");
        emp1.setFullname(input.nextLine());

        System.out.println("Please enter your age");
        emp1.setAge(input.nextInt());
        input.nextLine();

        System.out.println("Please enter your address");
        emp1.setAddress(input.nextLine());

        System.out.println(emp1.toString());

        if (emp1.getAddress().toLowerCase().contains("chicago") && emp1.getAge() > 21){
            System.out.println(emp1.getFullname() + " is in the club");
        }
        else System.out.println(emp1.getFullname() + " is not in the club");


    }
}
