package palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void singleCharIsPalindrome() {
		//Given
		String rawText = "a";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void PalindromeWithOddChars() {
		//Given
		String rawText = "bab";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void PalindromeWithEvenChars() {
		//Given
		String rawText = "Baab";
		//When
		boolean result = Palindrome.isPalindrome(rawText);
		//Then
		assertEquals(true,result);
	}
	
	@Test
	public void NotPalindromeWithOddChars() {
		//Given
		String rawText = "bac";
		//Then
		assertEquals(false,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void NotPalindromeWithEvenChars() {
		//Given
		String rawText = "bacb";
		//Then
		assertEquals(false,Palindrome.isPalindrome(rawText));
	}
		
	@Test
	public void PalindromeWithSpecialChars() {
		//Given
		String rawText = "!abbA@";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void textWithOnlySpecialCharsReturnsFalse() {
		//Given
		String rawText = "@#$$% ^";
		//Then
		assertEquals(false,Palindrome.isPalindrome(rawText));
	}

	@Test
	public void emptyTextReturnsFalse() {
		//Given
		String rawText = "";
		//Then
		assertEquals(false,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void PalindromeWithPolishChars() {
		//Given
		String rawText = "Kobyła ma mały bok.";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
}
