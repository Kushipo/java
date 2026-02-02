import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("A me piace la pizza!\n");

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
    }
}
