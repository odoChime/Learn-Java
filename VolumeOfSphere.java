import java.util.Scanner;
class VolumeOfSphere {

public static void main(String[] args) 
{

	Scanner s = new Scanner(System.in);
	System.out.println("Enter the radius: ");
	double r = s.nextDouble();

	double volume = VolumeOfSphere.area(r);
	
	System.out.println("The Volume of sphere with radius: " + r + "is: " + volume);

}

public static double area(double r){
	double volume = (4*22*r*r*r) / (3*7);
	return volume;
}

}