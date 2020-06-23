import java.util.Scanner;
class VolumeOfPrism {

public static void main(String[] args){

	Scanner s = new Scanner(System.in);
	System.out.println("Enter a base value: ");
	double base = s.nextDouble();

	System.out.println("Enter a height value: ");
	double height = s.nextDouble();

	double a = VolumeOfPrism.volume(base, height);
	System.out.println("The Volume of the prism is: " + a);

}

public static double volume(double b, double h) {
	double a = b*h;
	return a;
}

}
