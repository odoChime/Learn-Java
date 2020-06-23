class Casting {

public static void main(String args[]) {

	double x, y;
	byte b;
	int i;
	char ch;

	x = 10.0;
	y = 3.0;

	System.out.println("Double outcome of x / y: " + (x / y));

	i = (int) (x / y); // cast double to it
	System.out.println("Integer outcome of x / y: " + i);
	
	i = 100;
	b = (byte) i; // no loss of data here because a byte can hold the value 100
	System.out.println("Value of b is: " + b);

	i = 257;
	b = (byte) i; // loss of info. here, a byte cannot hold the value 257
	System.out.println("value of b is: " + b);

	b = 88; //ASCII code for X
	ch = (char) b;
	System.out.println("ch: " + ch);

}

}