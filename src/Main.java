import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initializing the variable for the upcoming user input
        int temperature;

        //initializing the scanner
        Scanner scanner = new Scanner(System.in);

        //getting input from the user
        System.out.print("What's the temperature in Celsius? ");
        temperature = scanner.nextInt();

        //the order of the if statements helps us not have to use 'ranges' for temperatures
        if (temperature < 5) {
            System.out.println("A great opportunity to go skiing.");
        } else if (temperature <= 15 ){
            System.out.println("Movies, it is.");
        } else if (temperature <= 25) {
            System.out.println("A picnic is always a great idea.");
        } else {
            System.out.println("Swimming could help you cool off.");
        }
    }
}