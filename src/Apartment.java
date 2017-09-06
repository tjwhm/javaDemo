
/**
 * Created by tjwhm on 2017/9/5 21:04
 * Happy coding !
 **/

public class Apartment {


    public int size;
    public int floor;
    public Decoration decoration;

    public Apartment(){

    }
    public Apartment(int size, int floor, Decoration decoration) {
        this.size = size;
        this.floor = floor;
        this.decoration = decoration;
    }

    public int getSize() {
        return size;
    }

    public int getFloor() {
        return floor;
    }

    public Decoration getDecoration() {
        return decoration;
    }

    public void updateDecoration() {
        if (this.decoration == Decoration.NULL) {
            this.decoration = Decoration.SIMPLE;
        } else if (this.decoration == Decoration.SIMPLE) {
            this.decoration = Decoration.LUXURY;
        } else {
            System.out.println("Your apartment's decoration is already the best!");
        }
    }
}
