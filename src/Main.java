/**
 * Created by tjwhm on 2017/9/5 21:04
 * Happy coding !
 **/
public class Main {

    public static void main(String[] args) {

        Apartment apartment = new Apartment(200, 3, Decoration.SIMPLE);

        apartment.updateDecoration();

        int ap_size = apartment.getSize();
        int ap_floor = apartment.getFloor();
        Decoration ap_decoration = apartment.getDecoration();

        String str_ap_decoration = ap_decoration.toString().toLowerCase();

        System.out.println("I have a " + ap_size + " square metres " + str_ap_decoration +
                " decorated house on the " + ap_floor + " floor.");

    }
}
