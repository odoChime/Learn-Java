import java.util.Scanner;
class Hypotenuse {

public static void main(String[] args) {
	double ad, opp, hyp;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter adjacent value: ");
	ad = sc.nextDouble();
	
	System.out.println("Enter opposite value: ");
	opp = sc.nextDouble();

	hyp = Math.sqrt((ad*ad) + (opp*opp));
	System.out.println("The length of the hypotenuse is: " + hyp);

}
}