import java.util.Scanner;
public class BodyMassIndexCalculator {
    public static void main(String[] args) {

        double height, index;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height in cm:");
        height = input.nextDouble();

        System.out.print("Please enter your kilo:");
        kilo = input.nextInt();

        index = kilo / (height * height);
        System.out.println("Your Body Mass Index :" + index);



    }
}