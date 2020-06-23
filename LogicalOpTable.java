class LogicalOpTable {

public static void main(String args[]) {

	boolean p, q;
	System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

	p = q = 1;
	System.out.print(p + "\t" + q + "\t");
	System.out.print( (p&q) + "\t");
	
/*
	p = true; q = false;
	System.out.print(p +"\t" + q + "\t");
	System.out.println((p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p) + "\t");
	
	p = false; q = true;
	System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" +
				 (p^q) + "\t" + (!p) + "\t");

	p = q = false;
	System.out.print(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" +
			(p^q) + "\t" + (!p));
*/
}
}