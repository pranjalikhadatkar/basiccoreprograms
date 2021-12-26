package BasicCoreProg;

import java.util.*;

public class largestThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter 3 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int largest;
		if(a>b)
			largest = a;
		else
			largest = b;
		if (c>largest)
			largest = c;
		System.out.println("Biggest number among 3 numbers="+ largest);
		sc.close();
	}

}
