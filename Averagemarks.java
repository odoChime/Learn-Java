import java.util.Scanner;
class Averagemarks{

	public static void main(String[] args){

	Scanner sc= new Scanner(System.in);

	System.out.println("Number of Subjects?");

	int n= sc.nextInt(), avg=0;

	int a[] = new int[n];
	System.out.println("enter marks");

	for (int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}

	for(int i=0;i<a.length;i++)
	{
		avg= avg+a[i];
	}
	System.out.println("Average mark is: " + avg);

	}
}
