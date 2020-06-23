import java.util.Scanner;

class FutureInvestmentValue {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is your asset's Present value?");
	int pv = sc.nextInt();

	System.out.println("What is the interest paid by the investment?");
	int rate = sc.nextInt();

	System.out.println("Enter the length of time in years");
	double y = sc.nextInt();

	double fv = pv*Math.pow((1+rate/100),y);
	System.out.println("Your FIV is: "+ fv);

}
}