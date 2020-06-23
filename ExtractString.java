import java.util.Scanner;
class ExtractString {

public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input text");
	String text = sc.nextLine();

	System.out.println("Original text is "+ text);

	System.out.println("Text at index 0 is "+ text.charAt(0));
	System.out.println("Text at index 10 is "+ text.charAt(10));

	}
}