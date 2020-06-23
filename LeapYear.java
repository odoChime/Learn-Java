import java.util.Scanner;
class LeapYear{
public static void main(String[] args) {

	long a,y,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any calendar year: ");

	y= sc.nextLong();

	if(y!=0) {
	a=(y%400==0)? (c=1):((y%100==0)? (c=0) : ((y%4==0)? (c=1):(c=0)));
	if (a==1)
		System.out.println(y + " is a leap year");
	else
		System.out.println(y + " is not a leap year");
}
	else	
		System.out.println("Zero year does not exist");

}
}