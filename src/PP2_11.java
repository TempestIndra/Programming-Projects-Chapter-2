import java.util.Scanner;

public class PP2_11 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter deliminator:");
        int deliminator = sc.nextInt();
        System.out.println((float)numerator/deliminator);
    }
}

/*
* write an application that prompts for reads the numerator
* and deliminator of a fraction as integers and then prints the
* decimal equivalent of the fraction
* */
