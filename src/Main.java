/**
 * Created by tjwhm on 2017/9/5 21:04
 * Happy coding !
 **/
public class Main {

    public static void main(String[] args) {

        Apartment apartment = new Apartment(300);
        Apartment.Location location = apartment.new Location(City.BEIJING,"Chang'An",305,3,true);
    }
}
