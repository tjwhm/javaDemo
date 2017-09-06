/**
 * Created by tjwhm on 2017/9/6 11:05
 * Happy coding !
 **/
public class Villa extends Apartment {

    public Villa(int size) {
        if (size < 250) {
            this.size = 250;
        } else {
            this.size = size;
        }
        this.floor = 1;
        this.decoration = Decoration.LUXURY;
    }

    @Override
    public void updateDecoration() {
        System.out.println("Come on! Give us a break!");
    }
}
