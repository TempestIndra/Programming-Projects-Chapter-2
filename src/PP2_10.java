import java.util.Scanner;

public class PP2_10 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a square's side: ");
        int num = sc.nextInt();
        System.out.println("Perimeter is " + num * 4 + "\nArea is " + Math.pow(num,2));
    }
}

/*
* write an application that prompts for and reads an integer repre-
* senting the length of a square's side and then prints the square's
* perimeter and area
* */