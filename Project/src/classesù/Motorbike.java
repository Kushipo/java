package classesù;

public class Motorbike extends Vehicle {

    private int cc;


    public Motorbike(String brand, String Colour) {
        super(brand, Colour);
    }

    public void doWheelie() {
        System.out.println("The " + brand + " is doing a wheelie on one wheel!");
    }
}
