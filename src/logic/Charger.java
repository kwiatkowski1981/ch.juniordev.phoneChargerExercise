package logic;
import model.Telephone;

public class Charger {

    public void chargeTelephone(Telephone phone){

        phone.setChargeLevel(phone.getChargeLevel() +1);

    }

}
