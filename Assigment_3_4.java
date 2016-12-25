
import java.util.Scanner;
public class Assigment_3_4{
	int roll_number; /* roll_number is a int variable which is global */
	String s2;      /* s2 is a string variable which is global */
	int marks;		/*marks is a int variable which is global */
	void getdata()   /* getdata is a method */
	{
		Scanner SC = new Scanner(System.in); /*input through keyboard */
		 roll_number=SC.nextInt();          /* input through user */
		 s2= SC.next();						/* input through user */
		 marks = SC.nextInt();				/* input through user */
	}
	void recorddata()	/*  here recorddata is a method*/
	{
		System.out.println("roll number is = "+roll_number); /* it's print the roll number */
		System.out.println("name is = "+s2);  /* it print the name */
		System.out.println("marks is = "+marks); /*it print the marks*/
	}
	public static void main(String args[])  /* main method */
	{
	
		Assigment_3_4 input = new Assigment_3_4(); /* object is creatd using new keyword*/
		int number = 1;   /* initializing the variable number*/
		Scanner Sc=new Scanner(System.in);
		while(number==1)  /* while loop execute */
		{
		System.out.println("Enter roll number, name and marks of the student"); /* enter the roll number marks and name */
		input.getdata();  /*calling getdata method*/
		input.recorddata(); /* calling record data method*/
		System.out.println("Enter 1 for more entries otherwise enter 0"); /*for more entries write 1 othrwise 0*/
		number=Sc.nextInt(); /*input through user*/
		}
	}

}
