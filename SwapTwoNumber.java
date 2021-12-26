package BasicCoreProg;
import java.util.*; 
public class SwapTwoNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("before swaping");
		System.out.println("a = " + a + " b = " + b);
		c = a; 
		a = b;
		b = c;
		System.out.println("after swaping");
		System.out.println("a = " + a + " b = " + b);
		sc.close();
	}

}
