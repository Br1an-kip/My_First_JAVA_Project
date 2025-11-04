import java.util.Scanner;
public class Main {
    public static void main() {
//        Calculate Area of a Rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("You wanna find the area of a Rectangle? (true/false): ");
        boolean findArea = scanner.nextBoolean();
        System.out.println();

        System.out.println("Wagwan G");
        if (findArea){
            System.out.println("Then fill out the following :) ");
        }
        else {
            System.out.println("Feel free to leave");
        }

        System.out.print("Whats the width ");
        width = scanner.nextDouble();

        System.out.print("Whats the Height ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("Here is your area: "+area+" ");
        scanner.close();
    }
}