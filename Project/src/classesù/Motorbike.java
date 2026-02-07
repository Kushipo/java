package classesù;

public class Motorbike {

    private String brand;
    private int cc;
    private String Colour;

    boolean isOn;

    public String getBrand() {
        return brand;
    }

    public int getCc() {
        return cc;
    }

    public String getColour() {
        return Colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setColour(String colour) {
        Colour = colour;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setCC(int cc) {
        if(cc > 0 && cc < 175) {
            this.cc = cc;
        } else {
            System.out.println("Invalid cc inputted!");
        }
    }



    public Motorbike(String inputBrand, String inputColour) {
        brand = inputBrand;
        Colour = inputColour;
        isOn = false;
    }

    public void startEngine() {
        System.out.println("The " + Colour + " " + brand + " is starting.");
        isOn = true;
    }

    public void test() {
        if(isOn) {
            System.out.println("The " + Colour + " " + brand + "'s engine is ready!");
        } else {
            System.out.println("Please remember to start the engine!");
        }
    }


}
