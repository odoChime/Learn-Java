class Help {
public static void main(String args[])
throws java.io.IOException {
char choice;

	System.out.println("Help on:");
	System.out.println("\t 1. if");
	System.out.println("\t 2. switch");

	System.out.println("Enter 1 or 2 to select");
	
	choice = (char) System.in.read();

	switch (choice) {
		case '1':
			System.out.println("The if:\n");
			System.out.println("if (condition) statement;");
			System.out.println("else statement");
			break;
		case '2':
			System.out.println("The switch:\n")
			System.out.println("switch (expression) {");


			}

}
}