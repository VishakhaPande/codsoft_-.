//My second task of internship which is student grade calculator.

import java.util.Scanner;

class StudentGradeCalculator
{
public static void main(String args[])
{
     float English, Physics, Chemistry, Mathematics, Computer; 

     double Total, Average, Percentage; 
	 String Grade;

    Scanner scn = new Scanner(System.in);

    System.out.println("Enter marks of five subjects out of 100:");
    System.out.print("Enter marks of English subjects:");
    English = scn.nextFloat();

    System.out.print("Enter marks of Physics subjects:");
    Physics = scn.nextFloat();

    System.out.print("Enter marks of Chemistry subjects:");
    Chemistry = scn.nextFloat();

    System.out.print("Enter marks of Mathematics subjects:");
    Mathematics = scn.nextFloat();

    System.out.print("Enter marks of Computers subjects:");
    Computer = scn.nextFloat();

    Total = English + Physics + Chemistry + Mathematics + Computer;
    Average = (Total / 5.0);
    Percentage = (Total / 500.0) * 100;
	
	if (Percentage >90)
	{
		 System.out.println("Grade is A++");
	}

	else if (Percentage>50)
	{
		System.out.println("Grade is A");
	}

	else if (Percentage>35)
	{
		System.out.println("Grade is B");
	}

    System.out.println("Total marks = "+Total);
    System.out.println("Average marks = "+Average);
    System.out.println("Percentage = "+Percentage);

	//System.out.println("Grade = "+Grade);
   }//End of the main method.
}//End of the class.