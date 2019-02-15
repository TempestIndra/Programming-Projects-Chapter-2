import java.util.Scanner;

public class PP2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature in Fahrenheit: ");
        double Fah = in.nextDouble();
        System.out.println("In Celsius, that is " + ((Fah - 32)*5)/9 + " degrees.");
        in.close();
    }
}

/*
* Create a version of the TempConverter application to convert
* from Fahrenheit to Celsius. Read the Fahrenheit temperature from user.
*/

