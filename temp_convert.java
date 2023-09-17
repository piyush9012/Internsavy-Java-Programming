import java.util.Scanner;

class temp_converter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}

public class temp_convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        temp_converter obj = new temp_converter();

        System.out.println("Temperature Conversion Tool");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        
        int choice = sc.nextInt();
        double input, converted;
        
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                input = sc.nextDouble();
                converted = obj.celsiusToFahrenheit(input);
                System.out.println("Converted temperature: " + converted + " Fahrenheit");
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                input = sc.nextDouble();
                converted = obj.fahrenheitToCelsius(input);
                System.out.println("Converted temperature: " + converted + " Celsius");
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option (1-6).");
        }
    }
}
