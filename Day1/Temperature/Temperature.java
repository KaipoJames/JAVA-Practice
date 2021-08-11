package Temperature;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        while(true) {
            Scanner s = new Scanner(System.in);
            System.out.println("\n --- TEMPERATURE CONVERTER ---");
            System.out.println("Enter 1 to convert to Fahrenheit");
            System.out.println("Enter 2 to convert to Celsius");
            System.out.println("Enter any other key to quit the program");
            String choice = s.next();
            if (choice.equalsIgnoreCase("q")) {
                s.close();
                break;
            }
            execute(choice);
        }
    }

    public static void execute(String choice) {
        Scanner s = new Scanner(System.in);
        if (choice.equals("1")) {
            System.out.println("Enter degrees in [C] to convert to [F]");
            System.out.println(toFahrenheit(s.nextDouble()));
        } else if (choice.equals("2")) {
            System.out.println("Enter degrees in [F] to convert to [C]");
            System.out.println(toCelsius(s.nextDouble()));
        } else {
            System.exit(0);
        }
    }

    public static Double toFahrenheit(Double celsius) {
        return (celsius * (9.0/5.0)) + 32;
    }
    public static Double toCelsius(Double fahrenheit) {
        return (fahrenheit - 32) * (5.0/9.0);
    }

}
