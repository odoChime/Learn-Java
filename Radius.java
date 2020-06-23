import java.util.Scanner;
class Radius {

	public static void main(String args[]) {

	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the circumference: ");
	double circumference = s.nextDouble();
	double r = circumference / (2 * 3.14);
	
	System.out.println("The radius of the circle is: "+ r);
	
	}
}