import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("What is the temperature in Celsius?");
            Scanner input = new Scanner(System.in);
            double temperature = input.nextDouble();
            double fahrenheit = temperature * 1.8 + 32;
            System.out.println("The temperature in Fahrenheit is " + fahrenheit);
        }
        while
    }
}