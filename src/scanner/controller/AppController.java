package scanner.controller;
import java.util.Scanner;

public class AppController {
	// this is where variable declaration goes, along with
	// enabling scanners
	private Scanner input;
	
	
	public AppController() {
		// set attributes like:
		// this.color = "Blue"
		// this is also where we make sure we can use Scanner
		this.input = new Scanner(System.in);
	}
	
	public void start() {
		// This is where most of the code for now goes, like
		// System.out.println("This is a message: Hello world") 
		// and
		// String answer = input.nextLine();
		// System.out.println("You said: " + answer);
		// here we go:
		System.out.println("Is this the real life, or is this just fantasy?");
		String answer = input.nextLine();
		System.out.println("'" + answer + "'? Gotcha.");
	}
}
