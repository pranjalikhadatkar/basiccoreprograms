package BasicCoreProg;
import java.util.*;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		if (n%2==0)
			System.out.println(n + " number is even ");
		else
			System.out.println(n + " number is odd ");
		sc.close();

	}

}
