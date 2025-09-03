package studio1;

import java.util.Scanner;

public class Average {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("The first of two integers to be averaged?");
        int firstint = in.nextInt();

        System.out.println("The second of two integers to be averaged?");
        int secondint = in.nextInt();

        System.out.println(
                "Average of " + firstint + " and " + secondint + " is " + ((double) (firstint + secondint) / 2) + ".");
    }

}
=======
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("The first of two integers to be averaged?");
		int firstint = in.nextInt();

        System.out.println("The second of two integers to be averaged?");
		int secondint = in.nextInt();

		System.out.println("Average of " + firstint + " and " + secondint + " is " + ((double)(firstint+secondint)/2) + ".");
	}

}
>>>>>>> 710202e (Average Commit)
