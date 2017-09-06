/**
 * Created by tjwhm on 2017/9/6 11:42
 * Happy coding !
 **/
public class ApartmentBuilder {
    Apartment apartment = new Apartment();

    ApartmentBuilder size(int size) {
        apartment.size = size;
        return this;
    }

    ApartmentBuilder floor(int floor) {
        apartment.floor = floor;
        return this;
    }

    ApartmentBuilder decoration(Decoration decoration) {
        apartment.decoration = decoration;
        return this;
    }

    ApartmentBuilder city(City city) {
        apartment.city = city;
        return this;
    }

    ApartmentBuilder location(Location location) {
        apartment.location = location;
        return this;
    }

    Apartment build() {
        return apartment;
    }
}
