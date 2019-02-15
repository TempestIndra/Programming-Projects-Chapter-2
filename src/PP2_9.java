import java.util.Scanner;

public class PP2_9 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the amount:");
        double input = sc.nextDouble();
        if (input / 10 > 0) {
            int temp = (int) input / 10;
            System.out.println(temp + " ten dollar bills");
            input -= temp * 10;
        } else {
            System.out.println("0 ten dollar bills");
        }
        if(input / 5 > 0) {
            int temp = (int) input / 5;
            System.out.println(temp + " five dollar bills");
            input -= temp * 5;
        } else {
            System.out.println("0 five dollar bills");
        }
        if(input / 1 > 0) {
            int temp = (int) input / 1;
            System.out.println(temp + " one dollar bills");
            input -= temp * 1;
        } else {
            System.out.println("0 one dollar bills");
        }
        if(input / .25 > 0) {
            double temp = input / .25;
            System.out.println((int)temp + " quarters");
            input -= (int)temp * .25;
        } else {
            System.out.println("0 quarters");
        }

        if(input / .1 > 0) {
            double temp = input / .1;
            System.out.println((int)temp + " dimes");
            input -= (int)temp * .1;
        } else {
            System.out.println("0 dimes");
        }
        if(input / .05 > 0) {
            double temp = input / .05;
            System.out.println((int)temp + " nickles");
            input -= (int)temp * .05;
        } else {
            System.out.println("0 nickles");
        }
        if(input / .01 > 0) {
            double temp = input / .01;
            System.out.println((int)temp + " pennies");
            input -= (int)temp * .01;
        } else {
            System.out.println("0 pennies");
        }

   }
}


/*
* Write an application that prompts for and reads a double value
* representing a monetary amount. Then determine the least num-
* ber opf each bill and coin needed to represent that amount,start-
* ing with the highest(assume that a ten-dollar bill is the maximum
* size needed).For example, if the value entered is 47.63(forty-
* seven dollars and sixty-three cents), then the program should
* print the equivalent amount as
* 4 ten dollar bills
* 1 five dollar bills
* 2 one dollar bills
* 2 quarters
* 1 dimes
* 0 nickles
* 3 pennies
* */
