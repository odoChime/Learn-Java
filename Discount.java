import java.util.Scanner;
class Discount {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is the price of the pen?");
	double originalPrice = sc.nextInt();
	
	System.out.println("What is the discount rate?");
	double disRate = sc.nextInt();
	
	double disPrice = (disRate/100)*originalPrice;
	System.out.println("The discount price is: " +(originalPrice - disPrice));


}
}
