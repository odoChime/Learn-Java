class Guess {

public static void main(String args[])
throws java.io.IOException {

	char ch, answer = 'K';

	System.out.println("I'm thinking of a letter bettween A and Z");
	System.out.println("Can you guess it?");

	ch = (char) System.in.read();
	if ( ch == answer ) System.out.println("** Right **");
	else System.out.println("Sorry you are wrong");

	if (ch < answer) System.out.println("Too low");
	else System.out.println("too high");

}
}