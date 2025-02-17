import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        double temperature = 0;
        double fahrenheit;
        Scanner input = new Scanner(System.in);
        boolean valid;
        do {
            System.out.println("What is the temperature in Celsius?");
            if (input.hasNextDouble()) {
                temperature = input.nextDouble();
                valid = true;
            } else {
                valid = false;
                input.next();
                System.out.println("Please enter a number.");}
        }while (!valid);
        fahrenheit = temperature * 1.8 + 32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
    }
}