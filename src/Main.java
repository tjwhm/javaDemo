/**
 * Created by tjwhm on 2017/9/5 21:04
 * Happy coding !
 **/
public class Main {

    public static void main(String[] args) {

        Apartment a1 = new Apartment(200);
        a1.getSize();
        a1.getSize();

        System.out.println(a1.totalViewer);
        System.out.println(Apartment.totalViewer);
        System.out.println(a1.getTotalViewer());
        System.out.println(Apartment.getTotalViewer());

        Apartment a2 = new Apartment(300);
        a2.getSize();
        a2.getSize();
        System.out.println(a2.totalViewer);
        System.out.println(Apartment.totalViewer);
        System.out.println(a2.getTotalViewer());
        System.out.println(Apartment.getTotalViewer());
    }
}
