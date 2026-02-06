package classesù;

public class Motorbike {

    public String brand;
    public int cc;
    public String Colour;

    boolean isOn = false;

    public void startEngine() {
        System.out.println("The " + brand + " is starting.");
        isOn = true;
    }

    public void test() {
        if(isOn) {
            System.out.println("The " + Colour + " " + brand + " is ready!");
        } else {
            System.out.println("Please remember to start the engine!");
        }
    }


}
