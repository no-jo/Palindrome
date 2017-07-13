package palindrome;

import java.util.Scanner;

public class StartUp {

	public static void main(String[] args) {
		
		System.out.println("Please input text for palindrome:");
		Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
		System.out.println(Palindrome.isPalindrome(text));
		scan.close(); 
	}

}
