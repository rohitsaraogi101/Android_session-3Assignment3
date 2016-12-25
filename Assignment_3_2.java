import java.util.Scanner;

public class Assignment_3_2 {
	public static void main(String args[])  
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the string S1 = "); 
		String S1 = input.next();  
		System.out.println("Enter the string S2 = "); 
		String S2 = input.next();
		boolean compare;  /* boolean variable */
		compare= S1.equals(S2); /* compare the two strings*/
		{
			System.out.println("Returned Value = "+compare); 
		}
		
	}

}
