import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        do {
        System.out.println("What is the temperature in Celsius?");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 'C' to convert to Fahrenheit: ");
        Scanner input2 = new Scanner(System.in);
        double temperature = input.nextDouble();
        double fahrenheit = temperature * 1.8 + 32;
        if (input2.next().equals("C")) {
            System.out.println("The temperature in Fahrenheit is " + fahrenheit);
        } else {
            System.out.println("Invalid entry. Please try again.");
        }
        System.out.print("Enter Yes to try again and No to exit: ");
        Scanner input3 = new Scanner(System.in);
        input3.nextLine();
        } while (args.next().equals("Yes"));
    }
}