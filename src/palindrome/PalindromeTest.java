package palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

//assert equal
//a true ; aba true ; abba true; absa false; abs false;
//metoda peapre
//ASD0012 aaa!? return asdaaa;

public class PalindromeTest {

	@Test
	public void singleCharIsPalindrome() {
		//Given
		String rawText = "a";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void mostPopularPalindromeWithPolishChars() {
		//Given
		String rawText = "Kobyła ma mały bok.";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void textWithOnlySpecialCharsReturnsNegative() {
		//Given
		String rawText = "@#$$% ^";
		//Then
		assertEquals(false,Palindrome.isPalindrome(rawText));
	}

}
