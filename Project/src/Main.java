import classesù.Motorbike;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out.print("A me piace la pizza!\n");

        /*int age = 98;

        System.out.println(age);

        boolean isYear = false;

        if(age == 98) {
            isYear = true;
        }

        if(isYear) {
            System.out.println(age + " is correct!");
            System.out.println("Status : " + isYear);
        } else {
            System.out.println(age + " is NOT correct!");
            System.out.println("Status : " + isYear);
        }
        */

        // use case example of input (Scanner library)
        /*

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width(cm) : ");
        width = scanner.nextDouble();

        System.out.print("Enter heigth(cm) : ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("Area : " + area + " cm^2");

        int friends = 10;

        friends++;

        System.out.println("I have " + friends + " friends!");
         */

        // Old method without constructor
        /*
        Motorbike myFirst = new Motorbike();

        myFirst.brand = "Zontac";
        myFirst.cc = 125;
        myFirst.Colour = "Black";

        System.out.println("You got a " + myFirst.Colour + " " + myFirst.brand + " !");

        myFirst.startEngine();

        myFirst.test();
        */

        // New method with Constructor
        Motorbike myFirst = new Motorbike("Kawasaki", "Green");

        System.out.println("The " + myFirst.getColour() + " " + myFirst.getBrand() + " is ready");

        myFirst.setCC(150);
        // we can test for the control, (comment either)
        myFirst.setCC(1500); // will throw an invalid text "Invalid cc inputted!"


        // If we comment this out and the engine doesn't start, a message will remind the program to
        myFirst.startEngine();

        myFirst.test();
    }
}
