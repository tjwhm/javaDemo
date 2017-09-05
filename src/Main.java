/**
 * Created by tjwhm on 2017/9/5 21:04
 * Happy coding !
 **/
public class Main {

    public static void main(String[] args) {

        Apartment apartment = new Apartment(200, 3, Decoration.SIMPLE);

        apartment.updateDecoration();

        String ap_size = String.valueOf(apartment.getSize());
        String ap_floor = String.valueOf(apartment.getFloor());
        String ap_decoration = apartment.getDecoration().toString().toLowerCase();

        System.out.println("I have a " + ap_size + " square metres " + ap_decoration +
                " decorated house on the " + ap_floor + " floor.");

    }
}
