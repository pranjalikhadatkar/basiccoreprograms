package BasicCoreProg;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.print("Factors of " + number + " is: ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
	        System.out.print(i + " ");
	      }
	    }

	}

}
