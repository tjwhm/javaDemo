/**
 * Created by tjwhm on 2017/9/5 21:04
 * Happy coding !
 **/
public class Main {

    public static void main(String[] args) {

        Horse horse = new Horse();
        System.out.println("I have a horse, it has"
                + String.valueOf(horse.getFeetQuantity())
                + " feet.");

        Animal animal = new Animal() {
            @Override
            boolean hasSpine() {
                return true;
            }

            @Override
            int getFeetQuantity() {
                return 4;
            }
        };
        System.out.println("I have a horse, it has"
                + String.valueOf(animal.getFeetQuantity())
                + " feet.");
    }
}
