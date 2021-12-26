package BasicCoreProg;
import java.util.*;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Charcter");
		char ch = sc.next().charAt(0);

		if(ch == 'a' || ch == 'A')
			System.out.println(ch+" is a vowel");
		else if(ch == 'e' || ch == 'E')
			System.out.println(ch+" is a vowel");
		else if(ch == 'i' || ch == 'I')
			System.out.println(ch+" is a vowel");
		else if(ch == 'o' || ch == 'O')
			System.out.println(ch+" is a vowel");
		else if(ch == 'u' || ch == 'U')
			System.out.println(ch+" is a vowel");
		else 
			System.out.println(ch+" is a consonant");
		
		sc.close();

	}

}
