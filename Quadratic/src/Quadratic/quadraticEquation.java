package Quadratic;
/*Reine Julianne Jorda

 * ICS4U
 * Mr. Christian
 * 9 July 2019
 * Unit 2 - Quadratic Equation
 * Create a QuadraticEquation application that gives the solution to any quadratic equation. 
 * The application should prompt the user for values for a, b, and c (ax^2 + bx + c = 0) and then display the roots.
 */
import java.util.Scanner;

public class quadraticEquation {
	public static void main(String[] args) {
// declaring double variables which will prompt the user to insert values
Double a, b, c;
Scanner standard = new Scanner(System.in);
System.out.println("Welcome. \nFind the zeros of any quadratic equation in the form ax^2+bx+c");
System.out.println("Enter the value of a:");
a = standard.nextDouble();
System.out.println("Enter the value of b:");
b = standard.nextDouble();
System.out.println("Enter the value of c:");
c = standard.nextDouble();

//find the discriminant by having a separate variable which determines this
Double discriminant = b*b - 4*a*c;
System.out.println("The discriminant value is: " + discriminant);

/*determine the zeros based on the discriminant: since there are 3 options: 1. 2 zeros
 * 2. 1 zero and 3. 0 zeros. I created an if-else statement which satisfies each option
 */

if (discriminant>0) {
	Double zero1, zero2;
	System.out.println("Since the discriminant is greater than 0, there are 2 possible zeros.");
	zero1 = (-b + Math.sqrt(discriminant))/(2*a);
		System.out.println("Zero 1 is: " + zero1);
	zero2 = (-b - Math.sqrt(discriminant))/(2*a);
		System.out.println("Zero 2 is: " + zero2);
} else if (discriminant==0) {
	Double zero1;
	System.out.println("Since the discriminant is equal to 0, there is only 1 possible zero");
	zero1 = -b /(2*a);
	System.out.println("Zero 1 is: " + zero1);
} else {
	System.out.println("Since the discriminant is less than 0, there are no possible zeros.");
}
	}
}