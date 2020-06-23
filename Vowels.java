import java.util.Scanner;
class Vowels {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String text = sc.nextLine();
	
	System.out.print("Number of vowels in the string: " + countVowels(text) + "\n");
}

public static int countVowels(String text) {

	int count = 0;
	for (int i=0;i<text.length();i++)
	{
		if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') 
			{
				count++;
			}
	

	}
	return count;
}

}