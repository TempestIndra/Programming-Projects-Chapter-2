import java.util.Scanner;

public class PP2_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter miles: ");
        System.out.println(sc.nextFloat()*1.60935 + "km.");
        sc.close();
    }
}

/*
* Write an application that converts miles to kilometers.(One mile
* equals 1.60935 kilometers.) Read the miles values from the user as
* a floating point value.
*/
