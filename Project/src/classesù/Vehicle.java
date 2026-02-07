package classesù;

public class Vehicle {

    /*
    * References
    *  - private    -> Only I can touch it
    *  - public     -> Everyone can touch it
    *  - protected  -> My children and I can touch it (Inheritance)
    * */

    protected String brand;
    protected String Colour;
    protected boolean isOn;

    public Vehicle(String brand, String Colour) {
        this.brand = brand;
        this.Colour = Colour;
        this.isOn = false;
    }

    public void startEngine() {
        System.out.println("The " + Colour + " " + brand + "is ready!");
        isOn = true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour() {
        this.Colour = Colour;
    }


}
