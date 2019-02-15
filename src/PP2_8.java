import java.util.Scanner;

public class PP2_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quarter: ");
        int quarter = sc.nextInt();
        System.out.print("Enter dimes: ");
        int dimes = sc.nextInt();
        System.out.print("Enter nickel: ");
        int nickel = sc.nextInt();
        System.out.print("Enter penny: ");
        int penny = sc.nextInt();
        double total = quarter*.25 + dimes *.1 + nickel*.05 + penny*.01;
        System.out.println(total);
    }
}

/*
* Write an application that determines the value of the coins in a jar
* and prints the total in dollars and cents. Read integer values that
* represent the number of quarters, dimes, nickels, and pennies
*/
