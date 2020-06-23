import java.util.Scanner;
class Factorial {

	public static void main(String[] args) {

	long n, num=1;
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter a number");
	n = s.nextLong();
	
	for(int i=1;i<n;i++)
	{
	num = num*i;
	}
	System.out.println("num ="+ num);

	}
}