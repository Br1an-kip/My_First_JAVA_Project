import java.util.Scanner;
public class Main {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your name ");
        String name = scanner.nextLine();

        System.out.println("Hi there " + name + " How are you doing ?");

        System.out.print("Whats Your GPA "+ name +" ? ");
        double gpa = scanner.nextDouble();
        System.out.println("Congrats you got a " + gpa+" in your GPA");
    }
}