/**
 * Test class for palindrome class.
 */
package palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void shouldReturnTrueForSingleCharacter() {
		//Given
		String rawText = "a";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void shouldReturnTrueForPalindromeWithOddNumberOfChars() {
		//Given
		String rawText = "bab";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void shouldReturnTrueForPalindromeWithEvenNumberOfChars() {
		//Given
		String rawText = "baab";
		//When
		boolean result = Palindrome.isPalindrome(rawText);
		//Then
		assertEquals(true,result);
	}
	
	@Test
	public void shouldReturnFalseForWordWithOddNumberOfChars() {
		//Given
		String rawText = "bac";
		//Then
		assertEquals(false,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void shouldReturnFalseForWordWithEvenNumberOfChars() {
		//Given
		String rawText = "lpkl";
		//Then
		assertEquals(false,Palindrome.isPalindrome(rawText));
	}
		
	@Test
	public void shouldReturnTrueForPalindromeWithSpecialChars() {
		//Given
		String rawText = "!abba@";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void shouldReturnTrueForPalindromeWithUpperCase() {
		//Given
		String rawText = "vffV";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void shouldReturnFalseForTextWithOnlySpecialChars() {
		//Given
		String rawText = "@#$$% ^";
		//Then
		assertEquals(false,Palindrome.isPalindrome(rawText));
	}

	@Test
	public void shouldReturnFalseForEmptyText() {
		//Given
		String rawText = "";
		//Then
		assertEquals(false,Palindrome.isPalindrome(rawText));
	}
	
	@Test
	public void shouldReturnTrueForPalindromeWithPolishChars() {
		//Given
		String rawText = "Kobyła ma mały bok.";
		//Then
		assertEquals(true,Palindrome.isPalindrome(rawText));
	}
}
