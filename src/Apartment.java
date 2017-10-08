
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
}
