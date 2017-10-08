
/**
 * Created by tjwhm on 2017/9/5 21:04
 * Happy coding !
 **/

public class Apartment {

    private int size;
    public static int totalViewer = 0;

    public Apartment(int size) {
        this.size = size;
    }

    public int getSize() {
        ++totalViewer;
        return size;
    }

    public static int getTotalViewer() {
        return totalViewer;
    }

    class Location {
        City city;
        String street;
        int number;
        int floor;
        boolean faceEast;

        public Location(City city, String street, int number, int floor, boolean faceEast) {
            this.city = city;
            this.street = street;
            this.number = number;
            this.floor = floor;
            this.faceEast = faceEast;
        }

        public City getCity() {
            ++totalViewer;
            return city;
        }

        public String getStreet() {
            ++totalViewer;
            return street;
        }

        public int getNumber() {
            ++totalViewer;
            return number;
        }

        public int getFloor() {
            ++totalViewer;
            return floor;
        }

        public boolean isFaceEast() {
            ++totalViewer;
            return faceEast;
        }
    }
}
