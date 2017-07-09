package palindrome;

public class Palindrome {

	public static boolean isPalindrome(String rawText) {
		String filteredText = rawText.toLowerCase().replaceAll("[^\\p{L}]+", "");
		
		if (filteredText.length() <= 1) {
			return true;
		} else if (filteredText.charAt(0) == filteredText.charAt(filteredText.length() - 1)) {
			filteredText = filteredText.substring(1, filteredText.length() - 1);
			return isPalindrome(filteredText);
		} else
			return false;
	}
}