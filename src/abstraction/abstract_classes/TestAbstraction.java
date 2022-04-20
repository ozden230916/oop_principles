package abstraction.abstract_classes;

import java.util.ArrayList;

public class TestAbstraction {
    public static void main(String[] args) {
        /*
        Create an object of Samsung called as s1
        info it will have is as below

        Samsung
        Black
        64
        700
         */
        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        /*
        Print all objects
        Find and print the most expensive one with the message -> "The most expensive phone is = IPhone"
        Find and print how many phones are convertible -> 2
         */

        System.out.println("\n-------\n");

        for (Phone phone : phones) {
            System.out.println(phone);
        }

        System.out.println("\n-------\n");
        Phone mostExpensive = null;
        double max = 0;
        for (Phone phone : phones) {
            if (phone.price > max) {
                max = phone.price;
                mostExpensive = phone;
            }
        }
        System.out.println("The most expensive phone is = " + mostExpensive.getClass().getSimpleName() );

        System.out.println("\n-------\n");
        int countConvertible = 0;
        for (Phone phone : phones) {
            if (phone.isConvertible()) countConvertible++;
        }
        System.out.println(countConvertible);

        System.out.println("\n----extra---\n");
        System.out.println(Iphone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for (Phone phone : phones) {
            phone.call();
            phone.ring();
            phone.text();
        }

    }
}
