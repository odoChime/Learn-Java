import java.util.Scanner;
class Perimeter {

public static void main(String[] args) {

	Scanner s= new Scanner(System.in);

	System.out.println("Enter the breadth: ");
	double b = s.nextDouble();

	System.out.println("Enter the height: ");
	double h = s.nextDouble();

	double p = 2 * (b + h);
System.out.println("The Value of the perimeter of your parallelogram is: " + p);

	}
}