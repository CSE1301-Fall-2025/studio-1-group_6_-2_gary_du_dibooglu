package studio1;

import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        // A year is a leap year if it is divisible by 4 but not by 100,
        // except if it is divisible by 400
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeapYear);
    }
}
