package application;

import model.Telephone;

public class PhoneTest {

    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.printInfo());
    }
}
