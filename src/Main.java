/**
 * Created by tjwhm on 2017/9/5 21:04
 * Happy coding !
 **/
public class Main {

    public static void main(String[] args) {

        Apartment apartment = new Apartment(200, 3, Decoration.SIMPLE);

        apartment.updateDecoration();

        int apartmentSize = apartment.getSize();
        int apartmentFloor = apartment.getFloor();
        Decoration apartmentDecoration = apartment.getDecoration();

        String strApartmentDecoration = apartmentDecoration.toString().toLowerCase();

        System.out.println("I have a " + apartmentSize + " square metres " + apartmentFloor +
                " decorated house on the " + strApartmentDecoration + " floor.");

    }
}
