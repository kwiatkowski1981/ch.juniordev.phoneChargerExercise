package application;

import model.Telephone;
import  logic.Charger;

public class PhoneTest {

    public static void main(String[] args) {
        Charger charger = new Charger();

        Telephone telephone1 = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone1.printInfo());
        charger.chargeTelephone(telephone1);
        System.out.println(telephone1.printInfo());

        Telephone phone1 = new Telephone("iphone", "pro11", 4200, 50);
        System.out.println(phone1.printInfo());


        charger.chargeTelephone(phone1);
        System.out.println(phone1.printInfo());

        charger.chargeTelephone(phone1);
        charger.chargeTelephone(phone1);
        charger.chargeTelephone(phone1);
        charger.chargeTelephone(phone1);
        charger.chargeTelephone(phone1);
        charger.chargeTelephone(phone1);
        charger.chargeTelephone(phone1);
        charger.chargeTelephone(phone1);
        System.out.println(phone1.printInfo());



    }
}
