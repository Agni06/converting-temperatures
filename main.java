import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Console Temperature Converter!");
    Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the scale of the temperature (Fahrenheit, Celsius, or Kelvin):");
        String scale = sc.nextLine().toLowerCase();

        System.out.println("Enter the temperature to convert:");
        double temperature = sc.nextDouble();





        ConvertTemperature ct = new ConvertTemperature();
        String convertedTemperature = ct.convert(temperature, scale);
        System.out.println("Converted temperature: " + convertedTemperature);
            sc.close();





    }
}
