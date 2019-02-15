import java.util.Scanner;

public class PP2_7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + " hours, " + p3 + " minutes, and " + p1 + " seconds");
        in.close();
    }
}


/*
* Create a version of the previous project that reverse the
* computation. That is, read a value representing a number of
* seconds, and then print the equivalent amount of time as a
* combination of hours, minutes, and seconds.(For example,
* 9999 seconds is equivalent to 2 hours, 46 minutes, and
* 39 seconds.)
*/
