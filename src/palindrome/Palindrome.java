package palindrome;

public class Palindrome {

	public static boolean isPalindrome(String rawText) {
		String filteredText = prepareRawText(rawText);
		if (filteredText.isEmpty()) {
			return false;
		} else {
			return isFilteredTextPalindrome(filteredText);
		}
	}

	private static boolean isFilteredTextPalindrome(String filteredText) {
		if (filteredText.length() <= 1) {
			return true;
		} else if (filteredText.charAt(0) == filteredText.charAt(filteredText.length() - 1)) {
			filteredText = filteredText.substring(1, filteredText.length() - 1);
			return isFilteredTextPalindrome(filteredText);
		} else
			return false;
	}

	private static String prepareRawText(String rawText) {
		String filteredText = rawText.toLowerCase().replaceAll("[^\\p{L}]+", "");
		return filteredText;
	}
}