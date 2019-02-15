import java.util.Scanner;

public class PP2_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hour:");
        int hr = sc.nextInt();
        System.out.print("Minute:");
        int min = sc.nextInt();
        System.out.print("Second:");
        int sec = sc.nextInt();
        System.out.println(((hr*60*60) + (min*60)+sec) + " seconds");
        sc.close();
    }
}

/*
* Write an application that reas values representing a time dura-
* tion in hours, minutes, and seconds, and the prints the equiva-
* lent total number of seconds.(For example, 1 hour, 28 minutes
* and 42 seconds is equivalent to 5322 seconds.
*/