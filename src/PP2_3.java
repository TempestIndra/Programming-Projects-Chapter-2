import java.util.Scanner;

public class PP2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Float num1 = sc.nextFloat();
        Float num2 = sc.nextFloat();
        sc.close();
        System.out.println("sum = " + (num1+num2) + "\ndifference = " + (num1-num2) + "\nproduct = " + (num1*num2));
    }
}

/*
* Write an application that reads two floating point numbers and
* prints their sum, difference, and product
*/
